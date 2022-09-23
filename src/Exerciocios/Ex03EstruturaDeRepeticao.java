package Exerciocios;

public class Ex03EstruturaDeRepeticao {
    public static void ImprimirElementos(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            if (i == 0) {
                System.out.printf("%d",vetor[i]);
            }else {
                System.out.printf(", %d",vetor[i]);
            }
        }
        System.out.println("");
    }

    public static void ImprimirElementosReverso(int[] vetor){
        for (int i = vetor.length-1; i >=0 ; i--) {
            if (i == vetor.length-1) {
                System.out.printf("%d",vetor[i]);
            }else {
                System.out.printf(", %d",vetor[i]);
            }
        }
        System.out.println("");
    }

    public static int SomaElementos(int[] vetor){
        int saldo = 0;
        for (int i = 0; i < vetor.length; i++) {
            saldo += vetor[i];
        }
        System.out.println(saldo);
        return saldo;
    }

    public static int CertidaoNegativaDeDebito(int[] vetor){
        int saldo = 0;
        for (int i = 0; i < vetor.length; i++) {
            saldo += vetor[i];
        }
        if (saldo<0){
            System.out.println("Saldo Negativo");
        } else if (saldo > 0) {
            System.out.println("Saldo Positivo");
        }else {
            System.out.println("Saldo = 0");
        }
        return saldo;

    }

}
