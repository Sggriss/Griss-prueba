/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import asus.com.Computadora;
import ico.fes.componentes.Procesador;
import javax.swing.JFrame;

/**
 *
 * @author garce
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = new String ("José José");
        System.out.println(nombre);
        System.out.println(nombre.charAt(3)); //Obtiene un caracter en una posición indice que se le indique
        System.out.println(nombre.toUpperCase()); //Pone en mayusculas el contenido de la clase String
        /*
        JFrame ventana = new JFrame("Mi primer ventana Java");
        ventana.setSize(600, 400);
        ventana.setVisible(true); //Indica si la ventana es visible o no
        */
        Computadora miCompu = new Computadora();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println(miCompu);
        
    }
    
}
