package com.challengeEnglishCourse.br.model;

public class Aluno {
    private int id;
    private String nome;
    private long matricula;

    public int getId()
    {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return String.valueOf(2026000 + this.id);
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}
