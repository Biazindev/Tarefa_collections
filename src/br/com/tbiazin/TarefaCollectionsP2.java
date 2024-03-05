    package br.com.tbiazin;

    import java.util.*;

    public class TarefaCollectionsP2 {
        public static void main(String[] args) {
            
            Map<Integer, String> pessoas = new HashMap<>();
            
            
            pessoas.put(1, "Jessica,Feminino");
            pessoas.put(2, "Mauro,Masculino");
            pessoas.put(3, "Rodrigo,Masculino");
            pessoas.put(4, "Paloma,Feminino");
            pessoas.put(5, "Tiago,Masculino");
            pessoas.put(6, "Nayara,Feminino");
            
            
            Map<String, List<String>> nomesPorGenero = new HashMap<>();
            for (String pessoa : pessoas.values()) {
                String[] partes = pessoa.split(",");
                String nome = partes[0];
                String genero = partes[1];
                if (!nomesPorGenero.containsKey(genero)) {
                    nomesPorGenero.put(genero, new ArrayList<>());
                }
                nomesPorGenero.get(genero).add(nome);
            }
            
            
            for (String genero : nomesPorGenero.keySet()) {
                List<String> nomesOrdenados = nomesPorGenero.get(genero);
                Collections.sort(nomesOrdenados);
                
                
                System.out.println("Nomes " + genero + " em ordem alfabética:");
                for (int i = 0; i < nomesOrdenados.size(); i++) {
                    System.out.print(nomesOrdenados.get(i));
                    if (i < nomesOrdenados.size() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }
