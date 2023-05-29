
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionSQL {
    String strConectionBD="jdbc:sqlite:src/BD App/Tienda2.s3db";
    Connection conectar = null;
    PreparedStatement pstm = null;
    public ResultSet Respuesta = null;
    /*----------------------------------------------------------------------*/
   public ConexionSQL(){
        try{
            Class.forName("org.sqlite.JDBC");
            conectar = DriverManager.getConnection(strConectionBD);
            System.out.println("Conexion establecida");
        }catch(Exception e){
            System.err.println("Error de conexion"+e);
        }
    }
   
   public void cerrarConexion(){
        try{            
            //pstm.close();    // esto es lo importante, para cerrar
            conectar.close();
            System.out.println("BD close");
        }catch (Exception e){
            System.out.println("No pudo cerrarse la BD: "+e); 
        }
   }
   
   public int ejecutarSentenciaSQL(String strSentenciaSQL){
       try{
           PreparedStatement pstm = conectar.prepareStatement(strSentenciaSQL);
           pstm.execute();
           return 1;
       }catch (SQLException e) {
           System.err.println("Error de ejecución SQL: "+e);
           return 0;
       }
    }
   
   public ResultSet consultarRegistro(String strSentenciaSQL){
       try {
           PreparedStatement pstm = conectar.prepareStatement(strSentenciaSQL);
           ResultSet respuesta = pstm.executeQuery();
           return respuesta;
       } catch (Exception e) {
           System.out.println("Error de ejecución consulta SQL: "+e);
           return null;
       } 
   }
}
    


