package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.Objects;

public class Curso {
        private String nome;
        private ArrayList<Professor> professores;
        private ArrayList<Aluno> alunos;



        public Curso(String nome) {
                this.nome = nome;
                       }

        public String getNome() {
                return nome;
        }

        public ArrayList<Professor> getProfessores() {
                return professores;
        }

        public ArrayList<Aluno> getAlunos() {
                return alunos;
        }
        
        @Override
        public boolean equals(Object o) {
                if (this == o)
                        return true;
                if (o == null || getClass() != o.getClass())
                        return false;
                Curso cursos = (Curso) o;
                return Objects.equals(nome, cursos.getNome());
        }

        @Override
        public int hashCode() {
                return Objects.hash(nome);
        }

        @Override
        public String toString() {
                return "Curso [nome = " + nome + ", professores = " + professores + ", alunos = "
                                + alunos + "]";
        }

        public static int size() {
            return 0;
        }

}