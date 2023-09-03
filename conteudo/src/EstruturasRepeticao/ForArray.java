package EstruturasRepeticao;

public class ForArray {
    
    public static void main(String[] args) {

        //em arrays o indice inicia em zero
        String alunos[] = {"Bruno", "Fernanda", "Fabio", "Debora", "Tia Midori"};

        for(int i=0; i<alunos.length;i++){
            System.out.println("Aluno na posição "+i+" é o/a "+alunos[i]);

        }

        //para cada nome na lista a variavel aluno ira percorrer ate finalizar
        for(String aluno : alunos){
            System.out.println("Aluno "+aluno);
        }

    }
}
