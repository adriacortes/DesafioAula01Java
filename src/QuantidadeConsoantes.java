import java.util.Scanner;

/* FAÇA UM PROGRAMA QUE LEIA UM VETOR DE 6 CARACTERES E DIGA QUANTAS
* CONSOANTES FORAM LIDAS! IMPRIMA AS CONSOANTES. */
public class QuantidadeConsoantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeConsoantes=0;

        int count =0;
        do {

            System.out.println("Digite as letras: ");
            String letra = entrada.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) )
            {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }
            count++;

        }while (count < consoantes.length);

        System.out.println("Quantidade de consoantes: " +quantidadeConsoantes);

       /* for (int i = 0; i <= (consoantes.length-1);i++){
            System.out.println(consoantes[i]);
        }*/

        // PARA CADA ELEMENTO STRING DENTRO DESSE ARRAY IMPRIMA A STRING - FOREACH
        for (String consoante : consoantes) {
            if ( consoante != null)
                System.out.println(consoante);
        }


    }
}
