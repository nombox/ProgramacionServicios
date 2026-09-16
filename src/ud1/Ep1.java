/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud1;

import java.io.IOException;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Ep1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {    
        /*Crea un programa que ejecute un comando en Windows, utilizando
la clase Runtime. El comando debe proporcionarse en los parámetros de línea de
comandos. Verifica qué ocurre si el comando que se quiere ejecutar no existe.
NOTA: Para poder leer la salida del proceso tendíamos que crear un stream contra la
salida del proceso. No es necesario hacerlo en este ejercicio. 
        */
        Runtime rt = Runtime.getRuntime();
        System.out.println("Procesadores disponibles: "+ rt.availableProcessors());
        //Comando equivalente a "cmd /c dir C:\Windows" lanzado con Runtime
        Process p = rt.exec(new String[]{"cmd","/c","dir","C:\\Windows"});
        int codRet = p.waitFor();
        System.out.println("Codigo de retorno: "+codRet);
        
        
    }
    
}
