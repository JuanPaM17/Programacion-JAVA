/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package VectoresClases;
import ClasesEmpleado.*;
import ClasesColegio.*;
/**
 *
 * @author JUAN PABLO MADRIGAL
 */
public interface Acciones {
    
    //Acciones Profesor
    public void anadirpr(Profesor profesor);
    public String verTodosP();
    public String consultapr(String nombre);
    
    
    //Acciones Administractivo
    public void anadirad(Administrativo administrativo);
    public String verTodosA();

    //Acciones Oficina
    public void anadirof(Oficina oficina);
    public String verTodosO();
    public boolean RevisarOfxCod(String codi);

    //Acciones Areas
    public void anadirar(Area area);
    public String verTodosAr();
    public boolean RevisarArxNom(String nombrearea);
}
