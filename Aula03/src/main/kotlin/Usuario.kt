class Usuario
{
    // Todo usuario do meu sistme, vai ter as
    // propriedas e metodos de um usuairo
    var nome : String = "";
    var email : String = "";
    var idade: Int = 0;
    var senha : String = ""
    var pet : Cachorro? = null; // Pet não obrigatório -> ?

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
}