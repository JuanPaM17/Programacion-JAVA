/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesEmpleado;

import javax.swing.JOptionPane;

/**
 *
 * @author JUAN PABLO MADRIGAL
 */
public class Administrativo extends Empleado {

    public Administrativo(String nombre, int cedula, int sueldo, String codAr, String codOfi) {
        super(nombre, cedula, sueldo, codAr, codOfi);
    }

    public void mostrarAd() {
        JOptionPane.showMessageDialog(null, super.toString(), "DATOS DEL ADMISTRATIVO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
}
