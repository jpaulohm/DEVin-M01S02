package Exerciocios;

public class Ex04EstruturaDeRepetiçãoECondicionais {
    public static int RepeticoesEmArray2D(int[][] array2D , int nro){
        int soma = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[0].length; j++) {
                if (array2D[i][j]==nro){
                    soma++;
                }
            }
        }
        System.out.printf("Repetiu o numero da sorte %d vezes.\n",soma);
        return soma;
    }
}
