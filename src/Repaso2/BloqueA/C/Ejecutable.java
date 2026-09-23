/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso2.BloqueA.C;

import java.io.IOException;

/**
 *
 * @author sebastian.eduardo.va
 */
public interface Ejecutable {
    public abstract void ejecutar() throws IOException;
    default void describir(){
        System.out.println("Soy un Ejecutable genérico");
    }
}
