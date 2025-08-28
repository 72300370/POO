package org.example;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private String codigo;
    private int cargaHoraria;
    private String profResponsavel;
    private List<Aluno> listaAlunos = new ArrayList<>();

    public Curso(String nome, String codigo, int cargaHoraria, String profResponsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.profResponsavel = profResponsavel;
    }

    public void adicionarAluno(Aluno a) {
        listaAlunos.add(a);
        System.out.println("Aluno " + a.getNome() + " adicionado ao curso " + nome);
    }

    public void exibirInformacoes() {
        System.out.println("\nCurso: " + nome + " (" + codigo + ")");
        System.out.println("Professor: " + profResponsavel);
        System.out.println("Carga Horaria: " + cargaHoraria + "h");
        System.out.println("Alunos matriculados: ");
        for (Aluno a : listaAlunos) {
            System.out.println(" - " + a.getNome());
        }
    }

    //Get para retornar o nome
    public String  getNome() {
        return nome;
    }
}
