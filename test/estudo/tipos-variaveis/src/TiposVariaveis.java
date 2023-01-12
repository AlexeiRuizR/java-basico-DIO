public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinino = 2500.33;
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333;
        long cpf = 98765432109L;
        float pi = 3.14F;  
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        numero = 10;
        final double PI_EXATA = 3.14;
        System.out.println(numero + " " + PI_EXATA);
    }
}
