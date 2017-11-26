
package sistema;

import ConexionSQLBD.BDAspirantes;
import ConexionSQLBD.BaseDatosConexion;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import selecciones.Aspirante;

public class Administrador extends java.awt.Frame {
        String BuscarMatricula;//en el buton buscar
        String aspirant;
    int longitudBytes;
     int clictablaaspirantes;
    public static  Object[] opElinar = { "ELIMINAR", "CANCELAR" };
    public static  Object[] opActualizar= { "ACTUALIZAR", "CANCELAR" };
     Aspirante as;
      public static ArrayList<Aspirante>aspirante;
    public static BDAspirantes ba=new BDAspirantes();
    public Administrador() {
        initComponents(); 
        mostrar();
        Limpiar();
        ListadeAspirantes();
        aspirant=ba.getUltimomatAspirante();
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
        txt_nombre = new javax.swing.JTextField();
        txt_appat = new javax.swing.JTextField();
        txt_apmat = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        txt_generacion = new javax.swing.JTextField();
        txt_tematesis = new javax.swing.JTextField();
        txt_carrera = new javax.swing.JTextField();
        txt_dirtesis = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbl_foto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_aspirantes = new javax.swing.JTable();
        btn_modifica = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_matricula = new javax.swing.JTextField();
        btn_foto = new javax.swing.JButton();
        lblfoto = new javax.swing.JLabel();
        txt_fotos = new javax.swing.JTextField();
        cmbo_trabajo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

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
            .addGap(0, 733, Short.MAX_VALUE)
        );

        add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel2.setBackground(new java.awt.Color(0, 51, 204));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Administrador de Aspirantes");

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

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel14.setText("Director de Tesis");

        jPanel4.setLayout(null);

