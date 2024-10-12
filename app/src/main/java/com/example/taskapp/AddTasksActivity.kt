package com.example.taskapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.taskapp.databinding.ActivityAddTasksBinding
import com.example.taskapp.databinding.ActivityMainBinding

class AddTasksActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddTasksBinding
    private lateinit var db:TaskDatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddTasksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db= TaskDatabaseHelper(this)

        binding.saveButton.setOnClickListener {
            val title = binding.titleEditText.text.toString()
            val content = binding.contentEditText.text.toString()
            val task = Task(0,title, content)
            db.insertTask(task)
            finish()
            Toast.makeText(this,"Task saved", Toast.LENGTH_SHORT).show()
        }

        }
    }
