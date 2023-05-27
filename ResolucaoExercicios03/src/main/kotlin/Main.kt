import java.util.Scanner
import javax.print.attribute.standard.Media
import javax.print.attribute.standard.PrinterLocation

fun main(args: Array<String>)
{
    var terminal = Scanner( System.`in` );

    // Exercicio 01 ---------------------
//    var listaAlunos = arrayOf<MediaAluno>();
//    println("Bem vindo ao sistema da Escola Senai")
//
//    println("Você deseja adicionar as informações de um aluno(a)?");
//    var resposta = terminal.nextLine();
//
//    while ( resposta.toUpperCase() == "SIM" )
//    {
//        var terminalLaco = Scanner( System.`in` );
//
//        println("Informe o nome do aluno:");
//        var nomeAluno = terminalLaco.nextLine();
//
//        println("Informe a média do aluno:")
//        var mediaAluno = terminalLaco.nextFloat();
//
//        var dadosAlunos = MediaAluno(nomeAluno, mediaAluno);
//
//        listaAlunos = listaAlunos.plus(dadosAlunos);
//        println("Aluno computado...");
//        println()
//
//        println("Você deseja adicionar as informações de um aluno(a)?");
//        resposta = terminal.nextLine();
//    }
//
//    println("\nExibindo as informações dos alunos cadastrados");
//    for ( aluno in listaAlunos )
//    {
//        println("Nome do aluno(a): ${aluno.nomeAluno}, media do aluno: ${aluno.mediaAluno}")
//    }

    // Exercicio 02 ---------------------------

    println("Bem vindo a central Pet\n");

    var donosPets = arrayOf<DonoPet>();

    println("Qual ação você deseja realizar?\n1- Criar conta, 2- Listar pets, 0 - sair");
    var resposta = terminal.nextInt();

    while ( resposta != 0 )
    {
        var terminalLaco = Scanner( System.`in` )

        if( resposta == 1 )
        {
            println("Informe seu nome: ");
            var nomeUsuario = terminalLaco.nextLine();

            println("Informe seu número de contato: ");
            var numeroContato = terminalLaco.nextLong()

            var novoDono = DonoPet(nomeUsuario, numeroContato);

            var terminalPet = Scanner( System.`in` );

            // Buscando a informação do pet
            println("\nO cliente ${novoDono.nomeDono} possuí algum pet?");
            var respostaPet = terminalPet.nextLine();

            while ( respostaPet.toUpperCase() == "SIM" )
            {
                println("Informe o nome do pet:")
                var nomePet = terminalPet.nextLine();

                println("Informe a raça do pet:")
                var racaPet = terminalPet.nextLine();

                println("Informe o idade do pet:")
                var idadePet = terminalPet.nextInt();

                var novoPet = Pet(nomePet, racaPet, idadePet);

                novoDono.AtribuirPet(novoPet);

                println("\nO cliente ${novoDono.nomeDono} possuí algum outro pet?");
                respostaPet = terminalLaco.nextLine()
            }


        }else{
            for ( donos in donosPets )
            {
                println("\n\nNome do dono: ${donos.nomeDono}");

                // Informando os pets do dono
                for ( pets in donos.petsDono )
                {
                    println("\nNome do pet: ${pets.nomePet} da raça ${pets.raca}");
                }
            }
        }
    }
}