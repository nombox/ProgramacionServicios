/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 */
package ud1;

import java.io.File;

import java.io.IOException;

import java.util.Arrays;

/**
 *
 *
 *
 * @author sebastian.eduardo.va
 *
 */
public class ep5 {

    /**
     *
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        // TODO code application logic here
        ProcessBuilder pb = new ProcessBuilder(
                //new String[]{"cmd", "/c", "dir", "/s", "/b", "C:\\*"});

                new String[]{"cmd", "/c", "dir"});

        System.out.printf("Se ejecuta comand: %s\n", Arrays.toString(args));

        System.out.println("el directorio actual es: " + pb.directory());

        pb.inheritIO();

        pb.redirectErrorStream(true);

        File carpetaDestino = new File("C:\\Users\\sebastian.eduardo.va\\Documents\\prueba");

        pb.directory(carpetaDestino);

        try {

            pb.start();

        } catch (IOException e) {

            System.err.println("Error durante ejecución. Información detallada");

            System.err.println("----------------");

            e.printStackTrace();

            System.err.println("----------------");

            System.exit(1);

        }

    }

}
