
package selecciones;
import java.io.FileInputStream;
public class Aspirante {
   private String nombre;
   private String apelPaterno;
   private String apelMaterno;
   private String matricula;
   private String correo;
   private String celular;
   private String carrera;
   private String generacion;
   private String temTesis;
   private String dirTesis;
   private String horario;
   private String trabajo;
   private byte[] foto;
   
   public Aspirante(){
       
   }
   
   public Aspirante(String nombre,String apelPaterno,String apelMaterno,String matricula,String correo,String celular,String carrera,String generacion,String temTesis,String dirTesis,String horario,String trabajo,byte[] foto){
       this.nombre=nombre;
       this.apelPaterno=apelPaterno;
       this.apelMaterno=apelMaterno;
       this.matricula=matricula;
       this.correo=correo;
       this.celular=celular;
       this.carrera=carrera;
       this.generacion=generacion;
       this.temTesis=temTesis;
       this.dirTesis=dirTesis;
       this.horario=horario;
       this.trabajo=trabajo;
       this.foto=foto;
   }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelPaterno() {
        return apelPaterno;
    }

    public void setApelPaterno(String apelPaterno) {
        this.apelPaterno = apelPaterno;
    }

    public String getApelMaterno() {
        return apelMaterno;
    }

    public void setApelMaterno(String apelMaterno) {
        this.apelMaterno = apelMaterno;
    }

    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getCarrera() {
        return carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getTemTesis() {
        return temTesis;
    }
    
    public void setTemTesis(String temTesis) {
        this.temTesis = temTesis;
    }

    public String getDirTesis() {
        return dirTesis;
    }
    
    public void setDirTesis(String dirTesis) {
        this.dirTesis = dirTesis;
    }
    
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public byte[] getFoto() {
        return foto;
    }
    
    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the trabajo
     */
    public String getTrabajo() {
        return trabajo;
    }

    /**
     * @param trabajo the trabajo to set
     */
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
}
