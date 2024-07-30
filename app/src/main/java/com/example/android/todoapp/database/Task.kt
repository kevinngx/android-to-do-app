package com.example.android.todoapp.database

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity(tableName = "tasks_table")
data class Task (
    @PrimaryKey(autoGenerate = true)
    var taskId: Long = 0L,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "description")
    var description: String,

    @ColumnInfo(name = "due")
    var dueDate: String,

    @ColumnInfo(name = "dueTime")
    var dueTime: String
)