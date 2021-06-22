/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import jkd.jfr.events.FileWriter;

/**
 *
 * @author ABIGAILSOFIA
 */
public class Archivo {
    public void grabar(String cadena) {
        try{
            FileWriter archivo  = new FileWriter("Datos.txt",true);
            BufferedWriter grabar = new BufferedWriter(archivo);
            grabar.write(cadena + "\n");
            grabar.close();
            
    } catch (Exception ex){
    ex.printStackTrace();
    }
   }
    
    public List<String> leer(){
        List<String> lista = new ArrayList<>();
        String cadena = "";
        try{
           FileReader archivo = new FileReader("Datos.txt");
           BufferedReader br = new BufferedReader(archivo);
           while((cadena = br.readLine ()) != null){
            lista.add(cadena);
           }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return lista ;
    }
}
        
