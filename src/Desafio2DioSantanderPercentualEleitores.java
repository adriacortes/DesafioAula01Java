import java.util.Scanner;

public class Desafio2DioSantanderPercentualEleitores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalHabitantes = 0, totalVotosBrancos = 0, totalVotosNulos = 0, totalVotosValidos,
                percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos;

        totalHabitantes = input.nextInt();
        totalVotosBrancos = input.nextInt();
        totalVotosNulos = input.nextInt();
        totalVotosValidos = input.nextInt();

        percentualVotosBrancos = ((totalVotosBrancos * 100) / totalHabitantes);
        percentualVotosNulos = (totalVotosNulos * 100) / totalHabitantes;
        percentualVotosValidos = (totalVotosValidos * 100) / totalHabitantes;

        System.out.println("Brancos: " + percentualVotosBrancos + "%");
        System.out.println("Nulos: " + percentualVotosNulos + "%");
        System.out.println("Validos: " + percentualVotosValidos + "%");

    }//main
}
