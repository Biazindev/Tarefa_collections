    package br.com.tbiazin;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    public class TarefaCollections {

        public static void main(String[] args) {
            
            Map<Integer, String> nomes = new HashMap<>();
            
            
            nomes.put(1, "Maria José");
            nomes.put(2, "Roberto Berto");
            nomes.put(3, "Flavio Rio");
            nomes.put(4, "Carlos Barriga");
            
            
            List<String> nomesOrdenados = new ArrayList<>(nomes.values());
            Collections.sort(nomesOrdenados);
            
        
            System.out.println("Nomes em ordem alfabética:");
            for (int i = 0; i < nomesOrdenados.size(); i++) {
                System.out.print(nomesOrdenados.get(i));
                if (i < nomesOrdenados.size() - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
