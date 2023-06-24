class Usuario
{
    // Todo usuario do meu sistema, vai ter as
    // propriedas e metodos de um usuairo
    private var nome : String = "";
    private var email : String = "";
    var idade: Int = 0;
    var senha : String = ""
    var pet : Cachorro? = null; // Pet não obrigatório -> ?

    // mutableList = lista variavel
    var carrosUsuario : MutableList<Carro> = mutableListOf()

    constructor(nome: String, email : String)
    {
        this.nome = nome;
        this.email = email
    }

    fun AdicionarPet(pet : Cachorro)
    {
        this.pet = pet;
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
}