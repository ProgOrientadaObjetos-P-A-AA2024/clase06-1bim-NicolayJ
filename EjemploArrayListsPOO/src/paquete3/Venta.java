/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 * Clase que representa una Venta
 *
 * @autor reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public Venta() {
        computadoras = new ArrayList<>();
    }

    public void establecerValorVenta() {
        valorVenta = 0;
        for (Computador c : computadoras) {
            valorVenta += c.obtenerCostoComputador();
        }
    }

    public void establecerArrayList(ArrayList<Computador> c) {
        computadoras = c;
    }

    public double obtenerValorVenta() {
        return valorVenta;
    }

    public ArrayList<Computador> obtenerArrayList() {
        return computadoras;
    }

    @Override
    public String toString() {
        String cadena = "\nREPORTE DE VENTAS\n";
        cadena = String.format("%sLista de Computadoras:\n", cadena);

        for (Computador c : computadoras) {
            cadena = String.format("%s\n"
                    + "\tMarca: %s"
                    + "\n\tMarca Procesador: %s"
                    + "\n\tCosto Procesador: $ %.2f"
                    + "\n\tMarca Memoria: %s"
                    + "\n\tCosto Memoria: $ %.2f"
                    + "\n\tCosto Final: $ %.2f\n\n",
                    cadena,
                    c.obtenerMarca(),
                    c.obtenerProcesador().obtenerMarca(),
                    c.obtenerProcesador().obtenerCosto(),
                    c.obtenerMemoria().obtenerMarca(),
                    c.obtenerMemoria().obtenerCosto(),
                    c.obtenerCostoComputador());
        }

        cadena = String.format("%s-----------------------------------\n"
                + "Valor Total de la Venta: $ %.2f\n",
                cadena,
                obtenerValorVenta());
        return cadena;
    }
}
