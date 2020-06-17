package Datos;

public class Persona {
    private int Id = 0;
    private String Nombre, Apellido;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido) {
        this.setId(this.getId() + 1);
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
}
