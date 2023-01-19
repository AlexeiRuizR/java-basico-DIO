import java.util.Scanner;

public class Nota {
      public static void main(String args[])
    {
       Scanner ent = new Scanner(System.in);
        int nota;
        // solución de camila profe
        /* System.out.println("Nota: ");
        nota = ent.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = ent.nextInt();
        } */
        
        // mi solución
        while (true) {            
           System.out.println("Entre a nota: ");
            nota = ent.nextInt();
            if (nota > 10) System.out.println("Nota invalida");
            else {System.out.println("Nota: " + nota); break;}
        }
    }
}
  

