package com.challengeEnglishCourse.br.database.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


import com.challengeEnglishCourse.br.database.DataBaseHelper;

public class AlunoDAO {
    private DataBaseHelper dbHelper;
    private SQLiteDatabase db;

    public AlunoDAO(Context context){
        dbHelper = new DataBaseHelper(context);
        db = dbHelper.getWritableDatabase();
    }

    public long inserirAlunos(String nome, String matricula){
        ContentValues values = new ContentValues();
        values.put("nome", nome);
        values.put("matricula", matricula);

        return db.insert("aluno", null, values);
    }

    public Cursor buscarAlunoPorMatricula(String matricula){
        return db.query();
    }
}
