package com.digitalhouse.desafio_materialdesign

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.login.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_login.setOnClickListener{
            makeSnack("Senha Incorreta", "Ok", it)
        }
    }


    fun makeSnack(msg: String, msgAct: String, context: View){
        Snackbar.make(context, msg, Snackbar.LENGTH_LONG)
            .setAction(msgAct) {}
            .show()
    }
}