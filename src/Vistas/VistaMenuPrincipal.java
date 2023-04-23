/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Dimension;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Adrian Castillo
 */
public class VistaMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaMenuPrincipal
     */
    public VistaMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null); 
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        setDefaultCloseOperation(NewJFrame.EXIT_ON_CLOSE);
        setResizable(false);// redimencionar la ventada
        setTitle("Agenda Empleados");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        regresar_btn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cargo_Combox = new javax.swing.JComboBox<>();
        salario_Spinner = new javax.swing.JSpinner();
        guardar_btn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        buscar_btn = new javax.swing.JButton();
        buscar_txt = new javax.swing.JTextField();
        borrar_btn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(33, 44, 62));
        jPanel5.setPreferredSize(new java.awt.Dimension(630, 200));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jPanel7.setBackground(new java.awt.Color(33, 44, 62));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 106));

        regresar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/retroceder.png"))); // NOI18N
        regresar_btn.setBorderPainted(false);
        regresar_btn.setContentAreaFilled(false);
        regresar_btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/retroceder2.png"))); // NOI18N
        regresar_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/retroceder2.png"))); // NOI18N
        regresar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(regresar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, Short.MAX_VALUE)
                .addGap(57, 57, 57))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(regresar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 168, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(33, 44, 62));

        jLabel6.setFont(new java.awt.Font("Gotham Thin", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(65, 170, 174));
        jLabel6.setText("Nombre");

        nombre.setBackground(new java.awt.Color(33, 44, 62));
        nombre.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(65, 170, 174));
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 170, 174)));
        nombre.setCaretColor(new java.awt.Color(65, 170, 174));
        nombre.setDisabledTextColor(new java.awt.Color(65, 170, 174));

        jLabel7.setFont(new java.awt.Font("Gotham Thin", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(65, 170, 174));
        jLabel7.setText("Apellido");

        apellido.setBackground(new java.awt.Color(33, 44, 62));
        apellido.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        apellido.setForeground(new java.awt.Color(65, 170, 174));
        apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 170, 174)));
        apellido.setCaretColor(new java.awt.Color(65, 170, 174));
        apellido.setDisabledTextColor(new java.awt.Color(65, 170, 174));

        jLabel8.setFont(new java.awt.Font("Gotham Thin", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(65, 170, 174));
        jLabel8.setText("Id");

        id.setBackground(new java.awt.Color(33, 44, 62));
        id.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(65, 170, 174));
        id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 170, 174)));
        id.setCaretColor(new java.awt.Color(65, 170, 174));
        id.setDisabledTextColor(new java.awt.Color(65, 170, 174));

        jLabel9.setFont(new java.awt.Font("Gotham Thin", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(65, 170, 174));
        jLabel9.setText("Cargo");

        jLabel10.setFont(new java.awt.Font("Gotham Thin", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(65, 170, 174));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Salario");

        cargo_Combox.setBackground(new java.awt.Color(33, 44, 62));
        cargo_Combox.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        cargo_Combox.setForeground(new java.awt.Color(65, 170, 174));
        cargo_Combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contador", "Asistente", "Empleado de Servicio", " " }));
        cargo_Combox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 44, 62)));
        cargo_Combox.setFocusable(false);

        salario_Spinner.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        salario_Spinner.setModel(new javax.swing.SpinnerNumberModel(Long.valueOf(1100000L), Long.valueOf(1100000L), Long.valueOf(5000001L), Long.valueOf(100000L)));
        salario_Spinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(65, 170, 174)));
        salario_Spinner.setFocusable(false);

        guardar_btn.setBackground(new java.awt.Color(65, 170, 174));
        guardar_btn.setFont(new java.awt.Font("Gotham Thin", 1, 14)); // NOI18N
        guardar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Guardar.png"))); // NOI18N
        guardar_btn.setBorder(null);
        guardar_btn.setBorderPainted(false);
        guardar_btn.setContentAreaFilled(false);
        guardar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar_btn.setFocusable(false);
        guardar_btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Guardar.png"))); // NOI18N
        guardar_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Guardar2.png"))); // NOI18N
        guardar_btn.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Guardar2.png"))); // NOI18N
        guardar_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Guardar2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(cargo_Combox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salario_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(id)
                            .addComponent(apellido)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cargo_Combox)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salario_Spinner)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel5.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(33, 44, 62));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 106));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel9);

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(33, 44, 62));

        jPanel3.setBackground(new java.awt.Color(33, 44, 62));

        buscar_btn.setBackground(new java.awt.Color(65, 170, 174));
        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LUPA.png"))); // NOI18N
        buscar_btn.setBorderPainted(false);
        buscar_btn.setContentAreaFilled(false);
        buscar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar_btn.setFocusPainted(false);
        buscar_btn.setFocusable(false);
        buscar_btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LUPA.png"))); // NOI18N
        buscar_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LUPA2.png"))); // NOI18N
        buscar_btn.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LUPA2.png"))); // NOI18N
        buscar_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/LUPA2.png"))); // NOI18N
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        buscar_txt.setBackground(new java.awt.Color(33, 44, 62));
        buscar_txt.setFont(new java.awt.Font("Gotham Thin", 0, 12)); // NOI18N
        buscar_txt.setForeground(new java.awt.Color(65, 170, 174));
        buscar_txt.setBorder(null);
        buscar_txt.setCaretColor(new java.awt.Color(65, 170, 174));
        buscar_txt.setDisabledTextColor(new java.awt.Color(65, 170, 174));

        borrar_btn.setBackground(new java.awt.Color(65, 170, 174));
        borrar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ELIMINAR.png"))); // NOI18N
        borrar_btn.setToolTipText("");
        borrar_btn.setBorderPainted(false);
        borrar_btn.setContentAreaFilled(false);
        borrar_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrar_btn.setFocusPainted(false);
        borrar_btn.setFocusable(false);
        borrar_btn.setIconTextGap(1);
        borrar_btn.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ELIMINAR2.png"))); // NOI18N
        borrar_btn.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ELIMINAR2.png"))); // NOI18N
        borrar_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ELIMINAR2.png"))); // NOI18N
        borrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar_btnActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(65, 170, 174));
        jSeparator1.setForeground(new java.awt.Color(65, 170, 174));
        jSeparator1.setDoubleBuffered(true);
        jSeparator1.setFocusable(true);
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(buscar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_txt)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar_btn)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(buscar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(33, 44, 62));

        jScrollPane1.setForeground(new java.awt.Color(65, 170, 174));

        tabla.setBackground(new java.awt.Color(65, 170, 174));
        tabla.setFont(new java.awt.Font("Gotham Thin", 1, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(33, 44, 62));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellido", "Salario", "Cargo"
            }
        ));
        tabla.setColumnSelectionAllowed(true);
        tabla.setEnabled(false);
        tabla.setFocusable(false);
        tabla.setGridColor(new java.awt.Color(33, 44, 62));
        tabla.setSelectionForeground(new java.awt.Color(65, 170, 174));
        tabla.setShowGrid(true);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(65, 170, 174));
        jMenuBar1.setForeground(new java.awt.Color(65, 170, 174));

        jMenu2.setBackground(new java.awt.Color(65, 170, 174));
        jMenu2.setBorder(null);
        jMenu2.setText("File");

        jMenuItem1.setText("Regresar");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu5.setBackground(new java.awt.Color(65, 170, 174));
        jMenu5.setBorder(null);
        jMenu5.setText("Edit");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrar_btnActionPerformed

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void regresar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar_btnActionPerformed
        // TODO add your handling code here:
        new VistaIniciarSeccion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresar_btnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton borrar_btn;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JTextField buscar_txt;
    private javax.swing.JComboBox<String> cargo_Combox;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton regresar_btn;
    private javax.swing.JSpinner salario_Spinner;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
