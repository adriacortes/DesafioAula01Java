/*
* O programa deve ler um valor e apresentar em qual intervalo se encontra.
* São eles:
* ([0,25], (25,50], (50,75], (75,100])
* Caso o valor não esteja em nenhum destes intervalos, deverá ser impressa a mensagem: “Fora de intervalo”.
 */
import java.io.IOException;
import java.util.Scanner;

public class Desafio1Santander {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double valor = leitor.nextDouble();
        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
//TODO: Complete os espaços em branco com uma possível solução para o problema
            System.out.println("Intervalo  [25,50]  ");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("  Intervalo de [50,75]  ");
        } else if (valor > 75 && valor <= 100) {
            System.out.println(" Intervalo de [75,100]  ");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}