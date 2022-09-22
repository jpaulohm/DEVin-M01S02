import Exerciocios.Ex01AcesseElementosDeUmArray;
import Exerciocios.Ex02AcesseElementosDeUmArrayMultidimensional;

public class Main {
    public static void main(String[] args) {
        //Começa exercicio [M01S02] Ex 01 - Acesse elementos de um Array
        System.out.println("1)");
        int[] arr = { 56, 57, 58, 67, 99, 12, 11, 88 };

        System.out.printf("a)");
        Ex01AcesseElementosDeUmArray.ImprimirElementoArray(0,arr);

        System.out.printf("b)");
        Ex01AcesseElementosDeUmArray.ImprimirUltimoElementoArray(arr);

        System.out.printf("c)");
        Ex01AcesseElementosDeUmArray.ImprimirElementoArray(2,arr);

        //Começa exerciocio [M01S02] Ex 02 - Acesse elementos de um Array (multidimensional)
        System.out.println("2)");
        double[][] notas = {
                {10, 8.5, 5.5, 9.5},
                {8.5, 7, 7.5, 6},
                {8, 9, 10, 7.5},
                {9, 9.5, 10, 8}
        };

        System.out.printf("a)");
        Ex02AcesseElementosDeUmArrayMultidimensional.ImprimirElementoArray2D(2,0,notas);
        System.out.printf("b)");
        Ex02AcesseElementosDeUmArrayMultidimensional.ImprimirElementoArray2D(3,1,notas);
        System.out.printf("c)");
        Ex02AcesseElementosDeUmArrayMultidimensional.SomaP1(notas);

    }
}