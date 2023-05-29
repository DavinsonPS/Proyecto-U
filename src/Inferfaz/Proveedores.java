package Inferfaz;

import Conexion.ConexionSQL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Negocio.OrdenesC;
import Negocio.Pedido;
import javax.swing.JTable;

public class Proveedores extends javax.swing.JFrame implements Runnable{
    public String userName, nomProd;
    public int Rol;
    DefaultTableModel modelo; //Crea el modelo global de la tabla
    //variables hora
    String hora,minutos,segundos;
    Thread hilo;
    
    public Proveedores() {
        initComponents();
        
        String[] titulos = {"Codigo","Producto","Cantidad","Descripción","Precio C/U"};
        modelo = new DefaultTableModel(null,titulos);
        tblOC.setModel(modelo);
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/YYYY");
        fecha.setText("Fecha: "+formato.format(sistFecha));
        //Hora
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
        this.LimpiarCampos();
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

        btnGcodigos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtOC = new javax.swing.JTextField();
        lblTotalPagar = new javax.swing.JLabel();
        btninventario = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbhora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        lblTotalUnidades = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOC = new javax.swing.JTable();
        btnProveedores = new javax.swing.JButton();
        btnCuadre = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRealizarPedido = new javax.swing.JButton();
        btnCancelarPedido = new javax.swing.JButton();
        btnOC = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btncerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUsuarioPedidos = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCrearOC = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNitProveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblTotalProductos = new javax.swing.JLabel();
        lblCodigoProducto = new javax.swing.JLabel();
        txtCodProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCantProducto = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Proveedores y Productos");
        setExtendedState(6);

        btnGcodigos.setText("Generar códigos de producto");
        btnGcodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGcodigosActionPerformed(evt);
            }
        });

        txtOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOCActionPerformed(evt);
            }
        });

        lblTotalPagar.setText("00000");

        btninventario.setText("Inventario");
        btninventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninventarioActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbhora.setText("Hora: 10:59 am");

        fecha.setText("Fecha: 16/08/2022");

        lblTotalUnidades.setText("Total de Unidades: 0");

        jLabel7.setText("ventas:0.0 ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbhora, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotalUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbhora)
                    .addComponent(fecha)
                    .addComponent(lblTotalUnidades)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        tblOC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"cod1", "Leche", "50", "Leche entera colanta",  new Integer(2500), "Lacteo"},
                {"cod2", "Quesito", "60", "Quesito colanta 500Gr",  new Integer(2100), "Lacteo"},
                {"cod3", "Yogurt", "100", "Paq yogurt por 20 c/u",  new Integer(800), "Lacteo"},
                {"cod4", "Leche ", "30", "Leche deslactosada 1L",  new Integer(2800), "Lacteo"}
            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Descripción", "Precio-C/U", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblOC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOC);
        if (tblOC.getColumnModel().getColumnCount() > 0) {
            tblOC.getColumnModel().getColumn(0).setResizable(false);
            tblOC.getColumnModel().getColumn(1).setResizable(false);
            tblOC.getColumnModel().getColumn(2).setResizable(false);
            tblOC.getColumnModel().getColumn(3).setResizable(false);
            tblOC.getColumnModel().getColumn(4).setResizable(false);
            tblOC.getColumnModel().getColumn(5).setResizable(false);
        }
        tblOC.getAccessibleContext().setAccessibleName("");

        btnProveedores.setBackground(new java.awt.Color(153, 153, 255));
        btnProveedores.setText(" Proveedores");

        btnCuadre.setText("Cuadre");
        btnCuadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadreActionPerformed(evt);
            }
        });

        jLabel5.setText("TOTAL A PAGAR:");

        btnRealizarPedido.setText("Realizar Pedido");
        btnRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPedidoActionPerformed(evt);
            }
        });

        btnCancelarPedido.setText("Cancelar Pedido");
        btnCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPedidoActionPerformed(evt);
            }
        });

        btnOC.setText("Orden de compra");
        btnOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOCActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btncerrarSesion.setText("cerrar sesión");
        btncerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarSesionActionPerformed(evt);
            }
        });

        jLabel2.setText("USUARIO:");

        lblUsuarioPedidos.setText("NOMBRE USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuarioPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncerrarSesion)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUsuarioPedidos)
                    .addComponent(btncerrarSesion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        jLabel4.setText("Orden de compra:");

        btnCrearOC.setText("CrearOC");
        btnCrearOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearOCActionPerformed(evt);
            }
        });

        jLabel8.setText("Nit Proveedor");

        txtNitProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitProveedorActionPerformed(evt);
            }
        });

        jLabel9.setText("TOTAL PRODUCTOS:");

        lblTotalProductos.setText("000000");

        lblCodigoProducto.setText("Codigo Producto:");

        txtCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProductoActionPerformed(evt);
            }
        });

        jLabel11.setText("Cantidad:");

        txtCantProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantProductoActionPerformed(evt);
            }
        });

        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        btnVenta.setText("Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelarPedido)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRealizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtOC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnInicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnGcodigos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnVenta)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btninventario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProveedores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCuadre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPedidos))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblCodigoProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCrearOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(139, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOC)
                    .addComponent(btnGcodigos)
                    .addComponent(btninventario)
                    .addComponent(btnProveedores)
                    .addComponent(btnCuadre)
                    .addComponent(btnInicio)
                    .addComponent(btnPedidos)
                    .addComponent(btnVenta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNitProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearOC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoProducto)
                    .addComponent(txtCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCantProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto)
                    .addComponent(btnEliminarProducto))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalPagar)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalProductos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGcodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGcodigosActionPerformed
        Codigos c1 = new Codigos();
        this.setVisible(false);
        c1.recibirUser(userName, Rol);
        c1.setVisible(true);
    }//GEN-LAST:event_btnGcodigosActionPerformed

    private void txtOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOCActionPerformed

    }//GEN-LAST:event_txtOCActionPerformed

    private void btnCuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCuadreActionPerformed

    private void btnRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedidoActionPerformed
        if(lblTotalProductos.getText() != "000000"){
            Proveedores pedidos = new Proveedores();
            pedidos.setVisible(true);
            this.setVisible(false);
            /*txtOC.setText("");
            txtNitProveedor.setText("");
            this.mostrarOC();
            btnAgregarProducto.setEnabled(true);
            btnEliminarProducto.setEnabled(true);
            txtOC.setEditable(true);
            txtNitProveedor.setEditable(true);
            btnCrearOC.setEnabled(true);
            lblTotalPagar.setText("");
            lblTotalProductos.setText("");*/
            JOptionPane.showMessageDialog(null,"Pedido registrado con exíto");
        }else{
            JOptionPane.showMessageDialog(null,"Registre un pedido");
        }
        System.out.println("Etiqueta:"+lblTotalProductos.getText());
    }//GEN-LAST:event_btnRealizarPedidoActionPerformed

    private void btnCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPedidoActionPerformed
      if(lblTotalProductos.getText() != "000000"){
            Proveedores pedidos = new Proveedores();
            this.EliminarPedido();
            pedidos.setVisible(true);
            this.setVisible(false);
            JOptionPane.showMessageDialog(null,"Pedido eliminado con exito");
        }else{
            JOptionPane.showMessageDialog(null,"No hay un pedido para eliminar");
        }
        System.out.println("Etiqueta:"+lblTotalProductos.getText());
    }//GEN-LAST:event_btnCancelarPedidoActionPerformed

    private void btnOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOCActionPerformed
        OC oc = new OC();
        this.setVisible(false);
        oc.recibirUser(userName, Rol);
        oc.setVisible(true);
    }//GEN-LAST:event_btnOCActionPerformed

    private void btncerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarSesionActionPerformed
        ConexionSQL objConexion = new ConexionSQL();
        objConexion.cerrarConexion();
        Inicio_Sesion volver = new Inicio_Sesion();
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btncerrarSesionActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Principal acceso = new Principal();
        acceso.mostrarProductos();
        this.setVisible(false);
        acceso.recibirUser(userName, Rol);
        acceso.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCrearOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearOCActionPerformed
        ConexionSQL objConexion = new ConexionSQL();
        Pedido oPedido = recuperarDatosPedido();
        String strSentenciaConsulta = String.format("SELECT * FROM tblProveedores WHERE nitProveedor = '%s'", oPedido.getNitProveedor());
        ResultSet proveedor = objConexion.consultarRegistro(strSentenciaConsulta);
        String strSentenciaConsulta1 = String.format("SELECT * FROM tblProductos WHERE nitProvedor = '%s'", oPedido.getNitProveedor());
        ResultSet producto = objConexion.consultarRegistro(strSentenciaConsulta1);
        int cont = 0;
        int contOC = 0;
        try {while(proveedor.next()){cont += 1;}}catch (Exception e) {}
        if(cont != 1){JOptionPane.showMessageDialog(null,"El proveedor no se encuentra regsitrado");}else{
            String strSentenciaConsulta2 = String.format("SELECT * FROM tblPedido WHERE CodPedido = '%s'", oPedido.getCodPedido());
            ResultSet OC = objConexion.consultarRegistro(strSentenciaConsulta2);
            try {while(OC.next()){contOC += 1;}}catch (Exception e) {}
            if(contOC == 1){JOptionPane.showMessageDialog(null,"La OC ya se encuentra registrada");}
            else{
            String strSentenciaInsertOC = String.format("INSERT INTO tblPedido (CodPedido, fechaPedido, nitProveedor)"
                    + "VALUES ('%s', '%s', '%s')", oPedido.getCodPedido(), oPedido.getFecha(), oPedido.getNitProveedor());
            objConexion.ejecutarSentenciaSQL(strSentenciaInsertOC);
            JOptionPane.showMessageDialog(null,"OC registrada con exíto");
            btnCrearOC.setEnabled(false);
            txtOC.setEditable(false);
            txtNitProveedor.setEditable(false);
            btnAgregarProducto.setEnabled(true);
            objConexion.cerrarConexion();}
        }
    }//GEN-LAST:event_btnCrearOCActionPerformed

    private void txtNitProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitProveedorActionPerformed

    private void txtCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProductoActionPerformed

    private void txtCantProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        int cantProd = 0;
        float totalFactura = 0;
        String descripcion = "";
        float precio = 0;
        String tipoProd = "";
        ConexionSQL objConexion = new ConexionSQL();
        OrdenesC oOC = recuperarDatosOC();
        String strSentenciaConsulta = String.format("SELECT * FROM tblProductos WHERE codProducto = '%s' AND nitProvedor = '%s'", 
                oOC.getCodProd(), txtNitProveedor.getText());
        ResultSet resultado = objConexion.consultarRegistro(strSentenciaConsulta);
        int contP = 0;
        try {
            while(resultado.next()){contP += 1;
            descripcion = resultado.getString("descripcion");
            precio = resultado.getFloat("precio");
            tipoProd = resultado.getString("NombreProd");}
            if(contP != 0){
            try {
                String strSentenciaInsertOC = String.format("INSERT INTO tblOrdenC (codOC, codProducto, cantProducto, descProducto,"
                    + "PrecioUnidad, TipoProd) VALUES('%s','%s',%s,'%s',%s,'%s')", 
                        oOC.getCodOC(), oOC.getCodProd(), oOC.getCantProd(), descripcion, precio, tipoProd);
                objConexion.ejecutarSentenciaSQL(strSentenciaInsertOC);
                
                String strSentenciaConsultaCant = String.format("SELECT cantProducto, PrecioUnidad FROM tblOrdenC WHERE codOC = '%s'", oOC.getCodOC());
                ResultSet cantidad = objConexion.consultarRegistro(strSentenciaConsultaCant);
                while(cantidad.next()){
                    cantProd += cantidad.getInt("cantProducto");
                    totalFactura += (cantidad.getFloat("PrecioUnidad")*cantidad.getInt("cantProducto"));}
                lblTotalPagar.setText(""+totalFactura);
                lblTotalProductos.setText(""+cantProd);
                String strSentenciaUpdate = String.format("UPDATE tblPedido SET cantProductos = %s, totalPagar = %s WHERE CodPedido = '%s'",
                            cantProd, totalFactura, oOC.getCodOC());
                objConexion.ejecutarSentenciaSQL(strSentenciaUpdate);
                this.LimpiarCampos();
                btnAgregarProducto.setEnabled(true);
                this.mostrarOC();
                objConexion.cerrarConexion();
            } catch (Exception e) {System.out.println("Error de insersion a la tblOrdenC: "+e);}
            }else{JOptionPane.showMessageDialog(null,"El proveedor no maneja este producto");}
        } catch (Exception e) {
            System.out.println("Error al insertar en OrdenC: "+e);
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        Pedidos p1 = new Pedidos();
        this.setVisible(false);
        p1.setVisible(true);
        p1.recibirUser(userName, Rol);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        Venta v1 = new Venta();
        v1.setVisible(true);
        this.setVisible(false);
        v1.recibirUser(userName, Rol);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btninventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninventarioActionPerformed
        
    }//GEN-LAST:event_btninventarioActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        ConexionSQL objConexion = new ConexionSQL();
        OrdenesC oOC = recuperarDatosOC();
        String strSentenciaUpdate = String.format("DELETE FROM tblOrdenC WHERE codOC = '%s' AND codProducto = '%s' AND cantProducto = %s",
                        oOC.getCodOC(), oOC.getCodProd(), oOC.getCantProd());
        objConexion.ejecutarSentenciaSQL(strSentenciaUpdate);
        this.actualizarPedido();
        this.mostrarOC();
        this.LimpiarCampos();
        btnAgregarProducto.setEnabled(true);
        objConexion.cerrarConexion();
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void tblOCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOCMouseClicked
        if(evt.getClickCount()==1){
            JTable registro = (JTable)evt.getSource();
            txtCodProducto.setText(registro.getModel().getValueAt(registro.getSelectedRow(),0).toString());
            txtCantProducto.setText(registro.getModel().getValueAt(registro.getSelectedRow(),2).toString());
        }
        btnAgregarProducto.setEnabled(false);
        btnEliminarProducto.setEnabled(true);
    }//GEN-LAST:event_tblOCMouseClicked

    public OrdenesC recuperarDatosOC(){
        OrdenesC oOC = new OrdenesC();
        oOC.setCodOC(txtOC.getText());
        oOC.setCodProd(txtCodProducto.getText());
        oOC.setCantProd(Integer.parseInt(txtCantProducto.getText()));
        return oOC;
    }
    
    public Pedido recuperarDatosPedido(){
        Pedido oPedido = new Pedido();
        oPedido.setCodPedido(txtOC.getText());
        oPedido.setNitProveedor(txtNitProveedor.getText());
        Date sistFecha=new Date();
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/YYYY");
        oPedido.setFecha(formato.format(sistFecha));
        //Falta total a pagar y revisar la cantidad de productos
        return oPedido;
    }
    
    public void actualizarPedido(){
        try {
            int cantProd = 0;
            float totalFactura = 0;
            ConexionSQL objConexion = new ConexionSQL();
            OrdenesC oOC = recuperarDatosOC();
            String strSentenciaConsultaCant = String.format("SELECT cantProducto, PrecioUnidad FROM tblOrdenC WHERE codOC = '%s'", txtOC.getText());
            ResultSet cantidad = objConexion.consultarRegistro(strSentenciaConsultaCant);
            while(cantidad.next()){
                cantProd += cantidad.getInt("cantProducto");
                totalFactura += (cantidad.getFloat("PrecioUnidad")*cantidad.getInt("cantProducto"));
            }
            lblTotalPagar.setText(""+totalFactura);
            lblTotalProductos.setText(""+cantProd);
            String strSentenciaUpdate = String.format("UPDATE tblPedido SET cantProductos = %s, totalPagar = %s WHERE CodPedido = '%s'",
                cantProd, totalFactura, oOC.getCodOC());
            objConexion.ejecutarSentenciaSQL(strSentenciaUpdate);
            objConexion.cerrarConexion();
        }catch (Exception e){ 
            System.out.println("Error al actualizar el pedido: "+e);
        }
    }
    
    public void EliminarPedido(){
        ConexionSQL objConexion = new ConexionSQL();
        String strSentenciaConsultaCant = String.format("DELETE FROM tblOrdenC WHERE codOC = '%s'", txtOC.getText());
        ResultSet ocOC = objConexion.consultarRegistro(strSentenciaConsultaCant);
        String strSentenciaConsulta = String.format("DELETE FROM tblPedido WHERE CodPedido = '%s'", txtOC.getText());
        ResultSet ocPedido = objConexion.consultarRegistro(strSentenciaConsulta);
        objConexion.cerrarConexion();
    }
    
    public void LimpiarCampos(){
        txtCantProducto.setText("");
        txtCodProducto.setText("");
        btnAgregarProducto.setEnabled(false);
        btnEliminarProducto.setEnabled(false);
    }
    
    public void mostrarOC(){
        while(modelo.getRowCount()>0){ 
            modelo.removeRow(0); //Recorre y limpia los registros de la tabla (evita que se duplique su contenido)
        }
        try {
            ConexionSQL objConexion = new ConexionSQL();
            String oc = txtOC.getText();
            ResultSet OC = objConexion.consultarRegistro("SELECT * FROM tblOrdenC WHERE codOC = "+"'"+oc+"'"+"");
            int cant = 0;
            while(OC.next()){
                //Tabla = "Codigo","Producto","Cantidad","Descripción","Precio C/U"
                cant = cant + OC.getInt("cantProducto");
                Object[] oOC = {OC.getString("codProducto"), OC.getString("TipoProd"), OC.getString("cantProducto"),
                OC.getString("descProducto"),OC.getString("PrecioUnidad")};
                modelo.addRow(oOC);
            }
            objConexion.cerrarConexion();
        } catch (Exception e){
            System.out.println("Error al consultar la OC: "+e);
        }
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnCancelarPedido;
    private javax.swing.JButton btnCrearOC;
    private javax.swing.JButton btnCuadre;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnGcodigos;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnOC;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRealizarPedido;
    private javax.swing.JButton btnVenta;
    private javax.swing.JButton btncerrarSesion;
    private javax.swing.JButton btninventario;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbhora;
    private javax.swing.JLabel lblCodigoProducto;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JLabel lblTotalProductos;
    private javax.swing.JLabel lblTotalUnidades;
    private javax.swing.JLabel lblUsuarioPedidos;
    private javax.swing.JTable tblOC;
    private javax.swing.JTextField txtCantProducto;
    private javax.swing.JTextField txtCodProducto;
    private javax.swing.JTextField txtNitProveedor;
    private javax.swing.JTextField txtOC;
    // End of variables declaration//GEN-END:variables

    void recibirUser(String user, int rol) {
        userName = user;
        Rol = rol;
        lblUsuarioPedidos.setText(user.toUpperCase());
    }
}
