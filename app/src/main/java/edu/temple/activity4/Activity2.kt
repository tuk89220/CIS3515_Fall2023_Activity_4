package edu.temple.activity4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val size =  intent.getFloatExtra("textSize", 0f)
        var textView = findViewById<TextView>(R.id.textView)

        textView.textSize = size
    }
}