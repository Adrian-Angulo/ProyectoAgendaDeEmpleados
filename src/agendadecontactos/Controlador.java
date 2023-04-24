/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendadecontactos;
import DAO.DAOEmpleados;
import java.util.ArrayList;
import javax.swing.JTable;
import Vistas.VistaMenuPrincipal;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Adrian Castillo
 */
public class Controlador implements  DAOEmpleados{
    private static Controlador controlador;
    private String usuario;
    private String contrasenia;
    ArrayList<Empleado> empleados = new ArrayList<>();
    
    private Controlador() {
    }
    
    private Controlador(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        
    }
    
    public static Controlador getControlador(){
        if(controlador==null){
            controlador=new Controlador();
        }
        return  controlador;
    }

    
    @Override
    public void eliminarFilaSeleccionada(JTable tabla) {
        // Obtener el modelo de datos de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        // Obtener el índice de la fila seleccionada
        int filaSeleccionada = tabla.getSelectedRow();
        
        // Verificar que se haya seleccionado una fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(tabla, "Por favor, seleccione una fila para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Mostrar un mensaje de confirmación antes de eliminar la fila
        int confirmacion = JOptionPane.showConfirmDialog(tabla, "¿Está seguro de que desea eliminar la fila seleccionada?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (confirmacion != JOptionPane.YES_OPTION) {
            return;
        }
        
        // Eliminar la fila seleccionada del modelo de datos de la tabla
        modelo.removeRow(filaSeleccionada);
    }

    @Override
    public void buscarFilaPorCampo(JTable tabla, String campo, String valor) {
       DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        // Buscar la fila que contiene el valor especificado en el campo indicado
        int fila = -1;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            if (modelo.getValueAt(i, modelo.findColumn(campo)).equals(valor)) {
                fila = i;
                break;
            }
        }
        
        // Verificar si se encontró la fila
        if (fila == -1) {
            JOptionPane.showMessageDialog(tabla, "No se encontró ninguna fila que contenga el valor especificado.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Seleccionar la fila encontrada
        tabla.setRowSelectionInterval(fila, fila);  
    }

    @Override
    public void cargaAutomatica(String nombre, String apellido, String id, Long salario, String cargo, JTable tabla) {
         // Crear una lista de empleados
        
        empleados.add(new Empleado(nombre, apellido, id,salario, cargo));
        
        // Crear el modelo de tabla con los nombres de las columnas
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("ID");
        model.addColumn("Salario");
        model.addColumn("Cargo");

        // Agregar los datos de los empleados al modelo de tabla
        for (Empleado empleado : empleados) {
            Object[] row = new Object[5];
            row[0] = empleado.getNombre();
            row[1] = empleado.getApellido();
            row[2] = empleado.getId();
            row[3] = empleado.getSalario();
            row[4] = empleado.getCargo();
            model.addRow(row);
        }
        tabla.setModel(model);
    }

    
    
}
