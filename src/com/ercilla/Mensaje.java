
package com.ercilla;

import java.util.Scanner;

public class Mensaje {

 public String solicitarDatos(String mensaje) {
  System.out.print(mensaje);

  Scanner sc = new Scanner(System.in);
  return sc.nextLine();
 }

 public void saludar(String nombre) {
  System.out.printf("Hola %s, bienvenido a Java%n", nombre);
 }

 public static void main(String[] args) {

  Mensaje msg = new Mensaje();

  String nombre = msg.solicitarDatos("Escribe tu nombre: ");

  msg.saludar(nombre);
 }
}
