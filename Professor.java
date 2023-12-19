
package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.Objects;

public class Professor {
        private String nome;
        private String matricula;
        private ArrayList<Curso> cursos;  

        public Professor(String nome, String matricula) {
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
                if (this == o)
                        return true;
                if (o == null || getClass() != o.getClass())
                        return false;
                Professor professores = (Professor) o;
                return Objects.equals(nome, professores.getNome());
        }

        @Override
        public int hashCode() {
                return Objects.hash(nome);
        }

        @Override
        public String toString() {
                return "Professor [nome = " + nome + ", matricula = " + matricula + ", cursos = " + cursos + "]";
        }

        public static int size() {
            return 0;
        }


}