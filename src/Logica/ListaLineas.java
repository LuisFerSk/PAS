package Logica;

import Datos.Linea;
import java.util.*;

public class ListaLineas {
    private List<Linea> lista = new ArrayList();
    private Linea linea;

    public ListaLineas() {
    }

    public ListaLineas(Linea linea) {
        this.linea = linea;
    }

    public List<Linea> getLista() {
        return lista;
    }

    public void setLista(List<Linea> lista) {
        this.lista = lista;
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }
    
    public boolean MapearLinea(String lineaInvestigativa){
        this.linea = new Linea(lineaInvestigativa);
        return this.lista.add(linea);
    }
    
    public void imprimirEncontrado(int codigo){
        for(Linea item: lista){
            if(item.getId() == codigo){
                System.out.println("\n\n*** LINEA INVESTIGATIVA ***\n");
                System.out.println("ID  |        Linea        |");
                System.out.println("----+----------------------");
                System.out.printf("%-3s | %s\n",item.getId(),item.getLineaInvestigativa());
                System.out.println("----+----------------------");
            }
        }
    }
    
    public boolean buscarLinea(int codigo){
        for(Linea item: lista){
            if(item.getId() == codigo)
                return true;
        }
        return false;
    }
    
    public Linea devolverLineaL(String nombre){
        for(Linea item: lista){
            if(item.getLineaInvestigativa().equals(nombre))
                return item;
        }
        return null;
    }
    
    public int devolverLinea(String nombre){
        for(Linea item: lista){
            if(item.getLineaInvestigativa().equals(nombre)){
                return item.getId();
            }
        }
        return 0;
    }
    
    public boolean eliminarLinea(int codigo){
        for(Linea item: lista){
            if(item.getId() == codigo){
                lista.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        System.out.println("\n\n*** LINEA INVESTIGATIVA ***\n");
        System.out.println("ID  |        Linea        |");
        System.out.println("----+----------------------");
        for(Linea item: this.lista){
            System.out.printf("%-3s | %s\n",item.getId(),item.getLineaInvestigativa());
        }
        System.out.println("----+----------------------");
        return this.lista.toString();
    }
}
