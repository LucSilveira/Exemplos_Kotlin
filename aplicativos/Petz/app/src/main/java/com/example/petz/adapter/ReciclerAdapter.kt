package com.example.petz.adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.petz.R
import com.example.petz.activitys.FormActivity
import com.example.petz.dbo.DBConnect
import com.example.petz.model.Pet

class ReciclerAdapter
    (
        private val context: Context,
        private val listaPets : List<Pet>
    ) : RecyclerView.Adapter<ReciclerAdapter.ViewHolder>()
{
    companion object
    {
        const val REQUEST_CODE_ITEM_DETAILS = 1
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        fun vincular( pet : Pet) {
            val nome = itemView.findViewById<TextView>(R.id.nomePet)
            nome.text = pet.nome

            val localizacao = itemView.findViewById<TextView>(R.id.localPet)
            localizacao.text = pet.localizacao

            val descricao = itemView.findViewById<TextView>(R.id.descricaoPet)
            descricao.text = "${pet.nome}, ${pet.idade} ${pet.tipoIdade}"
        }
    }

    // Criar a referencia para pegar as views e vai procurar e controlar elas
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_pet_activity, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int
    {
        return listaPets.size
    }

    // Indica qual o item que o adpter vai colocar, e qual a posição que vamos adaptar
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produto = listaPets[position]
        holder.vincular(produto)

        holder.itemView.setOnClickListener{
            val intent = Intent(holder.itemView.context, FormActivity::class.java)
            intent.putExtra("position", position)

            (holder.itemView.context as Activity).startActivityForResult(intent, REQUEST_CODE_ITEM_DETAILS)
        }
    }

}
