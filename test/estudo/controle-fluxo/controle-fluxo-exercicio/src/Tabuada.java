import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);

    int numero, i;
    System.out.println("Entre o numero para a Tabuada:");
    numero = ent.nextInt();
    System.out.println("Tabuada de " + numero + ":");
    for (i = 1; i < 11; i++){
      System.out.println(numero + " * " + i + " = " + (numero*i));
    }
  }
}
