import java.util.Scanner;

/* fatorial de um numero ex.: 5! = 4X4X3X2X1 = 120 */
public class Fatorial {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int i,multiplicacao=1;

        System.out.println("Fatorial de : ");
        int numero = entrada.nextInt();

        System.out.print(numero +"! = ");
        for(i=numero;i >=1;i--){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);

    }

}
