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
public class ComandoSimple implements Ejecutable{
    private String[] comandos;
    
    public ComandoSimple(String[] comandos){
    this.comandos = comandos;
    }

    /**
     * @return the comandos
     */
    public String[] getComandos() {
        return comandos;
    }

    /**
     * @param comandos the comandos to set
     */
    public void setComandos(String[] comandos) {
        this.comandos = comandos;
    }
        

    @Override
    public void ejecutar() throws IOException {
        try {
            ProcessBuilder proceso = new ProcessBuilder(comandos);
            proceso.inheritIO();
            
            Process p = proceso.start();
            p.waitFor();
        } catch (InterruptedException ex) {
            System.getLogger(ComandoSimple.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }

}
