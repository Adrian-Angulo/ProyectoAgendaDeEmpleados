/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendadecontactos;

import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Adrian Castillo
 */
public class AgendaDeEmpleados{

    private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
    public AgendaDeEmpleados(){
    }
    
    public AgendaDeEmpleados(ArrayList<Empleado> empleados){
        this.empleados = empleados;
    }
    
    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public void modificarEmpleado(int i, Empleado empleado){
        this.empleados.set(i, empleado);
    }
    
    public void eliminarEmpleado(int i){
        this.empleados.remove(i);
    }
    
    public Empleado obtenerEmpleado(int i){
        return (Empleado)empleados.get(i);
    }
    
    
    public int cantidadEmpleado(){
        return this.empleados.size();
    }
    
    
     
}