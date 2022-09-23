package Exerciocios;

import java.util.List;

public class Ex08Listas {
    public static Integer PrimeiraOcorrenciaMaiorQue(List<Integer> lista, Integer num){
        for (int i = 0; i < lista.size(); i++) {
            if (num < lista.get(i)) {
                return lista.get(i);
            }
        }
        return null;
    }
}
