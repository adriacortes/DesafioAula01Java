public class Main {
    public static void main(String[] args) {

        System.out.println("CALCULADORA");
        Calculadora.soma(2,4);
        Calculadora.subtracao(10,6);
        Calculadora.multiplicacao(10,6);
        Calculadora.divisao(5,2.5);

        System.out.println("MENSAGEM");
        Mensagem.mostrarMensagem(13);
        Mensagem.mostrarMensagem(1);
        Mensagem.mostrarMensagem(8);

        System.out.println("EMPRESTIMO");
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000,3);
        Emprestimo.calcular(2000,5);
    }



}
