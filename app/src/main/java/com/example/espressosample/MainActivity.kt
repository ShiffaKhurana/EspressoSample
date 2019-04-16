package com.example.espressosample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView=findViewById(R.id.editText) as EditText
        val button=findViewById(R.id.button) as Button
        // Change the text to "Hello" on button click
        button.setOnClickListener{textView.setText("Hello")}
    }
}
