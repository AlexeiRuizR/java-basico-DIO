public class Quadrilatero {

  public static void area(double lado) {
    System.out.println("El área del cuadrado es: " + lado*lado);
  }
  public static void area(double lado1, double lado2) {
    System.out.println("El área del rectangulo es: " + lado1*lado2);
  }
  public static void area(double baseMaior, double baseMenor, double altura) {
    System.out.println("El área del trapecio es: " + altura*((baseMaior+baseMenor)/2));
  }
}