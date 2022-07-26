import java.util.Scanner;

public class Desafio2DioSantanderGerente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int percentualDesconto = 0,desconto=0,valordoProdutoSemDesconto=0,valorDoProdutoComDesconto;

        desconto =   input.nextInt();
        valordoProdutoSemDesconto = input.nextInt();

        valorDoProdutoComDesconto = valordoProdutoSemDesconto -(valordoProdutoSemDesconto*desconto/100);

        System.out.println(valorDoProdutoComDesconto);


    }//main

}
