package Datos;

public class PracticaEmpresarial extends Propuesta{
    private String contacto, representanteLegal, area, funcionADesarrollar;

    public PracticaEmpresarial() {
    }

    public PracticaEmpresarial(String contacto, String representanteLegal, String area, String funcionADesarrollar) {
        this.contacto = contacto;
        this.representanteLegal = representanteLegal;
        this.area = area;
        this.funcionADesarrollar = funcionADesarrollar;
    }

    public PracticaEmpresarial(String contacto, String representanteLegal, String area, String funcionADesarrollar, String tiempoDeEjecucion, String descripcionDePropuesta, String estado, String docenteuno, String docentedos, String motivo, String correcciones, String mejoras, Linea linea, SubLinea subLinea) {
        //super(tiempoDeEjecucion,descripcionDePropuesta,estado,docenteuno,docentedos,motivo,correcciones,mejoras,linea,subLinea);
        this.contacto = contacto;
        this.representanteLegal = representanteLegal;
        this.area = area;
        this.funcionADesarrollar = funcionADesarrollar;
    }
    
    /*public PracticaEmpresarial(String contacto, String representanteLegal, String area, String funcionADesarrollar, String descripcionDePropuesta, String tiempoDeEjecucion, Linea linea, SubLinea subLinea, String motivo, String correciones) {
        super(descripcionDePropuesta, tiempoDeEjecucion, linea, subLinea);
        this.contacto = contacto;
        this.representanteLegal = representanteLegal;
        this.area = area;
        this.funcionADesarrollar = funcionADesarrollar;
    }*/

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFuncionADesarrollar() {
        return funcionADesarrollar;
    }

    public void setFuncionADesarrollar(String funcionADesarrollar) {
        this.funcionADesarrollar = funcionADesarrollar;
    }
}
