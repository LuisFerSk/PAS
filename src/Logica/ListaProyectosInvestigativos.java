package Logica;

//import java.util.*;
import Datos.*;
import java.io.*;
import java.util.logging.*;

public class ListaProyectosInvestigativos {
    //private List<ProyectoInvestigativo> lista = new ArrayList();
    //private ProyectoInvestigativo proyectoInvestigativo;
    private ProyectoInvestigativo PI = new ProyectoInvestigativo();
    private File archivo;
    private FileWriter escribir;
    private PrintWriter linea;

    public ListaProyectosInvestigativos() {
    }

    public ListaProyectosInvestigativos(ProyectoInvestigativo proyectoInvestigativo) {
        this.PI = proyectoInvestigativo;
    }
    public ProyectoInvestigativo getProyectoInvestigativo() {
        return PI;
    }

    public void setProyectoInvestigativo(ProyectoInvestigativo proyectoInvestigativo) {
        this.PI = proyectoInvestigativo;
    }
    
    public void GuardarPractica(String Descripcion, String Tdias,String ObGeneral,String ObEspecifico,
            String LInvestigativa,String SLInvestigativa,String Justificacion, String Resumen, String Documento) throws Exception{
        
        int ID = this.PI.getIdRadicado();
        //this.PI.setIdRadicado(ID);
        
        archivo = new File("ArchivoProyectos.txt");
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                //linea.println("ID | Descripción | Tiempo | Objetivo General | Objetivo Especifico | Linea Investigativa | Sublinea Investigativa | Justificación | Resumen | Documento");
                //linea.println("\n");
                linea.print(ID);
                linea.print(Descripcion);
                linea.print(Tdias);
                linea.print(ObGeneral);
                linea.print(ObEspecifico);
                linea.print(LInvestigativa);
                linea.print(SLInvestigativa);
                linea.print(Justificacion);
                linea.print(Resumen);
                linea.print(Documento);
                linea.println("\n");
                linea.println("\n");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(ListaProyectosInvestigativos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.print(this.PI.getIdRadicado() + 1);
                linea.print(Descripcion);
                linea.print(Tdias);
                linea.print(ObGeneral);
                linea.print(ObEspecifico);
                linea.print(LInvestigativa);
                linea.print(SLInvestigativa);
                linea.print(Justificacion);
                linea.print(Resumen);
                linea.print(Documento);
                linea.println();
                linea.println("\n");
                linea.println("\n");
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(ListaProyectosInvestigativos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    /*public boolean MapearProyectoInvestigativo(String resumen, String objetivoGeneral, String objetivoEspecifico, String justificacion, String descripcionDePropuesta, String tiempoDeEjecucion, Linea linea, SubLinea subLinea){
        this.proyectoInvestigativo = new ProyectoInvestigativo(resumen,objetivoGeneral,objetivoEspecifico,justificacion, descripcionDePropuesta,tiempoDeEjecucion,linea,subLinea);
        return this.lista.add(proyectoInvestigativo);
    }
    
    public void asignarDocentes(int id, String docente1, String docente2){
        for(ProyectoInvestigativo item: lista){
            if(item.getIdRadicado() == id){
                item.setDocenteuno(docente1);
                item.setDocentedos(docente2);
            }
        }
    }
    
    public void imprimirEncontrado(int codigo){
        for(ProyectoInvestigativo item: lista){
            if(item.getIdRadicado() == codigo){
                System.out.println("\n\n                                                                                    *** PROYECTO INVESTIGATIVO ***\n");
                System.out.println("ID  |      Objetivo General      |     Objetivo Especifico     |   Justificacion   |   Resumen   |      Descripcion      |             Tiempo             |   Linea   |   Sub Linea   |   ID Docente 1   |   ID Docente 2   |   Estado   |");
                System.out.println("----+----------------------------+-----------------------------+-------------------+-------------+-----------------------+--------------------------------+-----------+---------------+------------------+------------------+------------+");
                System.out.printf("%-3d | %-26s | %-27s | %-17s | %-11s | %-21s | %-21s | %-11s | %-13s | %-10s | %-10s | %s\n",item.getIdRadicado(),item.getObjetivoGeneral(),item.getObjetivoEspecifico(),item.getJustificacion(),item.getResumen(),item.getDescripcionDePropuesta(),item.getTiempoDeEjecucion(),item.getLinea(),item.getSubLinea(),item.getDocente().getId(),item.getEstado());
            }
        }
    }

    @Override
    public String toString(){
        System.out.println("\n\n                                                                                    *** PROYECTO INVESTIGATIVO ***\n");
        System.out.println("ID  |      Objetivo General      |     Objetivo Especifico     |   Justificacion   |   Resumen   |      Descripcion      |             Tiempo             |   Linea   |   Sub Linea   |   ID Docente 1   |   ID Docente 2   |   Estado   |");
        System.out.println("----+----------------------------+-----------------------------+-------------------+-------------+-----------------------+--------------------------------+-----------+---------------+------------------+------------------+------------+");
        for(ProyectoInvestigativo item: this.lista){
            System.out.printf("%-3d | %-26s | %-27s | %-17s | %-11s | %-21s | %-21s | %-11s | %-13s | %-10s | %-10s | %s\n",item.getIdRadicado(),item.getObjetivoGeneral(),item.getObjetivoEspecifico(),item.getJustificacion(),item.getResumen(),item.getDescripcionDePropuesta(),item.getTiempoDeEjecucion(),item.getLinea(),item.getSubLinea(),item.getDocente().getId(),item.getEstado());
        }
        return this.lista.toString();
    }
    
    public boolean buscarProyectoInvestigativo(int codigo){
        for(ProyectoInvestigativo item: lista){
            if(item.getIdRadicado() == codigo)
                return true;
        }
        return false;
    }
    
    public boolean eliminarProyectoInvestigativo(int codigo){
        for(ProyectoInvestigativo item: lista){
            if(item.getIdRadicado() == codigo){
                lista.remove(item);
                return true;
            }
        }
        return false;
    }
    
    public void imprimirEncontradoConRechazo(int codigo){
        for(ProyectoInvestigativo item: lista){
            if(item.getIdRadicado() == codigo){
                System.out.println("\n\n                                                                                 *** PROYECTO INVESTIGATIVO ***\n");
                System.out.println("ID  |      Objetivo General      |     Objetivo Especifico     |   Justificacion   |   Resumen   |      Descripcion      |             Tiempo             |   Linea   |   Sub Linea   |   Estado   |   Motivo   |      Correcciones      |");
                System.out.println("----+----------------------------+-----------------------------+-------------------+-------------+-----------------------+--------------------------------+-----------+---------------+------------+------------+------------------------+");
                System.out.printf("%-3d | %-26s | %-27s | %-17s | %-11s | %-21s | %-21s | %-11s | %-13s | %-10s | %-10s | %s\n",item.getIdRadicado(),item.getObjetivoGeneral(),item.getObjetivoEspecifico(),item.getJustificacion(),item.getResumen(),item.getDescripcionDePropuesta(),item.getTiempoDeEjecucion(),item.getLinea(),item.getSubLinea(),item.getEstado(),item.getMotivo(),item.getCorrecciones());
            }
        }
    }
    
    public String toStringRechazados(){
        System.out.println("\n\n                                                                                 *** PROYECTO INVESTIGATIVO ***\n");
        System.out.println("ID  |      Objetivo General      |     Objetivo Especifico     |   Justificacion   |   Resumen   |      Descripcion      |             Tiempo             |   Linea   |   Sub Linea   |   Estado   |   Motivo   |      Correcciones      |");
        System.out.println("----+----------------------------+-----------------------------+-------------------+-------------+-----------------------+--------------------------------+-----------+---------------+------------+------------+------------------------+");
        for(ProyectoInvestigativo item: this.lista){
            System.out.printf("%-3d | %-26s | %-27s | %-17s | %-11s | %-21s | %-21s | %-11s | %-13s | %-10s | %-10s | %s\n",item.getIdRadicado(),item.getObjetivoGeneral(),item.getObjetivoEspecifico(),item.getJustificacion(),item.getResumen(),item.getDescripcionDePropuesta(),item.getTiempoDeEjecucion(),item.getLinea(),item.getSubLinea(),item.getEstado(),item.getMotivo(),item.getCorrecciones());
        }
        return this.lista.toString();
    }*/
}
