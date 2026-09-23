/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso.BloqueB;

import java.io.IOException;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Eo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /*
            Objetivo: cerrar el bloque combinando streams + ArrayList + recorrido con condición + printf
            alineadoLanza el proceso ipconfig, captura toda su salida en un ArrayList<String>,
            y recorre la listacontando cuántas líneas contienen el texto "IPv4".
            Al final, muestra con printf un resumencon este formato exacto
            (fíjate en que los números quedan alineados a la derecha aunquetengan distinto número de cifras):
            */
            
            ProcessBuilder proceso = new ProcessBuilder("cmd","/c","ipconfig");
            Process p = proceso.start();
            
            
        } catch (IOException ex) {
            System.getLogger(Eo10.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
    
}
