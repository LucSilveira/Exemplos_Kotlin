class Carro
{
    var placa : String;
    var modelo : String;
    var marca : String;

    // Informe as informações do meu carro para que ele exista
    constructor( novaPlaca :String,
                 novoModelo : String,
                 novaMarca : String)
    {
        placa = novaPlaca;
        modelo = novoModelo;
        marca = novaMarca
    }

    fun Andar() : String
    {
        return "Vrum vrum"
    }
}