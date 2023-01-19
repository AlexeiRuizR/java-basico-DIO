import java.util.Scanner;

public class NomeeIdade {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String nome;
    int idade;

    while (true){
      System.out.println("Entre o seu nome: ");
      nome = entrada.next();
      if (nome.equals("0")) break;
      System.out.println("Entre a sua idade: ");
      idade = entrada.nextInt();      
    }
    System.out.println("Continua aquí ....");
  }
}