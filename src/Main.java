import Exerciocios.*;

import java.util.Arrays;
import java.util.List;

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

        //Comeca [M01S02] Ex 03 - Estrutura de Repetição
        System.out.println("3)");

        int[] extrato = { 100, -35, -15, -5, 55, -20 };

        System.out.printf("a)");
        Ex03EstruturaDeRepeticao.ImprimirElementos(extrato);

        System.out.printf("b)");
        Ex03EstruturaDeRepeticao.ImprimirElementosReverso(extrato);

        System.out.printf("c)");
        Ex03EstruturaDeRepeticao.SomaElementos(extrato);

        System.out.printf("d)");
        Ex03EstruturaDeRepeticao.CertidaoNegativaDeDebito(extrato);

        //[M01S02] Ex 04 - Estrutura de Repetição e Condicionais
        System.out.printf("4)");
        int nroSorte = 25;
        int sorteados[][] = {
                { 1, 44,  6,  2, 45, 60},
                {10, 21, 55, 25, 34, 44},
                { 8, 18, 28, 29, 55, 59},
                {60, 25, 11, 34,  6,  9},
                {55, 43, 25, 12,  7, 11}
        };

        Ex04EstruturaDeRepetiçãoECondicionais.RepeticoesEmArray2D(sorteados,nroSorte);

        //[M01S02] Ex 05 - Estrutura de Repetição e Condicionais
        System.out.println("5)");
        int[] a = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
        int[] b = {1};
        int[] c = {1, -1};
        int[] d = null;
        int[] e = {-2,-2,-2,-2};
        int[] f = {20,10, 30};
        System.out.printf("a)");
        Ex05EstruturaDeRepetiçãoECondicionais.Calcular(a);
        System.out.printf("b)");
        Ex05EstruturaDeRepetiçãoECondicionais.Calcular(b);
        System.out.printf("c)");
        Ex05EstruturaDeRepetiçãoECondicionais.Calcular(c);
        System.out.printf("d)");
        Ex05EstruturaDeRepetiçãoECondicionais.Calcular(d);
        System.out.printf("e)");
        Ex05EstruturaDeRepetiçãoECondicionais.Calcular(e);
        System.out.printf("f)");
        Ex05EstruturaDeRepetiçãoECondicionais.Calcular(f);

        //[M01S02] Ex 06 - Listas
        System.out.printf("6)");
        List<Integer> lista = Arrays.asList(1,2,3,4);

        List<Integer> lista3x = Ex06Listas.TriplicaLista(lista);

        //System.out.println(lista);
        System.out.println(lista3x);


        //[M01S02] Ex 07 - Listas
        System.out.println("7)");

        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

        System.out.printf("a)");
        Ex07Listas.ImprimeListaFor(nomes);
        System.out.printf("b)");
        Ex07Listas.ImprimeListaForEach(nomes);


        //[M01S02] Ex 08 - Listas
        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);
        System.out.printf("8) %d", Ex08Listas.PrimeiraOcorrenciaMaiorQue(numeros,50));

    }
}