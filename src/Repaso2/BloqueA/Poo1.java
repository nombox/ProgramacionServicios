/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso2.BloqueA;

import Repaso2.BloqueA.C.ComandoSimple;
import Repaso2.BloqueA.C.Ejecutable;
import java.io.IOException;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComandoSimple programa = new ComandoSimple(args);
        programa.describir();
        try {
            programa.ejecutar();
        } catch (IOException ex) {
            System.getLogger(Poo1.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
                
    }
    
}
