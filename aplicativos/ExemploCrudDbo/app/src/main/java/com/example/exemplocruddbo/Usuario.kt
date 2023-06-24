package com.example.exemplocruddbo

class Usuario ( var id :Int, var nome : String, var email : String)
{
    override fun toString(): String {
        return "Usuario - id: $id, name: $nome e email: $email;"
    }
}