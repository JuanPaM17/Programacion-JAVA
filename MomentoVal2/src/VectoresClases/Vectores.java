/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VectoresClases;

import ClasesColegio.*;
import ClasesEmpleado.*;

/**
 *
 * @author JUAN PABLO MADRIGAL
 */
public class Vectores implements Acciones {

    private Profesor[] vpr = new Profesor[10];
    private Administrativo[] vad = new Administrativo[10];
    private Oficina[] vof = new Oficina[10];
    private Area[] var = new Area[10];

    int p = 0;
    int a = 0;
    int o = 0;
    int x = 0;

    //Acciones Profesores
    @Override
    public void anadirpr(Profesor profesor) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        vpr[p] = profesor;
        p++;
    }

    @Override
    public String verTodosP() {
        String profesores = "";
        for (int j = 0; j < vpr.length; j++) {
            if (vpr[j] != null) {
                profesores += vpr[j].toString() + "\n\n";
            }
        }
        return profesores;

    }

    //Acciones Administrativos
    @Override
    public void anadirad(Administrativo administrativo) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        vad[a] = administrativo;
        a++;
    }

    @Override
    public String verTodosA() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String areas = "";
        for (int j = 0; j < vad.length; j++) {
            if (vad[j] != null) {
                areas += vad[j].toString() + "\n";
            }
        }
        return areas;
    }

    //Acciones Oficinas
    @Override
    public void anadirof(Oficina oficina) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        vof[o] = oficina;
        o++;
    }

    @Override
    public String verTodosO() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String oficinas = "";
        for (int j = 0; j < vof.length; j++) {
            if (vof[j] != null) {
                oficinas += vof[j].toString() + "\n";
            }
        }
        return oficinas;
    }

    @Override
    public boolean RevisarOfxCod(String codi) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for (int j = 0; j < vof.length; j++) {
            if (vof[j] != null) {
                if (vof[j].getCodigo().equals(codi)) {
                    return true;
                }
            }
        }
        return false;
    }

    //Acciones Areas
    @Override
    public void anadirar(Area area) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        var[x] = area;
        x++;
    }

    @Override
    public String verTodosAr() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String areas = "";
        for (int j = 0; j < var.length; j++) {
            if (var[j] != null) {
                areas += var[j].toString() + "\n";
            }
        }
        return areas;
    }

    @Override
    public boolean RevisarArxNom(String nombrearea) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for (int j = 0; j < var.length; j++) {
            if (var[j] != null) {
                if (var[j].getNombre().equals(nombrearea)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String consultapr(String nombre) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String consulta = "";
        for (int j = 0; j < vpr.length; j++) {
            if (vpr[j] != null) {
                if (vpr[j].getNombre().equals(nombre)) {
                    return consulta += vpr[j].toString();
                }
            }
        }
        return consulta;
    }

}
