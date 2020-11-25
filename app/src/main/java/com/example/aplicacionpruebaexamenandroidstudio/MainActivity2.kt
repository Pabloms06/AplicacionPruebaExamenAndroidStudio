package com.example.aplicacionpruebaexamenandroidstudio

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_2.*

class MainActivity2 : AppCompatActivity() {

    companion object{
        const val CLAVE = "ASDF"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)
        
        textView
        texto
        
        button2.setOnClickListener {  //funciones primer boton

            val intent = Intent(this, textView::class.java) //funciones boton 2
            intent.getStringArrayListExtra(MainActivity.guardar.toString())
            startActivity(intent)
        }




    }

}


