import java.util.Scanner

fun main(args: Array<String>) {
    var terminal = Scanner(System.`in`)

//    var usuario = Usuario();
//    usuario.nome = "Lucas"
//    usuario.email = "lucas@email.com"
//    usuario.idade = 30
//    usuario.senha = "123"
//    println( usuario.senha )

//    usuario.MudarSenha("345")
//    println( usuario.senha )

//    var usuario02 = Usuario()
//    usuario02.nome = "Miguel"
//    usuario02.email = "miguel@email.com"
//    usuario02.idade = 18
//    usuario02.senha = "321"
//    println( usuario02.NomeEEmail() )

//    var novoCarro = Carro("abc1234",
//                            "Celta",
//                            "Chevrolet");

//    println( novoCarro.marca )

//    var carro2 = Carro("def5678", "Etios", "Toyota");

//    println( carro2.placa )

//    var arrayCarros = arrayOf<Carro>();
//
//    arrayCarros = arrayCarros.plus( novoCarro );
//    arrayCarros = arrayCarros.plus( carro2 )
//
//    for ( carro in arrayCarros )
//    {
//        println( carro.placa )
//        println( carro.modelo )
//        println( carro.Andar() )
//    }


    //_________________________________
//    var pintcher = Cachorro(raca = "Pintcher",
//                            nomeCachorro = "Fredy",
//                            peso = 3);
//
//    println("Informe a ação do doguinho:");
//    println("1 - falar, 2 - correr, 3 fazer xixi, 0 - sair")
//    var acao = terminal.nextInt();
//
//    while ( acao != 0)
//    {
//        if( acao == 1 )
//        {
//            pintcher.Falar()
//
//        }else if( acao == 2 ){
//            pintcher.Correr()
//
//        }else if( acao == 3) {
//            pintcher.FazerXixi()
//
//        }else{
//            println("O " + pintcher.nomeCachorro + " está dormindo " +
//                    "no momento")
//        }
//
//        println()
//        println("Informe a ação do doguinho:");
//        println("1 - falar, 2 - correr, 3 fazer xixi, 0 - sair")
//        acao = terminal.nextInt();
//    }
//
//    var novoUsuario = Usuario("Lucas" ,"lucas@email.com" )
//
////    Atribuindo ao meu usuário um novo pet
//    novoUsuario.AdicionarPet(pintcher)
//
//    // ? -> Se eu tiver..
//    println(novoUsuario.pet?.nomeCachorro)
//
//    // ----------------------------
//
//    novoUsuario.carrosUsuario.add(novoCarro)
//    novoUsuario.carrosUsuario.add( carro2 )
//
//    for ( carro in novoUsuario.carrosUsuario)
//    {
//        println( carro.modelo )
//    }

    //____________________________________

//    var calculadora = CalculadoraEx(50.0, 25.0);
//
//    calculadora.result = calculadora.Somar(
//                                            calculadora.valor1,
//                                            calculadora.valor2
//                                        )
//
//    println(calculadora.result)

    var novoUsuario = Usuario("Usuario Novo", "usuario@email")

    novoUsuario.AlterarEmail("usuairo@email.com");
}

class CalculadoraEx
{
    var valor1: Double = 0.00;
    var valor2: Double = 0.00;
    var valor3: Double = 0.00;
    var result: Double = 0.00;

    constructor( valorx: Double, valory: Double)
    {
        valor1 = valorx;
        valor2 = valory;
    }

    fun Somar(valorx : Double, valory : Double) : Double
    {
        return valorx + valory;
    }

    fun Somar(valorx : Double, valory : Double, valorz : Double) : Double
    {
        return valorx + valory + valorz
    }
}