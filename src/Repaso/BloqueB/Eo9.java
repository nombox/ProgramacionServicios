/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso.BloqueB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian.eduardo.va
 */
public class Eo9 {

    public static class ProcesoTarea {

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

        /**
         * @return the pid
         */
        public int getPid() {
            return pid;
        }

        /**
         * @param pid the pid to set
         */
        public void setPid(int pid) {
            this.pid = pid;
        }

        /*
        A partir del ArrayList<ProcesoTarea> del ejercicio anterior, 
        pide al usuario (como argumentode línea de comandos) un texto de búsqueda, 
        y muestra solo los procesos cuyo nombre locontenga (usa contains(), 
        pasando ambos textos a minúsculas con toLowerCase() para queno importen las mayúsculas). 
        Si no hay ningún proceso que coincida, muestra también unmensaje claro indicándolo.
         */
        /**
         * @param args the command line arguments
         */
        private String nombre;
        private int pid;

        public ProcesoTarea() {

        }

        public ProcesoTarea(String nombre, int pid) {
            this.nombre = nombre;
            this.pid = pid;
        }

        @Override
        public String toString() {
            return "Proceso: " + this.nombre + "\n"
                    + "PID: " + this.pid;
        }

    }

    public static void main(String[] args) {

        List<ProcesoTarea> listaProcesos = new ArrayList<>();

        try {
            // TODO code application logic here
            ProcessBuilder pb = new ProcessBuilder("tasklist");
            Process p = pb.start();
            String linea;

            try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                while ((linea = br.readLine()) != null) {

                    linea = linea.trim();

                    //por si la linea está vacía
                    if (linea.isEmpty()) {
                        continue;
                    }

                    String[] lineaActual = linea.split("\\s+");

                    //Por si tiene menos de dos elementos
                    if (lineaActual.length < 2) {
                        continue;
                    }

                    try {

                        //Falta la parte de:
                        int pid = Integer.parseInt(lineaActual[1]);

                        listaProcesos.add(new ProcesoTarea(lineaActual[0], pid));

                    } catch (NumberFormatException en) {

                    }
                }
            } catch (IOException e) {
                System.out.println("Error! " + e.getMessage());
            }

        } catch (IOException ex) {
            System.getLogger(Ea8.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

        System.out.println("La cantidad de procesos son: " + listaProcesos.size());

        System.out.printf("%-30s%10s%n", "Nombre Proceso", "PID");
        System.out.println("=".repeat(40));

        int limite = Math.min(5, listaProcesos.size());

        for (int i = 0; i < limite; i++) {
            ProcesoTarea item = listaProcesos.get(i);
            System.out.printf("%-30s%10d%n", item.getNombre(), item.getPid());
        }

        String busqueda = args[0].toLowerCase();
        boolean encontrado = false;

        if (args.length > 0) {
            for (ProcesoTarea item : listaProcesos) {
                if (item.getNombre().contains(busqueda)) {
                    System.out.println("Tu proceso " + item.getNombre() + item.getPid());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("Ningun proceso coincide con: " + args[0]);
            }
        }

    }

}
