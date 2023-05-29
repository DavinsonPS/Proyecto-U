package Inferfaz;

import Conexion.ConexionSQL;
import Negocio.Usuarios;
import javax.swing.JOptionPane;

public class AddUsers extends javax.swing.JFrame {

    public AddUsers() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtuserName = new javax.swing.JTextField();
        txtuserPass = new javax.swing.JPasswordField();
        cbxuserRol = new javax.swing.JComboBox<>();
        btnregisterUser = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar nuevos usuarios");

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevos usuarios");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("USUARIO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CONTRASEÑA:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ROL:");

        txtuserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserNameActionPerformed(evt);
            }
        });

        txtuserPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserPassActionPerformed(evt);
            }
        });

        cbxuserRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adminstrador", "Gerente", "Creador", "Auxiliar", "Vendedor" }));

        btnregisterUser.setBackground(new java.awt.Color(204, 204, 255));
        btnregisterUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnregisterUser.setText("Regitrar");
        btnregisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterUserActionPerformed(evt);
            }
        });

        btnexit.setBackground(new java.awt.Color(255, 0, 0));
        btnexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnexit.setText("X");
        btnexit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cbxuserRol, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtuserName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtuserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnregisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addComponent(btnexit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexit))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtuserName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtuserPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxuserRol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnregisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserNameActionPerformed
        
    }//GEN-LAST:event_txtuserNameActionPerformed

    private void txtuserPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserPassActionPerformed
        
    }//GEN-LAST:event_txtuserPassActionPerformed

    private void btnregisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterUserActionPerformed
        try {
            ConexionSQL objConexion = new ConexionSQL();
            Usuarios oUsuarios = recuperarDatosUsers();
            //formato para usar Querys de SQL 
            String strSentenciaInsert = String.format("INSERT INTO tblUsuario (username, password, idTipoUsu) "
                    + "VALUES ('%s', '%s', %s)",oUsuarios.getUserName(),oUsuarios.getPassword(),oUsuarios.getRol());
            objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
            JOptionPane.showMessageDialog(null,"Usuario registrado con exíto");
            this.clearCampos();
        } catch (Exception e) {
            System.out.println("Hubo un error al insertar el usuario: "+e);
            JOptionPane.showMessageDialog(null,"Error, no se pudo completar el registro");
        }
        
    }//GEN-LAST:event_btnregisterUserActionPerformed
    //Metodo para asignar los valores ingresados en los campos a la clase Usuario
    public Usuarios recuperarDatosUsers(){
        Usuarios oUsuarios = new Usuarios();
        oUsuarios.setUserName(txtuserName.getText());
        oUsuarios.setPassword(txtuserPass.getText());
        int rol = cbxuserRol.getSelectedIndex();
        int idRol = rol+1;
        oUsuarios.setRol(idRol);
        return oUsuarios;
    }
    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        Principal acceso = new Principal();
        acceso.mostrarProductos();
        this.setVisible(false);
        acceso.setVisible(true);
    }//GEN-LAST:event_btnexitActionPerformed
    //Metodo de limpieza para los campos
    public void clearCampos(){
        txtuserName.setText("");
        txtuserPass.setText("");
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnregisterUser;
    private javax.swing.JComboBox<String> cbxuserRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtuserName;
    private javax.swing.JPasswordField txtuserPass;
    // End of variables declaration//GEN-END:variables
}
