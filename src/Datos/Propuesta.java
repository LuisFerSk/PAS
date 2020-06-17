package Datos;

public class Propuesta {
    private int IdRadicado = 0;
    private String tiempoDeEjecucion;
    private String descripcionDePropuesta, estado, docenteuno, docentedos, motivo, correcciones, mejoras;
    private Linea linea;
    private SubLinea subLinea;

    public Propuesta() {
        this.IdRadicado = 1;
    }

    public Propuesta(String tiempoDeEjecucion, String descripcionDePropuesta, String estado, String docenteuno, String docentedos, String motivo, String correcciones, String mejoras, Linea linea, SubLinea subLinea) {
        //this.IdRadicado += 1;
        this.tiempoDeEjecucion = tiempoDeEjecucion;
        this.descripcionDePropuesta = descripcionDePropuesta;
        this.estado = "Pendiente";
        this.docenteuno = "Pendiente";
        this.docentedos = "Pendiente";
        this.motivo = "Pendiente";
        this.correcciones = "Pendiente";
        this.mejoras = "";
        this.linea = linea;
        this.subLinea = subLinea;
    }

    public int getIdRadicado() {
        return IdRadicado;
    }

    public void setIdRadicado(int IdRadicado) {
        this.IdRadicado = IdRadicado;
    }

    public String getDescripcionDePropuesta() {
        return descripcionDePropuesta;
    }

    public void setDescripcionDePropuesta(String descripcionDePropuesta) {
        this.descripcionDePropuesta = descripcionDePropuesta;
    }

    public String getTiempoDeEjecucion() {
        return tiempoDeEjecucion;
    }

    public void setTiempoDeEjecucion(String tiempoDeEjecucion) {
        this.tiempoDeEjecucion = tiempoDeEjecucion;
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }

    public SubLinea getSubLinea() {
        return subLinea;
    }

    public void setSubLinea(SubLinea subLinea) {
        this.subLinea = subLinea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getCorrecciones() {
        return correcciones;
    }

    public void setCorrecciones(String correcciones) {
        this.correcciones = correcciones;
    }

    public String getDocenteuno() {
        return docenteuno;
    }

    public void setDocenteuno(String docenteuno) {
        this.docenteuno = docenteuno;
    }

    public String getDocentedos() {
        return docentedos;
    }

    public void setDocentedos(String docentedos) {
        this.docentedos = docentedos;
    }

    public String getMejoras() {
        return mejoras;
    }

    public void setMejoras(String mejoras) {
        this.mejoras = mejoras;
    }
}
