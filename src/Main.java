import Exerciocios.Ex01AcesseElementosDeUmArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 56, 57, 58, 67, 99, 12, 11, 88 };

        Ex01AcesseElementosDeUmArray ex01 =  new Ex01AcesseElementosDeUmArray();

        System.out.printf("1)\na)");
        ex01.ImprimirElemento(0,arr);

        System.out.printf("b)");
        ex01.ImprimirUltimoElemento(arr);

        System.out.printf("c)");
        ex01.ImprimirElemento(2,arr);


    }
}