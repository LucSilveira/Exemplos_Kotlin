package com.example.petz.dbo

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import com.example.petz.model.Pet

class DBConnect(context : Context) : SQLiteOpenHelper(context, "database.db", null, 1)
{
    val sql = arrayOf(
        "CREATE TABLE Pet(id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, localizacao TEXT, idade INTEGER, tipoIdade TEXT, raca TEXT)",
        "INSERT INTO Pet(nome, localizacao, idade, tipoIdade, raca) VALUES ('Spot', 'Brooklin, SP', 8, 'anos', 'Labrador')"
    )

    override fun onCreate(db: SQLiteDatabase)
    {
        sql.forEach { db.execSQL(it) }
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        db.execSQL("DROP TABLE Pet")

        onCreate(db);
    }

    // Funções sobre o aplicativo
    @SuppressLint("Range")
    fun ListarPets() : ArrayList<Pet>
    {
        val db = this.readableDatabase
        val c = db.rawQuery("SELECT * FROM Pet", null);

        val listaPets : ArrayList<Pet> = ArrayList();
        if( c.count > 0 )
        {
            c.moveToFirst()
            while(c.moveToNext())
            {
                val idPet = c.getInt( c.getColumnIndex("id") )
                val nome = c.getString( c.getColumnIndex("nome") )
                val raca = c.getString( c.getColumnIndex("raca") )
                val localizacao = c.getString( c.getColumnIndex("localizacao") )
                val idade = c.getInt( c.getColumnIndex("idade") )
                val tipoIdade = c.getString( c.getColumnIndex("tipoIdade") )

                listaPets.add( Pet(idPet, nome, localizacao, raca, idade, tipoIdade) )
            }
        }

        db.close()
        return listaPets
    }


    fun AdicionarNovoPet(context: Context, pet : Pet)
    {
        try
        {
            // Criando a conexão com o banco de dados
            val db = this.writableDatabase
            val valoresInsercao = ContentValues();

            // Mapeando os valores dos elementos
            valoresInsercao.put("nome", pet.nome)
            valoresInsercao.put("raca", pet.raca)
            valoresInsercao.put("idade", pet.idade)
            valoresInsercao.put("tipoIdade", pet.tipoIdade)
            valoresInsercao.put("localizacao", pet.localizacao)

            // Inserindo no banco de dados
            db.insert("Pet", null, valoresInsercao)
            db.close()

        }catch (e: Exception){
            Toast.makeText(context, "Erro na inserção", Toast.LENGTH_SHORT).show()
        }
    }
}