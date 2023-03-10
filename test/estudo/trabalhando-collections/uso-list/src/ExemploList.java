import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        //List<Double> notas = new ArrayList<>();
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // esta forma no te permite adicionar elementos o retirar
        // List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        // notas.add(1d);
        // notas.remove(5d);  //esta forma no te permite adicionar elementos o retirar
        // System.out.println(notas);
        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
       // System.out.println(notas.toString());
        System.out.println("Exiba a nota da nota 5.0: " + notas.indexOf(5d));
        System.out.println("adicione na lista a nota 8.0 na posiçao 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        
        System.out.println("substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        // System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        // for (Double nota : notas) System.out.println(nota);
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota:" + Collections.min(notas));
        System.out.println("Exiba a maior nota:" + Collections.max(notas));
        
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas.toString());

        System.out.println("Apague toda a lista:");
        notas.clear();

        System.out.println("confira se a lista está vazia: " + notas.isEmpty());
        
        System.out.println("Usando LinkedList");
        System.out.println("Crie uma lista chamada notas2" + 
        "e coloque todos os elementos do lis ArraysList nessa nova lista: ");

        System.out.println("Mostre a primeira nota da nova lista sem removê-la: ");

        System.out.println("Mostre a primeirra nota da nova lista removendo-o");
    }
}
