/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso.BloqueA;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Ea1 {
    
    private String nombre;
    private long pid;
    private double memoriaMB;
    
    public Ea1(){
    
    }
    
    public Ea1(String nombre, long pid, double memoriaMB){
    this.nombre = nombre;
    this.pid = pid;
    this.memoriaMB = memoriaMB;
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public long getPid(){
        return pid;
    }
    
    public void setPid(long pid){
        this.pid = pid;
    }
    
    public double getmemoriaMB(){
        return memoriaMB;
    } 
    
    public void setMemoriaMB(double memoriaMB){
        this.memoriaMB = memoriaMB;
    }
    
    @Override
    public String toString(){
        return nombre+" PID: "+pid+" - "+memoriaMB+ " MB\n";
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crea una clase Aplicacion con tres atributos privados: nombre (String), pid (long) y
        memoriaMB (double). Añade un constructor que reciba los tres valores, sus getters, y
        sobrescribe el método toString() para que devuelva una línea con el formato "<nombre>(PID <pid>) - <memoriaMB> MB". 
        Escribe un main que cree 2 o 3 objetos Aplicacion condatos inventados y los muestre con System.out.println(objeto). */
        
        Ea1 proceso1 = new Ea1("Google", 1234, 23.5);
        Ea1 proceso2 = new Ea1("Microsoft", 5462, 50.55);
        Ea1 proceso3 = new Ea1("Netbeans", 6523, 12.78);
        System.out.printf("%-10s%-10s%-10s",proceso1,proceso2,proceso3);
    }

    
}
