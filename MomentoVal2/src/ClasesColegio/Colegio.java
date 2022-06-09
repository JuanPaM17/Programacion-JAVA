/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesColegio;

/**
 *
 * @author JUAN PABLO MADRIGAL
 */
public class Colegio {
    
    private String nombre;
    private String codigo;

    public Colegio(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public Colegio(String codigo) {
        this.codigo = codigo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nCodigo: " + codigo;
    }
    
    
}
