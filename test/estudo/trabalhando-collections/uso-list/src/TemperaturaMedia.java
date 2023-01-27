import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TemperaturaMedia {
  public static void main(String[] args) {
    
    List<Double> temperaturaMediaMes = new ArrayList<>(Arrays.asList(30.8, 31.0, 30.9, 30.4, 29.6, 28.5));
    Iterator<Double> iterator = temperaturaMediaMes.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double media = (soma/temperaturaMediaMes.size());
    System.out.println("A temperatura média dos primeros 6 meses do ano é: " + media);

    for (Double recorrido : temperaturaMediaMes) {
      if (recorrido > media){
        Integer valor = temperaturaMediaMes.indexOf(recorrido);
        if(valor == 0)
        System.out.println("1-Janeiro: " + recorrido);
        else if(valor == 1)
        System.out.println("2-Fevereiro: " + recorrido);
        else if(valor == 2)
        System.out.println("3-Março: " + recorrido);
        else if(valor == 3)
        System.out.println("4-Abril: " + recorrido);
        else if(valor == 4)
        System.out.println("5-Maio: " + recorrido);
        else System.out.println("6-Junho: " + recorrido);
      }
    }      
  }
}
