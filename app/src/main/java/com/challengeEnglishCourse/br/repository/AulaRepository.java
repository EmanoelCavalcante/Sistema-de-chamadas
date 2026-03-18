package com.challengeEnglishCourse.br.repository;

import java.util.List;

import android.content.Context;

import com.challengeEnglishCourse.br.database.DAO.AulaDAO;
import com.challengeEnglishCourse.br.model.Aula;

public class AulaRepository {
  private AulaDAO aulaDAO;
  
  public AulaRepository(Context context){
    aulaDAO = new AulaDAO(context);
  }
  
  public long registrarAula(Aula aula){
    return aulaDAO.inserirAula(aula);
  }
  
  public List<Aula> listarAulas(Aula aula){
    return aulaDAO.listarAulas();
  }
  
  public long atualizarAula(Aula aula){
    return aulaDAO.atualizarAula(aula);
  }
  
  public long deletaeAula(int aulaId, int alunoId){
    return aulaDAO.deletarAula(aulaId, alunoId);
  }
}
