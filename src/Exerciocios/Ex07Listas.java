package Exerciocios;

import java.util.List;

public class Ex07Listas {
    public static void ImprimeListaFor(List<String> lista){
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%s ",lista.get(i));

        }
        System.out.printf("\n");
        return;
    }
    public static void ImprimeListaForEach(List<String> lista){
        for (String temp:lista){
            System.out.printf("%s ", temp);

        }
        System.out.printf("\n");
        return;
    }

}
