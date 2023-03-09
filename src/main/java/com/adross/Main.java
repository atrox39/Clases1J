package com.adross;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Agenda agenda = new Agenda(new ArrayList<Persona>(Arrays.asList(
        new Persona("Eddy", "6640000000"),
        new Persona("Damaris", "6640000000"),
        new Persona("Angelica", "6640000000")
    )));
    int opc = 0;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("Agenda");
      System.out.println("1.- Mostrar los contactos");
      System.out.println("2.- Agregar un contacto");
      System.out.println("3.- Detalle del contacto");
      System.out.println("4.- Modificar el contacto");
      System.out.println("5.- Eliminar un contacto");
      System.out.println("0.- Salir");
      System.out.print("Escribe la opcion: ");
      opc = scanner.nextInt();
      if (opc == 1) agenda.listarPersonas();
      if (opc == 2) {
        System.out.print("Escribe el nombre: ");
        String nombre = scanner.next();
        System.out.print("Escribe el telefono: ");
        String telefono = scanner.next();
        agenda.agregarPersona(new Persona(nombre, telefono));
      }
      if (opc == 3) {
        System.out.print("Escribe el ID: ");
        int id = scanner.nextInt();
        agenda.detallePersona(id);
      }
      if (opc == 4) {
        System.out.print("Escribe el ID: ");
        int id = scanner.nextInt();
        System.out.print("Escribe el nombre: ");
        String nombre = scanner.next();
        System.out.print("Escribe el telefono: ");
        String telefono = scanner.next();
        agenda.modificarPersona(id, new Persona(nombre, telefono));
      }
      if (opc == 5) {
        System.out.print("Escribe el ID: ");
        int id = scanner.nextInt();
        agenda.eliminarPersona(id);
      }
      if (opc == 0) break;
    }
  }
}