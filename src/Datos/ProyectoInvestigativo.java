package Datos;

public class ProyectoInvestigativo extends Propuesta{
    private String resumen, objetivoGeneral, objetivoEspecifico, justificacion;

    public ProyectoInvestigativo() {
    }

    public ProyectoInvestigativo(String resumen, String objetivoGeneral, String objetivoEspecifico, String justificacion) {
        this.resumen = resumen;
        this.objetivoGeneral = objetivoGeneral;
        this.objetivoEspecifico = objetivoEspecifico;
        this.justificacion = justificacion;
        
    }

    public ProyectoInvestigativo(String resumen, String objetivoGeneral, String objetivoEspecifico, String justificacion, String tiempoDeEjecucion, String descripcionDePropuesta, String estado, String docenteuno, String docentedos, String motivo, String correcciones, String mejoras, Linea linea, SubLinea subLinea) {
        //super(tiempoDeEjecucion,descripcionDePropuesta,estado,docenteuno,docentedos,motivo,correcciones,mejoras,linea,subLinea);
        this.resumen = resumen;
        this.objetivoGeneral = objetivoGeneral;
        this.objetivoEspecifico = objetivoEspecifico;
        this.justificacion = justificacion;
    }
    
    /*public ProyectoInvestigativo(String resumen, String objetivoGeneral, String objetivoEspecifico, String justificacion, String descripcionDePropuesta, String tiempoDeEjecucion, Linea linea, SubLinea subLinea, String motivo, String correcciones) {
        super(descripcionDePropuesta, tiempoDeEjecucion, linea, subLinea);
        this.resumen = resumen;
        this.objetivoGeneral = objetivoGeneral;
        this.objetivoEspecifico = objetivoEspecifico;
        this.justificacion = justificacion;
    }*/

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public String getObjetivoEspecifico() {
        return objetivoEspecifico;
    }

    public void setObjetivoEspecifico(String objetivoEspecifico) {
        this.objetivoEspecifico = objetivoEspecifico;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
}
