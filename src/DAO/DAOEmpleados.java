/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import agendadecontactos.Empleado;
import java.util.ArrayList;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adrian Castillo
 */
public interface DAOEmpleados {
    
    /**
     *
     * @param nombre
     * @param apellido
     * @param id
     * @param salario
     * @param cargo
     * @param tabla
     */
    public void cargaAutomatica(String nombre, String apellido, String id,Long salario, String cargo, JTable tabla, ArrayList<Empleado> empleados);

    /**
     *
     * @param tabla
     */
    public void eliminarFilaSeleccionada(JTable tabla,ArrayList<Empleado> empleados);

    /**
     *
     * @param tabla
     * @param campo
     * @param valor
     */
    public void buscarFilaPorCampo(JTable tabla, String campo, String valor);

    /**
     *
     * @param usuario
     * @param contrasenia
     * @return
     */
    public boolean VerificarUsuarios(String usuario, String contrasenia);

    /**
     *
     * @param encriptar
     * @return
     */
    public String encriptar(String encriptar);

    /**
     *
     * @param usuario
     * @param contrasena
     * @return
     */
    public String desencriptar(String usuario, String contrasena);

    /**
     *
     * @param clave
     * @return
     */
    public SecretKeySpec crearClave(String clave);
    
    
    
}
