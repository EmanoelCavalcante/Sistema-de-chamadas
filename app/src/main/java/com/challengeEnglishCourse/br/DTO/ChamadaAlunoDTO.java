package com.challengeEnglishCourse.br.DTO;

public class ChamadaAlunoDTO{
  private String matricula;
  private boolean presenca;
  private String nome;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean getPresenca(){
    return presenca;
  }
  
  public void setPresenca(boolean presenca){
    this.presenca = presenca;
  }
  
  public String getNome(){
    return nome;
  }
  
  public void setNome(String nome){
    this.nome = nome;
  }
}