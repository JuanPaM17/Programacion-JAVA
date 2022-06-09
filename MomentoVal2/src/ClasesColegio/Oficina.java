/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesColegio;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN PABLO MADRIGAL
 */
public class Oficina extends Colegio {

    public Oficina(String nombre, String codigo) {
        super(nombre, codigo);
    }

    
    
    public void mostrarAd() { //COnvertir en JOP
        JOptionPane.showMessageDialog(null, super.toString());
    }
    
    
    
}
