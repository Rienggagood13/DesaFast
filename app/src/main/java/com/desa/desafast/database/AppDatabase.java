package com.desa.desafast.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.desa.desafast.dao.DatabaseDao;
import com.desa.desafast.model.ModelDatabase;



@Database(entities = {ModelDatabase.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}
