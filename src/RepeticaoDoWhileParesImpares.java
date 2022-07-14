import java.util.Scanner;

public class RepeticaoDoWhileParesImpares {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeNumeros=0,incremento=0,numero=0,quantidadePares=0,quantidadeImpares=0;

        System.out.println("Quantidade de números:" );
        quantidadeNumeros = entrada.nextInt();

       do {

           System.out.println("Números:");
           numero = entrada.nextInt();

           if (numero % 2  == 0) quantidadePares++; //Operador MOD - apresenta o resto da divisao
           else quantidadeImpares++;
           incremento++;

       }while (incremento < quantidadeNumeros);

       System.out.println("Quantidade de Pares:"+quantidadePares);
       System.out.println("Quantidade de Impares:"+quantidadeImpares);

    }
}
