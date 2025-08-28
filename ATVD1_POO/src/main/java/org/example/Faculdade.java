package org.example;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    //Atributos
    public String nome;
    public String endereco;
    private String cnpj;
    public List<Curso> listaCursos = new ArrayList<>();
    private List<Aluno> listaAlunos = new ArrayList<>();

    //Construtor
    public Faculdade(String nome, String endereco, String cnpj) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
    }

    //Metodo que adicona cursos
    public void adicionarCurso(Curso c) {
        listaCursos.add(c);

        System.out.println("Curso " + c.getNome() + " adicionado a faculdade " + nome);
    }

    //Metodo que adicona Alunos
    public void adicionarAluno(Aluno a) {
        listaAlunos.add(a);

        System.out.println("Aluno " + a.getNome() + " matriculado na faculdade " + nome);
    }

    public void exibirInformacoes() {

        System.out.println("\nFaculdade: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("CNPJ: " + cnpj);

        System.out.println("\nCursos oferecidos: ");
        for (Curso c : listaCursos) {
            System.out.println(" - " + c.getNome());
        }

        System.out.println("\nAlunos matriculados: ");
        for (Aluno a : listaAlunos) {
            System.out.println(" - " + a.getNome());
        }
    }

    //Get para retornar o nome
    public String getNome() {
        return nome;
    }
}



