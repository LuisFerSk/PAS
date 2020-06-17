package Logica;

import Datos.*;
import java.util.*;

public class ListaSubLineas {
    private List<SubLinea> lista = new ArrayList();
    //private Linea linea;
    private SubLinea subLinea;

    public ListaSubLineas() {
    }

    public ListaSubLineas(SubLinea subLinea) {
        this.subLinea = subLinea;
    }

    public List<SubLinea> getLista() {
        return lista;
    }

    public void setLista(List<SubLinea> lista) {
        this.lista = lista;
    }

    public SubLinea getSubLinea() {
        return subLinea;
    }

    public void setSubLinea(SubLinea subLinea) {
        this.subLinea = subLinea;
    }
    
    public boolean MapearSubLinea(String linea, String subLineaInvestigativa){
        this.subLinea = new SubLinea(linea,subLineaInvestigativa);
        return this.lista.add(subLinea);
    }
    
    public void imprimirEncontrado(int codigo){
        for(SubLinea item: lista){
            if(item.getId() == codigo){
                System.out.println("\n\n*** SUB - LINEA INVESTIGATIVA ***\n");
                System.out.println("ID  |      Linea      |     Sub - Linea");
                System.out.println("----+-----------------+-----------------");
                System.out.printf("%-3s | %-15s | %s\n",item.getId(),item.getLinea(),item.getSubLineaInvestigativa());
                System.out.println("----+-----------------+-----------------");
            }
        }
    }
    
    public boolean buscarSubLinea(int codigo){
        for(SubLinea item: lista){
            if(item.getId() == codigo)
                return true;
        }
        return false;
    }
    
    public int devolverSubLinea(String id){
        for(SubLinea item: lista){
            if(item.getSubLineaInvestigativa().equals(id)){
                return item.getId();
            }
        }
        return 0;
    }
    
    public boolean eliminarSubLinea(int codigo){
        for(SubLinea item: lista){
            if(item.getId() == codigo){
                lista.remove(item);
                return true;
            }
        }
        return false;
    }
    
    public SubLinea devolverSubLineaS(String id){
        for(SubLinea item: lista){
            if(item.getSubLineaInvestigativa().equals(id))
                return item;
        }
        return null;
    }
    
    public boolean eliminarSubLinea(String nombreL){
        for(SubLinea item: lista){
            if(item.getLinea().equals(nombreL)){
                lista.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        System.out.println("\n\n*** SUB - LINEA INVESTIGATIVA ***\n");
        System.out.println("ID  |      Linea      |     Sub - Linea");
        System.out.println("----+-----------------+-----------------");
        for(SubLinea item: this.lista){
            System.out.printf("%-3s | %-15s | %s\n",item.getId(),item.getLinea(),item.getSubLineaInvestigativa());
        }
        System.out.println("----+-----------------+-----------------");
        return this.lista.toString();
    }
}
