public class Operadores_relacionais {
    
    public static void main(String[] args) {
            String nomeUm = "Gabriel";
            String nomeDois = "Gabriel";

            System.out.println(nomeUm == nomeDois);


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nosssa condição é verdadeira");
        } else {
            System.out.println("a nossa condição é falsa");
        }


        System.out.println("numeroUm é igual a numeroDois? " + simNao);


        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);


        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
        
    }
}
