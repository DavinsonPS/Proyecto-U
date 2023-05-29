
package Inferfaz;

import Conexion.ConexionSQL;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OC extends javax.swing.JFrame implements Runnable{
    public String userName;
    public int Rol;
    
    DefaultTableModel modelo; //Crea el modelo global de la tabla
    //variables hora
    String hora,minutos,segundos;
    Thread hilo;

    public OC() {
        initComponents();
        String[] titulos = {"OC","Fecha","NIT Proveedor","Cantidad de Productos","Valor"};
        modelo = new DefaultTableModel(null,titulos);
        tblPedidos.setModel(modelo);
        this.mostrarOC();
        
        Date sistFecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY");
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
        jLabel4 = new javax.swing.JLabel();
        btnGCodigos = new javax.swing.JButton();
        txtOC = new javax.swing.JTextField();
        btnInventario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnProveedores = new javax.swing.JButton();
        btnCuadre = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnVenta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnCerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUsuarioOC = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lbhora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        lblTotalOCs = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAprobarFactura = new javax.swing.JButton();
        btnRechazarFactura = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtTotalPagar = new javax.swing.JLabel();
        btnPedidos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtTotalProductos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenes de Compra");
        setExtendedState(6);

        btnOC.setBackground(new java.awt.Color(102, 102, 255));
        btnOC.setText("Orden de compra");
        btnOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOCActionPerformed(evt);
            }
        });

        jLabel4.setText("Numero de factura:");

        btnGCodigos.setText("Generar códigos de producto");
        btnGCodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGCodigosActionPerformed(evt);
            }
        });

        txtOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOCActionPerformed(evt);
            }
        });

        btnInventario.setText("Inventario");

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Leche", "50", "Leche entera colanta",  new Integer(2500), "Lacteo"},
                {"Quesito", "60", "Quesito colanta 500Gr",  new Integer(2100), "Lacteo"},
                {"Yogurt", "100", "Paq yogurt por 20 c/u",  new Integer(800), "Lacteo"},
                {"Leche ", "30", "Leche deslactosada 1L",  new Integer(2800), "Lacteo"}
            },
            new String [] {
                "Producto", "Cantidad", "Descripción", "Precio-C/U", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPedidos);

        btnProveedores.setText(" Proveedores");
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

        jLabel5.setText("TOTAL A PAGAR:");

        btnVenta.setText("Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCerrarSesion.setText("cerrar sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        jLabel2.setText("USUARIO:");

        lblUsuarioOC.setText("NOMBRE USUARIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuarioOC, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUsuarioOC)
                    .addComponent(btnCerrarSesion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbhora.setText("Hora: 10:59 am");

        fecha.setText("Fecha: 16/08/2022");

        lblTotalOCs.setText("Total de OC: 0");

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
                .addComponent(lblTotalOCs, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbhora)
                    .addComponent(fecha)
                    .addComponent(lblTotalOCs)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        btnAprobarFactura.setText("Aprobar factura");
        btnAprobarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarFacturaActionPerformed(evt);
            }
        });

        btnRechazarFactura.setText("Rechazar factura");
        btnRechazarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechazarFacturaActionPerformed(evt);
            }
        });

        btnInicio.setText("Inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtTotalPagar.setText("000000");

        btnPedidos.setText("Pedidos");
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        jLabel8.setText("CANT. PRODUCTOS");

        txtTotalProductos.setText("000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 668, Short.MAX_VALUE)
                                .addComponent(btnRechazarFactura))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAprobarFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOC, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGCodigos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInventario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProveedores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCuadre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPedidos)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOC)
                    .addComponent(btnGCodigos)
                    .addComponent(btnVenta)
                    .addComponent(btnInventario)
                    .addComponent(btnProveedores)
                    .addComponent(btnCuadre)
                    .addComponent(btnInicio)
                    .addComponent(btnPedidos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(jLabel4)
                    .addComponent(txtOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalProductos))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalPagar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRechazarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAprobarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOCActionPerformed

    private void btnAprobarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarFacturaActionPerformed
        if(txtOC.getText().isEmpty()){JOptionPane.showMessageDialog(null,"Selecione o consulte una OC");}else{
        this.AgregarProductosInventario();
        this.RechazarOC();
        this.mostrarOC();
        txtOC.setText("");
        txtTotalPagar.setText("0");
        txtTotalProductos.setText("0");}
    }//GEN-LAST:event_btnAprobarFacturaActionPerformed
    
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Principal acceso = new Principal();
        acceso.mostrarProductos();
        this.setVisible(false);
        acceso.recibirUser(userName, Rol);
        acceso.setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        Inicio_Sesion volver = new Inicio_Sesion();
        volver.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnGCodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGCodigosActionPerformed
        Codigos c1 = new Codigos();
        this.setVisible(false);
        c1.recibirUser(userName, Rol);
        c1.setVisible(true);
    }//GEN-LAST:event_btnGCodigosActionPerformed

    private void txtOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOCActionPerformed
  
    }//GEN-LAST:event_txtOCActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        this.ConsultarOC();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnRechazarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarFacturaActionPerformed
        if(txtOC.getText().isEmpty()){JOptionPane.showMessageDialog(null,"Seleccione o consulte una OC ");}else{ 
        this.RechazarOC();
        this.mostrarOC();
        txtOC.setText("");
        txtTotalPagar.setText("0");
        txtTotalProductos.setText("0");}
    }//GEN-LAST:event_btnRechazarFacturaActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        Venta v1 = new Venta();
        this.setVisible(false);
        v1.recibirUser(userName, Rol);
        v1.setVisible(true);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnCuadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCuadreActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        Pedidos seleccion = new Pedidos();
        this.setVisible(false);
        seleccion.recibirUser(userName, Rol);
        seleccion.setVisible(true);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void tblPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPedidosMouseClicked
        if(evt.getClickCount()==1){
            JTable registro = (JTable)evt.getSource();
            txtOC.setText(registro.getModel().getValueAt(registro.getSelectedRow(),0).toString());
            txtTotalPagar.setText(registro.getModel().getValueAt(registro.getSelectedRow(),4).toString());
            txtTotalProductos.setText(registro.getModel().getValueAt(registro.getSelectedRow(),3).toString());
        }
    }//GEN-LAST:event_tblPedidosMouseClicked

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        Proveedores p1 = new Proveedores();
        this.setVisible(false);
        p1.setVisible(true);
        p1.recibirUser(userName, Rol);
    }//GEN-LAST:event_btnProveedoresActionPerformed
    
    public void mostrarOC(){
        while(modelo.getRowCount()>0){ 
            modelo.removeRow(0); //Recorre y limpia los registros de la tabla (evita que se duplique su contenido)
        }
        ConexionSQL objConexion = new ConexionSQL();
        String OC = txtOC.getText();
        try {
            ResultSet productos = objConexion.consultarRegistro("SELECT * FROM tblPedido WHERE aprobada = 0");
            int cant = 0;
            while(productos.next()){
                cant += 1;
                //"OC","Fecha","NIT Proveedor","Cantidad de Productos","Valor"
                Object[] oProductos = {productos.getString("CodPedido"),productos.getString("fechaPedido"),
                productos.getString("nitProveedor"),productos.getString("cantProductos"),
                productos.getString("totalPagar")};
                modelo.addRow(oProductos);
            }
            if(cant == 0 && OC != null && !OC.isEmpty()){
                JOptionPane.showMessageDialog(null,"La OC no se encuentra registrada o esta vacia");
                txtOC.setText("");
            }else{
                System.out.println("Consulta realizada y sin datos");
            }
            lblTotalOCs.setText("Total de OC: "+ cant);
            objConexion.cerrarConexion();
        } catch (Exception e){
            System.out.println("Error al consultar la OC: "+e);
        }
    }
    
    public void ConsultarOC(){
        while(modelo.getRowCount()>0){ 
            modelo.removeRow(0); //Recorre y limpia los registros de la tabla (evita que se duplique su contenido)
        }
        ConexionSQL objConexion = new ConexionSQL();
        String OC = txtOC.getText();
        try {
            ResultSet productos = objConexion.consultarRegistro("SELECT * FROM tblPedido WHERE CodPedido ="+"'"+OC+"'"+"");
            int cant = 0;
            while(productos.next()){
                cant += 1;
                //"OC","Fecha","NIT Proveedor","Cantidad de Productos","Valor"
                Object[] oProductos = {productos.getString("CodPedido"),productos.getString("fechaPedido"),
                productos.getString("nitProveedor"),productos.getString("cantProductos"),
                productos.getString("totalPagar")};
                modelo.addRow(oProductos);
                txtTotalPagar.setText(productos.getString("totalPagar"));
                txtTotalProductos.setText(productos.getString("cantProductos"));
            }
            if(cant == 0 && OC != null && !OC.isEmpty()){
                JOptionPane.showMessageDialog(null,"La OC no se encuentra registrada o esta vacia");
                txtOC.setText("");
            }else{
                System.out.println("Consulta realizada y sin datos");
            }
            lblTotalOCs.setText("Total de Unidades: "+ cant);
            objConexion.cerrarConexion();
        } catch (Exception e){
            System.out.println("Error al consultar la OC: "+e);
        }
    }
    
    public void RechazarOC(){
        ConexionSQL objConexion = new ConexionSQL();
        String strSentenciaUpdate = String.format("UPDATE tblPedido SET aprobada = 1 WHERE CodPedido = '%s'", txtOC.getText());
        objConexion.ejecutarSentenciaSQL(strSentenciaUpdate);
        objConexion.cerrarConexion();
    }
    
    public void AgregarProductosInventario(){
        try {
            ConexionSQL objConexion = new ConexionSQL();
            int cantidad;
            String oc = txtOC.getText();
            ResultSet Productos = objConexion.consultarRegistro("SELECT * FROM tblOrdenC WHERE codOC = "+"'"+oc+"'"+"");
            while(Productos.next()){
                ResultSet Mercancia = objConexion.consultarRegistro("SELECT * FROM tblMercancia");
                while(Mercancia.next()){
                    if((Productos.getString("codProducto")).equals(Mercancia.getString("codigoProducto"))){
                        cantidad = Productos.getInt("cantProducto")+ Mercancia.getInt("cantidadMerc");
                        String strSentenciaUpdate = String.format("UPDATE tblMercancia SET cantidadMerc = %s WHERE codigoProducto = '%s'",
                                cantidad, Productos.getString("codProducto"));
                        objConexion.ejecutarSentenciaSQL(strSentenciaUpdate);
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"Factura aprobada correctamente");
            objConexion.cerrarConexion();
        } catch (Exception e) {
            System.out.println("Error en: "+e);
        }
        
    }
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAprobarFactura;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCuadre;
    private javax.swing.JButton btnGCodigos;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnOC;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnRechazarFactura;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbhora;
    private javax.swing.JLabel lblTotalOCs;
    private javax.swing.JLabel lblUsuarioOC;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtOC;
    private javax.swing.JLabel txtTotalPagar;
    private javax.swing.JLabel txtTotalProductos;
    // End of variables declaration//GEN-END:variables

    void recibirUser(String user, int rol) {
        userName = user;
        Rol = rol;
        lblUsuarioOC.setText(user.toUpperCase());
    }
}
