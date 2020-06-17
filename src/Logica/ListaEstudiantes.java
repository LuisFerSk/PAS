package Logica;

import Datos.*;
import java.util.*;

public class ListaEstudiantes{
    private List<Estudiante> lista = new ArrayList();
    private Estudiante estudiante;
    
    public ListaEstudiantes() {
    }
    public ListaEstudiantes(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<Estudiante> getLista() {
        return lista;
    }

    public void setLista(List<Estudiante> lista) {
        this.lista = lista;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public boolean MapearEstudiante(String Carrera, String Nombre, String Apellido){
        this.estudiante = new Estudiante(Carrera,Nombre,Apellido);
        return this.lista.add(estudiante);
    }
    
    public void imprimirEncontrado(int codigo){
        for(Estudiante item: lista){
            if(item.getId() == codigo){
                System.out.println("\n\n          *** ESTUDIANTE ***\n");
                System.out.println("ID  |      Nombre      |     Apellido     |   Carrera");
                System.out.println("----+------------------+------------------+----------");
                System.out.printf("%-4s | %-10s | %-10s | %s\n",item.getId(),item.getNombre(),item.getApellido(),item.getCarrera());
            }
        }
    }
    
    public boolean buscarEstudiante(int codigo){
        for(Estudiante item: lista){
            if(item.getId() == codigo)
                return true;
        }
        return false;
    }
    
    public Estudiante devolverEstudiante(int id){
        for(Estudiante item: lista){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }
    
    public boolean actualizarEstudiante(int codigo, String name, String lastName, String major){
        for(Estudiante item: lista){
            if(item.getId() == codigo){
                item.setNombre(name);
                item.setApellido(lastName);
                item.setCarrera(major);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarEstudiante(int codigo){
        for(Estudiante item: lista){
            if(item.getId() == codigo){
                lista.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        System.out.println("\n\n          *** ESTUDIANTES ***\n");
        System.out.println("ID  |      Nombre      |     Apellido     |   Carrera");
        System.out.println("----+------------------+------------------+----------");
        for(Estudiante item: this.lista){
            System.out.printf("%-4s | %-10s | %-10s | %s\n",item.getId(),item.getNombre(),item.getApellido(),item.getCarrera());
        }
        return this.lista.toString();
    }
    
    /*public boolean renombrar(String newName){
        File nNombre  = new File(newName);
        if (this.archivo.renameTo(nNombre)){
            this.archivo = nNombre;
            return true;
        }
        else
            return false;
    }*/
}
