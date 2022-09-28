package com.example.a20012011100_practical3
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import com.example.a20012011100_practical3.R
import com.example.a20012011100_practical3.secondactivity

lateinit var textView2: TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2 = findViewById(R.id.textView2)
        textView2.setOnClickListener {
            intent = Intent(this, secondactivity::class.java)
            startActivity(intent)
        }
    }
}