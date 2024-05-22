/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;
import paquete1.Profesor;

public class ArchivoLectura {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<Profesor> lista;

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("data/%s", nombreArchivo);

        try {
            entrada = new Scanner(new File(rutaArchivo));
            // entrada = new Scanner(System.in);
            // entrada = new Scanner(f);
        } // fin de try
        catch (FileNotFoundException e) {
            System.err.println("Error al leer del archivo: " + e);

        } // fin de catch

    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("data/%s.txt",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    // establecer valores de cada línea
    // en la lista de tipo Profesor
    public void establecerLista() {
    
        lista = new ArrayList<>();  
        // crea una lista en donde guarda la informacion del archivo para luego
        // presentarlo
        File f = new File(rutaArchivo);

        if (f.exists()) { // Mientras el archivo exista ingresa al if

            while (entrada.hasNext()) {
                String linea = entrada.nextLine(); // Tara Hernandez;contratado
                // Lee linea por linea
                
                ArrayList<String> linea_partes = new ArrayList<>(
                        Arrays.asList(linea.split(";")) // ["Tara Hernandez", "contratado"]
                );
                // Separa la linea cuando encuentra un ;
                
                Profesor p = new Profesor(linea_partes.get(0), // Tara Hernandez
                        linea_partes.get(1) // contratado
                );
                // Una vez separado lo que hace es al nombre ponerlo en
                // linea_partes.get(0) el nombre y .get(1) el tipo 
                
                lista.add(p); 
                // Una vez hecha la primera linea lo que hace es agregar la 
                // informacion en lista que es un Array list
                
            } // fin de while
        }
    }

    public ArrayList<Profesor> obtenerLista() {

        return lista;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

    @Override
    public String toString() {
        String cadena = "Lista Profesores\n";
        for (int i = 0; i < obtenerLista().size(); i++) {
            Profesor profTemporal = obtenerLista().get(i); // Obj. Profesor
            cadena = String.format("%s(%d) %s %s\n", cadena,
                    i + 1,
                    profTemporal.obtenerNombre(), // obtenerLista().get(i).obtenerNombre(),
                    profTemporal.obtenerTipo());    // obtenerLista().get(i).obtenerTipo());
        }
        return cadena;
    }
}
