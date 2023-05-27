open abstract class Automovel
{
    protected var qtdRodas : Int = 2;

    public fun Andar()
    {
        println("Vrumm vrumm")
    }

    fun Freiar()
    {
        println("ERGGGGGGGG")
    }

    fun MudarQtdRodas( novaQuantidade : Int )
    {
        qtdRodas = novaQuantidade;
    }

    fun MostrarQtdRodas() : Int
    {
        return qtdRodas
    }
}