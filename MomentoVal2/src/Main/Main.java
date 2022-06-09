/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import ClaseArchivo.AccionesArchivo;
import ClaseArchivo.Archivo;
import ClasesColegio.*;
import ClasesEmpleado.*;
import VectoresClases.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JUAN PABLO MADRIGAL
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Acciones vpr = new Vectores();
        Acciones vad = new Vectores();
        Acciones vof = new Vectores();
        Acciones var = new Vectores();
        AccionesArchivo accarchivo = new Archivo();

        int opc;
        int menu;
        int contof = 0;
        int contar = 0;
        int contemp = 0;

        JOptionPane.showMessageDialog(null, "          BIENVENIDOS");
        String nombre = JOptionPane.showInputDialog(null, "Nombra el Colegio: ");
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1) Gestionar Colegio \n2) Gestionar reportes \n3) Salir del sistema\n\n", nombre, JOptionPane.INFORMATION_MESSAGE));
            if (opc == 1) {
                menu = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1) Añadir un area \n2) Añadir Profesor \n3) Añadir Administrativos\n\n", nombre, JOptionPane.INFORMATION_MESSAGE));
                switch (menu) {
                    case 1: {
                        contar += 1;
                        String nombarea = JOptionPane.showInputDialog(null, "Nombre del area\n\n");
                        String codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo del area: \n\n");
                        int oficinas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de oficinas: \n\n"));
                        contof += oficinas;
                        JOptionPane.showMessageDialog(null, "Codigos de las oficinas correspondiente del area de " + nombarea);
                        Area area = new Area(oficinas, nombarea, codigo);
                        var.anadirar(area);
                        accarchivo.AnadirArea(area);

                        for (int i = 1; i < oficinas + 1; i++) {
                            String codig = JOptionPane.showInputDialog(null, "Codigo de la oficina: " + i + "\n\n");
                            Oficina oficina = new Oficina(nombarea, codig);
                            vof.anadirof(oficina);
                            accarchivo.AnadirOficina(oficina);
                        }
                        break;
                    }
                    case 2: {
                        contemp += 1;
                        String tip = JOptionPane.showInputDialog(null, "Tipo << Planta o Contratista>>\n\n");
                        String nomb = JOptionPane.showInputDialog(null, "Nombre del profesor\n\n");
                        int ced = Integer.parseInt(JOptionPane.showInputDialog(null, "Cedula del profesor: \n\n"));
                        int sueld = Integer.parseInt(JOptionPane.showInputDialog(null, "Sueldo del profesor:\n\n"));
                        String nombar = JOptionPane.showInputDialog(null, "Nombre de area asignado\n\n");
                        while (var.RevisarArxNom(nombar) == false) {
                            JOptionPane.showMessageDialog(null, "El area no existe");
                            nombar = nombar = JOptionPane.showInputDialog(null, "Nombre de area asignado\n\n");
                        }
                        String codi = JOptionPane.showInputDialog(null, "Asignar oficina <<Codigo>>\n\n");
                        while (vof.RevisarOfxCod(codi) == false) {
                            JOptionPane.showMessageDialog(null, "La oficina no existe");
                            codi = JOptionPane.showInputDialog(null, "Asignar oficina <<Codigo>>\n\n");
                        }
                        Profesor profesor = new Profesor(tip, nomb, ced, sueld, nombar, codi);
                        vpr.anadirpr(profesor);

                        accarchivo.AnadirProfesor(profesor);
                        break;
                    }
                    case 3: {
                        contemp += 1;
                        String nomb = JOptionPane.showInputDialog(null, "Nombre del Administrativo\n\n");
                        int ced = Integer.parseInt(JOptionPane.showInputDialog(null, "Cedula del Administrativo:\n\n "));
                        int sueld = Integer.parseInt(JOptionPane.showInputDialog(null, "Sueldo del Administrativo:\n\n "));
                        String nombar = JOptionPane.showInputDialog(null, "Nombre de area asignado\n\n");
                        String codi = JOptionPane.showInputDialog(null, "Asignar oficina <<Codigo>>\n\n");
                        //Medodo para comprar(Igual al de abajo)
                        while (vof.RevisarOfxCod(codi) == false) {
                            JOptionPane.showMessageDialog(null, "La oficina no existe");
                            codi = JOptionPane.showInputDialog(null, "Asignar oficina <<Codigo>>\n\n");
                        }
                        Administrativo administrativo = new Administrativo(nomb, ced, sueld, nombar, codi);
                        accarchivo.AnadirAdministrativo(administrativo);
                        vad.anadirad(administrativo);

                        break;
                    }
                }
            } else {
                if (opc == 2) {
                    int rep = Integer.parseInt(JOptionPane.showInputDialog(null, "\n1) Informacion general del colegio \n2) Profesores contratados \n3) Administrativos Contratados \n4) Informacion de oficinas \n5) Informacion de areas \n6) Consultar Profesor \n\n", nombre, JOptionPane.INFORMATION_MESSAGE));
                    switch (rep) {
                        case 1: {
                            JOptionPane.showMessageDialog(null, "Nombre del colegio: " + nombre + "\nTotal de oficinas: " + contof + "\nTotal de Areas: " + contar + "\nTotal de empleados: " + contemp);
                            break;
                        }
                        case 2: {
                            if (vpr.verTodosP() == "") {
                                JOptionPane.showMessageDialog(null, "No hay profesores contratados");
                            } else {
                                JOptionPane.showMessageDialog(null, vpr.verTodosP());
                            }
                            break;
                        }
                        case 3: {
                            if (vad.verTodosA() == "") {
                                JOptionPane.showMessageDialog(null, "No hay Administrativos contratados");
                            } else {
                                JOptionPane.showMessageDialog(null, vad.verTodosA());
                            }
                            break;
                        }
                        case 4: {
                            if (vof.verTodosO() == "") {
                                JOptionPane.showMessageDialog(null, "No hay Oficinas en el colegio");
                            } else {
                                JOptionPane.showMessageDialog(null, vof.verTodosO());
                            }
                            break;
                        }
                        case 5: {
                            if (var.verTodosAr() == "") {
                                JOptionPane.showMessageDialog(null, "No hay areas en el colegio");
                            } else {
                                JOptionPane.showMessageDialog(null, var.verTodosAr());
                            }
                            break;
                        }
                        case 6: {
                            String proNombre = JOptionPane.showInputDialog(null, "Nombre del profesor\n\n");
                            if (vpr.consultapr(proNombre) == "") {
                                JOptionPane.showMessageDialog(null, "Profesor no encontrado");
                            } else {
                                JOptionPane.showMessageDialog(null, vpr.consultapr(proNombre));
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        } while (opc != 3);

    }
}
