/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud1;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Ep5Profesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Creo el proceso
        ProcessBuilder pb = new ProcessBuilder("cmd /c dir c;\\Windows".split(" "));
        pb.inheritIO();
        Process p=pb.start();
        
        Map<String,String> mapa = pb.environment();
        for(String clave: mapa.keySet()){
            System.out.printf("Par %s:%s\n", clave,mapa.get(clave));
        }
        //Obtengo el directorio de ejecución por defecto
        File f=pb.directory();
        //Lo imprimo
        if(f!=null){
            System.out.println("Ruta del programa:"+f.getAbsolutePath());
        }
        else{
            System.out.println("Ruta por defecto");
        }
        p.close();
        
        System.out.println("indicando yo el directorio");
        ProcessBuilder pb2 = new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe".split(" "));
        
        // Asigno el nuevo directorio de ejecución
        File f2=new File("C:\\Users\\vsfj\\Desktop\\Compartida AD");
        pb2.directory(f2);
        Process p2=pb2.start();
        //Obtengo el directorio de ejecución por defecto
        File f3=pb2.directory();
        
        //Y así sucesivamente
    }
    
}
