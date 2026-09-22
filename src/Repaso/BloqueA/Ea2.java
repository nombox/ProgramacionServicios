/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso.BloqueA;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebas
 */
public class Ea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Modifica el ejercicio anterior para que los objetos Aplicacion, 
        en lugar de mostrarse uno auno, se añadan a un ArrayList<Aplicacion>. 
        Recorre la lista con un bucle for-each y muestracada elemento. 
        Añade además un método que reciba el ArrayList<Aplicacion> 
        y devuelva(como double) la suma de la memoria de todas las aplicaciones.
        */
        
        Ea1 proceso1 = new Ea1("Google", 1234, 23.5);
        Ea1 proceso2 = new Ea1("Microsoft", 5462, 50.55);
        Ea1 proceso3 = new Ea1("Netbeans", 6523, 12.78);
        
        List<Ea1> usuarios = new ArrayList<>();
        
        usuarios.add(proceso1);
        usuarios.add(proceso2);
        usuarios.add(proceso3);
        
        for(Ea1 usuario: usuarios){
            System.out.println(usuario);
        }
        double memoriaTotal = totalMemoria(usuarios);
        System.out.println("Total de la memoria usada es: "+ memoriaTotal+ " MB");
                
        
    }
    
    public static double totalMemoria(List<Ea1> usuarios){
        double total = 0.0;
        for(Ea1 usuario: usuarios){
            total += usuario.getmemoriaMB();
        }
        return total;
    }
    
}
