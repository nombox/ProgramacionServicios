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
public class Ea7 {
    
    public static class InfoProceso{
        private String comando;
        private long pid;
        
        public InfoProceso(long pid, String comando){
         this.pid = pid;
         this.comando = comando;
        }

        /**
         * @return the comando
         */
        public String getComando() {
            return comando;
        }

        /**
         * @param comando the comando to set
         */
        public void setComando(String comando) {
            this.comando = comando;
        }

        /**
         * @return the pid
         */
        public long getPid() {
            return pid;
        }

        /**
         * @param pid the pid to set
         */
        public void setPid(long pid) {
            this.pid = pid;
        }
        
        @Override
        public String toString(){
            return String.format("Comando: %-10s%nPID: %d%n",comando,pid);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /*
        Crea una clase InfoProceso con los atributos pid (long) y comando (String), 
        su constructor, getters y un toString() con String.format(). 
        Lanza un proceso (por ejemplo cmd /c dir), y encuanto arranque, 
        crea un objeto InfoProceso usando p.pid() y el comando que le has pasado, y muéstralo. 
        Cuando el proceso termine, añade a la salida el código de retorno obtenido conp.waitFor().
        */
        String comandos="cmd, /c, dir";
        ProcessBuilder pr = new ProcessBuilder(comandos.split(","));

 
        try {
            
           Process p = pr.start();
           
           InfoProceso proceso = new InfoProceso(p.pid(), comandos);
           
            System.out.println(proceso);
            int codRetorno = p.waitFor();
            System.out.println("codigo de retorno: "+codRetorno);

            
            
        } catch (IOException ex) {
            System.getLogger(Ea7.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (InterruptedException ex) {
            System.getLogger(Ea7.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
    
}
