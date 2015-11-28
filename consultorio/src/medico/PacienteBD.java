package medico;

import java.sql.*;
import javax.swing.JOptionPane;
import medico.extras.conectate;
/**

 */
public class PacienteBD {
  conectate con;
  
  public PacienteBD (){
    con = new conectate();
  } 
  
 public void Paciente (String RUT, String NOMBRE, String APELLIDO, String FECHA_DE_NACIMIENTO){
     try {
         try (PreparedStatement pstm = con.getConnection().prepareStatement("insert into " + "PACIENTE(RUT, NOMBRE, APELLIDO, FECHA_DE_NACIMIENTO) " + " values(?,?,?,?)")) {
             pstm.setString(1, RUT);
             pstm.setString(2, NOMBRE);
             pstm.setString(3, APELLIDO);
             pstm.setString(4, FECHA_DE_NACIMIENTO);
             pstm.execute();
             pstm.close();
         }
     }catch(SQLException e){
         System.out.println(e);
     }
 }
 
 /**
  public void Ingreso (String DIAGNOSTICO, String TRATAMIENTO, String FECHA_CONSULTA){
     try{
         try (PreparedStatement pstm = con.getConnection().prepareStatement("insert into " + "CONSULTA_MEDICA(DIAGNOSTICO, TRATAMIENTO, FECHA_CONSULTA) " + " values(?,?,?)")){
         pstm.setString(1, DIAGNOSTICO);
         pstm.setString(2, TRATAMIENTO);
         pstm.setString(3, FECHA_CONSULTA);
         pstm.execute();
         pstm.close();
} 
 } catch(SQLException e){
         System.out.println(e);
 }
 
}
 
 
public void Examenes(String NOMBRE, String TIPO_EXAMEN){
    try{
        try(PreparedStatement pstm = con.getConnection().prepareStatement("insert into " + "EXAMEN(NOMBRE, TIPO_EXAMEN) " + " values(?,?)")){
        pstm.setString(1, NOMBRE);
        pstm.setString(2, TIPO_EXAMEN);
        pstm.execute();
        pstm.close();
        
  }
    }catch(SQLException e){
        System.out.println(e);
    }
    
}

*/

}


  
  
  
  
  
  
  

