/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cristopher_flores_examen;

import java.io.*;

/**
 *
 * @author Alex
 */
public class Menu {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    //Abrir Archivo
    public String AbrirTexto(File archivo){
        String contents="";
        try {
            entrada=new FileInputStream(archivo);
            int ascci;
            while((ascci=entrada.read())!= -1){
                char crt=(char)ascci;
                contents += crt;
            }
        } catch (Exception e) {
        }
        return contents;
    }
    
    //Guardar Archivo
    public String GuardarTexto(File archivo, String contenido){
        String response=null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytesTxt = contenido.getBytes();
            salida.write(bytesTxt);
            response = "Archivo guardado con exito";
        } catch (Exception e) {
        }
        return response;
    }
}
