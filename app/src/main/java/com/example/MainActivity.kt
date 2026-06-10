package com.example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.data.AppDatabase
import com.example.data.TodoRepository
import com.example.ui.TodoApp
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    
    val database = AppDatabase.getDatabase(this)
    val repository = TodoRepository(database.todoDao())
    
    enableEdgeToEdge()
    setContent {
      MyApplicationTheme {
        TodoApp(repository = repository)
      }
    }
  }
}
