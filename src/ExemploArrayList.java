import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class ExemploArrayList {

    static  Scanner scan = new Scanner(System.in);
    static  ArrayList<String> nomeAluno = new ArrayList<>();
    static  ArrayList<Integer> idadeAluno = new ArrayList<>();

    public static void leiaNome(String nome){
        nomeAluno.add(nome);
    }

    public static void leiaIdade(int idade){
        idadeAluno.add(idade);
    }

    public static void main(String[] args) {
        String nome = "";
        int idade = 0;
        do{
            System.out.println("Digite nome do aluno");
            nome = scan.next();

            System.out.println("Digite idade do aluno " + nome);
            idade = scan.nextInt();

            if(((nome.compareTo("0")) != 0)){
                leiaNome(nome);
                leiaIdade(idade);
            }
        }while(((nome.compareTo("0")) != 0));

        for(int i = 0; i < nomeAluno.size(); i++){
            System.out.println(" Aluno "+ (i+1) +" nome = " + nomeAluno.get(i) + " e idade = " + idadeAluno.get(i));
        }

    }
}