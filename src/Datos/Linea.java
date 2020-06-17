package Datos;

public class Linea {
    private int id = 0;
    private String lineaInvestigativa;

    public Linea() {
    }

    public Linea(String lineaInvestigativa) {
        this.id += 1;
        this.lineaInvestigativa = lineaInvestigativa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLineaInvestigativa() {
        return lineaInvestigativa;
    }

    public void setLineaInvestigativa(String LineaInvestigativa) {
        this.lineaInvestigativa = LineaInvestigativa;
    }
}
