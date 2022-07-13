public class Emprestimo {
    
    public static void calcular(double valor,int quantidadeParcelas){
        if(quantidadeParcelas == 2)
        {
            double valorTotal = valor + (valor * getTaxaDuasParecelas());
            System.out.println("Valor total do empréstimo para 2 parcelas: R$"+ valorTotal);
        }
        else if (quantidadeParcelas == 3)
        {
            double valorTotal = valor + (valor * getTaxaTresParecelas());
            System.out.println("Valor total do empréstimo para 3 parcelas: R$"+ valorTotal);
        }
        else {
            System.out.println("Quantidade de parcela não aceita! Por favor,escolher entre as " +
                    "seguintes opção : 2 ou 3 parcelas.");
        }
    }

    private static double getTaxaTresParecelas() {
        return 0.45;
    }

    private static double getTaxaDuasParecelas() {
        return 0.3;
    }
}
