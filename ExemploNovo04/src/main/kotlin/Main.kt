fun main(args: Array<String>)
{
    var carroNovo = Carro();
    carroNovo.qtdPortas
    carroNovo.MudarQtdRodas(4)
    println( carroNovo.MostrarQtdRodas() )
    carroNovo.Andar()

    var moto = Moto();
    moto.Andar()

    var usuario = Usuario("asad", "asadd@emil.com")
    usuario.Logar()
}