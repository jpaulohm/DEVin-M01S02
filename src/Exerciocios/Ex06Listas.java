package Exerciocios;

import java.util.ArrayList;
import java.util.List;

public class Ex06Listas {
    public static List<Integer> TriplicaLista(List<Integer> lista){
        List<Integer> listaValoresTriplicados = new ArrayList<Integer>();
        for (int i = 0; i < lista.size(); i++) {
            listaValoresTriplicados.add(3*lista.get(i));
        }
        //System.out.println(listaValoresTriplicados);
        return listaValoresTriplicados;
    }
}
