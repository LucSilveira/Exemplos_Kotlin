import org.jetbrains.annotations.Nullable
import java.util.Scanner

fun main(args: Array<String>)
{
//   var minhaVariavel = "Agora tem um texto";
//
////    ::class - Consultar o tipo da minha variável
//    println( minhaVariavel::class );
//
//    var nome: String = "Joaozinho";
//    var sobrenome: String = "das Neves";
//
//    println( nome + " " + sobrenome );
//
//   var blocoTexto = """
//      Bloco novo
//      de texto
//      bunitao
//   """.trimIndent()
//
//    println( blocoTexto );
//
//   var char : Char = 'L'
//    println( char )

   // _________________________________________

//   var inteiro01 : Int = 10;
//   var inteiro02 : Int = 20;
//
//   println( inteiro01::class )
//   println( inteiro01 + inteiro02 )
//
//   var long : Long = 1234567890987654L
//   println(long)
//
//   var short : Short = 12312;
//   println( short );

   // __________________________

//   var double : Double = 12.5
//   println( double )
//
//   var float : Float = 15.5f;
//   println( float )
//   println( float::class )
//
//   var novo = 15.6
//   println( novo::class )

   // __________________________

//   var boolean : Boolean = true
//   println( boolean );

   // _____________________________

//   var nulo = null;
//   println( nulo );

   //______________________________________________
   //______________________________________________

//   var tipoInteiro = 17;
//   println( tipoInteiro.toString() );
//
//   var textoNovo = "17";
//   println( textoNovo.toInt() );
//
//   var doubleNovo = 16.5;
//   println( doubleNovo.toInt() );

   //______________________________________

//   if( tipoInteiro == 16 )
//   {
//     println("Isso é verdadeiro")
//
//   }else{
//      println("Isso não é verdadeiro")
//   }
//
//
//   if( tipoInteiro == 16 )
//   {
//      println("Ação 01");
//
//   }else if( tipoInteiro == 17 ){
//
//      println("Ação 02");
//
//   }else{
//      println("Ação 03");
//   }
//
//
//   when( tipoInteiro )
//   {
//      16 -> {
//         println("Isso é 16")
//      }
//      else -> {
//         println("Isso não é 16")
//      }
//   }
//
//   var inteiroComCondicao = 0;
//   if( (1 + 1) == 2 )
//   {
//      inteiroComCondicao = 1;
//
//   }else{
//      inteiroComCondicao = 2;
//   }
//
//   var inteiroComCondicaoNova = if((1 + 1) == 2)
//   {
//      1
//   }else{
//      2
//   }
//   println(inteiroComCondicaoNova)

   //______________________________________

//   fun MinhaNovaFuncao()
//   {
//      println("Oi, eu sou uma função")
//   }
//   MinhaNovaFuncao()
//
//   fun MinhaOutrFuncao( texto : String)
//   {
//      println("Exibindo o texto :" + texto);
//   }
//   MinhaOutrFuncao("Oi outra função");
//
//   fun Soma(numero01 : Int, numero02 : Int) : Int
//   {
//      var resultado = numero01 + numero02;
//
//      return resultado;
//   }
//
//   var conta = Soma( 3, 7);
//   println( conta )
//
//   var novaConta = Soma( numero01 = 5, numero02 = 6 );
//   println( novaConta )

   //______________________________________

//   println("Digite algo");
//   var respostaTerminal = Scanner( System.`in` );
//   var resposta = respostaTerminal.nextLine();

//   println( resposta );

   // _______________________

//   println("Você gostaria de saber se 1 + 1 é igual 2");
//   var terminal = Scanner( System.`in` );
//   var novaResposta = terminal.nextLine();

//   if( novaResposta.toUpperCase() == "SIM" )
//   {
//      println(2);
//
//   }else{
//      println("que pena")
//   }

   //_______________________________

//   var terminal02 = Scanner( System.`in` );
//
//   println("Informe um número:");
//   var numero01terminal = terminal02.nextInt();
//   var somaTerminal = numero01terminal + 2;

   // Soma (+)
   // Subtração (-)
   // Multiplicação (*)
   // Divisão (/)

//   println( somaTerminal > 10 );
//   println( somaTerminal < 10 );
//   println( somaTerminal == 10);
//   println( somaTerminal >= 10 );

   // igual (==)
   // maior (>)
   // menor (<)
   // maior ou igual (>=)
   // menor ou igual (<=)
   // diferente (!=)
   // estritamente igual (===)

   //__________________________________________

   // Definindo constantes que são valores imutaveis
//   val constante = "";

   //_______________________________________

   var inteiros = Array<Int>(4){0};

//   inteiros[0] = 18;
//   inteiros[1] = 19;
//   inteiros[2] = 20;
//   inteiros[3] = 21;
//
//   var inteiros02 = IntArray(5);
//   var flutuantes = DoubleArray(3);
//   var flutuantes02 = FloatArray(4);

//   println( inteiros.contentToString() )

   // __________________________________________

//   for(var i = 0; i++; i < 10)
//   for( i in 0 until 10)
//   {
//      println(i)
//      println("" + i + " + 1");
//      println()
//   }
//   println()

//   for(z in 10 downTo 0)
//   {
////      println(z)
//   }

//   var numero = 0
//   while( numero < 10 )
//   {
////      println( numero)
////      numero = numero + 1
//      numero++
//   }
//   println()

//   var numero02 = 0
//   do{
////      println( numero02)
//      numero02++
//
//   }while(numero02 < 10)
//   println()
//
//   var contador = 0;
//   for (inteiroUnico in inteiros)
//   {
//      println(contador)
//      println(inteiroUnico)
//
//      contador++
//   }

   //__________________________
//   var terminal = Scanner(System.`in`);

//   println("Você quer rodar o laço?");
//   var resposta = terminal.nextLine()

//   while(resposta != "nao")
//   {
//      println("rodou");
//
//
//      println("Você quer continuar no laço?");
//      resposta = terminal.nextLine();
//
//      println()
//   }

//   println("Informe os comando desejados")
//   println(" 1 - Oi, 2 - tchau, 0 - sair, senao - quebra o laço");
//
//   var resposta = terminal.nextInt()
//   while(resposta != 0)
//   {
//      if(resposta == 1)
//      {
//         println("Oi")
//      }else if( resposta == 2){
//         println("tchau")
//
//      }else{
//         break;
//      }
//
//      println()
//      println("Informe os comando desejados")
//      println(" 1 - Oi, 2 - tchau, 0 - sair, senao - quebra o laço");
//      resposta = terminal.nextInt()
//   }
}