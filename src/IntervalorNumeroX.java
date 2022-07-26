import java.util.Scanner;

public class IntervalorNumeroX {
    public static void main(String[] args) {
        int numero=0;
        Scanner entrada =new Scanner(System.in);
        numero = entrada.nextInt();

        if (numero >= 100  && numero <= 200)
        {
            System.out.println("Esta no intervalo!");
        }
        else
        {
            System.out.println("Não esta no intervalo!");
        }
    }

}
