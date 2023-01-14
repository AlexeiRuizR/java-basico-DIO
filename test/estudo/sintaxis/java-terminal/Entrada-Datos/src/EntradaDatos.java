import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Entre seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Entre seu idade: ");
        int idade = entrada.nextInt();

        System.out.println("Entre a sua altura en mts: ");
        Double altura = entrada.nextDouble();

        System.out.println("Hello " + nome + " " + sobrenome + " seja bem-vindo");
        System.out.println("Seu idade é: " + idade);
        System.out.println("Sua altura e: " + altura);
    }
}
