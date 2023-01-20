import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner ent = new Scanner(System.in);
        double num1, num2;
        int hora;
        System.out.println("Entre el primer numero para el calculo:");
        num1 = ent.nextDouble();
        System.out.println("Entre el segundo numero para el calculo:");
        num2 = ent.nextDouble();
        System.out.println("Entre la hora del día");
        hora = ent.nextInt();

        System.out.println("Calculos");
        Calculadora.soma(num1, num2);
        Calculadora.resta(num1, num2);
        Calculadora.multiplicao(num1, num2);
        Calculadora.divisao(num1, num2);

        System.out.println("Mensagem do día");
        Mensagem.obterMensagem(hora);

        System.out.println("Emprestimos");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
