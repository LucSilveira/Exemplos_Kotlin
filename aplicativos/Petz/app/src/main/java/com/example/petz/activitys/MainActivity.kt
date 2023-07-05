package com.example.petz.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.petz.R
import com.example.petz.adapter.ReciclerAdapter
import com.example.petz.dbo.DBConnect
import com.example.petz.model.Pet

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Procurando o recycler view
        var lista = findViewById<RecyclerView>(R.id.recyclerView)
        val connect = DBConnect(this)

//        val listPet = ArrayList<Pet>();
//        listPet.add( Pet(2, "teste", "teste", "teste", 9, "anos") )
//        listPet.add( Pet(3, "teste", "teste", "teste", 9, "anos") )
//        listPet.add( Pet(4, "teste", "teste", "teste", 9, "anos") )

        lista.adapter = ReciclerAdapter(this, connect.ListarPets() )
//        lista.adapter = ReciclerAdapter(this, listPet )

        val btn = findViewById<Button>(R.id.btnAdicionar)
        btn.setOnClickListener()
        {
            val intent = Intent(this, FormActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()

        // Procurando o recycler view
        var lista = findViewById<RecyclerView>(R.id.recyclerView)
        val connect = DBConnect(this)

        lista.adapter = ReciclerAdapter(this, connect.ListarPets() )

//        val floatButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
//        floatButton.setOnClickListener()
//        {
//            val intent = Intent(this, FormProdutoActivity::class.java)
//            startActivity(intent)
//        }
    }
}