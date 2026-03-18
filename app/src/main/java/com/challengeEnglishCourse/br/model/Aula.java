package com.challengeEnglishCourse.br.model;

import java.time.LocalDate;

public class Aula {
    private int id;
    private String nomeAula;
    private LocalDate data;
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

    public LocalDate getData() {
        return data;
    }
    
    public String getDataFormatada(){
      return data.toString();
    }
    
    public String getDescricaoAula(){
          return descricaoAula;
    }

    public void setData(LocalDate data){
      this.data = data;
    }

    public void setData(String data) {
      this.data = LocalDate.parse(data);
    }
    
    public void setDescricaoAula(String descricaoAula){
      this.descricaoAula = descricaoAula;
    }
}
