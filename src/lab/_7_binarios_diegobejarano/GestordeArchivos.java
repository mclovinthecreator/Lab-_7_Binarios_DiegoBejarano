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
        } catch (Exception e) {
            System.out.println("Error al guardar: "+ e.getMessage());
        }
    }
}
