import java.util.Scanner;

public class ListaNomeVetor {
    public static void main(String[] args) {

        String[] nomes = new String[5];
        Scanner entrada = new Scanner(System.in);


        //Adicionando nomes ao Vetor
        for (int i=0; i < nomes.length;i++){

            System.out.println("Informe o nome: ");
            nomes[i] = entrada.next();
        }

        //Listando os nomes
        for (String nome : nomes)
        {
            System.out.println(nome);
        }

    }
}
