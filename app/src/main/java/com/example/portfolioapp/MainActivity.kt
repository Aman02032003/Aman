package com.example.portfolioapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val and var
        val buttonSkills= findViewById<Button>(R.id.btnSkills)

        buttonSkills.setOnClickListener {

            intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        val buttonEducationActivity= findViewById<Button>(R.id.btnEducation)

        buttonEducationActivity.setOnClickListener {
            Toast.makeText(this, "Button Clicked",Toast.LENGTH_SHORT).show()

            intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
    }
}