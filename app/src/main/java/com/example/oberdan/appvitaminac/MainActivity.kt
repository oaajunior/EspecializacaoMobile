package com.example.oberdan.appvitaminac

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Bem-Vindo ao App Vitamina C"
        val btnMostrarFrutas:Button = buttonMostrarFrutas

        btnMostrarFrutas!!.setOnClickListener { View ->

            val nextActivityIntent = Intent(this, FrutasActivity::class.java)
            startActivity(nextActivityIntent)

        }
    }
}
