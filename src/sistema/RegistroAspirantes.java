
package sistema;

import ConexionSQLBD.BDAspirantes;
import ConexionSQLBD.BaseDatosConexion;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import selecciones.Aspirante;

public class RegistroAspirantes extends java.awt.Frame {
 
     int clictablaaspirantes;
     int longitudBytes;
    ArrayList<Aspirante>aspirante;
    BDAspirantes ba= new BDAspirantes();
    public RegistroAspirantes() {
        initComponents();
        mostrar();
        Limpiar();
        ListadeAspirantes();
       
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_aspirantes = new javax.swing.JTable();
        btn_registar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        checkbox_compromiso = new javax.swing.JCheckBox();
        checkbox_motivos = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        btn_foto = new javax.swing.JButton();
        lblfoto = new javax.swing.JLabel();
        txt_fotos = new javax.swing.JTextField();
        btn_atras = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cmbo_trabajo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_nuevo1 = new javax.swing.JButton();
        txt_matricula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_appat = new javax.swing.JTextField();
        txt_apmat = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        txt_generacion = new javax.swing.JTextField();
        txt_carrera = new javax.swing.JTextField();
        txt_tematesis = new javax.swing.JTextField();
        txt_dirtesis = new javax.swing.JTextField();

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel5.setText("Apellido Paterno");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Nombre");

        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Registro de Aspirantes");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Apellido Paterno");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("Correo");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("Apellido Materno");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("Teléfono Celular");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setText("Carrera");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("Generación");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setText("Tema de Tesis");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel14.setText("Director de Tesis");

        jPanel4.setLayout(null);

