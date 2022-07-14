import java.util.Random;

public class ArrayMultidimensionalMatriz {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] matriz = new int[4][4];

        for (int i = 0;i < matriz.length;i++)
        {
            for (int x = 0;x <  matriz[i].length ; x++){
                matriz[i][x] = random.nextInt(9);
            }
        }//for

        for (int[] linha : matriz)
        {
            for (int coluna : linha)
            {
                System.out.print(coluna + " ");

            }
            System.out.println();
        }

    }//main
}
