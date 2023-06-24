package com.example.listaprodutos.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.R
import com.example.listaprodutos.model.Produto


class RecyclerAdapter
    (
        private val context : Context,
        private val listProdutos : List<Produto>
    ) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()
{
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)
    {
       fun vincularInformacoes(produto : Produto)
       {
           val nome = itemView.findViewById<TextView>(R.id.nome);
           nome.text = produto.nome

           val descricao = itemView.findViewById<TextView>(R.id.descricao);
           descricao.text = produto.descricao

           val valor = itemView.findViewById<TextView>(R.id.valor);
           valor.text = produto.valor.toPlainString()
       }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder
    {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        val produto = listProdutos[position]
        holder.vincularInformacoes( produto )
    }

    override fun getItemCount(): Int
    {
        return listProdutos.size
    }
}