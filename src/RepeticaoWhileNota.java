import java.util.Scanner;

public class RepeticaoWhileNota {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade=0;
        int nota=0;

        System.out.println("Nota: ");
        nota = entrada.nextInt();
        while (nota < 0  | nota > 10)
        {
            System.out.println("Digite uma nota Válida entre 0 e 10!");
            System.out.println("Nota: ");
            nota = entrada.nextInt();
        }

        while (true) // Infinito ate satisfazer o break!
        {
            System.out.println("Digite o nome:");
            nome = entrada.next();
            if (nome.equals("0")) break;
            System.out.println("Digite a idade:");
            idade = entrada.nextInt();
        }

    }
}
