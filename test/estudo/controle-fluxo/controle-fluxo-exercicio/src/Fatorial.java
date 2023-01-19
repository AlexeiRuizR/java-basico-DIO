import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);

    System.out.println("Entre o número para o fatorial:");
    int fatorial = ent.nextInt();
    int resultado = 1;

    for(int i = 1; i <= fatorial; i++){
      resultado = i * resultado;
    }
    System.out.println("O fatorial de "+ fatorial + " es " + resultado);
    ent.close();
  }
}
