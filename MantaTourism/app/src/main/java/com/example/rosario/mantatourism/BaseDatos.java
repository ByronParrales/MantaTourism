package com.example.rosario.mantatourism;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

/**
 * Created by Rosario on 02/03/2017.
 */

public class BaseDatos extends SQLiteOpenHelper {

    public static class DatosTablas implements BaseColumns {
        public static final String NOMBRE_TABLA = "Datos";
        public static final String COLUMNA_CED = "entryid";
        public static final String COLUMNA_CORREO = "correo";
        public static final String COLUMNA_CONTRASEÑA = "contraseña";

        private static final String TEXT_TYPE = " TEXT";
        private static final String COMMA_SEP = ",";
        private static final String CREAR_TABLA_1 =
                "CREATE TABLE " + DatosTablas.NOMBRE_TABLA + " (" +
                        DatosTablas.COLUMNA_CED + " INTEGER PRIMARY KEY," +
                        DatosTablas.COLUMNA_CORREO + TEXT_TYPE + COMMA_SEP +
                        DatosTablas.COLUMNA_CONTRASEÑA + TEXT_TYPE + " )";

        private static final String SQL_DELETE_ENTRIES =
                "DROP TABLE IF EXISTS " + DatosTablas.NOMBRE_TABLA;
    }

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MiBasedeDatos.db";

    public BaseDatos(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DatosTablas.CREAR_TABLA_1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DatosTablas.SQL_DELETE_ENTRIES);
        onCreate(db);

    }
}