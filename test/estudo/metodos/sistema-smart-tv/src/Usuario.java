public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.subirVolume();
        smartTv.bajarVolume();
        smartTv.bajarVolume();
        smartTv.bajarVolume();
        System.out.println("O volume atual e: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Qual é o canal?: " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Qual é o canal?: " + smartTv.canal);


        System.out.println("TV ligada?: " + smartTv.ligada);
        System.out.println("Qual é o canal?: " + smartTv.canal);
        System.out.println("Qual é o volume?: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("TV ligada?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada?: " + smartTv.ligada);

    }
}
