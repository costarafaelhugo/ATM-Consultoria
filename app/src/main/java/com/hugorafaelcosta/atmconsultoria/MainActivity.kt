package com.hugorafaelcosta.atmconsultoria

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun goToClient(view: android.view.View) {

        val intent = Intent(this, DetalhesClienteActivity::class.java)
        startActivity(intent)
    }
    fun goToEmpresa(view: android.view.View) {
        val intent = Intent(this, DetalheEmpresaActivity::class.java)
        startActivity(intent)
    }
    fun goToContato(view: android.view.View) {
        val intent = Intent(this, DetalhesContatoActivity::class.java)
        startActivity(intent)
    }
    fun goToServicos(view: android.view.View) {
        val intent = Intent(this, DetalheServicosActivity::class.java)
        startActivity(intent)
    }

    fun showToatMessage(view: android.view.View) {
        makeText(applicationContext, "O logo foi clicado", LENGTH_LONG).show()
    }


}