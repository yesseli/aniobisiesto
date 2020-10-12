package com.example.Tarea8YesseniaMateo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verificar(view: View) {
        btnverificar.setOnClickListener() {}
        var anio: Int = (txanio.text.toString()).toInt()
        var anioo: Int = anio%2
        var a: String = "Es Bisiesto"
        var b: String = "No es bisiesto"

        if (anio % 4 == 0 && anio % 100 != 0 ) {
            textView.setText(a)
        }else {
            textView.setText(b)
        }
    }
}