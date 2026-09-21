/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso.BloqueB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sebastian.eduardo.va
 */
public class EA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
      Lanza el proceso cmd /c echo Hola desde un proceso con ProcessBuilder, sin usar
      inheritIO(). Obtén el InputStream de la salida con p.getInputStream(), envuélvelo en un
      InputStreamReader y un BufferedReader, 
      y muestra por pantalla cada línea que leas hastaque readLine() devuelva null. Termina con p.waitFor().
         */

     

        try {

            //Creamos un comando que se ejecute 
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "echo", "Hola");
            Process p = pb.start();

            //Metemos en un try-with-resources el proceso para imprimir en pantalla
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                //Creamos una linea que capture el String de salida del comando
                String linea;

                //Leemos la linea y la guardamos para recorrer el comando
                while ((linea = br.readLine()) != null) {
                    System.out.print("Salida del proceso por pantalla: ");
                    System.out.println(linea);
                }
                
            } catch (IOException e) {
                System.err.println("Error! " + e.getMessage());
            }

            p.waitFor();

        } catch (IOException e) {
            System.err.println("Error! " + e.getMessage());
        } catch (InterruptedException ex) {
            System.getLogger(EA5.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

}
