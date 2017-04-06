package comunicacaoserial;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.TooManyListenersException;
import javax.swing.JOptionPane;

public class ControlePorta {

    public OutputStream serialOut;
    public InputStream serialInput;
    public int taxa;
    public String portaCOM;
    public BufferedReader serialReader;
    public String[] values;

    /**
     * Construtor da classe ControlePorta
     *
     * @param portaCOM - Porta COM que será utilizada para enviar os dados para
     * o arduino
     * @param taxa - Taxa de transferência da porta serial geralmente é 9600
     */
    public ControlePorta(String portaCOM, int taxa) {
        this.portaCOM = portaCOM;
        this.taxa = taxa;
        this.initialize();
    }

    /**
     * Médoto que verifica se a comunicação com a porta serial está ok
     */
    private void initialize() {
        try {
            //Define uma variável portId do tipo CommPortIdentifier para realizar a comunicação serial
            CommPortIdentifier portId = null;
            try {
                //Tenta verificar se a porta COM informada existe
                portId = CommPortIdentifier.getPortIdentifier(this.portaCOM);
            } catch (NoSuchPortException npe) {
                //Caso a porta COM não exista será exibido um erro
                JOptionPane.showMessageDialog(null, "Porta COM não encontrada.",
                        "Porta COM", JOptionPane.PLAIN_MESSAGE);
            }
            //Abre a porta COM
            SerialPort port = (SerialPort) portId.open("Comunicação serial", this.taxa);
            serialOut = port.getOutputStream();
            serialInput = port.getInputStream();
            serialReader = new BufferedReader(new InputStreamReader(serialInput));

            port.setSerialPortParams(this.taxa, //taxa de transferência da porta serial
                    SerialPort.DATABITS_8, //taxa de 10 bits 8 (envio)
                    SerialPort.STOPBITS_1, //taxa de 10 bits 1 (recebimento)
                    SerialPort.PARITY_NONE); //receber e enviar dados

            //port.addEventListener((SerialPortEventListener) this);
            port.notifyOnDataAvailable(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que fecha a comunicação com a porta serial
     */
    public void close() {
        try {
            serialOut.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível fechar porta COM.",
                    "Fechar porta COM", JOptionPane.PLAIN_MESSAGE);
        }
    }

    /**
     * @param opcao - Valor a ser enviado pela porta serial
     */
    public void enviaDados(int opcao) {
        try {
            serialOut.write(opcao);//escreve o valor na porta serial para ser enviado
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível enviar o dado. ",
                    "Enviar dados", JOptionPane.PLAIN_MESSAGE);
        }
    }

    public String[] receberDados() {
        try {
            String line = serialReader.readLine();
            if (line.startsWith("MON:")) {
                String[] values = line.split(":");
                return values;
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível receber os dado. ",
                    "Receber dados", JOptionPane.PLAIN_MESSAGE);
        }
        return null;
    }

    private byte[] readBuffer = new byte[400];

    private void readSerial() {
        try {
            int availableBytes = serialInput.available();
            if (availableBytes > 0) {
                // Read the serial port
                serialInput.read(readBuffer, 0, availableBytes);

                // Print it out
                System.out.println(
                        new String(readBuffer, 0, availableBytes));
            }
        } catch (IOException e) {
        }
    }

    private class SerialEventHandler implements SerialPortEventListener {

        public void serialEvent(SerialPortEvent event) {
            switch (event.getEventType()) {
                case SerialPortEvent.DATA_AVAILABLE:
                    readSerial();
                    break;
            }
        }
    }

    private void setSerialEventHandler(SerialPort serialPort) {
        try {
            // Add the serial port event listener
            serialPort.addEventListener(new SerialEventHandler());
            serialPort.notifyOnDataAvailable(true);
        } catch (TooManyListenersException ex) {
            System.err.println(ex.getMessage());
        }
    }

    /*public void serialEvent(SerialPortEvent e) {
    try {
    String line = serialReader.readLine();
    if (line.startsWith("MON:")) {
    values = line.split(":");
    }
    } catch (IOException ex) {
    JOptionPane.showMessageDialog(null, "Não foi possível receber os dado. ",
    "Receber dados", JOptionPane.PLAIN_MESSAGE);
    }
    }*/
}
