package com.example.listaprodutos.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.example.listaprodutos.dao.ProdutoDAO
import com.example.listaprodutos.model.Produto
import com.example.listaprodutos.ui.RecyclerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Trazer a nossa lista de produtos
        val dao = ProdutoDAO()
        dao.AdicionarProduto( Produto("Traquinas", "Bolacha de limão", BigDecimal( "2.00" )) )
        dao.AdicionarProduto( Produto("Passatempo", "Bolacha de leite", BigDecimal( "1.00" )) )

        var listaProdutos = dao.ListarProduto()

        // Identificar a lista
        val listaView = findViewById<RecyclerView>(R.id.recyclerView)
        listaView.adapter = RecyclerAdapter(this, listaProdutos)

        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener()
        {
            val intent = Intent(this, FormularioActivity::class.java)
            startActivity(intent)
        }
    }
}