import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
                add(new Gato("Jon", 18, "preto"));
                add(new Gato("Simba", 6, "tigrado"));
                add(new Gato("Jon", 12, "amarelo"));
            }};

        //System.out.println(meusGatos);//para imprimir os dados do objeto,usar ToString na classe.
        System.out.println("Ordem de Inserção: ");
        System.out.println(meusGatos);

        System.out.println(" ### Ordem Aleatória:### ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("### Ordenar lista por NOME:### ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("### Ordenar pela IDADE:### ");

        System.out.println("### Ordenar pela COR:### ");

        System.out.println("### Ordenar pela NOME,IDADE,COR:### ");


    }
}

class Gato implements Comparable<Gato>{
    private  String nome;
    private  Integer idade;
    private  String  cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }


}

class ComparatorIdade implements Comparable<Gato> {

    @Override
    public int compareTo(Gato o) {
        return 0;
    }
}