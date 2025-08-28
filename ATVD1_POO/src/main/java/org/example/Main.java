package org.example;

public class Main {
    public static void main(String[] args) {

        //Criando a faculdade
        Faculdade faculdade = new Faculdade("UFMG - Universidade Federal de Minas Gerais","Av. Pres. Antônio Carlos, 6627 - Pampulha","17.217.985/0001-04");


        //Criando os cursos
        Curso curso1 = new Curso("Analise e Desenvolvimento de Sistemas","ADS101",2200, "Prof. Cristiano");
        Curso curso2 = new Curso("Engenharia de Software", "ES101", 3000, "Prof. Felipe");
        Curso curso3 = new Curso("Direito", "DR101", 3700, "Prof. Angela");


        //Adicionando os cursos na faculdade
        faculdade.adicionarCurso(curso1);
        faculdade.adicionarCurso(curso2);
        faculdade.adicionarCurso(curso3);

        //Criando os alunos
        Aluno aluno1 = new Aluno("João Marcelo", 101, 22, "joaomarcelo@gmail.com");
        Aluno aluno2 = new Aluno("Marcia dos Santos", 102, 25, "marciasantos@gmail.com");
        Aluno aluno3 = new Aluno("Gustavo Mota", 103, 19, "gustavomota@gmail.com");

        //Adicionando os alunos na faculdade
        faculdade.adicionarAluno(aluno1);
        faculdade.adicionarAluno(aluno2);
        faculdade.adicionarAluno(aluno3);

        //Matriculando os alunos nos cursos
        aluno1.matricular(curso1);
        aluno2.matricular(curso2);
        aluno3.matricular(curso3);

        //Exibindo as iformações
        faculdade.exibirInformacoes();
        curso1.exibirInformacoes();
        curso2.exibirInformacoes();
        curso3.exibirInformacoes();
    }
}
