import java.util.LinkedList;
import java.util.List;

public class ExtraLinkedList {
  public static void main(String[] args) {
    
    System.out.println("Crie uma lista chamada notas2");
    List<Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(0.0);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da lista sem removê-la: " + notas2.get(0));
        System.out.println("Tamanho da lista: " + notas2.size());
        
        notas2.remove(0);
        System.out.println("Mostre a primeira nota da lista removendo-lo: " + notas2.get(0));
        System.out.println("Tamanho da lista: " + notas2.size());

  }
}
