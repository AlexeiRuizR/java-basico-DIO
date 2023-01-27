import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PerguntasCrime {
  public static void main(String[] args) {
    
    Scanner act = new Scanner(System.in);

    List<String> pergunta = new ArrayList<>();

    System.out.println("Telefonou para a vítima: ");
    pergunta.add(0, act.next());
    System.out.println("Esteve no local do crime: ");
    pergunta.add(1, act.next()); 
    System.out.println("Mora perto da vítima: ");
    pergunta.add(2, act.next()); 
    System.out.println("Devia para a vítima: ");
    pergunta.add(3, act.next()); 
    System.out.println("Já trabalhou com a vítima: ");
    pergunta.add(4, act.next());

    System.out.println(pergunta);
    System.out.println(pergunta.size());

  //   Integer primer, segundo, tercero, cuarto, quinto, cuenta;
  //   if(pergunta.get(0).equalsIgnoreCase( "s")){primer = 1;} else {primer = 0;}
  //   if(pergunta.get(1).equalsIgnoreCase("s")){segundo = 1;} else {segundo = 0;}
  //   if(pergunta.get(2).equalsIgnoreCase("s")){tercero = 1;} else {tercero = 0;}
  //   if(pergunta.get(3).equalsIgnoreCase("s")){cuarto = 1;} else {cuarto = 0;}
  //   if(pergunta.get(4).equalsIgnoreCase("s")){quinto = 1;} else {quinto = 0;}
    
  //   cuenta = primer + segundo + tercero + cuarto + quinto;
  //   System.out.println(cuenta);
  //  System.out.println(pergunta.get(0));
    
    // Iterator<String> iterator = pergunta.iterator();
    // int cant = 0, count = 0;
    // while(iterator.hasNext()){
    //   String next = iterator.next();
    //   if(next.equalsIgnoreCase("s")) {count = 1;} else {count = 0;}
    //   cant += count;
    // }
    // System.out.println(cant-1);

    Iterator<String> iterator = pergunta.iterator();
    int cant = 0;
    while(iterator.hasNext()){
      String next = iterator.next();
      if(next.equalsIgnoreCase("s")) 
      cant++;
    }
    System.out.println(cant);
    act.close();
  }
}
