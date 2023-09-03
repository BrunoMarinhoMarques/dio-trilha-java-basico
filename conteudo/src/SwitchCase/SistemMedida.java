package SwitchCase;

public class SistemMedida {
    public static void main(String[] args) {
        String sigla = "m";

        switch (sigla) {
            case "p":{

                System.out.println("PEQUENO");
                break;
            }
            case "m":{
                System.out.println("MÉDIO");
                break;
            }
            case "g":{
                System.out.println("GRANDE");
                break;
            }
                
                
        
            default:
                System.out.println("Não foi encontrado");
                break;
        }
    }
}
