package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_tasks")
data class TodoTask(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val description: String = "",
    val isCompleted: Boolean = false,
    val category: String = "Personal",
    val priority: String = "MEDIUM", // HIGH, MEDIUM, LOW
    val dueDate: Long? = null,
    val createdAt: Long = System.currentTimeMillis()
)
