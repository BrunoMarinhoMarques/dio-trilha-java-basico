package EstruturasExcepcionais;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
public class TryCatch {
  /* */
    public static void main(String[] args) {
       
       try{
        String nome;
        int idade;
        double altura;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite sua idade: ");
        idade = scan.nextInt();

       

        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();

    

        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nAltura: "+altura);
        
    }catch(InputMismatchException e){
        System.out.println("Os campos altura e idade precisam ser numéricos!");
    }
  }

}
