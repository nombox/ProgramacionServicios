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
abstract class TareaProceso {
    private String nombre;
    
    public TareaProceso(String nombre){
        this.nombre = nombre;
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
   
    abstract String[] comand();
    
    public void lanzar(){
        try {
            
            
            ProcessBuilder pr = new ProcessBuilder(comand());
            pr.inheritIO();
            
            Process p = pr.start();
            p.waitFor();
            
            
        } catch (IOException ex) {
            System.getLogger(TareaProceso.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (InterruptedException ex) {
            System.getLogger(TareaProceso.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
