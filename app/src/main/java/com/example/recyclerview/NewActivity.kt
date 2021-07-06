package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class NewActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)




        val url = intent.getStringExtra("url")
        val name = intent.getStringExtra("name")
        val pic: ImageView = findViewById(R.id.imagepop)
        Glide.with(this).load(url).into(pic)
        val textView: TextView = findViewById(R.id.textpop)
        textView.text = name







    }
}




