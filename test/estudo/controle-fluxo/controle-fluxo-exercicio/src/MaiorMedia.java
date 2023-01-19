import java.sql.Array;
import java.util.Scanner;

public class MaiorMedia {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);

    int max = 0, med, sum = 0;
    int numero;
    int i = 0;
    do {
      System.out.println("Entre el numero: ");
      numero = ent.nextInt();
      sum += numero;
      if (max < numero) max = numero;
      i++;
    } while (i < 5);
      med = sum / i;
      System.out.println("med " + med);
      System.out.println("max " + max);
  }
}
