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
public class Area extends Colegio {

    private int nrOficinas;

    public Area(int nrOficinas, String nombre, String codigo) {
        super(nombre, codigo);
        this.nrOficinas = nrOficinas;
    }

    
    public int getNrOficinas() {
        return nrOficinas;
    }

    public void setNrOficinas(int nrOficinas) {
        this.nrOficinas = nrOficinas;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nOficinas asignadas: " + nrOficinas;
    }
    
    
    
}
