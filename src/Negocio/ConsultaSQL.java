package Negocio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;


public class ConsultaSQL {
    private Connection con;
    private ResultSet rs;
    private ResultSetMetaData mtd;
    private String[] columnas;
    private String consulta, error; 
    
    public ConsultaSQL (Connection c,String sql){
        this.con=c;
        this.consulta=sql;
            try{
                Statement st = con.createStatement();
                rs = st.executeQuery(consulta);
                mtd=rs.getMetaData();
                error=null;
            } catch (SQLException ex){
                error=ex.getMessage();
            }
    }
    
    public String getError(){
        return this.error;
    }
    
    public ResultSet getResultado(){
        return this.rs;
    }
    
    public String [] getNombresColumnas(){
        try {
            int numColumnas = mtd.getColumnCount();
            this.columnas=new String [numColumnas];
            
            for(int i=0;i<numColumnas;i++){
                columnas[i]=mtd.getColumnLabel(i+1);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ConsultaSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return columnas;
    }
    @Override
    public String toString(){
        return ""+columnas[0] + columnas[1];
    }
}
