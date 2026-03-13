package com.challengeEnglishCourse.br.database.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import java.util.ArrayList;
import com.challengeEnglishCourse.br.model.Aluno;
import com.challengeEnglishCourse.br.database.DataBaseHelper;


public class AlunoDAO {
    private DataBaseHelper dbHelper;
    private SQLiteDatabase db;

    public AlunoDAO(Context context){
        dbHelper = new DataBaseHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public long inserirAlunos(Aluno aluno){
        ContentValues values = new ContentValues();
        values.put("nome", aluno.getNome());
        values.put("matricula", aluno.getMatricula());

        return db.insert("aluno", null, values);
    }

    public List<Aluno> buscarAlunoPorMatricula(String matricula){
      List <Aluno> alunos = new  ArrayList<>();
      try{
        Cursor cursor = db.rawQuery(
          "SELECT * FROM aluno WHERE matricula=?", new String[]{matricula}
        );
      }
        
        while (cursor.moveToNext()){
          Aluno aluno = new Aluno();
          
          aluno.setNome(
            cursor.getString(cursor.getColumnIndexOrThrow("nome")));
            
          aluno.setId(
            cursor.getInt(cursor.getColumnIndexOrThrow("id")
            ));
            
            aluno.setMatricula(
              cursor.getString(cursor.getColumnIndexOrThrow("matricula")
              ));
          alunos.add(aluno);
        }
        finally{
          if(cursor != null){
            cursor.close();
          }
        }
        return alunos;
      }
    }
}
