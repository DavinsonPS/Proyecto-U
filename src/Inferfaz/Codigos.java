
package Inferfaz;

import Conexion.ConexionSQL;
import Negocio.OrdenesC;
import com.sun.org.glassfish.external.statistics.annotations.Reset;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Codigos extends javax.swing.JFrame implements Runnable{
    public String userName;
    public int Rol;
    DefaultTableModel modelo; //Crea el modelo global de la tabla
    //Variables hora
    String hora,minutos,segundos;
    Thread hilo;
    
    public Codigos() {
        initComponents();
        String[] titulos = {"Codigo","Producto","Precio","Proveedor", "Codigo Producto"};
        modelo = new DefaultTableModel(null,titulos);
        tblCodigos.setModel(modelo);
        
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/YYYY");
        fecha3.setText("Fecha: "+formato.format(sistFecha));
        //Hora
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
        this.ListarPedidos();
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
            lbhora3.setText("Hora: "+hora+":"+minutos+":"+segundos);
        }
    }
    //codigo hora

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fecha = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbhora = new javax.swing.JLabel();
        fecha2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioProducto = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        btnGenerarCodigo = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCodigos = new javax.swing.JTable();
        jButton11 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lbhora3 = new javax.swing.JLabel();
        fecha3 = new javax.swing.JLabel();
        lblTotalOcs = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnPedidos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        txtCodigoM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        calendarioFecha = new com.toedter.calendar.JDateChooser();

        fecha.setText("Fecha: 11/16/2021");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbhora.setText("Hora: 10:59 pm");

        fecha2.setText("Fecha: 11/16/2021");

        jLabel6.setText("Total de Unidades: 0");

        jLabel9.setText("ventas:0.0 ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbhora, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbhora)
                    .addComponent(fecha2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Mercancia");
        setExtendedState(6);

        jButton10.setText("Cancelar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton8.setText("cerrar sesión");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel2.setText("USUARIO:");

        lblUsuario.setText("NOMBRE USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton8)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(lblUsuario))
            .addComponent(jButton8)
        );

        jButton6.setText(" Proveedores");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnGenerarCodigo.setText("Generar código");
        btnGenerarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCodigoActionPerformed(evt);
            }
        });

        jButton7.setText("Cuadre");

        jButton4.setText("Venta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton9.setText("Guardar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setText("Orden de compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre del producto:");

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setText("Generar códigos de producto");

        jLabel7.setText("Precio del producto: ");

        jButton5.setText("Inventario");

        tblCodigos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"N12-que63", "Queso colanta blanco 400gr", "3500.00", "Colanta"}
            },
            new String [] {
                "Código", "Producto", "Precio", "Proveedor"
            }
        ));
        tblCodigos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCodigosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCodigos);

        jButton11.setText("Inicio");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbhora3.setText("Hora: 11:05 am");

        fecha3.setText("Fecha: 16/08/2022");

        lblTotalOcs.setText("Total de Unidades: 0");

        jLabel11.setText("ventas:0.0 ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbhora3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalOcs, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbhora3)
                    .addComponent(fecha3)
                    .addComponent(lblTotalOcs)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        jLabel8.setText("Proveedor:");

        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });

        jLabel12.setText("Codigo Mercancia:");

        jLabel10.setText("Id Producto:");

        txtCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoActionPerformed(evt);
            }
        });

        jLabel13.setText("Fecha Vencimiento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel12))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecioProducto)
                                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(txtCodigoM))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnGenerarCodigo))
                            .addComponent(calendarioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedidos)
                .addContainerGap(49, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton11)
                    .addComponent(btnPedidos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGenerarCodigo)))
                            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCodigoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addComponent(calendarioFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        OC n1 = new OC();
        this.setVisible(false);
        n1.recibirUser(userName, Rol);
        n1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Principal acceso = new Principal();
        acceso.mostrarProductos();
        this.setVisible(false);
        acceso.setVisible(true);
        acceso.recibirUser(userName, Rol);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Inicio_Sesion volver = new Inicio_Sesion();
        this.setVisible(false);
        volver.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Venta v1 = new Venta();
        this.setVisible(false);
        v1.recibirUser(userName, Rol);
        v1.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        Pedidos pedidos = new Pedidos();
        this.setVisible(false);
        pedidos.recibirUser(userName, Rol);
        pedidos.setVisible(true);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProveedorActionPerformed

    private void btnGenerarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCodigoActionPerformed
        if(txtProveedor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Seleccione un registro");
        }else{
            if(txtCodigoM.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Ingrese un código de mercancia");
            }else{
                this.crearCodigo();
                this.ListarPedidos();
                this.limpiarCampos();
            }
        }
    }//GEN-LAST:event_btnGenerarCodigoActionPerformed

    private void tblCodigosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCodigosMouseClicked
        if(evt.getClickCount()==1){
            JTable registro = (JTable)evt.getSource();
            //"Codigo","Producto","Precio","Proveedor", "Codigo Producto"//Tabla
            txtNombreProducto.setText(registro.getModel().getValueAt(registro.getSelectedRow(),1).toString());
            txtPrecioProducto.setText(registro.getModel().getValueAt(registro.getSelectedRow(),2).toString());
            txtProveedor.setText(registro.getModel().getValueAt(registro.getSelectedRow(),3).toString());
            txtCodigoM.setText(registro.getModel().getValueAt(registro.getSelectedRow(),0).toString());
            txtCodProducto.setText(registro.getModel().getValueAt(registro.getSelectedRow(),4).toString());
        }
    }//GEN-LAST:event_tblCodigosMouseClicked

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProductoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Proveedores p1 = new Proveedores();
        this.setVisible(false);
        p1.setVisible(true);
        p1.recibirUser(userName, Rol);
    }//GEN-LAST:event_jButton6ActionPerformed
    
    public void ListarPedidos(){
        while(modelo.getRowCount()>0){ 
            modelo.removeRow(0); //Recorre y limpia los registros de la tabla (evita que se duplique su contenido)
        }
        ConexionSQL objConexion = new ConexionSQL();
        try {
            ResultSet Productos = objConexion.consultarRegistro("SELECT * FROM tblProductos WHERE codMerc = '0'");
            int cant = 0;
            while(Productos.next()){
                cant += 1;
                //"Codigo","Producto","Precio","Proveedor", "Codigo Producto"//Tabla
                Object[] oProductos = {"", Productos.getString("NombreProd"), Productos.getString("Precio"),
                Productos.getString("nitProvedor"), Productos.getString("codProducto")};
                modelo.addRow(oProductos);
            }
            lblTotalOcs.setText("Total Productos: "+cant);
            objConexion.cerrarConexion();
        } catch (Exception e){
            System.out.println("Error al consultar los Productos: "+e);
        }
    }
    
    public void crearCodigo(){
            ConexionSQL objConexion = new ConexionSQL();
            try {
                String strSentenciaSelect = String.format("SELECT * FROM tblProductos WHERE codMerc = '%s'",txtCodigoM.getText());
                ResultSet consulta = objConexion.consultarRegistro(strSentenciaSelect);
                int cont = 0; 
                while (consulta.next()){cont += 1;}
                if (cont == 1){JOptionPane.showMessageDialog(null,"Verificar la existencia del código");}else{
                
                    SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String date = dFormat.format(calendarioFecha.getDate());
                    String strSentenciaUpdate = String.format("UPDATE tblProductos SET codMerc = '%s' WHERE codProducto = '%s'",
                            txtCodigoM.getText(), txtCodProducto.getText());
                    objConexion.ejecutarSentenciaSQL(strSentenciaUpdate);
                    String strSentenciaInsert = String.format("INSERT INTO tblMercancia (codigoMerc, nitProveedor, nombreMerc, precioMerc,"
                           +" fechaVencimiento, codigoProducto) VALUES ('%s','%s','%s',%s,'%s','%s')",
                            txtCodigoM.getText(), txtProveedor.getText(), txtNombreProducto.getText(), txtPrecioProducto.getText(), 
                            date, txtCodProducto.getText());
                    objConexion.ejecutarSentenciaSQL(strSentenciaInsert);
                    JOptionPane.showMessageDialog(null,"Codigo creado con éxito");
                    objConexion.cerrarConexion();
                
                }
            } catch (Exception e) {
                System.out.println("Error al ejecutar: "+e);
            } 
    }
    
    public void limpiarCampos(){
        txtCodProducto.setText("");
        txtCodigoM.setText("");
        txtNombreProducto.setText("");
        txtPrecioProducto.setText("");
        txtProveedor.setText("");
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Codigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarCodigo;
    private javax.swing.JButton btnPedidos;
    private com.toedter.calendar.JDateChooser calendarioFecha;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel fecha2;
    private javax.swing.JLabel fecha3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbhora;
    private javax.swing.JLabel lbhora3;
    private javax.swing.JLabel lblTotalOcs;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tblCodigos;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtCodigoM;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables

    void recibirUser(String user, int rol) {
        userName = user;
        Rol = rol;
        lblUsuario.setText(user.toUpperCase());
    }

}
