package Datos;

public class Archivo {
    private String Descripcion, Tdias, ObGeneral, ObEspecifico, LInvestigativa,
            SLInvestigativa, Justificacion, Resumen, Documento;

    public Archivo() {
    }

    public Archivo(String Descripcion, String Tdias, String ObGeneral, String ObEspecifico, String LInvestigativa, String SLInvestigativa, String Justificacion, String Resumen, String Documento) {
        this.Descripcion = Descripcion;
        this.Tdias = Tdias;
        this.ObGeneral = ObGeneral;
        this.ObEspecifico = ObEspecifico;
        this.LInvestigativa = LInvestigativa;
        this.SLInvestigativa = SLInvestigativa;
        this.Justificacion = Justificacion;
        this.Resumen = Resumen;
        this.Documento = Documento;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTdias() {
        return Tdias;
    }

    public void setTdias(String Tdias) {
        this.Tdias = Tdias;
    }

    public String getObGeneral() {
        return ObGeneral;
    }

    public void setObGeneral(String ObGeneral) {
        this.ObGeneral = ObGeneral;
    }

    public String getObEspecifico() {
        return ObEspecifico;
    }

    public void setObEspecifico(String ObEspecifico) {
        this.ObEspecifico = ObEspecifico;
    }

    public String getLInvestigativa() {
        return LInvestigativa;
    }

    public void setLInvestigativa(String LInvestigativa) {
        this.LInvestigativa = LInvestigativa;
    }

    public String getSLInvestigativa() {
        return SLInvestigativa;
    }

    public void setSLInvestigativa(String SLInvestigativa) {
        this.SLInvestigativa = SLInvestigativa;
    }

    public String getJustificacion() {
        return Justificacion;
    }

    public void setJustificacion(String Justificacion) {
        this.Justificacion = Justificacion;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String Resumen) {
        this.Resumen = Resumen;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }
}
