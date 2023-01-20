public class Mensagem {
  public static void obterMensagem(int hora){
    if(hora > 4 && hora < 13){
      mensagemBomDia();
    } else if (hora > 12 && hora < 20){
      mensagemBoaTarde();
    } else if ((hora > 19 && hora <= 24) || (hora <= 4 && hora >= 1)){
      mensagemBoaNoite();
    } else {
      mensagemErrado();
    }
  }
  public static void mensagemBomDia() {
    System.out.println("Bom día");
  }
  public static void mensagemBoaTarde() {
    System.out.println("Boa tarde");
  }
  public static void mensagemBoaNoite() {
    System.out.println("Boa noite");
  }
  public static void mensagemErrado() {
    System.out.println("Entre hora válida entre las 24 horas");
  }
  
}
