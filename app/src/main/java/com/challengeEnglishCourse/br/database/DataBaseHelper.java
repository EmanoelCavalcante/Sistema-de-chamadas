package com.challengeEnglishCourse.br.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "Chamadas.db";
    private static final int DB_VERSION = 1;

    public DataBaseHelper(Context context){
        super(context,
                DB_NAME,
                null,
                DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE aluno(" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "nome TEXT," +
            "matricula TEXT)");

        db.execSQL("CREATE TABLE presenca(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "aluno_Id INTEGER,"+
                "aula_Id INTEGER,"+
                "presenca INTEGER)");

        db.execSQL("CREATE TABLE aula("+
                "id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nome TEXT,"+
                "data TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS aluno");
        db.execSQL("DROP TABLE IF EXISTS aula");
        db.execSQL("DROP TABLE IF EXISTS presenca");
        onCreate(db);
    }
}
