package Exerciocios;

public class Ex09EstruturaDeRepeticao {
    public static void Pin(int divPor, int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] % divPor == 0){
             System.out.printf(" PIN");
         } else {
             System.out.printf(" %d",vetor[i]);
         }
            System.out.printf("\n");
        }
    }

}
