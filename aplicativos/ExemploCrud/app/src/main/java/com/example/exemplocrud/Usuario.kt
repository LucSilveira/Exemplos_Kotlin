package com.example.exemplocrud

class Usuario ( var nome : String, var email : String)
{
    override fun toString(): String {
        return "Usuario - name: $nome e email: $email;"
    }
}