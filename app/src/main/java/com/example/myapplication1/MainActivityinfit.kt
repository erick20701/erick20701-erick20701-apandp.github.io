package com.example.myapplication1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class MainActivityinfit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activityinfit)

        val infImage: ImageView = findViewById(R.id.infmface)
        val infName: TextView = findViewById(R.id.infmname)
        val infClass: TextView = findViewById(R.id.infmclass)
        val infLike: TextView = findViewById(R.id.infmlike)
        val infnote: TextView = findViewById(R.id.infmnote)
        val infMm: TextView = findViewById(R.id.infmm)

        infLike.text= intent.getStringExtra("key_like" )
        infMm.text= intent.getStringExtra("key_infmm" )
        infClass.text= intent.getStringExtra("key_class" )
        infnote.text= intent.getStringExtra("key_note" )
        infName.text= intent.getStringExtra("key_name" )

        intent.getStringExtra("key_img")?.let { infImage.setImageResource(it.toInt()) }


    }
}