package com.challengeEnglishCourse.br.model;

public class Presenca {
    private int id;
    private int aulaId;
    private int alunoId;
    private boolean presenca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAulaId() {
        return aulaId;
    }

    public void setAulaId(int aulaId) {
        this.aulaId = aulaId;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public boolean isPresenca() {
        return presenca;
    }

    public void setPresenca(boolean presenca) {
        this.presenca = presenca;
    }
}
