public class Consoantes {
  public static void main(String[] args) {
    char[] cons = {'x', 'b', 'i', 'd', 'o', 'f'};
    int conta = 0;
    char[] consoantes = new char[cons.length];
    
    for (int i = 0; i < cons.length; i++){
      if (!(cons[i] == 'a' || cons[i] == 'e' || cons[i] == 'i' || cons[i] == 'o' || cons[i] == 'u')) {
        consoantes[i] = cons[i] ;
        conta++;}
    }
    System.out.println("Quantidade de consoantes: " + conta);
    for(char t : consoantes){
      if (t != ' '){
        System.out.print(t + " ");
      }
    }
  }
}
