public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro();

        carro.setCor("Azul");
        carro.setModelo("BMW serie 3");
        carro.setCapacidade(59);

        System.out.println("Color: "+carro.getCor());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Capacidad del tanque: "+carro.getCapacidade());
        System.out.println("Valor total de llenar el tanque: "+carro.valorTotal(6));

        Carro carro1 = new Carro("Cinza", "Mercedes-Benz Classe C", 66);

        System.out.println("Color del segundo carro: "+carro1.cor);
        System.out.println("Modelo del segundo carro: "+carro1.modelo);
        System.out.println("Capacidad del tanque del segundo carro: "+carro1.capacidadeTanque);
        System.out.println("Valor total de llenar el tanque de carro1: "+carro1.valorTotal(6.46));

    }
}
