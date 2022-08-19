package com.example.project;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Account.class}, version = 1, exportSchema = false)
public abstract class AccDatabase extends RoomDatabase{
    private static AccDatabase INSTANCE;
    static synchronized AccDatabase getDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AccDatabase.class,"Acc_database")
                    .allowMainThreadQueries()
                    .build();
        }
        return INSTANCE;
    }
    public abstract AccDao getAccDao();



}
