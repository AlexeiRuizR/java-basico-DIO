import java.util.Scanner;

public class OrdemInversa {
  public static void main(String[] args) {
    //Scanner ent = new Scanner(System.in);
    //int [] ordem = new int[5];
    int ordem[] = {8, 7, 10, 6, 9};
    
    for(int i = ordem.length-1; i >= 0; i--){
      System.out.print(ordem[i] + " ");
    }
    
  }
}
