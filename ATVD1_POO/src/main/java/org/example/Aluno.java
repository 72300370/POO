package org.example;

public class Aluno {
    private String nome;
    private int matricula;
    private int idade;
    private String email;
    private Curso curso;

    public Aluno(String nome, int matricula, int idade, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.email = email;
    }

    public void matricular(Curso c) {
        this.curso = c;
        c.adicionarAluno(this);
        System.out.println(nome + " se matriculou no curso " + c.getNome());
    }

    public void exibirDados(){
        System.out.println(nome + " | Matricula: " + matricula + " | Curso: " + (curso != null ? curso.getNome() : "Nenhum"));
    }

    //Get para retornar nome
    public  String getNome() {
        return nome;
    }
}
