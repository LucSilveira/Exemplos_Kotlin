class Cachorro
{
    // Atributos
    var nomeCachorro : String;
    var raca : String;
    var peso : Int;

    constructor(nomeCachorro: String,
                raca : String,
                peso : Int)
    {
        // this. -> uma referencia a variavel da minha classe
        this.nomeCachorro = nomeCachorro;
        this.raca = raca;
        this.peso = peso;
    }

//    Metodos
    fun Falar()
    {
        println("Au au");
    }

    fun FazerXixi()
    {
        println("Xiiiiiiiiiiiiiiiii")
    }

    fun Correr()
    {
        println("Pocotó")
    }
}