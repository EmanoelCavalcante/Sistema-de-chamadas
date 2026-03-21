package com.challengeEnglishCourse.br.service;

import com.challengeEnglishCourse.br.database.dao.AlunoDAO;
import com.challengeEnglishCourse.br.model.Aluno;
import java.util.List;
import java.util.ArrayList;


public class AlunoService{
  private AlunoDAO alunoDAO;
  public AlunoService(AlunoDAO alunoDAO){
    this.alunoDAO = alunoDAO;
  }
  
  public Aluno registrarAluno(String nome){
      if(nome == null){
          throw new RuntimeException("Nome null");
      }

      nome = nome.trim();
      nome = nome.replaceAll(" +", " ");

      if(nome.isEmpty()){
          throw new IllegalArgumentException("Nome vazio!");
      }

      String nomeComparado = nome.replaceAll("\\s+", "").toLowerCase();

      List<Aluno> alunos = alunoDAO.buscarAlunoPeloNome(nomeComparado);
      if(!alunos.isEmpty()){
          throw new RuntimeException("Aluno já cadastrado");
      }

      Aluno aluno = new Aluno();
      aluno.setNome(nome);
      long id = alunoDAO.inserirAluno(aluno);
      if(id != -1){
          aluno.setId(id);
      }

      return aluno;
  }


}