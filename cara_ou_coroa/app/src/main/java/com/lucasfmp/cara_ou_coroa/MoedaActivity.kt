package com.lucasfmp.cara_ou_coroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_moeda.*

class MoedaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moeda)

        val dados: Bundle? = intent.extras
        val numero = dados?.getInt("numero")

        if(numero == 0){
            image_resultado.setImageResource(R.drawable.moeda_cara)
        }else{
            image_resultado.setImageResource(R.drawable.moeda_coroa)
        }

        button_voltar.setOnClickListener{
            finish()
        }

    }
}