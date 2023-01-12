public class OperadorTernario {
  public static void main(String[] args) {
    String nome1 = "Alexei";
    String nome2 = "Alexei";

    System.out.println(nome1.equals(nome2));
    
    int a,b;
    a=5;
    b=6;
    String resultado = (a>b) ? "Aprobado" : "Desaprobado";
    System.out.println(resultado);
    
    boolean simNao = a==b;
    System.out.println("numeroA é igual a numeroB?: " + simNao);

    simNao = a!=b;
    System.out.println("numeroA é diferente a numeroB?: " + simNao);

    simNao = a>=b;
    System.out.println("numeroA é maior igual a numeroB?: " + simNao);

    simNao = a<=b;
    System.out.println("numeroA é menor igual a numeroB?: " + simNao);

    
  }
}
