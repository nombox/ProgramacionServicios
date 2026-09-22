/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso.BloqueA;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Eo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int respuestaArgs;
        
        
        try{
        respuestaArgs = Integer.parseInt(args[0]);
            System.out.println("Excelente! Tu numero es: "+respuestaArgs);
        
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Error: No has pasado ningún argumento al ejecutar el programa."+ex.getMessage());
        }catch(NumberFormatException ex){
            System.out.println("Error: El argumento introducido no es un número entero válido."+ex.getMessage());
        }
    }
    
}
