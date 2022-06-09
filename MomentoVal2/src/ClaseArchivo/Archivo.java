    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseArchivo;

import ClasesColegio.Area;
import ClasesColegio.Oficina;
import ClasesEmpleado.Administrativo;
import ClasesEmpleado.Profesor;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JUAN PABLO MADRIGAL
 */
public class Archivo implements AccionesArchivo {

    private File archivo;
    private FileWriter fw;
    private PrintWriter pw;

    @Override
    public void AnadirAdministrativo(Administrativo administrativo) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        archivo = new File("Administrativos.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                fw = new FileWriter(archivo, true);
                pw = new PrintWriter(fw);
                pw.println(administrativo);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {

                fw = new FileWriter(archivo, true);
                pw = new PrintWriter(fw);
                pw.println(administrativo);
                pw.close();
                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    @Override
    public void AnadirProfesor(Profesor profesor) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        archivo = new File("Profesores.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                fw = new FileWriter(archivo, true);
                pw = new PrintWriter(fw);
                pw.println(profesor);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {

                fw = new FileWriter(archivo, true);
                pw = new PrintWriter(fw);
                pw.println(profesor);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void AnadirArea(Area area) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        archivo = new File("Areas.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                fw = new FileWriter(archivo, true);
                pw = new PrintWriter(fw);
                pw.println(area);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
      
                fw = new FileWriter(archivo, true);
                pw = new PrintWriter(fw);
                pw.println(area);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }   

    @Override
    public void AnadirOficina(Oficina oficina) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        archivo = new File("Oficinas.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                fw = new FileWriter(archivo, true);
                pw = new PrintWriter(fw);
                pw.println(oficina);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
      
                fw = new FileWriter(archivo, true);
                pw = new PrintWriter(fw);
                pw.println(oficina);
                pw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
