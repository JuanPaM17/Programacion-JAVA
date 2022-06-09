/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesEmpleado;

/**
 *
 * @author JUAN PABLO MADRIGAL
 */
public class Empleado {

    private String nombre;
    private int cedula;
    private int sueldo;
    private String codAr;
    private String codOfi;

    public Empleado(String nombre, int cedula, int sueldo, String codAr, String codOfi) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.codAr = codAr;
        this.codOfi = codOfi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getCodAr() {
        return codAr;
    }

    public void setCodAr(String codAr) {
        this.codAr = codAr;
    }

    public String getCodOfi() {
        return codOfi;
    }

    public void setCodOfi(String codOfi) {
        this.codOfi = codOfi;
    }

    @Override
    public String toString() {
        return "\nDATOS DEL EMPLEADOR" + "\nNombre: " + nombre + "\nCedula: " + cedula + "\nSueldo: " + sueldo + "\nArea Asignada: " + codAr + "\nOficina Asignada: " + codOfi;
    }

}
