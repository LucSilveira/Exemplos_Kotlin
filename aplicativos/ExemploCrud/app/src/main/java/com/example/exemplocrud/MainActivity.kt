package com.example.exemplocrud

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity()
{
    private lateinit var listView: ListView
    private lateinit var campoNome : EditText
    private lateinit var campoEmail : EditText

    // Posição lista
    private var positionList = -1;

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Identificar a lista
        listView = findViewById(R.id.listaUsuarios)

        // Receber os 3 botoes
        var btn_cadastrar = findViewById<Button>(R.id.btn_cadastrar)
        var btn_alterar = findViewById<Button>(R.id.btn_alterar)
        var btn_remover = findViewById<Button>(R.id.btn_remover)

        // Receber os 2 campos
        campoNome = findViewById<EditText>(R.id.nome)
        campoEmail = findViewById<EditText>(R.id.email)

        // Instanciar uma lista de usuarios
        var listaDeUsuarios = ArrayList<Usuario>();
        listaDeUsuarios.add( Usuario("Exemplo", "exemplo@email.com") )
        ListarUsuarios(listaDeUsuarios)

        // Pega o item clicado da lista
        listView.setOnItemClickListener {
            _, _, position, _ ->

            positionList = position
            campoNome.setText( listaDeUsuarios[position].nome )
            campoEmail.setText( listaDeUsuarios[position].email )
        }

        btn_cadastrar.setOnClickListener()
        {
            var novoUsuario = Usuario( campoNome.text.toString(), campoEmail.text.toString() )
            listaDeUsuarios.add( novoUsuario )

            ListarUsuarios( listaDeUsuarios )

            // Limpar os campos
            LimparCampos()
        }

        btn_alterar.setOnClickListener()
        {
            if( positionList >= 0 )
            {
                listaDeUsuarios[positionList].nome = campoNome.text.toString()
                listaDeUsuarios[positionList].email = campoEmail.text.toString()

                // Recarregar a lista de usuários
                ListarUsuarios( listaDeUsuarios )

                // Limpar os campos
                LimparCampos()
            }
        }

        btn_remover.setOnClickListener()
        {
            if( positionList >= 0 )
            {
                listaDeUsuarios.removeAt( positionList )

                ListarUsuarios( listaDeUsuarios )

                LimparCampos()
            }
        }
    }

    // Ler a lista e exibir
    fun ListarUsuarios( listaDeUsuarios : ArrayList<Usuario> )
    {
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaDeUsuarios)
        listView.adapter = adapter
    }

    fun LimparCampos()
    {
        positionList = -1
        campoNome.setText("")
        campoEmail.setText("")
    }
}