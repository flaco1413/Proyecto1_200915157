/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_200915157;

import java.io.BufferedReader;
import java.io.StringReader;

/**
 *
 * @author eOliva
 */
public class Proyecto1_200915157 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("Inicio Analisis Lexico");
        StringReader sr = new StringReader("hola #");
        BufferedReader br = new BufferedReader(sr);
        LexicoConfig lg = new LexicoConfig(br);
        sintactico sg = new sintactico(lg);
        sg.parse();
        
        
        
    }
    
}
