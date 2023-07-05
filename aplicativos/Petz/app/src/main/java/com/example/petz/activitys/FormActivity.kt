package com.example.petz.activitys

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import com.example.petz.R
import com.example.petz.dbo.DBConnect
import com.example.petz.model.Pet

class FormActivity : AppCompatActivity()
{
    private var listaPets : List<Pet> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val connect = DBConnect(this)
        listaPets = connect.ListarPets()

        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)
        btnCadastrar.setOnClickListener(){
            var nome = findViewById<EditText>(R.id.editNome).text.toString()
            var raca = findViewById<EditText>(R.id.editRaca).text.toString()
            var idade = findViewById<EditText>(R.id.editIdade).text.toString()
            var localizacao = findViewById<EditText>(R.id.editLocalizacao).text.toString()
            var radio = VerificarIdadePet( idade.toInt(), findViewById<RadioGroup>(R.id.radioGroup).checkedRadioButtonId)


            //Criando um novo pet
//            val pet = Pet(0, nome, localizacao, raca, idade, radio);

//            connect.AdicionarNovoPet(this, pet)
            connect.AdicionarNovoPet(nome, localizacao, raca, idade.toInt(), radio)
        }

        val intentExtras = intent.extras
        //Verificando se mostramos os botoes de edicao
        if( intentExtras != null )
        {
            findViewById<Button>(R.id.btnCadastrar).visibility = View.INVISIBLE
            findViewById<Button>(R.id.btnAlterar).visibility = View.VISIBLE
            findViewById<Button>(R.id.btnRemover).visibility = View.VISIBLE
        }

        val btnAlterar = findViewById<Button>(R.id.btnAlterar)
        btnAlterar.setOnClickListener(){
            var nome = findViewById<EditText>(R.id.editNome).text.toString()
            var raca = findViewById<EditText>(R.id.editRaca).text.toString()
            var idade = findViewById<EditText>(R.id.editIdade).text.toString()
            var localizacao = findViewById<EditText>(R.id.editLocalizacao).text.toString()
            var radio = VerificarIdadePet( idade.toInt(), findViewById<RadioGroup>(R.id.radioGroup).checkedRadioButtonId)

            val intentExtras = intent.extras
            if( intentExtras != null )
            {
                val pet = CapturarPet(intentExtras.get("position").toString().toInt())

//              connect.AdicionarNovoPet(this, pet)
                connect.AlterarPet( pet.id ,nome, localizacao, raca, idade.toInt(), radio)
            }
        }
    }

    fun ListarPets(context: Context)
    {
        listaPets = DBConnect(context).ListarPets()
    }

    fun CapturarPet(position : Int) : Pet
    {
        val pet = listaPets[position]

        return pet
    }

    fun VerificarIdadePet(idade : Int, radio : Int ) : String
    {
        if( radio == R.id.radioAno)
        {
            if(idade > 1)
            {
                return "Anos"

            }else{
                return "Ano"
            }

        }else{
            if( idade > 1 )
            {
                return "Meses"
            }else{
                return "Mes"
            }
        }
    }
}