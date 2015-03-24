/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_200915157;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JEditorPane;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author flaco
 */
public class Archivo {

    public String abrirArchivo(JFrame ventana) {
        String aux = "";
        String texto = null;
        try {
            FileFilter filter = new FileNameExtensionFilter(".xconf","xconf");
            /**
             * llamamos el metodo que permite cargar la ventana
             */
            JFileChooser file = new JFileChooser();
            file.setFileFilter(filter);
            file.showOpenDialog(ventana);
            /**
             * abrimos el archivo seleccionado
             */
            File abre = file.getSelectedFile();

            /**
             * recorremos el archivo, lo leemos para plasmarlo en el area de texto
             */
            if (abre != null) {
                texto="";
                MainWindow.path =abre.toString();
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }
                lee.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }
        return texto;//El texto se almacena en el JTextArea
    }
    
    
    public void guardarArchivoComo(JFrame ventana, String texto) {
        try {
            FileFilter filter = new FileNameExtensionFilter(".xconf","xconf");
            String nombre = "";
            JFileChooser file = new JFileChooser();
            file.setFileFilter(filter);
            file.showSaveDialog(ventana);
            File guarda = file.getSelectedFile();

            if (guarda != null) {
                MainWindow.path = guarda.toString();
                /*guardamos el archivo y le damos el formato directamente,
                 * si queremos que se guarde en formato doc lo definimos como .doc*/
                FileWriter save = new FileWriter(guarda + ".xconf");
                save.write(texto);
                save.close();
                JOptionPane.showMessageDialog(null,
                        "El archivo se a guardado Exitosamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
                
           
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Su archivo no se ha guardado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    
//  


    public void guardarArchivo(String texto) {
        File f;
        f = new File(MainWindow.path);
        //Escritura
        try {
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write(texto);//escribimos en el archivo
           // wr.append(errores);
            //wr.append(end); //concatenamos en el archivo sin borrar lo existente

            //ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita
            //de no hacerlo no se escribirá nada en el archivo
            wr.close();
            bw.close();
        } catch (IOException e) {
        };
    }
    
//    public void guardarAt(String Ruta, String carpeta, String archivo, String tipo, String texto )
//    {
//        File folder = new File(Ruta);
//        String Ruta2 = Ruta + "\\" + carpeta;
//        File folder2 = new File(Ruta2);
//        if(folder.exists())
//        {
//            if (folder2.mkdir()) {
//                System.out.println("Se ha creado directorio");
//                try {
//                    FileWriter w = new FileWriter(folder2+"\\" + archivo+ "."+ tipo);
//                    BufferedWriter bw = new BufferedWriter(w);
//                    PrintWriter wr = new PrintWriter(bw);
//                    wr.write(texto);//escribimos en el archivo
//                   // wr.append(errores);
//                    //wr.append(end); //concatenamos en el archivo sin borrar lo existente
//
//            //ahora cerramos los flujos de canales de datos, al cerrarlos el archivo quedará guardado con información escrita
//                    //de no hacerlo no se escribirá nada en el archivo
//                    wr.close();
//                    bw.close();
//                } catch (IOException e) {
//                };
//            } else {
//                System.out.println("No se ha podido crear el directorio");
//            }
//        }else
//        {
//            System.out.println("No existe ruta");
//        }
//                
//    }
    
    
    
    
}
