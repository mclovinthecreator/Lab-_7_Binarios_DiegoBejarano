/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab._7_binarios_diegobejarano;

import javax.swing.SwingUtilities;

/**
 *
 * @author diego
 */
public class Lab_7_Binarios_DiegoBejarano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Principal().setVisible(true);
            }
        });
    }
    
}
