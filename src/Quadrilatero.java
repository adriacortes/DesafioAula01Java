public class Quadrilatero {

    public static double area(double lado){

        return lado * lado;
    }

    public static double area(double lado1,double lado2){

        return lado1 * lado2;
    }

    public static double area(double baseMaior,double baseMenor,double altura){
        return ( ( (baseMaior+baseMenor) * altura) / 2 );
    }

    public static String verifica(int idade){
        if(idade>18){
            return "Maior de idade";
        }
        else {
            return "Menor de idade";
        }
    }

    public static void verifica(){
        System.out.println("Alo galera");
    }

}
