import java.util.Scanner;

public class ParEImpar {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);

    int quantNumeros;
    int numero, quantPares = 0;

    System.out.println("Quantidade de numeros: ");
    quantNumeros = ent.nextInt();
    int i = 0;
    do {
      System.out.println("Número ");
      numero = ent.nextInt();
      if (numero % 2 == 0) quantPares++;
      i++;
    } while(i < quantNumeros);
    System.out.println("Pares: " + quantPares);
    System.out.println("Impares: " + (i - quantPares));
  }
}
