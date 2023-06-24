package com.example.conversorvalores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var campo = findViewById<TextView>(R.id.cmp_preco);
        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        var botao = findViewById<Button>(R.id.button)
        var resultado = findViewById<TextView>(R.id.txt_result)

        botao.setOnClickListener{
            resultado.text = ConverterValores(
                                                campo.text.toString(),
                                                radioGroup.checkedRadioButtonId
                                            );
        }
    }

    fun ConverterValores(valor : String, radioButton : Int ) : String
    {
        if( !valor.isEmpty() )
        {
            val dolar = 0.20
            val euro = 0.19
            val iene = 28.24

            if (radioButton == R.id.rd_dolar) {
                return "${"%.2f".format((valor.toDouble() * dolar))}";

            } else if (radioButton == R.id.rd_euro) {

                return "${"%.2f".format((valor.toDouble() * euro))}";

            } else {
                return "${"%.2f".format((valor.toDouble() * iene))}";
            }

        }else{
            return ""
        }
    }
}