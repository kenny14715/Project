package com.example.project;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

//訪問資料庫的接口
@Dao //Database access object
public interface AccDao {
    @Insert
    void insertAccs(Account... accounts);

    @Update
    void updateAccs(Account... accounts);

    @Delete
    void deleteAccs(Account... accounts);

    @Query("DELETE FROM ACCOUNT")
    void deleteAllAccs();

    @Query("SELECT * FROM ACCOUNT WHERE account LIKE :acc AND password LIKE :pwd LIMIT 1")
    Account findByName(String acc,String pwd);

    @Query("SELECT * FROM ACCOUNT ORDER BY ID DESC")
    LiveData<List<Account>> getAllAccsLives();
}

