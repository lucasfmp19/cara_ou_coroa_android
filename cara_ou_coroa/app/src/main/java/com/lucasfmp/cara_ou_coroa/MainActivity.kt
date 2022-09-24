package com.lucasfmp.cara_ou_coroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_jogar.setOnClickListener{
            val intent = Intent(applicationContext, MoedaActivity::class.java)

            //gerar número aletório.
            val numero = Random().nextInt(2)

            //Enviar número para a próxima activity
            intent.putExtra("numero", numero)

            startActivity(intent)
        }
    }
}