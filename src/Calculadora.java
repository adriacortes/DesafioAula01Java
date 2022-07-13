public class Calculadora {

    public static void soma(double numero1,double numero2){
        double resultado = numero1 + numero2;
        mensagemDoResultado(resultado,numero1,numero2,"SOMA");
    }

    public static void subtracao(double numero1,double numero2){
        double resultado = numero1 - numero2;
        mensagemDoResultado(resultado,numero1,numero2,"SUBTRACAO");
    }

    public static void multiplicacao(double numero1,double numero2){
        double resultado = numero1 * numero2;
        mensagemDoResultado(resultado,numero1,numero2,"MULTIPLICAÇÃO");
    }

    public static void divisao(double numero1,double numero2){
        double resultado = numero1 / numero2;
        mensagemDoResultado(resultado,numero1,numero2,"DIVISÃO");
    }

    public static void mensagemDoResultado(double resultado,double numero1,double numero2,String operacao){
        System.out.println("O resultado da "+operacao+" de "+numero1+" com "+numero2+" é : "+resultado);
    }


}
