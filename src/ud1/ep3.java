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
public class ep3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // Hay que revisar este ejercicio con la IA para lograrlo de manera correcta
        try{
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec(new String[]{"rutadelejecutable"});
        while(pr.isAlive()){
            System.out.println("Esta vivo");
        }} catch(IOException ex){
        System.getLogger(ep3.class.getName()).log(System.Logger.Level.ERROR,(String) null, ex);
        }
    }
    
}
