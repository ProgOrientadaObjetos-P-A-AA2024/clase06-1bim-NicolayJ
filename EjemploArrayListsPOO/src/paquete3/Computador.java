/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {

    private String marca;
    private Procesador procesador;
    private Memoria memoria;
    private double costoComputador;

    public Computador(String m, Memoria mem, Procesador pro) {
        marca = m;
        memoria = mem;
        procesador = pro;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerProcesador(Procesador p) {
        procesador = p;
    }

    public void establecerMemoria(Memoria m) {
        memoria = m;
    }

    public void calcularCostoComputador() {
        costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();
    }

    public String obtenerMarca() {
        return marca;
    }

    public Procesador obtenerProcesador() {
        return procesador;
    }

    public Memoria obtenerMemoria() {
        return memoria;
    }

    public double obtenerCostoComputador() {
        return costoComputador;
    }
}
