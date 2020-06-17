package Logica;

import Datos.ComiteEvaluador;
import java.util.*;

public class ListaComitesEvaluadores {
    private List<ComiteEvaluador> lista = new ArrayList();
    private ComiteEvaluador comiteEvaluador;

    public ListaComitesEvaluadores() {
    }

    public ListaComitesEvaluadores(ComiteEvaluador comiteEvaluador) {
        this.comiteEvaluador = comiteEvaluador;
    }

    public List<ComiteEvaluador> getLista() {
        return lista;
    }

    public void setLista(List<ComiteEvaluador> lista) {
        this.lista = lista;
    }

    public ComiteEvaluador getComiteEvaluador() {
        return comiteEvaluador;
    }

    public void setComiteEvaluador(ComiteEvaluador comiteEvaluador) {
        this.comiteEvaluador = comiteEvaluador;
    }
    
    public boolean MapearComiteEvaluador(String User, String Password){
        this.comiteEvaluador = new ComiteEvaluador(User,Password);
        return this.lista.add(comiteEvaluador);
    }
    
    public void imprimirEncontrado(int codigo){
        for(ComiteEvaluador item: lista){
            if(item.getId() == codigo){
                System.out.println("\n\n     *** COMITE EVALUADOR ***\n");
                System.out.println("ID  |      Usuario      |     Password     |");
                System.out.println("----+-------------------+-------------------");
                System.out.printf("%-3s | %-17s | %s\n",item.getId(),item.getUser(),item.getPassword());
            }
        }
    }
    
    public void imprimirEncontrado(String name){
        for(ComiteEvaluador item: lista){
            if(item.getUser().equals(name)){
                System.out.println("\n\n     *** COMITE EVALUADOR ***\n");
                System.out.println("ID  |      Usuario      |     Password     |");
                System.out.println("----+-------------------+-------------------");
                System.out.printf("%-3s | %-17s | %s\n",item.getId(),item.getUser(),item.getPassword());
            }
        }
    }
    
    public boolean buscarComiteEvaluador(int codigo){
        for(ComiteEvaluador item: lista){
            if(item.getId() == codigo)
                return true;
        }
        return false;
    }
    
    public boolean actualizarComiteEvaluador(int codigo, String user, String pass){
        for(ComiteEvaluador item: lista){
            if(item.getId() == codigo){
                item.setUser(user);
                item.setPassword(pass);
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarComiteEvaluador(int codigo){
        for(ComiteEvaluador item: lista){
            if(item.getId() == codigo){
                lista.remove(item);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        System.out.println("\n\n     *** COMITE EVALUADOR ***\n");
        System.out.println("ID  |      Usuario      |     Password     |");
        System.out.println("----+-------------------+-------------------");
        for(ComiteEvaluador item: this.lista){
            System.out.printf("%-4s | %-10s | %s\n",item.getId(),item.getUser(),item.getPassword());
        }
        return this.lista.toString();
    }
}
