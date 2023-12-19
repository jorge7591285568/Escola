/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/
package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class Escola {

  public static void main(String[] args) {
    // Add Alunos do colegio.

    ArrayList<Aluno> alunos = new ArrayList<>();

    Aluno aluno = new Aluno("Jorge", "20191tadssaj0015");
    Aluno aluno1 = new Aluno("Jorge1", "20191tadssaj0016");
    Aluno aluno2 = new Aluno("Jorge2", "20191tadssaj0017");
    Aluno aluno3 = new Aluno("Jorge3", "20191tadssaj0018");
    Aluno aluno4 = new Aluno("Jorge4", "20191tadssaj0019");
    Aluno aluno5 = new Aluno("Jorge5", "20191tadssaj0020");
    Aluno aluno6 = new Aluno("Jorge6", "20191tadssaj0021");
    Aluno aluno7 = new Aluno("Jorge7", "20191tadssaj0022");
    Aluno aluno8 = new Aluno("Jorge8", "20191tadssaj0023");
    Aluno aluno9 = new Aluno("Jorge9", "20191tadssaj0025");

    /*for (int i = 0; i < Aluno.size(); i++) {
      System.out.println("Alunos : " + alunos.get(i));
    }*/

    // add professores e matriculas..

    ArrayList<Professor> professores = new ArrayList<>();

    Professor professor = new Professor("Miguel", "20191tadssaj0001");
    Professor professor1 = new Professor("Miguel1", "20191tadssaj0002");
    Professor professor2 = new Professor("Miguel2", "20191tadssaj0003");
    Professor professor3 = new Professor("Miguel3", "20191tadssaj0004");
    Professor professor4 = new Professor("Miguel4", "20191tadssaj0005");

    /*for (int i = 0; i < Professor.size(); i++) {
      System.out.println("Professores : " + professores.get(i));
    }*/

    // add cursos existentes no colegio.

    ArrayList<Curso> cursos = new ArrayList<>();

    Curso curso = new Curso("python");
    Curso curso1 = new Curso("WEB");
    Curso curso2 = new Curso("POO");
    Curso curso3 = new Curso("Flutter");
    Curso curso4 = new Curso("C++");

    /*for (int i = 0; i < Curso.size(); i++) {
      System.out.println("Cursos : " + cursos.get(i));
    }*/

    // Add turnos existentes no colegio.

    Turno turno = new Turno("Matutitno: ");
    Turno turno1 = new Turno("Vespertino: ");
    Turno turno2 = new Turno("Noturno: ");

    System.out.println("\n***********************************************");
    System.out.println("   Nome do Turno:     " + turno.getNome());
    System.out.println(
      "   Nome do Professor: " +
      professor.getNome() +
      "  " +
      professor1.getNome() +
      " " +
      professor2.getNome() +
      " " +
      professor3.getNome() +
      " " +
      professor4.getNome()
    );
    System.out.println(
      "   Nome do Curso:     " +
      curso.getNome() +
      "  " +
      curso1.getNome() +
      "     " +
      curso2.getNome() +
      "     " +
      curso3.getNome() +
      " " +
      curso4.getNome() +
      " "
    );
    System.out.println(
      "   Nome do Aluno:     " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      " \n                      " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      " \n                      " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      " \n                      " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      " \n                      " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      " \n                      " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      " \n                      " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      " \n                      " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      " \n                      " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      " \n                      " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome()
    );
    System.out.println("***********************************************");
    System.out.println("   Nome do Turno:     " + turno1.getNome());
    System.out.println(
      "   Nome do Professor: " +
      professor.getNome() +
      "  " +
      professor1.getNome() +
      " " +
      professor2.getNome() +
      " " +
      professor3.getNome() +
      " " +
      professor4.getNome()
    );
    System.out.println(
      "   Nome do Curso:     " +
      curso.getNome() +
      "  " +
      curso1.getNome() +
      "     " +
      curso2.getNome() +
      "     " +
      curso3.getNome() +
      " " +
      curso4.getNome() +
      " "
    );
    System.out.println(
      "   Nome do Aluno:     " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      " \n                      " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      " \n                      " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      " \n                      " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      " \n                      " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      " \n                      " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      " \n                      " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      " \n                      " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      " \n                      " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      " \n                      " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome()
    );
    System.out.println("***********************************************");
    System.out.println("   Nome do Turno:     " + turno2.getNome());
    System.out.println(
      "   Nome do Professor: " +
      professor.getNome() +
      "  " +
      professor1.getNome() +
      " " +
      professor2.getNome() +
      " " +
      professor3.getNome() +
      " " +
      professor4.getNome()
    );
    System.out.println(
      "   Nome do Curso:     " +
      curso.getNome() +
      "  " +
      curso1.getNome() +
      "     " +
      curso2.getNome() +
      "     " +
      curso3.getNome() +
      " " +
      curso4.getNome() +
      " "
    );
    System.out.println(
      "   Nome do Aluno:     " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      "   " +
      aluno.getNome() +
      " \n                      " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      "  " +
      aluno1.getNome() +
      " \n                      " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      "  " +
      aluno2.getNome() +
      " \n                      " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      "  " +
      aluno3.getNome() +
      " \n                      " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      "  " +
      aluno4.getNome() +
      " \n                      " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      "  " +
      aluno5.getNome() +
      " \n                      " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      "  " +
      aluno6.getNome() +
      " \n                      " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      "  " +
      aluno7.getNome() +
      " \n                      " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      "  " +
      aluno8.getNome() +
      " \n                      " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome() +
      "  " +
      aluno9.getNome()
    );
    System.out.println("\n***********************************************");
    /*for (Aluno Aluno : alunos) {
      System.out.println("Alunos: " + alunos.get(0));
    }
    for (Professor Professor : professores) {
      System.out.println("Professores: " + professores.get(0));
    }
    for (Curso Curso : cursos) {
      System.out.println("Cursos: " + cursos.get(0));
    }
  }*/
    System.out.println("\n");
    System.out.println(turno.toString());
    System.out.println(curso.toString());
    System.out.println(professor.toString());
    System.out.println(aluno.toString());
    System.out.println("\n");
  }
}
