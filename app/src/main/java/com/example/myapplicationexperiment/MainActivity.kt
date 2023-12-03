package com.example.myapplicationexperiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // R is a class that contains all the resources in the project

        //TextView myTextView = findViewById(R.id.MyTextView); // find the view by id
        //myTextView.setText("Haaaaa"); // set the text
    }
}