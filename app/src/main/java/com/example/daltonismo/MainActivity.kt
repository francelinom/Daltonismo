package com.example.daltonismo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var REQUESTCODE1 = 99
    var REQUESTCODE2 = 100
    var REQUESTCODE3 = 101

    var CODE1 = 1
    var CODE2 = 2
    var CODE3 = 3

    var resposta_1 = 0
    var resposta_2 = 0
    var resposta_3 = 0

    var resultadoFinal = "Faça o teste"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i = Intent(this, tela2::class.java)
        var b =Bundle()


        resposta1.text=resposta_1.toString()
        resposta2.text=resposta_2.toString()
        resposta3.text=resposta_3.toString()

        resultadoTeste.text=resultadoFinal

        teste1.setOnClickListener {

            b.putInt("cod_imagem",CODE1)
            i.putExtras(b)
            startActivity(i)

            startActivityForResult(i, REQUESTCODE1)

        }

        teste2.setOnClickListener {
            b.putInt("cod_imagem",CODE2)
            i.putExtras(b)
            startActivity(i)

            startActivityForResult(i, REQUESTCODE2)
        }

        teste3.setOnClickListener {
            b.putInt("cod_imagem",CODE3)
            i.putExtras(b)
            startActivity(i)

            startActivityForResult(i, REQUESTCODE3)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val x = data?.getStringExtra("RESPOSTA")

        if(requestCode==REQUESTCODE1){
            resposta1.text = x.toString()
        }
        }
    }



