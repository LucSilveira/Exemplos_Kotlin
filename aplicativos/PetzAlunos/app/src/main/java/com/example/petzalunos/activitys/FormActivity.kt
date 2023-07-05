package com.example.petzalunos.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import com.example.petzalunos.R
import com.example.petzalunos.dbo.DBConnect

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val db = DBConnect(this)

        val btnCadastro = findViewById<Button>(R.id.btnCadastrar)
        btnCadastro.setOnClickListener()
        {
            val nome = findViewById<EditText>(R.id.editNome).text.toString()
            val raca = findViewById<EditText>(R.id.editRaca).text.toString()
            val local = findViewById<EditText>(R.id.editLocalizacao).text.toString()
            val idade = findViewById<EditText>(R.id.editIdade).text.toString()
            val tipoidade = VerificarIdade( idade.toInt(), findViewById<RadioGroup>(R.id.radioGroup).checkedRadioButtonId)

            db.AdicionarPet(nome, raca, local, idade.toInt(), tipoidade)
            finish()
        }
    }

    fun VerificarIdade(idade:Int, radioButton:Int) : String
    {
        if( radioButton == R.id.radioAnos )
        {
            if(idade > 1)
            {
                return "Anos"

            }else{
                return "Ano"
            }

        }else{

            if(idade > 1)
            {
                return "Meses"

            }else{
                return "Mês"
            }
        }
    }
}