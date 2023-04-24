/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import javax.swing.JTable;

/**
 *
 * @author Adrian Castillo
 */
public interface DAOEmpleados {
    
    public void cargaAutomatica(String nombre, String apellido, String id,Long salario, String cargo, JTable tabla);
    public void eliminarFilaSeleccionada(JTable tabla);
    public void buscarFilaPorCampo(JTable tabla, String campo, String valor);
    
}
