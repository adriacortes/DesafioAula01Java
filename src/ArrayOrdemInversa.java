/* CRIE UM VETOR DE 6 NUMEROS E MOSTRE-OS NA ORDEM INVERSA */

public class ArrayOrdemInversa {
    public static void main(String[] args) {

       int [] vetor = {-5,0,15,50,8,4};
       int i=0;

       System.out.println("Tamanho do Vetor: "+ vetor.length);
       while (i < vetor.length){
           System.out.print(vetor[i] + " ");
           i++;
       }


       System.out.println("ORDEM INVERSA");
       for (int count = (vetor.length - 1); count >= 0 ; count --){
           System.out.print(vetor[count] + " ");
       }

    }
}
