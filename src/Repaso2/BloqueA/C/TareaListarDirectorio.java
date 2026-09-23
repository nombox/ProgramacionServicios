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
public class TareaListarDirectorio extends TareaProceso{
    
    private String nombre;
    
    public TareaListarDirectorio(String nombre){
    super("Listar Directorio");
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
    
    @Override
    String[] comand() {
        String[] comandos = {"cmd","/c","dir"};
        return comandos;
    }
    
    @Override
    public void lanzar(){
        try {
            
            ProcessBuilder pr = new ProcessBuilder(comand());
            pr.inheritIO();
            Process p = pr.start();
            System.out.println("Lanzando tarea <"+ nombre +">");
            p.waitFor();
            
        } catch (IOException ex) {
            System.getLogger(TareaListarDirectorio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (InterruptedException ex) {
            System.getLogger(TareaListarDirectorio.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    
    
    }
    
}
