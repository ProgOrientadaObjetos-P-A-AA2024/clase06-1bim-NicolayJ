/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete0;

import java.util.ArrayList;
import paquete2.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList5 {
    public static void main(String[] args) {
        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");

        // Arreglo
        Profesor[] profesores = new Profesor[2];
        profesores[0] = prof1;
        profesores[1] = prof2;

        for (int i = 0; i < profesores.length; i++) {
            Profesor p1 = profesores[i];
            System.out.printf("%s\n", p1);
        }

        System.out.println("-----------------------------");

        // ArrayList
        ArrayList<Profesor> profesores2 = new ArrayList<>();
        profesores2.add(prof1);
        profesores2.add(prof2);

        for (int i = 0; i < profesores2.size(); i++) {
            Profesor p1 = profesores2.get(i);
            System.out.printf("%s\n", p1);
        }

        System.out.println("-----------------------------");

        Profesor prof3 = new Profesor("Melissa Gilbert", "contratado");
        profesores2.add(prof3);

        for (int i = 0; i < profesores2.size(); i++) {
            Profesor p1 = profesores2.get(i);
            System.out.printf("%s\n", profesores2.get(i));
            /*
            profesores2.get(i) es un objeto del tipo Profesor
            .add() es para agregar valores a la lista
            .get(i) es para saber la posicion i de la lista
            .size() es para saber el tamanio del ArrayList
            */
        }
    }
}
