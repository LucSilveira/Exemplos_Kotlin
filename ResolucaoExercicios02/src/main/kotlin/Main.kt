import java.util.Scanner

fun main(args: Array<String>)
{
    var terminal = Scanner( System.`in` )


    // Exercicio 01 ----------------------------------
//    var idades = Array<Int>(4){0}
//
//    println("Informe a primeira idade:")
//    var idade1 = terminal.nextInt();
//
//    println("Informe a segunda idade:")
//    var idade2 = terminal.nextInt();
//
//    println("Informe a terceira idade:")
//    var idade3 = terminal.nextInt();
//
//    println("Informe a quarta idade:")
//    var idade4 = terminal.nextInt();
//
//    if( idade1 > idade2 && idade1 > idade3 && idade1 > idade4 )
//    {
//        println("Idade maior : " + idade1)
//
//    }else if(idade2 > idade1 && idade2 > idade3 && idade2 > idade4){
//        println("Idade maior : " + idade2)
//
//    }else if(idade3 > idade2 && idade3 > idade1 && idade3 > idade4){
//        println("Idade maior : " + idade3)
//
//    }else{
//        println("Idade maior : " + idade4)
//    }
//
//    if( idade1 < idade2 && idade1 < idade3 && idade1 < idade4 )
//    {
//        println("Idade menor : " + idade1)
//
//    }else if(idade2 < idade1 && idade2 < idade3 && idade2 < idade4){
//        println("Idade menor : " + idade2)
//
//    }else if(idade3 < idade2 && idade3 < idade1 && idade3 < idade4){
//        println("Idade menor : " + idade3)
//
//    }else{
//        println("Idade menor : " + idade4)
//    }

    //__________________________________________

//    var idades = Array<Int>(4){0}
//
//    println("Informe a primeira idade")
//    idades[0] = terminal.nextInt()
//
//    println("Informe a segunda idade")
//    idades[1] = terminal.nextInt()
//
//    println("Informe a terceira idade")
//    idades[2] = terminal.nextInt()
//
//    println("Informe a quarta idade")
//    idades[3] = terminal.nextInt()
//
//    println()
//
//    var maiorIdade = 0;
//    var menorIdade = 0;
//    for( idadeUp in idades )
//    {
//        if( idadeUp > maiorIdade )
//        {
//            maiorIdade = idadeUp
//
//        }
//
//        if(menorIdade == 0)
//        {
//            menorIdade = idadeUp
//
//        }else if( idadeUp < menorIdade ){
//            menorIdade = idadeUp
//        }
//    }
//
//    println(maiorIdade)
//    println(menorIdade)

    // Exercicio 02 -----------------

//    var salarios = Array<Double>(5){ 0.00 }
//
//    salarios[0] = 1320.00 // 132 + 1320 = 1452
//    salarios[1] = 1550.00 // 155 + 1550 = 1705
//    salarios[2] = 1750.00 // 175 + 1750 = 1925
//    salarios[3] = 1990.00 // 199 + 1990 = 2189
//    salarios[4] = 2300.00 // 230 + 2300 = 2530
//
//    for( indice in 0 until 5)
//    { // 0; 1; 2; 3; 4
//        var acrescimo = ( salarios[ indice ] * 10 ) / 100;
//
//        salarios[indice] = salarios[indice] + acrescimo;
//
//        println(salarios[indice]);
//    }

    // Exercicio 03 ------------------------------

//    var listaNumeros = Array<Int>(3){0}
//
//    println("Informe 3 numeros distintos")
//    listaNumeros[0] = terminal.nextInt()
//    listaNumeros[1] = terminal.nextInt()
//    listaNumeros[2] = terminal.nextInt()
//
//    var total = 0
//    for( elemento in 0 until 3 )
//    {
//        total = listaNumeros[ elemento ] * 2
//
//        listaNumeros[ elemento ] = total;
//    }
//
//    println(listaNumeros.contentToString())

    // Exercicio 04 --------------------------

    var array = Array<Int>(4){0}

    println("Informe um número")
    array[0] = terminal.nextInt()

    println("Informe outro número")
    array[1] = terminal.nextInt()

    println("Informe outro número")
    array[2] = terminal.nextInt()

    println("Informe outro número")
    array[3] = terminal.nextInt()

    var soma = 0;
    for( elemento in array )
    {
        soma = soma + elemento
    }

    println(soma)
    // Exercicio 08 -------------------------

//    println("Quantas sequencias você deseja visualizar")
//    var quantidade = terminal.nextInt()
//
//    if( quantidade < 2 )
//    {
//        println( 1 )
//
//    }else{
//      var numero01 = 1
//      var numero02 = 1
//        var fn = 0
//
//        println(numero01)
//        println(numero01)
//
//        for (n in 0 until ( quantidade - 2) )
//        {
//            fn = numero01 + numero02
//            numero01 = numero02
//            numero02 = fn
//
//            println(fn)
//        }
//    }
}