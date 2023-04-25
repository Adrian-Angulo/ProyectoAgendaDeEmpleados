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

    /**
     *
     * @param nombre
     * @param apellido
     * @param id
     * @param salario
     * @param cargo
     */
    public Empleado(String nombre, String apellido, String id, long salario, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
    }

    /**
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public long getSalario() {
        return salario;
    }

    /**
     *
     * @param salario
     */
    public void setSalario(long salario) {
        this.salario = salario;
    }

    /**
     *
     * @return
     */
    public String getCargo() {
        return cargo;
    }

    /**
     *
     * @param cargo
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    
}
