package com.example.myshopping.db

import androidx.room.Query
import androidx.room.Dao
import androidx.room.Insert
import com.example.myshopping.entities.NoteItem
import kotlinx.coroutines.flow.Flow

@androidx.room.Dao
interface Dao {
    @Query("SELECT * FROM NoteItem")
    fun getAllNotes(): Flow<List<NoteItem>>

    @Insert
    suspend fun insertNote(note: NoteItem)
}