/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Enumeration;
import javax.comm.*;
import javax.comm.*;
import java.io.*;
import java.util.*;
import javax.comm.*;
import java.io.*;
import java.util.*;
import java.io.UnsupportedEncodingException;
import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

/**
 *
 * @author usuario
 */
public class VerificarPortas {

    protected String[] portas;
    protected Enumeration listaDePortas;
//construtor  

    public VerificarPortas() {
        listaDePortas = CommPortIdentifier.getPortIdentifiers();
    }
//retorna as portas disponíveis  

    public String[] ObterPortas() {
        return portas;
    }
//Copia portas para um Array  

    protected void ListarPortas() {
        int i = 0;
        portas = new String[10];
        while (listaDePortas.hasMoreElements()) {
            CommPortIdentifier ips = (CommPortIdentifier) listaDePortas.nextElement();
            portas[i] = ips.getName();
            i++;
        }
    }
//pesquisa se a Porta existe  

    public boolean PortaExiste(String COMp) {
        String temp;
        boolean e = false;
        while (listaDePortas.hasMoreElements()) {
            CommPortIdentifier ips = (CommPortIdentifier) listaDePortas.nextElement();
            temp = ips.getName();
            if (temp.equals(COMp) == true) {
                e = true;
            };
        }
        return e;
    }
//imprime as portas disponíveis  

    protected void ImprimePortas() {
        for (int i = 0; i < portas.length; i++) {
            if (portas != null) {
                System.out.println(portas[i] + " ");
            }
        }
        System.out.println(" ");
    }

    Hashtable h = new Hashtable(20);
    Enumeration portList = h.keys();

    CommPortIdentifier portId;

    public void getPorts() {
        System.out.println("passo 01: " + portList);
        while (portList.hasMoreElements()) {
            System.out.println("passo 02: ");
            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {
                // if (portId.getName().equals("COM1")) {
                if (portId.getName().equals("COM1")) {
                    System.out.println("AISJDKJHSAKJ");
                }
            }
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String[] portNames = SerialPortList.getPortNames();
        for (String portName : portNames) {
            System.out.println(portName);
        }

        SerialPort serialPort = new SerialPort("COM3");
        try {
            System.out.println("Port opened: " + serialPort.openPort());
            System.out.println("Params setted: " + serialPort.setParams(9600, 8, 2, 0));
            System.out.println("successfully writen to port: " + serialPort.writeBytes(new byte[]{0x04}));
            byte[] buffer = serialPort.readBytes(46);//Read 10 bytes from serial port
            System.out.println(new String(buffer));
            System.out.println("Port closed: " + serialPort.closePort());
        } catch (SerialPortException ex) {
            System.out.println(ex);
        }

    }
}
