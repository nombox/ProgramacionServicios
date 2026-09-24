/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso.BloqueB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Eo10 {

    /**
     * @param args the command line arguments
     */
    /*
            Objetivo: cerrar el bloque combinando streams + ArrayList + recorrido con condición + printf
            alineadoLanza el proceso ipconfig, captura toda su salida en un ArrayList<String>,
            y recorre la listacontando cuántas líneas contienen el texto "IPv4".
            Al final, muestra con printf un resumencon este formato exacto
            (fíjate en que los números quedan alineados a la derecha aunquetengan distinto número de cifras):
     */
    public static void main(String[] args) {

        List<String> procesos = new ArrayList<>();
        ProcessBuilder proceso = new ProcessBuilder("cmd", "/c", "ipconfig");
        Process p;
        try {
            p = proceso.start();

            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                String linea;
                while((linea = br.readLine())!= null){
                    procesos.add(linea);
                }
                int contadorLineas=0;
                int contadorIpv4=0;
                for(String item: procesos){
                    contadorLineas++;
                    if(item.contains("IPv4")){
                        contadorIpv4++;
                    }
                }
                System.out.printf("Lineas leidas: %d%nLineas con IPV4: %d%n",contadorLineas,contadorIpv4);

            } catch (IOException ex) {
                System.getLogger(Eo10.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }

        } catch (IOException ex) {
            System.getLogger(Eo10.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }

}
