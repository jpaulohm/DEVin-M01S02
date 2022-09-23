package Exerciocios;

public class Ex05EstruturaDeRepetiçãoECondicionais {
    public static int Calcular(int[] vetor){
        int soma = 0;
        if (vetor != null) {
            for (int i = 0; i < vetor.length; i++) {
                soma+=vetor[i];
            }
            System.out.println(soma);
            return soma;
        }else {
            System.out.println("Não é possível calcular");
            return 0;
        }
    }
}
