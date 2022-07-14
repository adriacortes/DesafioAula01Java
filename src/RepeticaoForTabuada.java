import java.util.Scanner;

/* Desenvolva um gerador de tabuada capaz de gerar a tabuada de qualquer número
inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5X1=5
5X2=10
...
5X10=50
* */
public class RepeticaoForTabuada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Tabuada de : ");
        int tabuada = entrada.nextInt();

        int i;
        for (i = 1;i <=10 ; i++){
            System.out.println(tabuada+"X"+ i +"=" + (tabuada * i) );
        }

    }
}
