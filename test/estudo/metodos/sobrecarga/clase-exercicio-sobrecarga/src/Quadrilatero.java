public class Quadrilatero {

  public static double area(double lado) {
    double resultado = lado*lado;
    return resultado;    
  }
  public static double area(double lado1, double lado2) {
    double resultado = lado1*lado2; // puedo poner return delante
    return resultado;               // return (lado1 * lado2);
  }                                 //y en el main declaro var resultado
  public static double area(double baseMaior, double baseMenor, double altura) {
    double resultado = altura*((baseMaior+baseMenor)/2);
    return resultado;
  }
}