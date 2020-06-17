package Vista;

import Logica.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Menu {
    Date fechaLimite;
    Date fechaInicial = new Date();
    ListaLineas ListaL = new ListaLineas();
    Scanner teclado = new Scanner(System.in);
    String strDataFormat = "dd - MMM - yyyy";
    ListaDocentes ListaD = new ListaDocentes();
    ListaEstudiantes ListaE = new ListaEstudiantes();
    ListaSubLineas ListaSubLinea = new ListaSubLineas();
    SimpleDateFormat formato = new SimpleDateFormat(strDataFormat);
    ListaComitesEvaluadores ListaComites = new ListaComitesEvaluadores();
    ListaPracticasEmpresariales ListaPracticas = new ListaPracticasEmpresariales();
    ListaProyectosInvestigativos ListaProyectos = new ListaProyectosInvestigativos();
    
    File archivoDeFechas = new File("C:\\Users\\TATTAN\\Documents\\NetBeansProjects\\FechaDeProyectos.dat");
    
    public Date sumarDias(Date fecha, int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        return calendar.getTime();
    }
    /*
                    ***** NOTAS *****
        
    Proyecto de Aula
        - guardar con espacios
        - organizar proyectos por fecha de llegada
    */
    
    public void Menu(){
        //Scanner teclado = new Scanner(System.in);
        int Op;
        
        do{
            System.out.print("\n\n  ***** GESTION DE PROPUESTAS DE GRADO *****\n");
            System.out.print("----------------------------------------------\n");
            System.out.print("      1. Admin.\n");
            System.out.print("      2. Estudiante.\n");
            System.out.print("      3. Comite Evaluador.\n");
            System.out.print("      0. Salir\n");
            System.out.print("----------------------------------------------\n");
            System.out.print(">>> Seleccione: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: System.out.print("\n\n  ***** DATOS DE ADMIN *****\n");
                        System.out.print("------------------------------\n");
                        System.out.print("USER: ");
                        String user = teclado.next();
                        System.out.print("PASSWORD: ");
                        String pass = teclado.next();
                        if(/*ListaA.validarAdmin(user, pass) == true*/user.equals("1065") && pass.equals("0000"))
                            Admin();
                        else
                            System.out.print("\n    ***** DATOS INCORRECTOS *****\n\n");
                    break;
                case 2: Estudiante();
                    break;
                case 3: ComiteEvaluador();
                    break;
            }
        }while(Op != 0);
    } //(LISTO)
    
    public void Admin(){
        int Op;
        
        do{
            System.out.print("\n\n  ***** BIENVENIDO ADMIN *****\n");
            System.out.print("--------------------------------\n");
            System.out.print("      1. Gestion De Perfiles.\n");
            System.out.print("      2. Gestion De Fechas Limites.\n");
            System.out.print("      3. Gestion De Lineas Y Sub Lineas de Investigacion.\n");
            System.out.print("      0. Salir\n");
            System.out.print("--------------------------------\n");
            System.out.print(">>> Seleccione: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: GestionDePerfiles();
                    break;
                case 2: GestionDeFechas();
                    break;
                case 3: GestionDeLineasYSubLineas();
                    break;
            }
        }while(Op != 0);
    }   //(LISTO) Opcion 1 de Menu
    
    public void Estudiante(){
        int Op;
        
        do{
            System.out.print("\n\n  ***** BIENVENIDO ESTUDIANTE *****\n");
            System.out.print("-------------------------------------\n");
            System.out.print("      1. Gestion Propuesta.\n");
            System.out.print("      2. Seguimiento de Propuesta.\n");
            System.out.print("      0. Salir\n");
            System.out.print("-------------------------------------\n");
            System.out.print(">>> Seleccione: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: GestionDeProyectos();
                    break;
                case 2: Seguimiento();
                    break;
            }
        }while(Op != 0);
    }   //(LISTO) Opcion 2 de Menu
    
    public void ComiteEvaluador(){
        int Op;
        
        do{
            System.out.print("\n\n  ***** BIENVENIDO COMITE EVALUADOR *****\n");
            System.out.print("-------------------------------------\n");
            System.out.print("      1. Evaluar Propuestas.\n");
            System.out.print("      0. Salir\n");
            System.out.print("-------------------------------------\n");
            System.out.print(">>> Seleccione: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: EvaluarPropuestas();
                    break;
            }
        }while(Op != 0);
    }   //(LISTO) Opcion 3 de Menu
        
    public void GestionDePerfiles(){
        //Scanner teclado = new Scanner(System.in);
        int Op;
        
        do{
            System.out.print("\n\n        ***** GESTION DE PERFILES *****\n");
            System.out.print("----------------------------------------------\n");
            System.out.print("  1. Crear Perfil.\n");
            System.out.print("  2. Buscar Perfil.\n");
            System.out.print("  3. Actualizar Perfil.\n");
            System.out.print("  4. Eliminar Perfil.\n");
            System.out.print("  0. Salir.\n");
            System.out.print("----------------------------------------------\n");
            System.out.print(">>> Opcion: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: CrearPerfil();
                    break;
                case 2: BuscarPerfil();
                    break;
                case 3: ActualizarPerfil();
                    break;
                case 4: EliminarPerfil();
                    break;
            }
        }while(Op != 0);
    }   //(LISTO) Opcion 1 de Admin
    
    public void CrearPerfil(){
        //Scanner teclado = new Scanner(System.in);
        int Op;
        
        System.out.print("\n\n        ***** CREAR PERFIL *****\n");
        System.out.print("---------------------------------------\n");
        System.out.print("  1. Perfil Docente Evaluador.\n");
        System.out.print("  2. Perfil Comite Investigativo.\n");
        System.out.print("  0. Salir.\n");
        System.out.print("---------------------------------------\n");
        System.out.print(">>> Opcion: ");
        Op = teclado.nextInt();
        switch(Op){
            case 1: CrearPerfilDocenteEvaluador();
                break;
            case 2: CrearPerfilComiteInvestigativo();
                break;
        }
    }   //(LISTO) Opcion 1 de GestionDePerfiles
    
    public void CrearPerfilDocenteEvaluador(){
        //Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\n  ***** CREAR PERFIL DOCENTE EVALUADOR *****\n");
        System.out.print("----------------------------------------------\n");
        System.out.print("Id de Docente: ");
        int id = teclado.nextInt();
        if(ListaD.buscarDocente(id) == false){
            System.out.print("Nombre de Docente: ");
            String name = teclado.next();
            System.out.print("Apellido de Docente: ");
            String lastName = teclado.next();
            System.out.print("Area de Docente: ");
            String area = teclado.next();
            ListaD.MapearDocente(area, id, name, lastName);
            ListaD.imprimirDocente(id);
            System.out.print("\n    >>> PREFIL REGISTRADO CON EXITO <<<\n\n");
        }else{
            System.out.print("\n    >>> YA EXISTE ESTE DOCENTE EVALUADOR <<<\n");
            ListaD.imprimirDocente(id);
            System.out.print("\n\n");
        }
    }   //(LISTO) Opcion 1 de CrearPerfil
    
    public void CrearPerfilComiteInvestigativo(){
        //Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\n  ***** CREAR PERFIL COMITE INVESTIGATIVO *****\n");
        System.out.print("-------------------------------------------------\n");
        System.out.print("Usuario de Comite Investigativo: ");
        String user = teclado.next();
        System.out.print("Password de Comite Investigativo: ");
        String pass = teclado.next();
        ListaComites.MapearComiteEvaluador(user, pass);
        ListaComites.imprimirEncontrado(user);
        System.out.print("\n    >>> PREFIL REGISTRADO CON EXITO <<<\n\n");
    }   //(LISTO) Opcion 2 de CrearPerfil
    
    public void RegistroDePropuesta(){
        //Scanner teclado = new Scanner(System.in);
        int Op;
        
        do{
            System.out.print("\n\n        ***** REGISTRO DE PROPUESTA *****\n\n");
            System.out.print("-------------------------------------------------\n");
            System.out.print("  1. Proyecto Investigativo.\n");
            System.out.print("  2. Practicas Empresariales.\n");
            System.out.print("  0. Salir.\n");
            System.out.print("-------------------------------------------------\n");
            System.out.print(">>> Opcion: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: RegistroDeProyecto();
                    break;
                case 2: RegistroDePracticas();
                    break;
            }
        }while(Op != 0);
    }   //(LISTO)Opcion 1 de GestionDeProyectos
    
    public void RegistroDeProyecto(){
        //Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\n  ***** REGISTRO DE PROYECTO INVESTIGATIVO *****\n");
        System.out.print("---------------------------------------------------\n");
                System.out.print("Desripcion de Proyecto: ");
                String descripcion = teclado.next();
                System.out.print("Tiempo de Ejecucion en Dias: ");
                String tiempo = teclado.next();
                System.out.print("\n");
                ListaL.toString();
                System.out.print("Id de Linea Investigativa: ");
                String idLI = teclado.next();
                System.out.print("\n");
                ListaSubLinea.toString();
                System.out.print("Id de Sub-Linea Investigativa: ");
                String idSI = teclado.next();
                System.out.print("Objetivo General de Proyecto: ");
                String ObjetivoGeneral = teclado.next();
                System.out.print("Objetivo Especifico de Proyecto: ");
                String ObjetivoEspecifico = teclado.next();
                System.out.print("Justificacion de Proyecto: ");
                String justificacion = teclado.next();
                System.out.print("Resumen de Proyecto: ");
                String resumen = teclado.next();
                System.out.print("\n");
                //if(ListaProyectos.MapearProyectoInvestigativo(resumen,ObjetivoGeneral,ObjetivoEspecifico,justificacion,descripcion,sumarDias(fechaInicial, tiempo),ListaL.devolverLineaL(idLI),ListaSubLinea.devolverSubLineaS(idSI)) == true){
                    System.out.print("\n    ***** ID de Radicado: " + ListaProyectos.getProyectoInvestigativo().getIdRadicado() + " *****");
                    System.out.print("\n    ***** PROYECTO REGISTRADO CON EXITO *****\n\n");
                //}else
                    //System.out.print("\n    ***** REGISTRO DE PROYECTO FALLIDO *****\n\n");
        /*)}else
            System.out.print("\n >>> ESTE ESTUDIANTE NO ESTA REGISTRADO <<<\n\n");*/
    }   //(LISTO) Opcion 1 de RegistroDePropuesta
    
    public void BuscarPerfil(){
        //Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\n      ***** BUSCAR PERFIL *****\n");
        System.out.print("--------------------------------------\n");
        System.out.print("Id de Perfil: ");
        int codigoB = teclado.nextInt();
        if(ListaComites.buscarComiteEvaluador(codigoB) == true){
            ListaComites.imprimirEncontrado(codigoB);
            System.out.print("\n\n");
        }/*else if(ListaE.buscarEstudiante(codigoB) == true){
            ListaE.imprimirEncontrado(codigoB);
            System.out.print("\n\n");
        }*/else if(ListaD.buscarDocente(codigoB) == true){
            ListaD.imprimirDocente(codigoB);
        }else
            System.out.print("\n    >>> PERFIL NO REGISTRADO <<<\n\n");
    }   //(LISTO) Opcion 2 de GestionDePerfiles
    
    public void ActualizarPerfil(){
        //Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\n      ***** ACTUALIZAR PERFIL *****\n");
        System.out.print("-----------------------------------------\n");
        System.out.print("Id de Perfil: ");
        int codigoA = teclado.nextInt();
        if(ListaComites.buscarComiteEvaluador(codigoA) == true){
            ListaComites.imprimirEncontrado(codigoA);
            System.out.print("\n");
            System.out.print("      ***** DATOS DE ACTUALIZACION DE COMITE EVALUADOR *****\n");
            System.out.print("----------------------------------------------------------\n");
            System.out.print("Nuevo Usuario: ");
            String user = teclado.next();
            System.out.print("Nuevo Password: ");
            String pass = teclado.next();

            if(ListaComites.actualizarComiteEvaluador(codigoA, user, pass) == true){
                ListaComites.imprimirEncontrado(codigoA);
                System.out.print("\n    ***** ACTUALIZACION EXITOSA *****\n\n");
            }else
                System.out.print("\n    ***** ACTUALIZACION FALLIDA *****\n\n");
        }/*else if(ListaE.buscarEstudiante(codigoA) == true){
            ListaE.imprimirEncontrado(codigoA);
            System.out.print("\n");
            System.out.print("      ***** DATOS DE ACTUALIZACION DE ESTUDIANTE *****\n");
            System.out.print("----------------------------------------------------\n");
            System.out.print("Nuevo Nombre: ");
            String name = teclado.next();
            System.out.print("Nuevo Apellido: ");
            String lastName = teclado.next();
            System.out.print("Nueva Carrera: ");
            String major = teclado.next();

            if(ListaE.actualizarEstudiante(codigoA, name, lastName, major) == true){
                ListaE.imprimirEncontrado(codigoA);
                System.out.print("\n    ***** ACTUALIZACION EXITOSA *****\n\n");
            }else
                System.out.print("\n    ***** ACTUALIZACION FALLIDA *****\n\n");
        }*/else if(ListaD.buscarDocente(codigoA) == true){
            ListaD.imprimirDocente(codigoA);
            System.out.print("\n");
            System.out.print("      ***** DATOS DE ACTUALIZACION DE DOCENTE *****\n");
            System.out.print("-------------------------------------------------\n");
            System.out.print("Nuevo Nombre: ");
            String nameD = teclado.next();
            System.out.print("Nuevo Apellido: ");
            String lastNameD = teclado.next();
            System.out.print("Nueva Area: ");
            String area = teclado.next();

            if(ListaD.actualizarDocente(codigoA, nameD, lastNameD, area) == true){
                ListaE.imprimirEncontrado(codigoA);
                System.out.print("\n    ***** ACTUALIZACION EXITOSA *****\n\n");
            }else
                System.out.print("\n    ***** ACTUALIZACION FALLIDA *****\n\n");
        }else
            System.out.print("\n    >>> PERFIL NO REGISTRADO <<<\n\n");
    }   //(LISTO) Opcion 3 de GestionDePerfiles
    
    public void EliminarPerfil(){
        //Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\n      ***** ELIMINAR PERFIL *****\n");
        System.out.print("---------------------------------------\n");
        System.out.print("Id de Perfil: ");
        int codigoEliminar = teclado.nextInt();
        if(ListaComites.buscarComiteEvaluador(codigoEliminar) == true){
            ListaComites.imprimirEncontrado(codigoEliminar);
            System.out.print("\n");
            System.out.print("  >>> CONFIRMAR: [S/N] ");
            char confirmar = teclado.next().charAt(0);
            if(confirmar == 's' || confirmar == 'S'){
                if(ListaComites.eliminarComiteEvaluador(codigoEliminar) == true){
                    System.out.print("\n    ***** COMITE ELIMINADO *****\n\n");
                }else
                    System.out.print("\n    ***** ELIMINACION FALLIDA *****\n\n");
            }
        }/*else if(ListaE.buscarEstudiante(codigoEliminar) == true){
            ListaE.imprimirEncontrado(codigoEliminar);
            System.out.print("\n");
            System.out.print("  >>> CONFIRMAR: [S/N] ");
            char confirmar = teclado.next().charAt(0);
            if(confirmar == 's' || confirmar == 'S'){
                if(ListaE.eliminarEstudiante(codigoEliminar) == true){
                    System.out.print("\n    ***** COMITE ELIMINADO *****\n\n");
                }else
                    System.out.print("\n    ***** ELIMINACION FALLIDA *****\n\n");
            }
        }*/else if(ListaD.buscarDocente(codigoEliminar) == true){
            ListaD.imprimirDocente(codigoEliminar);
            System.out.print("\n");
            System.out.print("  >>> CONFIRMAR: [S/N] ");
            char confirmar = teclado.next().charAt(0);
            if(confirmar == 's' || confirmar == 'S'){
                if(ListaD.eliminarDocente(codigoEliminar) == true){
                    System.out.print("\n    ***** COMITE ELIMINADO *****\n\n");
                }else
                    System.out.print("\n    ***** ELIMINACION FALLIDA *****\n\n");
            }
        }else
            System.out.print("\n    >>> PERFIL NO REGISTRADO <<<\n\n");
    }   //(LISTO) Opcion 4 de GestionDePerfiles
    
    public void GestionDeProyectos(){
        //Scanner teclado = new Scanner(System.in);
        /*int Op;
        
        do{
            System.out.print("\n\n        ***** GESTION DE PROPUESTAS *****\n\n");
            System.out.print("-------------------------------------------------\n");
            if(fechaInicial.compareTo(fechaLimite) <= 0){   //COMPARO QUE LA FECHA NO PASE DEL LIMITE ESTABLECIDO
                System.out.print("  1. Registrar un Propuesta.\n");
                System.out.print("  2. Eliminar una Propuesta.\n");
                System.out.print("  0. Salir.\n");
                System.out.print("-------------------------------------------------\n");
                System.out.print(">>> Opcion: ");
                Op = teclado.nextInt();
                switch(Op){
                    case 1: RegistroDePropuesta();
                        break;
                    case 2: if(ListaPracticas.getLista() != null && ListaProyectos.getLista() != null)
                                System.out.print("\n***** No Hay Propuestas Registradas *****\n");
                            else{
                                if(ListaPracticas.getLista() != null || ListaProyectos.getLista() != null){
                                    System.out.print("\n\n  ***** DATOS DE ADMIN *****\n");
                                    System.out.print("------------------------------\n");
                                    System.out.print("USER: ");
                                    String user = teclado.next();
                                    System.out.print("PASSWORD: ");
                                    String pass = teclado.next();
                                    if(ListaA.validarAdmin(user, pass) == true)
                                        EliminarPropuesta();
                                    else
                                        System.out.print("\n    ***** DATOS INCORRECTOS *****\n\n");
                                }
                            }
                            
                        break;
                }
            }else{
                System.out.print("  ***** FECHA PARA REGISTRO DE PROPUESTAS DE GRADO FINALIZADA *****\n");
                System.out.print("  1. Eliminar una Propuesta.\n");
                System.out.print("  0. Salir.\n");
                System.out.print("-------------------------------------------------\n");
                System.out.print(">>> Opcion: ");
                Op = teclado.nextInt();
                switch(Op){
                    case 1: if(ListaPracticas.getLista() == null && ListaProyectos.getLista() == null)
                                System.out.print("\n***** No Hay Propuestas Registradas *****\n");
                            else{
                                //if(ListaPracticas.getLista() != null || ListaProyectos.getLista() != null){
                                    System.out.print("\n\n  ***** DATOS DE ADMIN *****\n");
                                    System.out.print("------------------------------\n");
                                    System.out.print("USER: ");
                                    String user = teclado.next();
                                    System.out.print("PASSWORD: ");
                                    String pass = teclado.next();
                                    //if(ListaA.validarAdmin(user, pass) == true)
                                        //EliminarPropuesta();
                                    //else
                                        //System.out.print("\n    ***** DATOS INCORRECTOS *****\n\n");
                                }
                            }
                        break;
                }
            }
        }while(Op != 0);*/
    }   //(LISTO)Opcion 1 de Estudiante
    
    public void RegistroDePracticas(){
        //Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\n  ***** REGISTRO DE PRACTICAS EMPRESARIALES *****\n");
        System.out.print("---------------------------------------------------\n");
        /*System.out.print("Id de Estudiante: ");
        int idE = teclado.nextInt();
        if(ListaE.buscarEstudiante(idE) == true){
            /*ListaD.toString();
            System.out.print("\n");
            System.out.print("Id de Docente Evaluativo: ");
            String idD = teclado.next();
            if(ListaD.buscarDocente(idD) == true){*/
                System.out.print("\nNumero de Contacto de Empresa: ");
                String contacto = teclado.next();
                System.out.print("Representante Legal: ");
                String representante = teclado.next();
                System.out.print("Area a Ocupar: ");
                String area = teclado.next();
                System.out.print("Funcion a Desarrollar: ");
                String funcion = teclado.next();
                System.out.print("Descripcion: ");
                String descripcion = teclado.next();
                System.out.print("Tiempo de Ejecucion en Dias: ");
                int tiempo = teclado.nextInt();
                ListaL.toString();
                System.out.print("Id de Linea Investigativa: ");
                String idLI = teclado.next();
                System.out.print("\n");
                ListaSubLinea.toString();
                System.out.print("Id de Sub-Linea Investigativa: ");
                String idSI = teclado.next();
                //if(ListaPracticas.MapearPracticaEmpresarial(contacto, representante, area, funcion,/* ListaE.devolverEstudiante(idE), /*ListaD.devolverDocente(idD),*/ descripcion, sumarDias(fechaInicial, tiempo), ListaL.devolverLineaL(idLI), ListaSubLinea.devolverSubLineaS(idSI)) == true){
                    System.out.print("\n    ***** ID de Radicado: " + ListaPracticas.getPracticaEmpresarial().getIdRadicado() + " *****");
                    System.out.print("\n    ***** PRACTICAS REGISTRADAS CON EXITO *****\n\n");
                //}else
                    System.out.print("\n    ***** REGISTRO DE PRACTICAS FALLIDO *****\n\n");
            /*}else
                System.out.println("\n  >>> ESTE DOCENTE NO ESTA REGISTRADO <<<\n\n");*/
        /*}else
            System.out.print("\n >>> ESTE ESTUDIANTE NO ESTA REGISTRADO <<<\n\n");*/
    }   //(LISTO) Opcion 2 de RegistroDePropuesta
    
    public void EliminarPropuesta(){
        //Scanner teclado = new Scanner(System.in);
        /*int Op;
        
        do{
            System.out.print("\n\n  ***** ELIMINAR PROPUESTA DE GRADO *****\n");
            System.out.print("-------------------------------------------\n");
            System.out.print("  1. Eliminar Practica Empresarial.\n");
            System.out.print("  2. Eliminar Proyecto Investigativo.\n");
            System.out.print("  0. Salir\n");
            System.out.print("-------------------------------------------\n");
            System.out.print(">>> Opcion: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: if(ListaPracticas.getLista() == null)
                            System.out.print("\n***** NO HAY PRACTICAS REGISTRADAS *****\n");
                        else
                            EliminarPracticaEmpresarial();
                    break;
                case 2: if(ListaProyectos.getLista() == null)
                            System.out.print("\n***** NO HAY PROYECTOS REGISTRADOS *****\n");
                        else
                            EliminarProyectoInvestigativo();
                    break;
            }
        }while(Op != 0);*/
    }   //(LISTO)Opcion 2 de GestionDeProyectos
    
    public void EliminarPracticaEmpresarial(){
        //Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\n  ***** ELIMINAR PRACTICA EMPRESARIAL *****\n");
        System.out.print("---------------------------------------------\n");
        ListaPracticas.toString();
        System.out.print("\n");
        System.out.print("\nID de Practica Empresarial:");
        int idPractica = teclado.nextInt();
        /*if(ListaPracticas.buscarPracticaEmpresarial(idPractica) == true){
            ListaPracticas.imprimirEncontrado(idPractica);
            System.out.print("\n");
            System.out.print("  >>> CONFIRMAR: [S/N] ");
            char confirmar = teclado.next().charAt(0);
            if(confirmar == 's' || confirmar == 'S'){
                if(ListaPracticas.eliminarPracticaEmpresarial(idPractica) == true){
                    ListaPracticas.toString();
                    System.out.print("\n    ***** PRACTICA EMPRESARIAL ELIMINADA *****\n\n");
                }else
                    System.out.print("\n    ***** ELIMINACION FALLIDA *****\n\n");
            }
        }*/
    }   //(LISTO) Opcion 1 de EliminarPropuesta
    
    public void EliminarProyectoInvestigativo(){
        //Scanner teclado = new Scanner(System.in);
        
        System.out.print("\n\n  ***** ELIMINAR PROYECTO INVESTIGATIVO *****\n");
        System.out.print("-----------------------------------------------\n");
        ListaProyectos.toString();
        System.out.print("\n");
        System.out.print("\nID de Proyecto Investigativo:");
        int idProyecto = teclado.nextInt();
        /*if(ListaProyectos.buscarProyectoInvestigativo(idProyecto) == true){
            ListaProyectos.imprimirEncontrado(idProyecto);
            System.out.print("\n");
            System.out.print("  >>> CONFIRMAR: [S/N] ");
            char confirmar = teclado.next().charAt(0);
            if(confirmar == 's' || confirmar == 'S'){
                if(ListaProyectos.eliminarProyectoInvestigativo(idProyecto) == true){
                    ListaProyectos.toString();
                    System.out.print("\n    ***** PROYECTO INVESTIGATIVO ELIMINADO *****\n\n");
                }else
                    System.out.print("\n    ***** ELIMINACION FALLIDA *****\n\n");
            }
        }*/
    }   //(LISTO) Opcion 2 de EliminarPropuesta
    
    public void GestionDeFechas(){
        System.out.print("\n\n  ***** GESTIONAR FECHAS LIMITES *****\n");
        System.out.print("----------------------------------------\n");
        System.out.print("Fecha Actual: " + fechaInicial + "\n");
        System.out.print("\nCantidad de Dias Para Entrega: ");
        int dias = teclado.nextInt();
        System.out.print("\n    ***** FECHA LIMITE REGISTRADA *****\n");
        System.out.print("\n|        Fecha Inicial        |         Fecha Final         |");
        System.out.print("\n+-----------------------------+-----------------------------+\n");
        System.out.printf("|%-15s | %s|", fechaInicial,sumarDias(fechaInicial, dias));
        System.out.print("\n+-----------------------------+-----------------------------+\n");
        fechaLimite = sumarDias(fechaInicial, dias);
    }   //(LISTO) Opcion 2 de Admin
    
    public void GestionDeLineasYSubLineas(){
        int Op;
        
        do{
            System.out.print("\n\n  ***** GESTION DE LINEAS Y SUBLINEAS DE INVESTIGACION *****\n");
            System.out.print("--------------------------------------------------------------\n");
            System.out.print("      1. Gestion de Lineas de Investigacion.\n");
            System.out.print("      2. Gestion de Sub - Lineas de Investigacion.\n");
            System.out.print("      0. Salir\n");
            System.out.print("--------------------------------------------------------------\n");
            System.out.print(">>> Opcion: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: GestionLinea();
                    break;
                case 2: GestionSubLinea();
                    break;
            }
        }while(Op != 0);
    }   //(LISTO) Opcion 3 de Admin
    
    public void GestionLinea(){
        int Op;
        
        do{
            System.out.print("\n\n  ***** GESTION DE LINEAS DE INVESTIGACION *****\n");
            System.out.print("--------------------------------------------------\n");
            System.out.print("      1. Registrar Linea de Investigacion.\n");
            System.out.print("      2. Eliminar Linea de Investigacion.\n");
            System.out.print("      0. Salir\n");
            System.out.print("---------------------------------------------------\n");
            System.out.print(">>> Opcion: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: RegistrarLinea();
                    break;
                case 2: EliminarLinea();
                    break;
            }
        }while(Op != 0);
    }   //(LISTO) Opcion 1 de GestionDeLineasYSubLineas
    
    public void GestionSubLinea(){
        int Op;
        
        do{
            System.out.print("\n\n  ***** GESTION DE SUB - LINEAS DE INVESTIGACION *****\n");
            System.out.print("--------------------------------------------------------\n");
            System.out.print("      1. Registrar Sub - Linea de Investigacion.\n");
            System.out.print("      2. Eliminar Sub - Linea de Investigacion.\n");
            System.out.print("      0. Salir\n");
            System.out.print("---------------------------------------------------------\n");
            System.out.print(">>> Opcion: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: RegistroSubLinea();
                    break;
                case 2: EliminarSubLinea();
                    break;
            }
        }while(Op != 0);
    }   //(LISTO) Opcion 2 de GestionDeLineasYSubLineas
    
    public void RegistrarLinea(){
        System.out.print("\n\n  ***** REGISTRAR LINEA DE INVESTIGACION *****\n");
        System.out.print("Nombre de Linea: ");
        String name = teclado.next();
        if((ListaL.buscarLinea(ListaL.devolverLinea(name))) != true){
            ListaL.MapearLinea(name);
            if(ListaL.devolverLinea(name) != 0){
                System.out.print("\n    ***** REGISTRO DE LINEA EXITOSA *****");
                ListaL.imprimirEncontrado(ListaL.devolverLinea(name));
                System.out.print("\n");
            }else
                System.out.print("\n    ***** REGISTRO DE LINEA FALLIDA *****\n\n");
        }else{
            System.out.print("\n    ***** ESTA LINEA YA EXISTE *****\n");
            ListaL.imprimirEncontrado(ListaL.devolverLinea(name));
            System.out.print("\n");
        }
    }   //(LISTO) Opcion 1 de GestionLinea
    
    public void RegistroSubLinea(){
        System.out.print("\n\n  ***** REGISTRAR SUB - LINEA DE INVESTIGACION *****\n");
        if(ListaL.getLinea() != null){
            ListaL.toString();
            System.out.print("ID de Linea a la que Pertenece: ");
            String idLinea = teclado.next();
            if((ListaL.buscarLinea(ListaL.devolverLinea(idLinea))) != true){
                System.out.print("Nombre de Sub - Linea: ");
                String name = teclado.next();
                //ListaSubLinea.MapearSubLinea(idLinea, name);
                if((ListaSubLinea.buscarSubLinea(ListaSubLinea.devolverSubLinea(name))) != true){
                    ListaSubLinea.MapearSubLinea(ListaL.getLinea().getLineaInvestigativa(), name);
                    System.out.print("\n    ***** REGISTRO DE SUB - LINEA EXITOSA *****");
                    ListaSubLinea.imprimirEncontrado(ListaSubLinea.devolverSubLinea(name));
                    System.out.print("\n");
                }else{
                    System.out.print("\n    ***** SUB - LINEA EXISTENTE *****\n");
                    ListaSubLinea.imprimirEncontrado(ListaSubLinea.devolverSubLinea(name));
                    System.out.println("");
                }    
            }else
                System.out.print("\n    ***** LA LINEA " + idLinea + "NO EXISTE *****\n\n");
        }else
            System.out.print("\n  ***** NO HAY LINEAS INVESTIGATIVAS PARA ASOCIAR *****");
    }   //(LISTO) Opcion 1 de GestionSubLinea
    
    public void EliminarLinea(){
        System.out.print("\n\n  ***** ELIMINAR LINEA DE INVESTIGACION *****\n");
        ListaL.toString();
        System.out.print("ID de Linea Investigativa a Eliminar: ");
        int linea = teclado.nextInt();
        if(ListaL.eliminarLinea(linea) == true){
            System.out.print("\n    ***** LINEA INVESTIGATIVA ELIMINADA *****\n");
            ListaL.toString();
            System.out.print("\n");
        }else
            System.out.print("\n    ***** LINEA " + linea + " NO SE ENCUENTRA *****\n\n");
    }   //(LISTO) Opcion 2 de GestionLinea
    
    public void EliminarSubLinea(){
        System.out.print("\n\n  ***** ELIMINAR SUB - LINEA DE INVESTIGACION *****\n");
        ListaSubLinea.toString();
        System.out.print("ID de Sub - Linea Investigativa a Eliminar: ");
        int subLinea = teclado.nextInt();
        if(ListaSubLinea.eliminarSubLinea(subLinea) == true){
            System.out.print("\n    ***** SUB - LINEA INVESTIGATIVA ELIMINADA *****\n");
            ListaSubLinea.toString();
            System.out.print("\n");
        }else
            System.out.print("\n    ***** SUB - LINEA " + subLinea + " NO SE ENCUENTRA *****\n\n");
    }   //(LISTO) Opcion 2 de GestionSubLinea
    
    public void EvaluarPropuestas(){
        int Op;
        
        do{
            System.out.print("\n\n  ***** EVALUAR ROPUESTAS *****\n");
            System.out.print("---------------------------------\n");
            System.out.print("  1. Practicas Empresariales.\n");
            System.out.print("  2. Proyectos Investigativos.\n");
            System.out.print("  0. Salir\n");
            System.out.print("---------------------------------\n");
            System.out.print(">>> Opcion: ");
            Op = teclado.nextInt();
            switch(Op){
                case 1: EvaluarPracticas();
                    break;
                case 2: EvaluarProyectos();
                    break;
            }
        }while(Op != 0);
    }   //(LISTO) Opcion 1 de ComiteEvaluador
    
    public void EvaluarPracticas(){
        System.out.print("\n\n  ***** LISTADO DE PRACTICAS EMPRESARIALES *****\n");
        ListaPracticas.toString();
        System.out.print("\n");
        System.out.print("ID de Practica a Evaluar: ");
        int idPractica = teclado.nextInt();
        //ListaPracticas.imprimirEncontrado(idPractica);
        System.out.print("\n    ***** TABLA DE VALORES *****\n");
        System.out.print("  A <- [APROVADO]     -     D <- [NO APROBADO]\n");
        System.out.print("Evaluar Practica: ");
        char opcion = teclado.next().charAt(0);
        if(opcion == 'a' || opcion == 'A'){
            ListaPracticas.getPracticaEmpresarial().setEstado("APROBADO");
            System.out.print("\n\n  ***** ASIGNAR DOCENTES *****\n");
            ListaD.toString();
            System.out.print("\n");
            System.out.print("Docente #1: ");
            String docenteuno = teclado.next();
            System.out.print("Docente #2: ");
            String docentedos = teclado.next();
            //ListaPracticas.asignarDocentes(idPractica, docenteuno, docentedos);
            System.out.print("\n");
            System.out.print("Enviar Mejoras? [S/N] ");
            char OpMejoras = teclado.next().charAt(0);
            if(OpMejoras == 's' || OpMejoras == 'S'){
                System.out.print("Mejoras: ");
                String mejoras = teclado.next();
                ListaPracticas.getPracticaEmpresarial().setMejoras(mejoras);
                System.out.print("\n");
                System.out.print("  ***** MEJORAS ENVIADAS *****\n");
            }
            System.out.print("  ***** REGISTRO DE DOCENTES EXITOSO *****\n\n");
        }else if(opcion == 'd' || opcion == 'D'){
            ListaPracticas.getPracticaEmpresarial().setEstado("NO APROBADO");
            System.out.print("\n");
            System.out.print("Motivo de Rechazo: ");
            String motivoRechazo = teclado.next();
            System.out.print("Correcciones por Hacer: ");
            String correcciones = teclado.next();
            ListaPracticas.getPracticaEmpresarial().setMotivo(motivoRechazo);
            ListaPracticas.getPracticaEmpresarial().setCorrecciones(correcciones);
            System.out.print("\n");
            //ListaPracticas.imprimirEncontradoConRechazo(idPractica);
            System.out.print("\n");
            System.out.print("  ***** REGISTRO DE MOVITO DE RECHAZO Y CORRECCIONES CORRECTO *****\n\n");
        }
    }   //(LISTO) Opcion 1 de EvaluarPropuestas
    
    public void EvaluarProyectos(){
        System.out.print("\n\n  ***** LISTADO DE PROYECTOS INVESTIGATIVOS *****\n");
        ListaProyectos.toString();
        System.out.print("\n");
        System.out.print("ID de Proyecto a Evaluar: ");
        int idProyecto = teclado.nextInt();
        //ListaProyectos.imprimirEncontrado(idProyecto);
        System.out.print("\n    ***** TABLA DE VALORES *****\n");
        System.out.print("  A <- [APROVADO]     -     D <- [NO APROBADO]\n");
        System.out.print("Evaluar Proyecto: ");
        char opcion = teclado.next().charAt(0);
        if(opcion == 'a' || opcion == 'A'){
            ListaProyectos.getProyectoInvestigativo().setEstado("APROBADO");
            System.out.print("\n\n  ***** ASIGNAR DOCENTES *****\n");
            ListaD.toString();
            System.out.print("\n");
            System.out.print("Docente #1: ");
            String docenteuno = teclado.next();
            System.out.print("Docente #2: ");
            String docentedos = teclado.next();
            //ListaProyectos.asignarDocentes(idProyecto, docenteuno, docentedos);
            System.out.print("\n");
            System.out.print("Enviar Mejoras? [S/N] ");
            char OpMejoras = teclado.next().charAt(0);
            if(OpMejoras == 's' || OpMejoras == 'S'){
                System.out.print("Mejoras: ");
                String mejoras = teclado.next();
                ListaProyectos.getProyectoInvestigativo().setMejoras(mejoras);
                System.out.print("\n");
                System.out.print("  ***** MEJORAS ENVIADAS *****\n");
            }
            System.out.print("  ***** REGISTRO DE DOCENTES EXITOSO *****\n\n");
        }else if(opcion == 'd' || opcion == 'D'){
            ListaProyectos.getProyectoInvestigativo().setEstado("NO APROBADO");
            System.out.print("\n");
            System.out.print("Motivo de Rechazo: ");
            String motivoRechazo = teclado.next();
            System.out.print("Correcciones por Hacer: ");
            String correcciones = teclado.next();
            ListaProyectos.getProyectoInvestigativo().setMotivo(motivoRechazo);
            ListaProyectos.getProyectoInvestigativo().setCorrecciones(correcciones);
            System.out.print("\n");
            //ListaProyectos.imprimirEncontradoConRechazo(idProyecto);
            System.out.print("\n");
            System.out.print("  ***** REGISTRO DE MOVITO DE RECHAZO Y CORRECCIONES CORRECTO *****\n\n");
        }
    }   //(LISTO) Opcion 1 de ComiteEvaluador
    
    public void Seguimiento(){
        System.out.print("\n\n  ***** SEGUIMIENTO DE PROPUESTA *****\n");
        System.out.print("ID de Radicado: ");
        int idpropuesta = teclado.nextInt();
        /*if(ListaPracticas.buscarPracticaEmpresarial(idpropuesta) == true){
            if(ListaPracticas.getPracticaEmpresarial().getEstado().equals("APROVADO"))
                ListaPracticas.imprimirEncontrado(idpropuesta);
            else
                ListaPracticas.imprimirEncontradoConRechazo(idpropuesta);
        }else if(ListaProyectos.buscarProyectoInvestigativo(idpropuesta) == true){
            if(ListaProyectos.getProyectoInvestigativo().getEstado().equals("APROVADO"))
                ListaProyectos.imprimirEncontrado(idpropuesta);
            else
                ListaProyectos.imprimirEncontradoConRechazo(idpropuesta);
        }else
            System.out.print("  ***** ID " + idpropuesta + " NO SE ENCUENTRA EN LISTA DE PROYECTOS *****");*/
    }   //(LISTO) Opcion 2 de Estudiante
}