        lbl_foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fotoMouseClicked(evt);
            }
        });
        jPanel4.add(lbl_foto);
        lbl_foto.setBounds(20, 10, 160, 160);

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

        btn_modifica.setBackground(new java.awt.Color(51, 255, 51));
        btn_modifica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEst/modificar.png"))); // NOI18N
        btn_modifica.setText("Actualizar");
        btn_modifica.setBorderPainted(false);
        btn_modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificaActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(51, 255, 51));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEst/cancelar.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.setActionCommand("Agregar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setText("Matricula");

        txt_matricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_matriculaKeyTyped(evt);
            }
        });

        btn_foto.setText("Subir Foto");
        btn_foto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fotoActionPerformed(evt);
            }
        });

        lblfoto.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lblfoto.setText("Fotos");

        cmbo_trabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel15.setText("Trabaja");

        btn_registrar.setBackground(new java.awt.Color(51, 255, 51));
        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEst/registrar.jpg"))); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEst/LogUacm.jpg"))); // NOI18N

        btn_salir.setBackground(new java.awt.Color(51, 255, 51));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(txt_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbo_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(txt_generacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_appat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apmat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tematesis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_dirtesis, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(txt_fotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16)
                                .addComponent(btn_foto, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1)))))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txt_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbo_trabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_generacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txt_appat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(txt_apmat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_tematesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_dirtesis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modifica, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void ListadeAspirantes(){
     aspirante=ba.ListaAspirantes();
     DefaultTableModel tabla=(DefaultTableModel)tabla_aspirantes.getModel();
     for(Aspirante as :aspirante){
    tabla.addRow(new Object[]{as.getMatricula(), as.getNombre(), as.getApelPaterno(),as.getApelMaterno(),as.getCorreo(),as.getCelular(),as.getGeneracion(),as.getCarrera(),as.getTemTesis(),as.getDirTesis(),as.getTrabajo()});
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
  modelo.addColumn("CORREO");
  modelo.addColumn("CELULAR");
  modelo.addColumn("GENERACION");
  modelo.addColumn("CARRERA");
  modelo.addColumn("TEMTESIS");
  modelo.addColumn("DIRTESIS");
  modelo.addColumn("TRABAJA");
  tabla_aspirantes.setModel(modelo);

}
  public void Limpiaraspirantes(){
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
  }
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
     
    }//GEN-LAST:event_exitForm

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

    
        if (!"".equals(txt_matricula.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_appat.getText()) && !"".equals(txt_apmat.getText())
        && !"".equals(txt_correo.getText())&& !"".equals(txt_celular.getText())&& !"".equals(txt_generacion.getText())&& !"".equals(txt_carrera.getText())
        && !"".equals(txt_tematesis.getText())&& !"".equals(txt_dirtesis.getText())&& !"".equals(cmbo_trabajo.getSelectedItem().toString()) && !"".equals(lbl_foto.getIcon())){
                int Acction = JOptionPane.showOptionDialog(this,"Una vez que ayas eliminado \n no puedes volver a restaurarla","Mensaje", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION, null,opElinar,opElinar[0]);

            if (Acction == JOptionPane.YES_OPTION) {

               ba.EliminaraAspirantes(BuscarMatricula);
               Limpiar();
               ListadeAspirantes();
            } else {

                JOptionPane.showMessageDialog(this, "Se Cancelo la Operacion", "Mensaje", JOptionPane.CANCEL_OPTION);

            }
        } else {

            JOptionPane.showMessageDialog(this,"Busca Datos en la DB primero", "Mensaje", JOptionPane.ERROR_MESSAGE);

        }  
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaActionPerformed
         Aspirante as= new Aspirante();
           BDAspirantes bas= new BDAspirantes();
     as.setMatricula(txt_matricula.getText());
     as.setNombre(txt_nombre.getText());
     as.setApelPaterno(txt_appat.getText());
     as.setApelMaterno(txt_apmat.getText());
     as.setCorreo(txt_correo.getText());
     as.setCelular(txt_celular.getText());
     as.setGeneracion(txt_generacion.getText());
     as.setCarrera(txt_carrera.getText());
     as.setTemTesis(txt_tematesis.getText());
     as.setDirTesis(txt_dirtesis.getText());
     as.setTrabajo(cmbo_trabajo.getSelectedItem().toString());
     //as.setFoto(lbl_foto.getIcon());
       if (!"".equals(txt_matricula.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_appat.getText()) && !"".equals(txt_apmat.getText())
        && !"".equals(txt_correo.getText())&& !"".equals(txt_celular.getText())&& !"".equals(txt_generacion.getText())&& !"".equals(txt_carrera.getText())
        && !"".equals(txt_tematesis.getText())&& !"".equals(txt_dirtesis.getText())&& !"".equals(cmbo_trabajo.getSelectedItem().toString())){
           int Acction = JOptionPane.showOptionDialog(this, "Esta seguro de actualizar al aspirante", "Mensaje", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opActualizar, opActualizar[0]);
           
            if (Acction == JOptionPane.YES_OPTION) {
            bas.ModificarAspirantes(as);
            Limpiar();
            ListadeAspirantes();
          
            JOptionPane.showMessageDialog(this,"Datos del aspirante modificado en la DB ", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"Es obligatorio todo los campos del aspirante", "", JOptionPane.ERROR_MESSAGE);
        }  
       }
    }//GEN-LAST:event_btn_modificaActionPerformed

    private void btn_fotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fotoActionPerformed
 
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

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
          BDAspirantes bas= new BDAspirantes();  
        Aspirante as= new Aspirante();
     as.setMatricula(txt_matricula.getText());
     as.setNombre(txt_nombre.getText());
     as.setApelPaterno(txt_appat.getText());
     as.setApelMaterno(txt_apmat.getText());
     as.setCorreo(txt_correo.getText());
     as.setCelular(txt_celular.getText());
     as.setGeneracion(txt_generacion.getText());
     as.setCarrera(txt_carrera.getText());
     as.setTemTesis(txt_tematesis.getText());
     as.setDirTesis(txt_dirtesis.getText());
     as.setTrabajo(cmbo_trabajo.getSelectedItem().toString());
     //as.setFoto(lbl_foto.getIcon());
       if (!"".equals(txt_matricula.getText()) && !"".equals(txt_nombre.getText()) && !"".equals(txt_appat.getText()) && !"".equals(txt_apmat.getText())
        && !"".equals(txt_correo.getText())&& !"".equals(txt_celular.getText())&& !"".equals(txt_generacion.getText())&& !"".equals(txt_carrera.getText())
        && !"".equals(txt_tematesis.getText())&& !"".equals(txt_dirtesis.getText())&& !"".equals(cmbo_trabajo.getSelectedItem().toString()) && !"".equals(lbl_foto.getIcon())){
            bas.InsertarAspirantes(as);
            Limpiaraspirantes();
            JOptionPane.showMessageDialog(this,"Datos Guardados del aspirante en la DB ", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"Es obligatorio todo los campos del aspirante", "", JOptionPane.ERROR_MESSAGE);
        }                          
     
    }//GEN-LAST:event_btn_registrarActionPerformed

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

    private void txt_celularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_celularKeyTyped
          char C= evt.getKeyChar();
        if(Character.isLetter(C)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar numeros");
            txt_celular.setCursor(null);
        }
    }//GEN-LAST:event_txt_celularKeyTyped

    private void txt_matriculaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_matriculaKeyTyped
          char C= evt.getKeyChar();
        if(Character.isLetter(C)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Solo debes ingresar numeros");
            txt_matricula.setCursor(null);
        }
    }//GEN-LAST:event_txt_matriculaKeyTyped

    private void tabla_aspirantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_aspirantesMouseClicked
         clictablaaspirantes = tabla_aspirantes.rowAtPoint(evt.getPoint());
          String matricula=""+tabla_aspirantes.getValueAt(clictablaaspirantes,0);
          String nombre=""+tabla_aspirantes.getValueAt(clictablaaspirantes,1);
          String apellidopaterno=""+tabla_aspirantes.getValueAt(clictablaaspirantes,2);
          String apellidomaterno=""+tabla_aspirantes.getValueAt(clictablaaspirantes,3);
          String correo=""+tabla_aspirantes.getValueAt(clictablaaspirantes,4);
          String celular=""+tabla_aspirantes.getValueAt(clictablaaspirantes,5);
          String generacion=""+tabla_aspirantes.getValueAt(clictablaaspirantes,6);
          String carrera=""+tabla_aspirantes.getValueAt(clictablaaspirantes,7);
          String tematesis=""+tabla_aspirantes.getValueAt(clictablaaspirantes,8);
          String dirtesis=""+tabla_aspirantes.getValueAt(clictablaaspirantes,9);
          String trabaja=""+tabla_aspirantes.getValueAt(clictablaaspirantes,10);        
          
          txt_matricula.setText(matricula);
          txt_nombre.setText(nombre);
          txt_appat.setText(apellidopaterno);
          txt_apmat.setText(apellidomaterno);
          txt_correo.setText(correo);
          txt_celular.setText(celular);
          txt_carrera.setText(carrera);
          txt_generacion.setText(generacion);
          txt_tematesis.setText(tematesis);
          txt_dirtesis.setText(dirtesis);
          cmbo_trabajo.getSelectedItem().equals(trabaja);
          
    }//GEN-LAST:event_tabla_aspirantesMouseClicked

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_foto;
    private javax.swing.JButton btn_modifica;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmbo_trabajo;
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
