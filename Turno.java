package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.Objects;

public class Turno {

  private String nome;
  private ArrayList<Curso> cursos;

  

  public Turno(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public ArrayList<Curso> getCursos() {
    return cursos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Turno turno = (Turno) o;
    return Objects.equals(nome, turno.getNome());
  }

  @Override
  public String toString() {
    return ("Turno [nome = " + nome + ", cursos = " + cursos + "]");
  }
}
