package EstruturasRepeticao;

public class BreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero++){
            //o continue ele retorna a linha de execucao anterior e continua a execução do laço
            if(numero==3)continue;

            System.out.println(numero);
        }

        for(int numero = 1; numero <=5; numero++){
            //finaliza o laço de repetição
            if(numero==3)break;

            System.out.println(numero);
        }
    }
}
