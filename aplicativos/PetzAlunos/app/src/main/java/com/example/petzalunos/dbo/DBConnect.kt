package com.example.petzalunos.dbo

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.petzalunos.model.Pet

class DBConnect(context : Context) : SQLiteOpenHelper(context, "database.db", null, 1){

    val sql = arrayOf(
        "CREATE TABLE Pet(id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, raca TEXT, localizacao TEXT, idade INTEGER, tipoIdade TEXT)"
    )

    override fun onCreate(db: SQLiteDatabase) {
        sql.forEach { db.execSQL( it ) }
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL("DROP TABLE Pet")

        onCreate( db )
    }

    // Função de listar os pets
    @SuppressLint("Range")
    fun ListarPets() : ArrayList<Pet>
    {
        val db = this.readableDatabase
        val comand = db.rawQuery("SELECT * FROM Pet", null);

        val listaPets : ArrayList<Pet> = ArrayList();
        if( comand.count > 0 )
        {
            comand.moveToFirst()
            while( comand.moveToNext() )
            {
                val idPet = comand.getInt( comand.getColumnIndex("id") )
                val nomePet = comand.getString( comand.getColumnIndex("nome") )
                val racaPet = comand.getString( comand.getColumnIndex("raca") )
                val localizacaoPet = comand.getString( comand.getColumnIndex("localizacao") )
                val idadePet = comand.getInt( comand.getColumnIndex("idade") )
                val tipoIdade = comand.getString( comand.getColumnIndex("tipoIdade") )

                // Adicionando o elemento do banco para a lista
                listaPets.add( Pet(idPet, nomePet, racaPet, localizacaoPet, idadePet, tipoIdade) )
            }
        }

        db.close()

        return listaPets
    }

    // Função de adição dos Pets
    fun AdicionarPet(nome:String, raca : String, localizacao : String, idade : Int, tipoIdade : String)
    {
        val db = this.writableDatabase

        val valoresInsercao = ContentValues()
        valoresInsercao.put("nome", nome)
        valoresInsercao.put("raca", raca)
        valoresInsercao.put("localizacao", localizacao)
        valoresInsercao.put("idade", idade)
        valoresInsercao.put("tipoIdade", tipoIdade)

        db.insert("Pet", null, valoresInsercao)
        db.close()
    }

    fun AlterarPet(id : Int, nome:String, raca : String, localizacao : String, idade : Int, tipoIdade : String)
    {
        val db = this.writableDatabase

        val valoresInsercao = ContentValues()
        valoresInsercao.put("nome", nome)
        valoresInsercao.put("raca", raca)
        valoresInsercao.put("localizacao", localizacao)
        valoresInsercao.put("idade", idade)
        valoresInsercao.put("tipoIdade", tipoIdade)

        db.update("Pet", valoresInsercao, "id=?",  arrayOf( id.toString() ))
        db.close()
    }

    // Funcao de remover pet
    fun RemoverPet(id : Int)
    {
        val db = this.writableDatabase
        db.delete("Pet", "id=?", arrayOf( id.toString() ))

        db.close()
    }
}