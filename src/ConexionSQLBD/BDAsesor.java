
package ConexionSQLBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import selecciones.Asesores;

public class BDAsesor {
    
    public ArrayList <Asesores> ListaAsesores(){
     ArrayList <Asesores> asesor= new ArrayList(); 
     
      try {
          Connection con=BaseDatosConexion.getConnection();
          Statement st= con.createStatement();
          ResultSet rs= st.executeQuery("SELECT IDASESOR,NOMBRE,APELLIDOS,CUBICULO,CORREO,HORARIO,DIAS,HORARIO_DE_TRABAJO"
          +"FROM BDASESORES ORDER BY 2");
          while(rs.next()){
            Asesores ase=new Asesores();
            ase.setIdasesor(rs.getString("IDASESOR"));
            ase.setNombre(rs.getString("NOMBRE"));
            ase.setApellidos(rs.getString("APELLIDOS"));
            ase.setCubiculo(rs.getString("CUBICULO"));
            ase.setCorreoasesor(rs.getString("CORREO"));
            ase.setHorarioasesoria(rs.getString("HORARIO"));
            ase.setLugar(rs.getString("DIAS"));
            ase.setHorariotrabajo(rs.getString("HORARIO_DE_TRABAJO"));
            asesor.add(ase);
          }
      } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        System.out.println("Error en la lista de asesores");
      }
     return asesor;
  }
public void InsertarAsesores(Asesores asesor){
  try{
    Connection con=BaseDatosConexion.getConnection();
    PreparedStatement pst= con.prepareStatement("INSERT INTO BDASESORES( IDASESOR, NOMBRE, APELLIDOS,CUBICULO, CORREO, HORARIO, DIAS, HORARIO_DE_TRABAJO)"
    +"VALUES(?,?,?,?,?,?,?,?)");
    pst.setString(1,asesor.getIdasesor());
    pst.setString(2,asesor.getNombre());
    pst.setString(3,asesor.getApellidos());
    pst.setString(4,asesor.getCubiculo());
    pst.setString(5,asesor.getCorreoasesor());
    pst.setString(6,asesor.getHorarioasesoria());
    pst.setString(7,asesor.getLugar());
    pst.setString(8,asesor.getHorariotrabajo());
    pst.executeUpdate();
    }catch(SQLException ex){
   System.out.println(ex.getMessage());
   System.out.println("Error en insertar los asesores");
  }  
} 
    
}
