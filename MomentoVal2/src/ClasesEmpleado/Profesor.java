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
public class Profesor extends Empleado {

    private String tipo;

    public Profesor(String tipo, String nombre, int cedula, int sueldo, String codAr, String codOfi) {
        super(nombre, cedula, sueldo, codAr, codOfi);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: " + tipo + "\n\n";
    }

        
}
