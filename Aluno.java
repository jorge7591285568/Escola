package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {

  private String nome;
  private String matricula;
  private ArrayList<Curso> cursos;

  public Aluno(String nome, String matricula) {
    this.nome = nome;
    this.matricula = matricula;
      }

  public String getNome() {
    return nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public ArrayList<Curso> getCursos() {
    return cursos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Aluno alunos = (Aluno) o;
    return Objects.equals(nome, alunos.getNome());
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome);
  }

  @Override
  public String toString() {
    return (
      "Aluno [nome = " +
      nome +
      ", matricula = " +
      matricula +
      ", cursos = " +
      cursos +
      "]"
    );
  }

  public static int size() {
    return 0;
  }
}
