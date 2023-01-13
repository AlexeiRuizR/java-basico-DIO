public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("O canal é: " + canal);
  }
  public void aumentarCanal(){
    canal++;
    System.out.println("Aumentando o canal a: " + canal);
  }
  public void diminuirCanal(){
    canal--;
    System.out.println("Diminuindo o canal a: " + canal);
  }

  public void subirVolume(){
    volume++;
    System.out.println("Aumentando o volume a: " + volume);
  }

  public void bajarVolume(){
    volume--;
    System.out.println("Diminuindo o volume a: " + volume);
  }

  public void cambiarCanalAcima(){
    canal++;
  }

  public void cambiarCanalAbaixo(){
    canal--;
  }

  public void ligar() {
    ligada = true;
  }
  public void desligar() {
    ligada = false;
  }
}