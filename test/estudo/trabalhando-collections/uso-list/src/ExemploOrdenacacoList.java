import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// dadas as seguintes informacoes sobre meus gatos, crie uma lista
// e ordene esta lista exibindo:
// nome - idade - cor
// Gato 1 = nome: Jon, idade: 18, cor: preto 
// Gato 2 = nome: Simba, idade: 6, cor: tigrado 
// Gato 1 = nome: Jon, idade: 12, cor: amarelo 

public class ExemploOrdenacacoList {
  public static void main(String[] args) {

    List<Gato> meusGatos = new ArrayList<>(){{
      add(new Gato("Jon", 18, "preto"));
      add(new Gato("Simba", 6, "tigrado"));
      add(new Gato("Jon", 12, "amarelo"));
    }};
    System.out.println("--\tOrdem de Inserção\t---");
    System.out.println(meusGatos);

    System.out.println("--\tOrdem aleatória\t---");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);


    System.out.println("--\tOrdem Natural (Nome)\t---");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);

    System.out.println("--\tOrdem Idade\t---");
    //Collections.sort(meusGatos, new ComparatorIdade());
    meusGatos.sort(new ComparatorIdade());
    System.out.println(meusGatos);

    System.out.println("--\tOrdem cor\t---");
    //Collections.sort(meusGatos, new ComparatorCor());
    meusGatos.sort(new ComparatorCor());
    System.out.println(meusGatos);

    System.out.println("--\tOrdem Nome/Cor/Idade\t---");
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);

  }
}
class Gato implements Comparable<Gato>{
  private String nome;
  private Integer idade;
  private String cor;


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
    return " [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
  }
  @Override
  public int compareTo(Gato o) {
    return this.getNome().compareToIgnoreCase(o.getNome());
  }
}

class ComparatorIdade implements Comparator<Gato>{

  @Override
  public int compare(Gato o1, Gato o2) {
      return Integer.compare(o1.getIdade(), o2.getIdade());
  }}

class ComparatorCor implements Comparator<Gato>{
  @Override
  public int compare(Gato o1, Gato o2) {
    return o1.getCor().compareToIgnoreCase(o2.getCor());
  }
}