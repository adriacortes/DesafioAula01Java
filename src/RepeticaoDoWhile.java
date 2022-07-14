import java.util.Scanner;

public class RepeticaoDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero=0,soma=0;
        int media=0,incremento=0,maiorNumero=0;

        do{

            System.out.println("Digige o nota: ");
            numero = entrada.nextInt();

            if(numero > maiorNumero){
                maiorNumero = numero;
            }

            soma = soma + numero;
            incremento = incremento + 1;

        }while(incremento < 5);

        System.out.println("O maior número é :" + maiorNumero);
        media = soma/5;
        System.out.println("A média é  :" + media);



    }

}
