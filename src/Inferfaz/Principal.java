package Inferfaz;

import Conexion.ConexionSQL;
import java.sql.ResultSet;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame implements Runnable{
    public String userName;
    public int Rol;
    DefaultTableModel modelo; //Crea el modelo global de la tabla
    String hora,minutos,segundos;
    Thread hilo;
    public Principal() {
        initComponents();
        this.mostrarProductos();
        String[] titulos = {"#","Código","Producto","Precio","Unidades","Proveedor","Vencimiento"};
        modelo = new DefaultTableModel(null,titulos);
        tblProductos.setModel(modelo);
        //Fecha
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/YYYY");
        fecha.setText("Fecha: "+formato.format(sistFecha));
        //Hora
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
    }
    //hora
    public void hora(){
        Calendar calendario = new GregorianCalendar();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    public void run(){
        Thread current = Thread.currentThread();
        while(current==hilo){
            hora();
            lbhora.setText("Hora: "+hora+":"+minutos+":"+segundos);
        }
    }
    //codigo hora
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOC = new javax.swing.JButton();
        btnGenerarCodigos = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnCuadre = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblTotalUnidades = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        lbhora = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPedidos = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido a Tracking");
        setExtendedState(6);
        setSize(new java.awt.Dimension(0, 0));

        btnOC.setText("Orden de compra ");
        btnOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOCActionPerformed(evt);
            }
        });

        btnGenerarCodigos.setText("Generar codigos de producto");
        btnGenerarCodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigosActionPerformed(evt);
            }
        });

        btnVentas.setText("Venta");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnInventario.setText("Inventario");

        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnCuadre.setText("Cuadre");
        btnCuadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadreActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenido.");

        jLabel2.setText("USUARIO:");

        jLabel3.setText("NOMBRE USUARIO");

        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCerrarSesion)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(btnCerrarSesion))
                .addContainerGap())
        );

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "", ""}
            },
            new String [] {
                "#", "Código", "Producto", "Marca ", "Unidades", "Proveedor", "Vencimiento"
            }
        ));
        tblProductos.setSelectionForeground(new java.awt.Color(0, 0, 255));
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(0).setPreferredWidth(7);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTotalUnidades.setText("Total de Unidades: 0");

        jLabel7.setText("ventas:0.0 ");

        fecha.setText("Fecha: 11/16/2021");

        lbhora.setText("Hora: 10:59 pm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lbhora, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(lblTotalUnidades)
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalUnidades)
                    .addComponent(jLabel7)
                    .addComponent(fecha)
                    .addComponent(lbhora))
                .addContainerGap())
        );

        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnAddUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Add1.png"))); // NOI18N
        btnAddUser.setToolTipText("Registrar Nuevos Usuarios Para el Sistema");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerarCodigos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVentas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInventario)
                        .addGap(18, 18, 18)
                        .addComponent(btnProveedores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCuadre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOC)
                            .addComponent(btnGenerarCodigos)
                            .addComponent(btnVentas)
                            .addComponent(btnInventario)
                            .addComponent(btnProveedores)
                            .addComponent(btnCuadre)
                            .addComponent(btnPedidos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarCodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigosActionPerformed
        Codigos c1 = new Codigos();
        this.setVisible(false);
        c1.recibirUser(userName, Rol);
        c1.setVisible(true);
    }//GEN-LAST:event_btnGenerarCodigosActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        ConexionSQL objConexion = new ConexionSQL();
        objConexion.cerrarConexion();
        Inicio_Sesion volver = new Inicio_Sesion();
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOCActionPerformed
        OC oc = new OC();
        this.setVisible(false);
        oc.recibirUser(userName, Rol);
        oc.setVisible(true);
    }//GEN-LAST:event_btnOCActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Venta v1 = new Venta();
        this.setVisible(false);
        v1.recibirUser(userName, Rol);
        v1.setVisible(true);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnCuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCuadreActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        Pedidos p1 = new Pedidos();
        this.setVisible(false);
        p1.setVisible(true);
        p1.recibirUser(userName, Rol);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        AddUsers acceso = new AddUsers();
        acceso.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        Proveedores p1 = new Proveedores();
        this.setVisible(false);
        p1.setVisible(true);
        p1.recibirUser(userName, Rol);
    }//GEN-LAST:event_btnProveedoresActionPerformed
    public void mostrarProductos(){
                ConexionSQL objConexion = new ConexionSQL();
                try {
                    ResultSet productos = objConexion.consultarRegistro("SELECT * FROM tblMercancia");
                    int cant = 0;
                    int totalProductos = 0;
                    while(productos.next()){
                        cant += 1;
                        totalProductos += productos.getInt("cantidadMerc");
                        Object[] oProductos = {/*productos.getString("idM")*/cant,productos.getString("codigoMerc"),
                            productos.getString("NombreMerc"),productos.getString("precioMerc"),productos.getString("cantidadMerc"),
                            productos.getString("nitProveedor"),productos.getString("fechaVencimiento"),};
                        modelo.addRow(oProductos);
                    }
                    lblTotalUnidades.setText("Total de Unidades: "+ totalProductos);
                    objConexion.cerrarConexion();
                } catch (Exception e) {
                }
            }
    

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCuadre;
    private javax.swing.JButton btnGenerarCodigos;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnOC;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbhora;
    private javax.swing.JLabel lblTotalUnidades;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables

    void recibirUser(String user, int rol) {
        userName = user;
        Rol = rol;
        jLabel3.setText(userName.toUpperCase());
        if(rol == 1){
            btnAddUser.setVisible(true);
        }else{
            btnAddUser.setVisible(false);
        }
    }
}
