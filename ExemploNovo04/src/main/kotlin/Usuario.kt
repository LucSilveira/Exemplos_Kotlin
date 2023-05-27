class Usuario : IUsuario
{
    // Todo usuario do meu sistema, vai ter as
    // propriedas e metodos de um usuairo
    private var nome : String = "";
    private var email : String = "";
    var idade: Int = 0;
    var senha : String = ""

    constructor(nome: String, email : String)
    {
        this.nome = nome;
        this.email = email
    }

    fun NomeEEmail() : String
    {
        return nome + " e o email " + email + " e a  idade " + idade;
    }

    fun MudarSenha(novaSenha : String)
    {
        senha = novaSenha
    }

    fun AlterarEmail(novoEmail : String)
    {
        email = novoEmail
    }

    override fun Logar() {
        TODO("Not yet implemented")
        println("Logando no sistema")
    }
}