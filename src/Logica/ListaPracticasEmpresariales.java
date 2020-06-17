package Logica;

import Datos.*;
import java.util.*;

public class ListaPracticasEmpresariales {
    private List<PracticaEmpresarial> lista = new ArrayList();
    private PracticaEmpresarial practicaEmpresarial;

    public ListaPracticasEmpresariales() {
    }

    public ListaPracticasEmpresariales(PracticaEmpresarial practicaEmpresarial) {
        this.practicaEmpresarial = practicaEmpresarial;
    }

    public List<PracticaEmpresarial> getLista() {
        return lista;
    }

    public void setLista(List<PracticaEmpresarial> lista) {
        this.lista = lista;
    }

    public PracticaEmpresarial getPracticaEmpresarial() {
        return practicaEmpresarial;
    }

    public void setPracticaEmpresarial(PracticaEmpresarial practicaEmpresarial) {
        this.practicaEmpresarial = practicaEmpresarial;
    }
    
    /*public boolean MapearPracticaEmpresarial(String contacto, String representanteLegal, String area, String funcionADesarrollar, String descripcionDePropuesta, String tiempoDeEjecucion, Linea linea, SubLinea subLinea){
        this.practicaEmpresarial = new PracticaEmpresarial(contacto,representanteLegal,area,funcionADesarrollar, descripcionDePropuesta,tiempoDeEjecucion,linea,subLinea);
        return this.lista.add(practicaEmpresarial);
    }
    
    public void asignarDocentes(String id, String docente1, String docente2){
        for(PracticaEmpresarial item: lista){
            if(item.getIdRadicado().equals(id)){
                item.setDocenteuno(docente1);
                item.setDocentedos(docente2);
            }
        }
    }
    
    public void imprimirEncontrado(String codigo){
        for(PracticaEmpresarial item: lista){
            if(item.getIdRadicado().equals(codigo)){
                System.out.println("\n\n                                                        *** PRACTICA EMPRESARIAL ***\n");
                System.out.println("ID  |      Contacto      |     Representante Legal     |   Area   |   Funcion   |   ID Docente 1   |   ID Docente 2   |   Descripcion   |   Tiempo   |   Linea   |   Sub Linea   |   Estado   |   Mejoras   |");
                System.out.println("----+--------------------+-----------------------------+----------+-------------+------------------+------------------+-----------------+------------+-----------+---------------+------------+-------------+");
                            System.out.printf("%-3d | %-18s | %-27s | %-8s | %-11s | %-16s | %-16s | %-15s | %-10s | %-9s | %-13s | %-10s | %s\n",item.getIdRadicado(),item.getContacto(),item.getRepresentanteLegal(),item.getArea(),item.getFuncionADesarrollar(),item.getDocenteuno(),item.getDocentedos(),item.getDescripcionDePropuesta(),item.getTiempoDeEjecucion(),item.getLinea(),item.getSubLinea(),item.getEstado(),item.getMejoras());

            }
        }
    }

    @Override
    public String toString(){
        System.out.println("\n\n                                                        *** PRACTICA EMPRESARIAL ***\n");
                System.out.println("ID  |      Contacto      |     Representante Legal     |   Area   |   Funcion   |   ID Docente 1   |   ID Docente 2   |   Descripcion   |   Tiempo   |   Linea   |   Sub Linea   |   Estado   |   Mejoras   |");
                System.out.println("----+--------------------+-----------------------------+----------+-------------+------------------+------------------+-----------------+------------+-----------+---------------+------------+-------------+");
        for(PracticaEmpresarial item: this.lista){
            System.out.printf("%-3d | %-18s | %-27s | %-8s | %-11s | %-16s | %-16s | %-15s | %-10s | %-9s | %-13s | %-10s | %s\n",item.getIdRadicado(),item.getContacto(),item.getRepresentanteLegal(),item.getArea(),item.getFuncionADesarrollar(),item.getDocenteuno(),item.getDocentedos(),item.getDescripcionDePropuesta(),item.getTiempoDeEjecucion(),item.getLinea(),item.getSubLinea(),item.getEstado(),item.getMejoras());
        }
        return this.lista.toString();
    }
    
    public boolean buscarPracticaEmpresarial(int codigo){
        for(PracticaEmpresarial item: lista){
            if(item.getIdRadicado() == codigo)
                return true;
        }
        return false;
    }
    
    public boolean eliminarPracticaEmpresarial(int codigo){
        for(PracticaEmpresarial item: lista){
            if(item.getIdRadicado() == codigo){
                lista.remove(item);
                return true;
            }
        }
        return false;
    }
    
    public void imprimirEncontradoConRechazo(int codigo){
        for(PracticaEmpresarial item: lista){
            if(item.getIdRadicado() == codigo){
                System.out.println("\n\n                                                                    *** PRACTICA EMPRESARIAL ***\n");
                System.out.println("ID  |      Contacto      |     Representante Legal     |   Area   |   Funcion   |   Descripcion   |      Tiempo      |    Linea    |   Sub Linea   |   Estado   |      Motivo      |      Correcciones      |");
                System.out.println("----+--------------------+-----------------------------+----------+-------------+-----------------+------------------+-------------+---------------+------------+------------------+------------------------+");
                System.out.printf("%-3d | %-15s | %-15s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %s\n",item.getIdRadicado(),item.getContacto(),item.getRepresentanteLegal(),item.getArea(),item.getFuncionADesarrollar(),item.getDescripcionDePropuesta(),item.getTiempoDeEjecucion(),item.getLinea(),item.getSubLinea(),item.getEstado(),item.getMotivo(),item.getCorrecciones());
            }
        }
    }
    
    public String toStringRechazados(){
        System.out.println("\n\n                                                                    *** PRACTICA EMPRESARIAL ***\n");
            System.out.println("ID  |      Contacto      |     Representante Legal     |   Area   |   Funcion   |   Descripcion   |      Tiempo      |    Linea    |   Sub Linea   |   Estado   |      Motivo      |      Correcciones      |");
            System.out.println("----+--------------------+-----------------------------+----------+-------------+-----------------+------------------+-------------+---------------+------------+------------------+------------------------+");
        for(PracticaEmpresarial item: this.lista){
            System.out.printf("%-3d | %-15s | %-15s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %-10s | %s\n",item.getIdRadicado(),item.getContacto(),item.getRepresentanteLegal(),item.getArea(),item.getFuncionADesarrollar(),item.getDocenteuno(),item.getDocentedos(),item.getDescripcionDePropuesta(),item.getTiempoDeEjecucion(),item.getLinea(),item.getSubLinea(),item.getEstado());
        }
        return this.lista.toString();
    }*/
}
