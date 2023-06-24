class DonoPet
{
    var nomeDono : String;
    var numeroContato : Long;

    // Lista de pets
    var petsDono : MutableList<Pet> = mutableListOf();

    constructor( nomeDono : String, numeroContato : Long )
    {
        this.nomeDono = nomeDono;
        this.numeroContato = numeroContato;
    }

    // Função para adicionar a informação do pet
    fun AtribuirPet( novoPet : Pet )
    {
        petsDono.add( novoPet )
    }
}