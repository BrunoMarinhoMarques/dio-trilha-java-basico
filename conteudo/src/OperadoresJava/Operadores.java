package OperadoresJava;
public class Operadores {
    public static void main(String[] args) {

        String nomeCompleto = "Linguagem" + "Java";
        String concatenacao = "?";
        System.out.println(nomeCompleto);

        //imprimi 31 pois soma os 3 primeiros numero e concatena com o ultimo caracter
        concatenacao = 1+1+1+"2";
        System.out.println(concatenacao);

        //imprimi 1111 por que concatena logo no inicio com o caracter e ele so identifica como
        //concatenacao e nao soma
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        //Operador Unario
        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        numero *= -1;
        System.out.println(numero);

//-----------------------------------------------------------------------------------------
        //incremento
        numero++;
        System.out.println(numero);

        //decremento
        numero--;
        System.out.println(numero);

//-----------------------------------------------------------------------------------------
        //boolean
        //a ! inverte o valor da variavel do tipo bool
        boolean variavel = true;
        variavel = !variavel;
        System.out.println(variavel);

//-----------------------------------------------------------------------------------------
        //Operador ternário
        int a, b;
        a = 5;
        b = 6;

        //bem parecido com o if/else, caso a condicao for verdadeira ele retorna o que estiver apos a ?, senao ele retorna
        //o que  estiver apos os :
        int resultado = a==b ? 1 : 0;
        System.out.println(resultado);
//-----------------------------------------------------------------------------------------

        //operadores relacionais
        int numeroUm = 1, numeroDois = 2;

        //verifica se variavel numeroUm é igual a numeroDois, caso for retorna true, senao false
        boolean simNao = numeroUm == numeroDois;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        //verifica se numeroUm é diferente de numeroDois
        simNao = numeroUm != numeroDois;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        //verifica se numeroUm é maior que numeroDois
        simNao = numeroUm > numeroDois;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);
//------------------------------------------------------------------------------------------
        //comparacao de strings

        String nomeUm = "Fernanda";
        String nomeDois = new String ("Fernanda");
        System.out.println(nomeUm.equals(nomeDois));

//------------------------------------------------------------------------------------------
        //Operadores Logicos
        boolean condicaoUm=true;
        boolean condicaoDois=false;

        if(condicaoUm && condicaoDois){
            System.out.println("As duas condições são verdadeiras");

        }
        if(condicaoUm || condicaoDois){
            System.out.println("Uma das condições é verdadeira");
        }
       


    }
}