        lbl_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fotoMouseClicked(evt);
            }
        });
        jPanel4.add(lbl_foto);
        lbl_foto.setBounds(10, 10, 150, 160);

        tabla_aspirantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_aspirantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_aspirantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_aspirantes);

        btn_registar.setBackground(new java.awt.Color(0, 153, 255));
        btn_registar.setForeground(new java.awt.Color(102, 102, 102));
        btn_registar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEst/registrar.jpg"))); // NOI18N
        btn_registar.setText("Registrar");
        btn_registar.setActionCommand("Agregar");
        btn_registar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEst/siguiente.png"))); // NOI18N
        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        checkbox_compromiso.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        checkbox_compromiso.setText("Carta compromiso");

        checkbox_motivos.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        checkbox_motivos.setText("Carta exposición de motivos");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setText("Matricula");

        btn_foto.setText("Subir Foto");
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });

        lblfoto.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblfoto.setText("Fotos");

        btn_atras.setBackground(new java.awt.Color(0, 153, 255));
        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEst/finalizar.jpg"))); // NOI18N
        btn_atras.setText("Finalizar");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel15.setText("Trabaja");

        cmbo_trabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEst/LogUacm.jpg"))); // NOI18N

        btn_nuevo1.setBackground(new java.awt.Color(0, 153, 255));
        btn_nuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEst/cancelar.png"))); // NOI18N
        btn_nuevo1.setText("Cancelar");
        btn_nuevo1.setBorderPainted(false);
        btn_nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo1ActionPerformed(evt);
            }
        });

        txt_matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_matriculaKeyTyped(evt);
            }
        });

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_appat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_appatKeyTyped(evt);
            }
        });

        txt_apmat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apmatKeyTyped(evt);
            }
        });

        txt_celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_celularKeyTyped(evt);
            }
        });

        txt_carrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_carreraKeyTyped(evt);
            }
        });

        txt_dirtesis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dirtesisKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(71, 71, 71)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_appat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_generacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(txt_apmat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(txt_tematesis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(cmbo_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)
                            .addComponent(checkbox_motivos)
                            .addGap(6, 6, 6)
                            .addComponent(checkbox_compromiso, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(11, 11, 11)
                                                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, 0)
                                                    .addComponent(txt_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(78, 78, 78)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(71, 71, 71)
                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)
                                    .addComponent(txt_dirtesis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txt_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txt_appat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_generacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txt_apmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txt_tematesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txt_dirtesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbo_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkbox_motivos)
                    .addComponent(checkbox_compromiso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void ListadeAspirantes(){
     aspirante=ba.ListaAspirantes();
     DefaultTableModel tabla=(DefaultTableModel)tabla_aspirantes.getModel();
     for(Aspirante as :aspirante){
    tabla.addRow(new Object[]{as.getMatricula(), as.getNombre(), as.getApelPaterno(),as.getApelMaterno(),as.getTemTesis(),as.getDirTesis()});
     }
}

public void Limpiar(){
     DefaultTableModel tabla= (DefaultTableModel)tabla_aspirantes.getModel();
     for(int i=tabla.getRowCount()-1;i>0;i--){
         tabla.removeRow(i);
     }
}

public void mostrar(){
  DefaultTableModel modelo= new DefaultTableModel();  
  modelo.addColumn("MATRICULA");
  modelo.addColumn("NOMBRE");
  modelo.addColumn("APELLIDOPATERNO");
  modelo.addColumn("APELLIDOMATERNO");
 // modelo.addColumn("CORREO");
 // modelo.addColumn("CELULAR");
  //modelo.addColumn("GENERACION");
  //modelo.addColumn("CARRERA");
  modelo.addColumn("TEMTESIS");
  modelo.addColumn("DIRTESIS");
  tabla_aspirantes.setModel(modelo);
}
 
 
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void btn_registarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registarActionPerformed
                   
        Aspirante aspi= new Aspirante();
   
      aspi.setMatricula(txt_matricula.getText());
      aspi.setNombre(txt_nombre.getText());
      aspi.setApelPaterno(txt_appat.getText());
      aspi.setApelMaterno(txt_apmat.getText());
      aspi.setCorreo(txt_correo.getText());
      aspi.setCelular(txt_celular.getText());
      aspi.setCarrera(txt_carrera.getText());
      aspi.setGeneracion(txt_generacion.getText());
      aspi.setTemTesis(txt_tematesis.getText());
      aspi.setDirTesis(txt_dirtesis.getText());
      aspi.setTrabajo(cmbo_trabajo.getSelectedItem().toString());
       if (!"".equals(txt_matricula.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_appat.getText())&& !"".equals(txt_apmat.getText())&& !"".equals(txt_correo.getText())&& !"".equals(txt_celular.getText())
        && !"".equals(txt_tematesis.getText())&& !"".equals(txt_carrera.getText())&& !"".equals(txt_dirtesis.getText())&& !"".equals(lbl_foto.getIcon())&& !"".equals(cmbo_trabajo.getSelectedItem().toString()) && !"".equals(checkbox_motivos.getText())&& !"".equals(checkbox_compromiso.getText())){
           JOptionPane.showMessageDialog(this,"Datos Guardados del aspirante en la DB ", "", JOptionPane.INFORMATION_MESSAGE);
           ba.InsertarAspirantes(aspi);
           ListadeAspirantes();
        } else {
            JOptionPane.showMessageDialog(this,"Es obligatorio todo los campos del aspirante", "", JOptionPane.ERROR_MESSAGE);
        }
           
    }//GEN-LAST:event_btn_registarActionPerformed

    private void btn_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fotoActionPerformed
  // TODO add your handling code here:
        //Creamos nuestra variable archivo en la cual podremos usar todos los metodos de la clase jFileChooser
        JFileChooser archivo = new JFileChooser();
        //Si deseamos crear filtros para la selecion de archivos
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Formatos de Archivos JPEG(*.JPG;*.JPEG)", "jpg","jpeg");
        //Si deseas que se muestre primero los filtros usa la linea q esta abajo de esta.
        //archivo.setFileFilter(filtro);
        // Agregamos el Filtro pero cuidado se mostrara despues de todos los archivos
        archivo.addChoosableFileFilter(filtro);
        // Colocamos titulo a nuestra ventana de Seleccion
        archivo.setDialogTitle("Abrir Archivo");
        //Si deseamos que muestre una carpeta predetermina usa la siguiente linea
        File ruta = new File("Desktop:/");
        //Le implementamos a nuestro ventana de seleccion
         archivo.setCurrentDirectory(ruta);
         //Abrimos nuestra Ventana de Selccion
        int ventana = archivo.showOpenDialog(null);
        //hacemos comparacion en caso de aprete el boton abrir
        if(ventana == JFileChooser.APPROVE_OPTION)
        {
            //Obtenemos la ruta de nuestra imagen seleccionada
            File file = archivo.getSelectedFile();
            //Lo imprimimos en una caja de texto para ver su ruta
            txt_fotos.setText(String.valueOf(file));
            //de cierto modo necesitamos tener la imagen para ello debemos conocer la ruta de dicha imagen
            Image foto= getToolkit().getImage(txt_fotos.getText());
            //Le damos dimension a nuestro label que tendra la imagen
            foto= foto.getScaledInstance(110, 110, Image.SCALE_DEFAULT);
            //Imprimimos la imagen en el label
            lbl_foto.setIcon(new ImageIcon(foto));
        }     
    }//GEN-LAST:event_btn_fotoActionPerformed

    private void lbl_fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fotoMouseClicked
JFileChooser se = new JFileChooser();
     FileInputStream fis;
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);       
        int estado = se.showOpenDialog(null);
        if(estado == JFileChooser.APPROVE_OPTION)
        {
            try {
                
                fis =  new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int)se.getSelectedFile().length();
                
                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(lbl_foto.getWidth(), lbl_foto.getHeight(), Image.SCALE_DEFAULT);
                lbl_foto.setIcon(new ImageIcon(icono));
                lbl_foto.updateUI(); 
                
            } catch (FileNotFoundException ex) {ex.printStackTrace();}
            catch (IOException ex){ex.printStackTrace();}
        }
    }//GEN-LAST:event_lbl_fotoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CartasAspirantes aspirante= new CartasAspirantes();
        aspirante.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo1ActionPerformed
     txt_matricula.setText("");
     txt_nombre.setText("");
     txt_appat.setText("");
     txt_apmat.setText("");
     txt_correo.setText("");
     txt_celular.setText("");
     txt_carrera.setText("");
     txt_generacion.setText("");
     txt_tematesis.setText("");
     txt_dirtesis.setText(""); 
    }//GEN-LAST:event_btn_nuevo1ActionPerformed

    private void txt_matriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_matriculaKeyTyped
         char C= evt.getKeyChar();
        if(Character.isLetter(C)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar numeros");
            txt_matricula.setCursor(null);
        }
    }//GEN-LAST:event_txt_matriculaKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char C= evt.getKeyChar();
        if(Character.isDigit(C)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_nombre.setCursor(null);
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
            || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_nombre.setCursor(null);
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_appatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_appatKeyTyped
        char C= evt.getKeyChar();
        if(Character.isDigit(C)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_appat.setCursor(null);
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
            || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_appat.setCursor(null);
        }
    }//GEN-LAST:event_txt_appatKeyTyped

    private void txt_apmatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apmatKeyTyped
        char C= evt.getKeyChar();
        if(Character.isDigit(C)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_apmat.setCursor(null);
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
            || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_apmat.setCursor(null);
        }
    }//GEN-LAST:event_txt_apmatKeyTyped

    private void txt_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celularKeyTyped
        char C= evt.getKeyChar();
        if(Character.isLetter(C)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar numeros");
            txt_celular.setCursor(null);
        }
    }//GEN-LAST:event_txt_celularKeyTyped

    private void txt_carreraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_carreraKeyTyped
        char C= evt.getKeyChar();
        if(Character.isDigit(C)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_carrera.setCursor(null);
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
            || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_carrera.setCursor(null);
        }
    }//GEN-LAST:event_txt_carreraKeyTyped

    private void txt_dirtesisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dirtesisKeyTyped
        char C= evt.getKeyChar();
        if(Character.isDigit(C)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_dirtesis.setCursor(null);
        }else if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47
            || (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64
            || (int)evt.getKeyChar()>=91 && (int)evt.getKeyChar()<=96
            || (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar letras");
            txt_dirtesis.setCursor(null);
        }
    }//GEN-LAST:event_txt_dirtesisKeyTyped

    private void tabla_aspirantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_aspirantesMouseClicked
      
    }//GEN-LAST:event_tabla_aspirantesMouseClicked

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
         JOptionPane.showMessageDialog(this,"Su registro ha sido un exito");
    }//GEN-LAST:event_btn_atrasActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAspirantes().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_foto;
    private javax.swing.JButton btn_nuevo1;
    private javax.swing.JButton btn_registar;
    private javax.swing.JCheckBox checkbox_compromiso;
    private javax.swing.JCheckBox checkbox_motivos;
    private javax.swing.JComboBox<String> cmbo_trabajo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_foto;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JTable tabla_aspirantes;
    private javax.swing.JTextField txt_apmat;
    private javax.swing.JTextField txt_appat;
    private javax.swing.JTextField txt_carrera;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_dirtesis;
    private javax.swing.JTextField txt_fotos;
    private javax.swing.JTextField txt_generacion;
    private javax.swing.JTextField txt_matricula;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tematesis;
    // End of variables declaration//GEN-END:variables
}
