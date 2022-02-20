package com.example.romdatabase.data.local;

import androidx.room.Dao;
import androidx.room.Query;

@Dao
public interface WorkDao {

    @Query("SELECT * FROM work")
}
