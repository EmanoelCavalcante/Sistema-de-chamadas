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
  
  private String normalizarNome(String nome){
    nome = nome.trim();
    return nome.replaceAll(" +", " ");
  }
  
  private void validarMatricula(long matricula){
    if(matricula <= 0){
      throw new RuntimeException("Matrícula inválida");
    }
  }
  
  public Aluno registrarAluno(String nome){
      if(nome == null){
          throw new RuntimeException("Nome null");
      }

      nome = normalizarNome(nome);

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
  
  public List<Aluno> buscarPeloNome(String nome){
    if(nome == null){
      throw new IllegalArgumentException("Nome não pode ser null!");
    }
    nome = normalizarNome(nome);
    
    if(nome.isEmpty()){
      throw new RuntimeException("Nome vazio!");
    }
    
    List<Aluno> alunos = 
    alunoDAO.buscarAlunoPeloNome(nome); 
    
    alunos.sort(Comparator.comparing(a -> a.getNome() == null ? "" : aluno.getNome().toLowerCase());
    
    if(alunos.isEmpty()){
      throw new RuntimeException("Lista de alunos vazia!");
    }
    
    return alunos;
  }
  
  public Aluno buscarAlunoPorMatricula(long matricula){
    validarMatricula(matricula);
    Aluno aluno = alunoDAO.buscarAlunoPorMatricula(matricula);
    
    if(aluno == null{
      throw new RuntimeException("Aluno não encontrado");
    }
    
    return aluno;
  }
  
  public boolean existeAlunoPorMatricula(long matricula){
    validarMatricula(matricula);
    
    Aluno aluno = alunoDAO.buscarAlunoPorMatricula(matricula);
    
    return aluno != null;
  }
}