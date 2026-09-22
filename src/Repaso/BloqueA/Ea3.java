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
public class Ea3 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        /*
        Reescribe la salida del ejercicio anterior como una tabla alineada, usando System.out.printf(). 
           Usa al menos %-20s para el nombre, %6d para el PID y %10.2f para la memoria, 
           y terminacon una línea de totales usando el método del EA2. 
        */
        
        Ea1 proceso1 = new Ea1("Google", 1234, 23.5);
        Ea1 proceso2 = new Ea1("Microsoft", 5462, 50.55);
        Ea1 proceso3 = new Ea1("Netbeans", 6523, 12.78);
        
        List<Ea1> usuarios = new ArrayList<>();
        
        usuarios.add(proceso1);
        usuarios.add(proceso2);
        usuarios.add(proceso3);
           System.out.printf("%-20s%6s%13s%n","NOMBRE","PID","MEMORIA (MB)");
        
        for(Ea1 usuario: usuarios){
            System.out.printf("%-20s%6d%10.2f%n",usuario.getNombre(),usuario.getPid(),usuario.getmemoriaMB());
        }
        
           System.out.printf("%-30s%n","-".repeat(38));
        
        double memoriaTotal = totalMemoria(usuarios);
        System.out.printf("%-26s%10.2f%n","TOTAL", memoriaTotal);
                
        
    }
    
    public static double totalMemoria(List<Ea1> usuarios){
        double total = 0.0;
        for(Ea1 usuario: usuarios){
            total += usuario.getmemoriaMB();
        }
        return total;
    }
    
}
