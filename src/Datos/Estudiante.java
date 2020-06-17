package Datos;

public class Estudiante extends Persona{
    private String Carrera;

    public Estudiante() {
    }

    public Estudiante(String Carrera) {
        this.Carrera = Carrera;
    }

    public Estudiante(String Carrera, String Nombre, String Apellido) {
        super(Nombre, Apellido);
        this.Carrera = Carrera;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    public String datosParaArchivo(){
        return (this.getId() + ";" + this.getNombre() + ";" + this.getApellido() + ";" + this.getCarrera() + "\n");
    }
}
