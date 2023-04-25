/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendadecontactos;
import DAO.DAOEmpleados;
import java.util.ArrayList;
import javax.swing.JTable;
import Vistas.VistaMenuPrincipal;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
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
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    DefaultTableModel model = new DefaultTableModel();
    private ResourceBundle env;
    private String claveSecreta="12345";
    
    private Controlador() {
    }
    
    private Controlador(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        
    }
    
    /**
     *
     * @return
     */
    public static Controlador getControlador(){
        if(controlador==null){
            controlador=new Controlador();
        }
        return  controlador;
    }

    /**
     *
     * @param tabla
     */
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
        this.empleados.remove(filaSeleccionada);
        
    }

    /**
     *
     * @param tabla
     * @param campo
     * @param valor
     */
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

    /**
     *
     * @param nombre
     * @param apellido
     * @param id
     * @param salario
     * @param cargo
     * @param tabla
     */
    @Override
    public void cargaAutomatica(String nombre, String apellido, String id, Long salario, String cargo, JTable tabla) {
         // Crear una lista de empleados
        
        this.empleados.add(new Empleado(nombre, apellido, id,salario, cargo));
        
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

    /**
     *
     * @param usuario
     * @param contrasenia
     * @return
     */
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        
        
        if (usuario.equals(desencriptar(encriptar("Adrian1080"), contrasenia))) {
            //JOptionPane.showMessageDialog(, "Has iniciado sesión correctamente.", "Mensaje de inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Has iniciado seccion");
            return true;
        } else {
            // Login failed
            System.out.println("Contraseña y/o usuarios incorrectos");
            return  false;
        }
        
       
    }

    /**
     *
     * @param usuario
     * @return
     */
    @Override
    public String encriptar(String usuario) {
        try {
            SecretKeySpec secretKey = this.crearClave(claveSecreta);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            
            byte[] datosEncriptar = usuario.getBytes("UTF-8");
            byte[] bytesEncriptados = cipher.doFinal(datosEncriptar);
            String encriptado = Base64.getEncoder().encodeToString(bytesEncriptados);
            
            return encriptado;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        

    }

    /**
     *
     * @param usuario
     * @param contrasenia
     * @return
     */
    @Override
    public String desencriptar(String usuario, String contrasenia) {
        try {
            SecretKeySpec secretKey = this.crearClave(contrasenia);
            
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            
            byte[] datosDesencriptar = Base64.getDecoder().decode(usuario);
            byte[] bytesDesencriptados = cipher.doFinal(datosDesencriptar);
            String encriptado = new String(bytesDesencriptados);
            
            return encriptado;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    /**
     *
     * @param clave
     * @return
     */
    @Override
    public SecretKeySpec crearClave(String clave) {
        try {
            byte[] claveEncriptar = clave.getBytes("UTF-8");
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            
            claveEncriptar = sha.digest(claveEncriptar);
            claveEncriptar = Arrays.copyOf(claveEncriptar,16);
            
            SecretKeySpec secretKey = new SecretKeySpec(claveEncriptar, "AES");
            
            return secretKey;
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    
   
}
