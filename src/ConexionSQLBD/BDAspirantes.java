
package ConexionSQLBD;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import selecciones.Aspirante;

public class BDAspirantes {
    
     Statement st;
     ResultSet rs;
     Connection con;
     PreparedStatement ps;
     DefaultTableModel tabla;
     String ora = "SELECT MATRICULA, NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,CORREO,CELULAR,GENERACION,CARRERA,TEMATESIS,DIRECTORTESIS,TRABAJA";
  public ArrayList <Aspirante> ListaAspirantes(){
     ArrayList <Aspirante> aspirante= new ArrayList(); 
   
      try {
          Connection con=BaseDatosConexion.getConnection();
          Statement st= con.createStatement();
          ResultSet rs= st.executeQuery(" SELECT MATRICULA, NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,CORREO,CELULAR,GENERACION,CARRERA,TEMATESIS,DIRECTORTESIS,TRABAJA"
          + "  FROM BASEASPIRANTES ORDER BY 2");
          while(rs.next()){
            Aspirante asp=new Aspirante();
            asp.setMatricula(rs.getString("MATRICULA"));
            asp.setNombre(rs.getString("NOMBRE"));
            asp.setApelPaterno(rs.getString("APELLIDOPATERNO"));
            asp.setApelMaterno(rs.getString("APELLIDOMATERNO"));
            asp.setCorreo(rs.getString("CORREO"));
            asp.setCelular(rs.getString("CELULAR"));
            asp.setGeneracion(rs.getString("GENERACION"));
            asp.setCarrera(rs.getString("CARRERA"));
            asp.setTemTesis(rs.getString("TEMATESIS"));
            asp.setDirTesis(rs.getString("DIRECTORTESIS"));
            asp.setTrabajo(rs.getString("TRABAJA"));
            
            aspirante.add(asp);
          }
      } catch (SQLException ex) {
        System.out.println(ex.getMessage());
        System.out.println("Error en la lista de aspirantes");
      }
     return aspirante;
  }
  
  public DefaultTableModel mostrartabla(){
      String[]Cabecera={"MATRICULA","NOMBRE","APELLIDOPATERNO","APELLIDOMATERNO","CORREO","CELULAR","GENERACION","CARRERA","TEMATESIS","DIRECTORTESIS","TRABAJA"};
      String[]registro= new String[12];
      tabla=new DefaultTableModel(null,Cabecera);
      try{
           st=con.createStatement();
           rs=st.executeQuery(ora);
           while(rs.next()){
              registro[0]= rs.getString("MATRICULA");
            registro[1] =rs.getString("NOMBRE");
            registro[2]=rs.getString("APELLIDOPATERNO");
            registro[3]=rs.getString("APELLIDOMATERNO");
            registro[4]=rs.getString("CORREO");
            registro[5]=rs.getString("CELULAR");
            registro[6]=rs.getString("GENERACION");
            registro[7]=rs.getString("CARRERA");
            registro[8]=rs.getString("TEMATESIS");
            registro[9]=rs.getString("DIRECTORTESIS");
           // registro[10]=rs.getString("FOTO");
            registro[10]=rs.getString("TRABAJA");
             
            tabla.addRow(registro);
           }
          return tabla; 
      }catch(Exception e){
        System.out.println("Error:"+e.getMessage());
          return null;
      }
  }
  
String insertar="INSERT INTO BDASPIRANTES VALUES(?,?,?,?,?,?,?,?,?,?,?)";

public boolean insertarasp(Aspirante a){
    try{
      ps=con.prepareStatement(insertar);
      ps.setString(1,a.getMatricula());
      ps.setString(2,a.getNombre());
      ps.setString(3,a.getApelPaterno());
      ps.setString(4,a.getApelMaterno());
      ps.setString(5,a.getCorreo());
      ps.setString(6,a.getCelular());
      ps.setString(7,a.getGeneracion());
      ps.setString(8,a.getCarrera());
      ps.setString(9,a.getTemTesis());
      ps.setString(10,a.getDirTesis());
       //ps.setBytes(11,a.getFoto());
      ps.setString(11,a.getTrabajo());
     
      
      int r=ps.executeUpdate();
      if(r==1){
          return true;
      }else{
          return false;
      }
    }catch(Exception e){
        System.out.println(e.getMessage());
        return false;
    }
}

public void InsertarAspirantes(Aspirante as){
  try{
    Connection con=BaseDatosConexion.getConnection();
    PreparedStatement pst= con.prepareStatement("INSERT INTO BASEASPIRANTES( MATRICULA, NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,CORREO,CELULAR,GENERACION,CARRERA,TEMATESIS,DIRECTORTESIS,TRABAJA)"
    +"VALUES(?,?,?,?,?,?,?,?,?,?,?)");
    pst.setString(1,as.getMatricula());
    pst.setString(2,as.getNombre());
    pst.setString(3,as.getApelPaterno());
    pst.setString(4,as.getApelMaterno());
    pst.setString(5,as.getCorreo());
    pst.setString(6,as.getCelular());
    pst.setString(7,as.getGeneracion());
    pst.setString(8,as.getCarrera());
    pst.setString(9,as.getTemTesis());
    pst.setString(10,as.getDirTesis());
    //pst.setBytes(12,as.getFoto());
    pst.setString(11,as.getTrabajo());
    
    pst.executeQuery();
    }catch(SQLException ex){
   System.out.println(ex.getMessage());
   System.out.println("Error en insertar los aspirantes");
  }
}

public void ModificarAspirantes(Aspirante as){
  try{
    Connection con=BaseDatosConexion.getConnection();
    PreparedStatement pst= con.prepareStatement("UPDATE BASEASPIRANTES SET  MATRICULA=?, NOMBRE=?,APELLIDOPATERNO=?,APELLIDOMATERNO=?,CORREO=?,CELULAR=?,GENERACION=?,CARRERA=?,TEMATESIS=?,DIRECTORTESIS=?,TRABAJA=?");
    pst.setString(1,as.getMatricula());
    pst.setString(2,as.getNombre());
    pst.setString(3,as.getApelPaterno());
    pst.setString(4,as.getApelMaterno());
    pst.setString(5,as.getCorreo());
    pst.setString(6,as.getCelular());
    pst.setString(7,as.getGeneracion());
    pst.setString(8,as.getCarrera());
    pst.setString(9,as.getTemTesis());
    pst.setString(10,as.getDirTesis());
   // pst.setBytes(12,as.getFoto());
    pst.setString(11,as.getTrabajo());
 System.out.println("Aspirante modificado con exito");
    }catch(SQLException ex){
   System.out.println(ex.getMessage());
   System.out.println("Error en modificar los aspirantes");
  }
}

public void BusquedaAspirantes(String clave){
     Aspirante as= new Aspirante();
    try{
    Connection con=BaseDatosConexion.getConnection();
    PreparedStatement pst= con.prepareStatement("SELECT  FROM  BASEASPIRANTES WHERE MATRICULA=?");
    pst.setString(1,clave);
    ResultSet rs=pst.executeQuery();
    if(rs.next()){
      as.setMatricula(rs.getString(1));
      as.setNombre(rs.getString(2));
      as.setApelPaterno(rs.getString(3));
      as.setApelMaterno(rs.getString(4));
      as.setCorreo(rs.getString(5));
      as.setCelular(rs.getString(6));
      as.setGeneracion(rs.getString(7));
      as.setCarrera(rs.getString(8));
      as.setTemTesis(rs.getString(9));
      as.setDirTesis(rs.getString(10));
         //as.setFoto(rs.getBytes(12));
      as.setTrabajo(rs.getString(11));
   
    }
 System.out.println("Aspirante encontrado , MATRICULA"+as.getMatricula());
    }catch(SQLException ex){
   System.out.println(ex.getMessage());
   System.out.println("Error en encontrar aspirante");
  }
}

