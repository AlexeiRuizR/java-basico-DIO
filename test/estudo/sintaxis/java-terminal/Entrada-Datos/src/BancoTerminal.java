
public class BancoTerminal {
  public static void main(String[] args) {
    double saldo = 15;
    double valorSolicitado = 22;

    if (saldo > valorSolicitado) {
      saldo = saldo - valorSolicitado;
      System.out.println("El saldo que queda es: " + saldo);
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  
  }

