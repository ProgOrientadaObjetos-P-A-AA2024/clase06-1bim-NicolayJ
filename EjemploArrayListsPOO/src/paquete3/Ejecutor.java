/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        ArrayList<Computador> listaComputadoras = new ArrayList<>();

        System.out.println("Cuantos computadores se desea vender? ");
        int numComputadores = tecla.nextInt();

        for (int i = 0; i < numComputadores; i++) {
            tecla.nextLine();
            System.out.println("--------------------------------------------");
            System.out.println("Ingrese los componentes del computador " + (i + 1));
            System.out.println("----------o");

            System.out.print("Ingrese la marca del computador: ");
            String marca = tecla.nextLine();

            System.out.print(" -> Ingrese la marca de la memoria: ");
            String marcaMemoria = tecla.nextLine();
            System.out.print("      Ingrese el costo de la memoria: ");
            double costoMemoria = tecla.nextDouble();
            tecla.nextLine();

            System.out.print("-> Ingrese la marca del procesador: ");
            String marcaProcesador = tecla.nextLine();
            System.out.print("      Ingrese el costo del procesador: ");
            double costoProcesador = tecla.nextDouble();

            Memoria memoria = new Memoria(
                    marcaMemoria,
                    costoMemoria);

            Procesador procesador = new Procesador(
                    marcaProcesador,
                    costoProcesador);

            Computador computador = new Computador(
                    marca,
                    memoria,
                    procesador);
            computador.calcularCostoComputador();

            listaComputadoras.add(computador);
        }

        Venta venta = new Venta();
        venta.establecerArrayList(listaComputadoras);
        venta.establecerValorVenta();

        System.out.printf("%s\n", venta);
    }
}
