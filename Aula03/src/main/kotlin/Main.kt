fun main(args: Array<String>)
{
    var usuario = Usuario();
    usuario.nome = "Lucas"
    usuario.email = "lucas@email.com"
    usuario.idade = 30
    usuario.senha = "123"
//    println( usuario.senha )

//    usuario.MudarSenha("345")
//    println( usuario.senha )

    var usuario02 = Usuario()
    usuario02.nome = "Miguel"
    usuario02.email = "miguel@email.com"
    usuario02.idade = 18
    usuario02.senha = "321"
//    println( usuario02.NomeEEmail() )

    var novoCarro = Carro("abc1234",
                            "Celta",
                            "Chevrolet");

//    println( novoCarro.marca )

    var carro2 = Carro("def5678", "Etios", "Toyota");

//    println( carro2.placa )

    var arrayCarros = arrayOf<Carro>();

    arrayCarros = arrayCarros.plus( novoCarro );
    arrayCarros = arrayCarros.plus( carro2 )

    for ( carro in arrayCarros )
    {
        println( carro.placa )
        println( carro.modelo )
        println( carro.Andar() )
    }
}