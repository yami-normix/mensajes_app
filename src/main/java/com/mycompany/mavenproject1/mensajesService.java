/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author carlos
 */
public class mensajesService {
    //Creando los métodos que reciben el menú y que se van a conectar con DAO
    
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message");
        String mensaje = sc.nextLine();
        
        System.out.println("Your name");
        String nombre = sc.nextLine();
        
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensajeDB(registro);
    }
    
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    public static void borrarMensaje(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Indica el ID del mensaje a borrar");
      int id_mensaje = sc.nextInt();
      MensajesDAO.borrarMensajeDB(id_mensaje);
    }
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        
        System.out.println("Indica el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        
        Mensajes actualizacion = new Mensajes();

        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
    
}
