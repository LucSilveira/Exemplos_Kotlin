package com.example.petzalunos.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.petzalunos.R
import com.example.petzalunos.adapter.ReciclerAdapter
import com.example.petzalunos.dbo.DBConnect

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Conexao com o banco
        val db = DBConnect(this)

        //Identificar a nossa lista
        val lista = findViewById<RecyclerView>(R.id.recyclerView)
        lista.adapter = ReciclerAdapter(this, db.ListarPets())

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener(){
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()

        // Conexao com o banco
        val db = DBConnect(this)

        //Identificar a nossa lista
        val lista = findViewById<RecyclerView>(R.id.recyclerView)
        lista.adapter = ReciclerAdapter(this, db.ListarPets())
    }
}