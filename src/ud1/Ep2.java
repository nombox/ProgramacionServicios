/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ud1;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Ep2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args2) {
        String args[]={"cmd", "/c", "dir", "C:\\Windows"};
        if (args.length <= 0) {
            System.out.println("Debe indicarse comando a ejecutar.");
            System.exit(1);
        }
        ProcessBuilder pb = new ProcessBuilder(args);
        pb.inheritIO();
        try {
            Process p = pb.start();
            int codRet = p.waitFor();
            System.out.println("La ejecución de " + Arrays.toString(args)
                    + " devuelve " + codRet
                    + " " + (codRet == 0 ? "(ejecución correcta)" : "(ERROR)")
            );
        } catch (IOException e) {
            System.err.println("Error durante ejecución del proceso");
            System.err.println("Información detallada");
            System.err.println("----------------");
            e.printStackTrace();
            System.err.println("----------------");
            System.exit(2);
        } catch (InterruptedException e) {
            System.err.println("Proceso interrumpido");
            System.exit(3);
        }
    }

}
