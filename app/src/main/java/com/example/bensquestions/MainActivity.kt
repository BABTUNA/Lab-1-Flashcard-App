package com.example.bensquestions

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val question = findViewById<TextView>(R.id.question)
        val answer = findViewById<TextView>(R.id.answer)
        val questionOne = findViewById<TextView>(R.id.question_one)
        val questionTwo = findViewById<TextView>(R.id.question_two)
        val questionThree = findViewById<TextView>(R.id.question_three)

        question.setOnClickListener{
            question.visibility = View.INVISIBLE
            answer.visibility = View.VISIBLE
        }

        answer.setOnClickListener{
            answer.visibility = View.INVISIBLE
            question.visibility = View.VISIBLE
        }

        questionOne.setOnClickListener{
            findViewById<TextView>(R.id.question_one).setBackgroundColor(getResources().getColor(R.color.my_color_green, null))
        }

        questionTwo.setOnClickListener{
            findViewById<TextView>(R.id.question_two).setBackgroundColor(getResources().getColor(R.color.my_color_red, null))
        }

        questionThree.setOnClickListener{
            findViewById<TextView>(R.id.question_three).setBackgroundColor(getResources().getColor(R.color.my_color_red, null))
        }
    }
}