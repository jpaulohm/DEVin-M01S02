package Exerciocios;

public class Ex02AcesseElementosDeUmArrayMultidimensional {
    public static double ImprimirElementoArray2D(int nArray, int elemento, double[][] conjunto){
        System.out.println(conjunto[nArray][elemento]);
        return conjunto[nArray][elemento];
    }
    public static double SomaP1(double[][] conjunto){
        double soma = 0;
        for (int i = 0 ; i < conjunto.length ; i++){
            soma += conjunto[i][0];
        }
        System.out.println(soma);
        return soma;
    }

}
