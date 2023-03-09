package com.adross;

import java.util.ArrayList;

public class Agenda {
  private ArrayList<Persona> personas;

  public Agenda(ArrayList<Persona> personas) {
    this.personas = personas;
  }

  public ArrayList<Persona> getPersonas() {
    return personas;
  }

  public void setPersonas(ArrayList<Persona> personas) {
    this.personas = personas;
  }

  public void listarPersonas() {
    for(int i=0;i<personas.size();i++) {
      Persona p = personas.get(i);
      System.out.println(String.format("ID: %d | Nombre: %s | Telefono: %s", i + 1, p.getNombre(), p.getTelefono()));
    }
  }

  public void agregarPersona(Persona p) {
    personas.add(p);
  }

  public void detallePersona(int index) {
    Persona p = personas.get(index-1);
    System.out.println(String.format("ID: %d | Nombre: %s | Telefono: %s", index, p.getNombre(), p.getTelefono()));
  }

  public void modificarPersona(int index, Persona p) {
    personas.set(index-1, p);
  }

  public void eliminarPersona(int index) {
    personas.remove(index-1);
  }
}
