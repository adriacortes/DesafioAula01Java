public class Main {
    public static void main(String[] args) {

        String verificacao = Quadrilatero.verifica(34);
        System.out.println(verificacao);

        Quadrilatero.verifica();

        System.out.println("QUADRILATERO");
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println(areaQuadrado);

        double areaQuadrilatero = Quadrilatero.area(5,5);
        System.out.println(areaQuadrilatero);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println(areaTrapezio);


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
