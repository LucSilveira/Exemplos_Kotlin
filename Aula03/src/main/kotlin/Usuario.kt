class Usuario
{
    // Todo usuario do meu sistme, vai ter as
    // propriedas e metodos de um usuairo
    var nome : String = "";
    var email : String = "";
    var idade: Int = 0;
    var senha : String = ""

    fun NomeEEmail() : String
    {
        return nome + " e o email " + email + " e a  idade " + idade;
    }

    fun MudarSenha(novaSenha : String)
    {
        senha = novaSenha
    }
}