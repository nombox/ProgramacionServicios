/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso.BloqueB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Ea6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Modifica el programa anterior para lanzar cmd /c dir C:\Windows en lugar de echo. En vez
        de imprimir cada línea a medida que la lees, guárdala en un ArrayList<String>. Cuando el
        proceso termine, muestra cuántas líneas se han leído en total y las 3 primeras líneas de lalista.
         */

        try {

            //Creamos un comando que se ejecute 
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir", "C:\\Users\\sebastian.eduardo.va\\Documents\\NetBeansProjects\\JavaApplication1");
            Process p = pb.start();

            //Metemos en un try-with-resources el proceso para imprimir en pantalla
            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                //Creamos una linea que capture el String de salida del comando
                String linea;
                List<String> campos = new ArrayList<>();
                
                //Leemos la linea y la guardamos para recorrer el comando
                while ((linea = br.readLine()) != null) {
                    campos.add(linea);
                }
                System.out.println("Se han contado: " + campos.size()+" lineas");
                
                int lineasAMostrar = 3;
                
                for (int i = 0; i < lineasAMostrar; i++) {
                    System.out.println(campos.get(i));
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
