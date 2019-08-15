package com.example.daltonismo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela2.*

class tela2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        var parametros = intent.extras
        var valor = parametros?.getInt("cod_imagem")

        if (valor == 1) {

            imageView.setImageResource(R.drawable.teste1)
        }
        if (valor == 2) {

            imageView.setImageResource(R.drawable.teste2)
        }
        if (valor ==3) {

            imageView.setImageResource(R.drawable.teste3)
        }

        cancelar.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }


    }
}
