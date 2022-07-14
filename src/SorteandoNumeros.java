import java.util.Random;

public class SorteandoNumeros {
    public static void main(String[] args) {
        Random sorteado = new Random();

        int[] numerosAleatorios = new int[20];
        for (int i = 0; i < numerosAleatorios.length;i++ ){
            int numero = sorteado.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeors Aleatorios");
        for (int numero: numerosAleatorios) {
        System.out.print(numero + " ");
        }

        System.out.println("\nSucessores dos Numeors Aleatorios");
        for (int numero: numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }



    }
}
