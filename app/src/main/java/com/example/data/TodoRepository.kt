package com.example.data

import kotlinx.coroutines.flow.Flow

class TodoRepository(private val todoDao: TodoDao) {
    val allTasks: Flow<List<TodoTask>> = todoDao.getAllTasks()

    suspend fun insert(task: TodoTask) {
        todoDao.insertTask(task)
    }

    suspend fun update(task: TodoTask) {
        todoDao.updateTask(task)
    }

    suspend fun delete(task: TodoTask) {
        todoDao.deleteTask(task)
    }

    suspend fun updateCompletionStatus(id: Int, isCompleted: Boolean) {
        todoDao.updateCompletionStatus(id, isCompleted)
    }
}
