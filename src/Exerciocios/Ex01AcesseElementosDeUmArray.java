package Exerciocios;

public class Ex01AcesseElementosDeUmArray {
    public int ImprimirElemento(int posicao, int[] conjunto){
        System.out.println(conjunto[posicao]);
        return conjunto[posicao];
    }
    public int ImprimirUltimoElemento(int[] conjunto){
        System.out.println(conjunto[conjunto.length-1]);
        return conjunto[conjunto.length-1];
    }
}
