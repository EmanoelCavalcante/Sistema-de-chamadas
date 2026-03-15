package com.challengeEnglishCourse.br.model;

import java.time.LocalDate;

public class Aula {
    private int id;
    private String nomeAula;
    private String data;
    private String descricaoAula;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAula() {
        return nomeAula;
    }

    public void setNomeAula(String aula) {
        this.nomeAula = aula;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void setDescricaoAula(String descricaoAula){
      this.descricaoAula = descricaoAula;
    }
    
    public String getDescricaoAula(){
      return descricaoAula;
    }
}
