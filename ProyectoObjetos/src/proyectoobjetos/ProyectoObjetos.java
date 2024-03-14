/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoobjetos;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author BJAL
 */
public class ProyectoObjetos {

    static Scanner duki = new Scanner(System.in);
    static Random rndm = new Random();


    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido, te hemos contratado por un dia\npara gestionar un puesto de tickets para la areolina BB8");
        JOptionPane.showMessageDialog(null, "*****INFORMACION*****\n>Cada ticket tiene un valor de $9.99\n>Solamente se puede seleccionar un asiento por persona"
                + "\n>Si desean comprar mas de un ticket tendra que decirlo");
        
    }

}
