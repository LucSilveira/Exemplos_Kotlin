package com.example.exemplocruddbo

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import java.lang.reflect.Array

class DBConnect( context : Context ) : SQLiteOpenHelper(context, "database.db", null, 1)
{
    var comandosBanco = arrayOf(
        "CREATE TABLE Usuario ( id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, email TEXT)",
        "INSERT INTO Usuario (nome, email) VALUES ('teste', 'teste@email.com')"
    )

    override fun onCreate( db: SQLiteDatabase ) {

//      // Executando os comandos para o banco
        comandosBanco.forEach { db.execSQL(it) }
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {

        // Apagando a tabela de usuario
        db.execSQL( "DROP TABLE Usuario" );

        onCreate( db )
    }

    // Função para listar os usuários
    fun ListarUsuarios() : ArrayList<Usuario>
    {
        // Referencia ao banco de dados
        val dbo = this.readableDatabase
        val comando = dbo.rawQuery("SELECT * FROM Usuario", null);

        // Criar a uma lista de Usuario
        var listaUsuario : ArrayList<Usuario> = ArrayList();

        // Verificar se existe alguma informação no banco
        if( comando.count > 0 )
        {
            while( comando.moveToNext() )
            {
                // Recendo a coluna
                val colunaId = comando.getColumnIndex("id")
                val colunaNome = comando.getColumnIndex("nome")
                val colunaEmail = comando.getColumnIndex("email")

                val id = comando.getInt( colunaId )
                val nome = comando.getString( colunaNome )
                val email = comando.getString( colunaEmail )

                listaUsuario.add( Usuario(id, nome, email) )
            }
        }

        dbo.close()

        return listaUsuario
    }

    fun InserirUsuario(nome : String, email : String)
    {
        val db = this.writableDatabase

        val valoresUsuario = ContentValues()
        valoresUsuario.put("nome", nome)
        valoresUsuario.put("email", email)

        val insertUsuario = db.insert("Usuario", null, valoresUsuario);
        db.close()
    }

    fun RemoverUsuario(id : Int)
    {
        val db = this.writableDatabase
        db.delete("Usuario", "id=?", arrayOf( id.toString() ))
        db.close()
    }
}