 public Aspirante getAspirantesMatricula(String mat){
   Aspirante asp=null;
       try {
            Connection cnx = BaseDatosConexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(" SELECT MATRICULA, NOMBRE,APELLIDOPATERNO,APELLIDOMATERNO,CORREO,CELULAR,GENERACION,CARRERA,TEMATESIS,DIRECTORTESIS,TRABAJA"
                    +" FROM BASEASPIRANTES A JOIN MATRICULA D "
                    +" ON A.MATRICULA=D.MATRICULA WHERE MATRICULA= '"+mat+"'");
            while (rs.next()) {
             asp=new Aspirante();
            asp.setMatricula(rs.getString("MATRICULA"));
            asp.setNombre(rs.getString("NOMBRE"));
            asp.setApelPaterno(rs.getString("APELLIDOPATERNO"));
            asp.setApelMaterno(rs.getString("APELLIDOMATERNO"));
            asp.setCorreo(rs.getString("CORREO"));
            asp.setCelular(rs.getString("CELULAR"));
            asp.setGeneracion(rs.getString("GENERACION"));
            asp.setCarrera(rs.getString("CARRERA"));
            asp.setTemTesis(rs.getString("TEMATESIS"));
            asp.setDirTesis(rs.getString("DIRECTORTESIS"));
            asp.setTrabajo(rs.getString("TRABAJA")); 
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en buscar");
        }
    return asp;
  }        
    
    public void EliminaraAspirantes(String clave){
    try{
    Connection con=BaseDatosConexion.getConnection();
    PreparedStatement pst= con.prepareStatement("DELETE  FROM  BDASPIRANTES.BASEASPIRANTES WHERE MATRICULA = ?");
    pst.setString(1,clave);
    pst.executeUpdate();
 System.out.println("Aspirante eliminado");
    }catch(SQLException ex){
   System.out.println(ex.getMessage());
   System.out.println("Error en eliminar aspirante");
  }
}
    
  public String getUltimomatAspirante(){
  String ultiMat=null;
          try
    {
        Connection cnx = BaseDatosConexion.getConnection();
        Statement st = cnx.createStatement();
        ResultSet rs = st.executeQuery("SELECT  MATRICULA  "
              + " FROM BASEASPIRANTES     "
                + "where 0 < (select count(*) from BASEASPIRANTES)");
        while(rs.next()){
            ultiMat=rs.getString("MATRICULA");
        }
    }catch(SQLException ex)
    {
        System.out.println(ex.getMessage());
    }
  
  
      return ultiMat;
  }  

}
