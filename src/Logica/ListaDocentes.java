package Logica;

import Datos.Docente;
import java.util.*;

public class ListaDocentes {
    private List<Docente> lista = new ArrayList();
    private Docente docente;

    public ListaDocentes() {
    }

    public ListaDocentes(Docente docente) {
        this.docente = docente;
    }

    public List<Docente> getLista() {
        return lista;
    }

    public void setLista(List<Docente> lista) {
        this.lista = lista;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
    
    public boolean MapearDocente(String Area, int Id, String Nombre, String Apellido){
        this.docente = new Docente(Area,Nombre,Apellido);
        return this.lista.add(docente);
    }
    
    public void imprimirDocente(int codigo){
        for(Docente item: lista){
            if(item.getId() == codigo){
                System.out.println("\n\n          *** DOCENTE ***\n");
                System.out.println("ID  |      Nombre      |     Apellido     |   Area   ");
                System.out.println("----+------------------+------------------+----------");
                System.out.printf("%-3s | %-16s | %-16s | %s\n",item.getId(),item.getNombre(),item.getApellido(),item.getArea());
            }
        }
    }
    
    public boolean buscarDocente(int codigo){
        for(Docente item: lista){
            if(item.getId() == codigo)
                return true;
        }
        return false;
    }
    
    public boolean eliminarDocente(int codigo){
        for(Docente item: lista){
            if(item.getId() == codigo){
                lista.remove(item);
                return true;
            }
        }
        return false;
    }
    
    public Docente devolverDocente(int id){
        for(Docente item: lista){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }
    
    public boolean actualizarDocente(int codigo, String name, String lastName, String area){
        for(Docente item: lista){
            if(item.getId() == codigo){
                item.setNombre(name);
                item.setApellido(lastName);
                item.setArea(area);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        System.out.println("\n\n          *** DOCENTES ***\n");
        System.out.println("ID  |      Nombre      |     Apellido     |   Area   ");
        System.out.println("----+------------------+------------------+----------");
        for(Docente item: this.lista){
            System.out.printf("%-4s | %-10s | %-10s | %s\n",item.getId(),item.getNombre(),item.getApellido(),item.getArea());
        }
        return this.lista.toString();
    }
}
