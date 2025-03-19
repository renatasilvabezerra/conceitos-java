//Aqui foi importado todo o pacote java.util (Map, HashMap, Set, HashSet, List, ArrayList, etc).
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Criando o dicionário: um map chamado x que associa chaves do tipo String a valores do tipo Integer.
        Map<String, Integer> x = new HashMap<>();  //HashMap implementa map e armazena os pares (chave, valor) e não permite chaves duplicadas (no caso as letras não estão duplicadas).
        x.put("f", 1);
        x.put("g", 2);
        x.put("h", 1);
        x.put("i", 2);
        x.put("j", 3);

        // Obtendo os valores do dicionário (HashSet<Integer> armazena esses valores). 
        // O HashSet é uma estrutura que não permite elementos duplicados então ele automaticamente remove os valores repetidos.
        Set<Integer> valoresUnicos = new HashSet<>(x.values());

        // Convertendo para uma lista e ordenando
        // Peguei o ArrayList<Integer> a partir do conjunto (valoresUnicos).
        List<Integer> listaOrdenada = new ArrayList<>(valoresUnicos);
        Collections.sort(listaOrdenada); //ordena a lista em ordem crescente.

        System.out.println(listaOrdenada);
    }
}

// o x.values era [1, 2, 1, 2, 3]
// Quando eu criei valoresUnicos ele deu o retorno {1, 2, 3}
// O resto foi só pra transformar em array e ordenar.
