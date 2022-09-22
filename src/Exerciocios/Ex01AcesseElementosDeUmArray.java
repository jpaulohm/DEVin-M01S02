package Exerciocios;

public class Ex01AcesseElementosDeUmArray {
    public static int ImprimirElementoArray(int posicao, int[] conjunto){
        System.out.println(conjunto[posicao]);
        return conjunto[posicao];
    }
    public static int ImprimirUltimoElementoArray(int[] conjunto){
        System.out.println(conjunto[conjunto.length-1]);
        return conjunto[conjunto.length-1];
    }
}
