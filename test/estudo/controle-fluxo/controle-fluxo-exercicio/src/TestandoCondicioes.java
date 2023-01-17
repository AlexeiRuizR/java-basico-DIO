public class TestandoCondicioes {
    public static void main(String[] args) throws Exception {
        
        ifFlecha();
       // ifSemFlecha();
        ifFerias();
        ifMenor();

        switchNumero();

                    
        }
    private static void switchNumero() {
        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
            System.out.println("Certo");
            break;
            case 4:
            System.out.println("Errado");                
            break;
            case 5:
            System.out.println("Tal vez");
            default:
            System.out.println("Valor Indefinido");
                break;
        }
    }
    private static void ifMenor() {
        double salarioMensual = 11893.58;
        double mediaSalario = 10500;

        int quantidadeDependente = 4;
        int mediaDependentes = 2;

        if((salarioMensual < mediaSalario) && (quantidadeDependente >= mediaDependentes)){
            System.out.println("Funcionario deve receber auxilio.");
        }

        boolean salarioMenor = (salarioMensual < mediaSalario);
        boolean quantidadeReal = (quantidadeDependente >= mediaDependentes);
        if (salarioMenor && quantidadeReal){
            System.out.println("funcionario deve receber auxilio.");
        } else { System.out.println("funcionario nao deve receber auxilio.");}
    }
    private static void ifFerias() {
        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro"){
            System.out.println("Ferias");
        }
    }
    private static void ifFlecha() {
        int mes = 9;
            if(mes == 1) {
        System.out.println("Janeiro");
    } else if (mes == 2){
        System.out.println("Fevereiro");
    } else if (mes == 3){
        System.out.println("Março");
    } else if (mes == 4){
        System.out.println("Avril");
    } else if (mes == 5){
        System.out.println("Maio");
    } else if (mes == 6){
        System.out.println("Junho");
    } else if (mes == 7){
        System.out.println("Julho");
    } else if (mes == 8){
        System.out.println("Agosto");
    } else if (mes == 9){
        System.out.println("Setembro");
    } else if (mes == 10){
        System.out.println("Outobro");
    } else if (mes == 11){
        System.out.println("Novembro");
    } else if (mes == 12){
        System.out.println("Dezembro");
    } else {
        System.out.println("Entre um numero do 1 ao 12");
    }
}
}
