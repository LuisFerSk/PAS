package Datos;

public class SubLinea {
    private int id = 0;
    private String linea, subLineaInvestigativa;

    public SubLinea() {
    }

    public SubLinea(String linea, String subLineaInvestigativa) {
        this.id += 1;
        this.linea = linea;
        this.subLineaInvestigativa = subLineaInvestigativa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getSubLineaInvestigativa() {
        return subLineaInvestigativa;
    }

    public void setSubLineaInvestigativa(String subLineaInvestigativa) {
        this.subLineaInvestigativa = subLineaInvestigativa;
    }
}
