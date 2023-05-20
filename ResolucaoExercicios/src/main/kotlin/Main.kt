import java.util.Scanner

fun main(args: Array<String>)
{
    // Intânciando a funcionalidade de receber informações no terminal
    var terminal = Scanner(System.`in`);

    // Recebendo as variáveis
    println("Informe uma palavra:");
    var palavra01 = terminal.nextLine();

    println("Informe a segunda palavra");
    var palavra02 = terminal.nextLine();

    if( palavra01.length > palavra02.length )
    {
        println("A maior palavra é: " + palavra01);

    }else if( palavra02.length > palavra01.length ){
        println("A maior palavra é: " + palavra02);

    }else{
        println("As palavras tem o mesmo tamanho ");
    }

    // ______________________________________

//    println("Informe um número");
//    var numeroInformado = terminal.nextInt();
//
//    if( numeroInformado > 0 )
//    {
//        println("Número é positivo");
//
//    }else{
//        println("Número é negativo");
//    }

    //_________________________
//    println("Qual a sua idade");
//    var idade = terminal.nextInt();
//
//    if( idade >= 18 )
//    {
//        println("Você é maior de idade")
//
//    }else{
//        println("Você é menor de idade")
//    }

    //_________________________
//    println("Informe uma letra:")
//    var letra = terminal.nextLine()
//
//    if ( letra.toUpperCase() == "A" || letra.toUpperCase() == "E" ||
//        letra.toUpperCase() == "I" || letra.toUpperCase() == "O" ||
//        letra.toUpperCase() == "U" )
//    {
//       println("Seu caracter é uma vogal");
//
//    }else{
//        println("Seu caracter é uma consoante");
//    }

    //___________________________
//    println("Informe a primeira idade:")
//    var idade01 = terminal.nextInt()
//
//    println("Informe a segunda idade:")
//    var idade02 = terminal.nextInt();
//
//    if( idade01 == idade02 )
//    {
//        println("Ambos tem a mesma idade")
//
//    }else{
//        println("Ambos tem a idade diferente")
//    }

    //____________________________________
//    println("Informe seu salário:")
//    var salario = terminal.nextDouble();
//
//    if( salario > 2500.00 )
//    {
//        println("Seu salário é acima da média");
//
//    }else{
//        println("Seu salário é abaixo da média");
//    }
    // ______________

//    println("Informe o primeiro número")
//    var numero01 = terminal.nextInt()
//
//    println("Informe o segundo número")
//    var numero02 = terminal.nextInt()
//
//    println("Informe o terceiro número")
//    var numero03 = terminal.nextInt()
//
//    var maiorNumero = 0;
//    if( numero01 > numero02 && numero01 > numero03 )
//    {
//        maiorNumero = numero01;
//    }else if(numero02 > numero01 && numero02 > numero03){
//
//        maiorNumero = numero02
//
//    }else{
//        maiorNumero = numero03
//    }

//    println("Maior número : " + maiorNumero)

    //______________________________________________

//    println("Informe sua idade");
//    var idade = terminal.nextInt();
//
//    if( idade >= 13 && idade <= 17 )
//    {
//       println("Você é um adolescente")
//
//    }else{
//        println("Você não é adolescente")
//    }

    //______________________________________

//    val scan = Scanner(System.`in`);
//
//    println("Qual termo de fibonnaci vc gostaria?");
//    var quantidade = scan.nextInt();
//    if (quantidade == 1 || quantidade == 2){
//        println(1)
//    }
//    else {
//        var N1 = 1;
//        var N2 = 1;
//        var Fn = 0
//
//        println(1);
//        println(1);
//
//        for (n in 0 until  (quantidade - 2 )){
//            Fn = N1 + N2;
//            N1 = N2;
//            N2 = Fn;
//
//            println(Fn)
//        }
//    }

    //_______________________________________

//    println("Informe quantas sequências deseja visualizar: ")
//    var sequencia = terminal.nextInt();
//
//    var n1 = 0
//    var n2 = 1
//    var fn = 0;
//
//    println( n1 )
//    println( n2 );
//    for (i in 0 until sequencia)
//    {
//        fn = n1 + n2;
//
//        n1 = n2;
//        n2 = fn;
//
//        println( fn )
//    }

    //1- Escreva um programa onde informamos 4 idades distintas e depois exibir a maior e a menor idade informada
    var idades = Array<Int>(4){0}

    for (i in 0 until 4){
        println("Escreva uma idade: ")
        idades[i] = terminal.nextInt();
    }

    idades.sort();

    println("A maior idade é " + idades[3])
    println("A menor idade é " + idades[0])
}