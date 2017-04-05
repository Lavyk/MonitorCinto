package comunicacaoserial;

import gnu.io.SerialPortEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * @author klauder
 */
public class Arduino {

    private ControlePorta arduino;
    public String[] valores;

    /**
     * Construtor da classe Arduino
     */
    public Arduino() {

        String os = System.getProperties().getProperty("os.name");
        if (os.contains("Win")) {
            arduino = new ControlePorta("COM3", 9600);//Windows - porta e taxa de transmissão
        } else {
            arduino = new ControlePorta("/dev/ttyUSB0", 9600);//Linux - porta e taxa de transmissão
        }
    }

    /**
     * Envia o comando para a porta serial
     *
     * @param button - Botão que é clicado na interface Java
     */
    public void comunicacaoArduino(JButton button) {
        if ("Ligar".equals(button.getActionCommand())) {
            arduino.enviaDados(1);
            System.out.println(button.getText());//Imprime o nome do botão pressionado
        } else if ("Desligar".equals(button.getActionCommand())) {
            arduino.enviaDados(2);
            System.out.println(button.getText());
        } else {
            arduino.close();
            System.out.println(button.getText());//Imprime o nome do botão pressionado
        }
    }

    public String[] getDados() {
        return arduino.receberDados();
    }

    private void serialEvent(SerialPortEvent e) {
        try {
            String line = arduino.serialReader.readLine();
            if (line.startsWith("MON:")) {
                valores = line.split(":");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível receber os dado. ",
                    "Receber dados", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
