/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendadecontactos;

/**
 *
 * @author Adrian Castillo
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String id;
    private long salario;
    private String cargo;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String id, long salario, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    
}
