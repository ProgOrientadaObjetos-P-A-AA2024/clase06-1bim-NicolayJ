/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author dj931
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        System.out.print("Cuantos computadores se desea vender?: ");
        int numComputadores = tecla.nextInt();
        
        for (int i = 0; i < numComputadores; i++) {
            tecla.nextLine();
            System.out.println("--------------------------------------------");
            System.out.println("Ingrese los componentes del computador " + (i+1));
            System.out.println("----------o");
            System.out.print("Ingrese la marca del computador: ");
            String marca = tecla.nextLine();
            System.out.print("Ingrese la memoria del computador: ");
            String memoria = tecla.nextLine();
        }
    }
}
