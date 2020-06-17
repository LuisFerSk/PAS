package Datos;

public class Docente extends Persona{
    private String Area;

    public Docente() {
    }

    public Docente(String Area) {
        this.Area = Area;
    }

    public Docente(String Area, String Nombre, String Apellido) {
        super(Nombre, Apellido);
        this.Area = Area;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
}
