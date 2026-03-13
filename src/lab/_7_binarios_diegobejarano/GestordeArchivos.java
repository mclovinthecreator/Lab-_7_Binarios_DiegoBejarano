/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab._7_binarios_diegobejarano;

import java.io.*;
import java.util.ArrayList;

public class GestordeArchivos {
    private static final String archivolista = "lista_reproduccion.dat";
    
    public static void guardarLista(ArrayList<Cancion> lista){
        try {
            FileOutputStream fos = new FileOutputStream(archivolista);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(oos);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("Error al guardar: "+ e.getMessage());
        }
    }
    
    public static ArrayList<Cancion> cargarlista(){
        File archivo = new File(archivolista);
        if(!archivo.exists()){
            return new ArrayList();
        }
        try {
            FileInputStream fis = new FileInputStream(archivolista);
             ObjectInputStream ois = new ObjectInputStream(fis);
             ArrayList<Cancion> lista =  (ArrayList<Cancion>) ois.readObject();
             ois.close();
             fis.close();
             return lista;
            
        } catch (IOException e) {
            System.out.println("Error IO: "+ e.getMessage());
            return new ArrayList();
        }catch(ClassNotFoundException e){
            System.out.println("Error clase: "+ e.getMessage());
            return new ArrayList();
        }
    }
    
    public static byte[] leerimagen(File archivo){
        try {
            FileInputStream fis = new FileInputStream(archivo);
            byte[] bytes = new byte[(int) archivo.length()];
            fis.read(bytes);
            fis.close();
            return bytes;
            
        } catch (IOException e) {
            System.out.println("Error leyendo imagen: "+ e.getMessage());
            return null;
        }
    }
}
