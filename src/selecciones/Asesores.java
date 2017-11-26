
package selecciones;

public class Asesores {
    private String idasesor;
    private String nombre;
    private String apellidos;
    private String cubiculo;
    private String correoasesor;
    private String horarioasesoria;
    private String lugar;
    private String horariotrabajo;
    
     public Asesores(String idasesor,String nombre,String apellidos,String cubiculo,String correoasesor,String horarioasesoria,String lugar,String horariotrabajo){
     this.idasesor=idasesor;
     this.nombre=nombre;
     this.apellidos=apellidos;
     this.cubiculo=cubiculo;
     this.correoasesor=correoasesor;
     this.horarioasesoria=horarioasesoria;
     this.lugar=lugar;
     this.horariotrabajo=horariotrabajo;
     }

    public Asesores() {
    }
    public String getIdasesor() {
        return idasesor;
    }

    public void setIdasesor(String idasesor) {
        this.idasesor = idasesor;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
 
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getCubiculo() {
        return cubiculo;
    }
    
    public void setCubiculo(String cubiculo) {
        this.cubiculo = cubiculo;
    }
    
    public String getCorreoasesor() {
        return correoasesor;
    }
    
    public void setCorreoasesor(String correoasesor) {
        this.correoasesor = correoasesor;
    }
    
    public String getHorarioasesoria() {
        return horarioasesoria;
    }
    
    public void setHorarioasesoria(String horarioasesoria) {
        this.horarioasesoria = horarioasesoria;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public String getHorariotrabajo() {
        return horariotrabajo;
    }
    
    public void setHorariotrabajo(String horariotrabajo) {
        this.horariotrabajo = horariotrabajo;
    }
    }
     
    