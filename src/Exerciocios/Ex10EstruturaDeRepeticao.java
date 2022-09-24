package Exerciocios;

public class Ex10EstruturaDeRepeticao {
    public static boolean EhPalindromo(String palavra){
        int resto = palavra.length()%2;

        for (int i = 0 ; i < palavra.length()/2 + resto ; i++) {
            //System.out.println(palavra.charAt(i) + palavra.charAt(palavra.length() - i - 1));
            if (palavra.charAt(i) != palavra.charAt(palavra.length()-i-1)){
                System.out.println(palavra + " não e palindroma");
                return false;
            }
        }
        System.out.println(palavra + " é palindroma");
        return true;
    }
}

