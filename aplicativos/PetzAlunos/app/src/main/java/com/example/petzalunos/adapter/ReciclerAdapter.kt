package com.example.petzalunos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.petzalunos.R
import com.example.petzalunos.model.Pet

class ReciclerAdapter
    (
        private val context : Context,
        private val listaPets : List<Pet>
    ) : RecyclerView.Adapter<ReciclerAdapter.ViewHolder>()
{

    class ViewHolder( view : View ) : RecyclerView.ViewHolder(view)
    {
        fun VincularItenCard( pet : Pet)
        {
            val nomePet = itemView.findViewById<TextView>(R.id.nomePet)
            nomePet.text = pet.nome

            val localizacao = itemView.findViewById<TextView>(R.id.localPet)
            localizacao.text = pet.localizacao

            val descricao = itemView.findViewById<TextView>(R.id.descPet)
            descricao.text = "${pet.raca}, ${pet.idade} ${pet.tipoIdade}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_pet_view, parent, false)

        return ViewHolder(view);
    }

    override fun getItemCount(): Int {
        return listaPets.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        val pet = listaPets[position]
        holder.VincularItenCard(pet)
    }

}