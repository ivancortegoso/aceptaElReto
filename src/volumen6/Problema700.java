package volumen6;

import java.util.*;

public class Problema700 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int series = sc.nextInt();
        while (series != 0) {
            Map<String, Integer> seriesMap = new HashMap<>();
            for (int i = 0; i < series; i++) {
                int value = sc.nextInt();
                String serie = sc.nextLine().substring(1);
                if (seriesMap.containsKey(serie)) {
                    seriesMap.put(serie, value + seriesMap.get(serie));
                } else {
                    seriesMap.put(serie, value);
                }
            }
            // Convertimos las entradas del Map a una lista
            List<Map.Entry<String, Integer>> entriesList = new ArrayList<>(seriesMap.entrySet());

            // Ordenamos la lista utilizando un comparador personalizado para ordenar por valor en orden descendente
            Collections.sort(entriesList, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                    int valueComparison = entry2.getValue().compareTo(entry1.getValue());
                    if (valueComparison == 0) {
                        return entry2.getKey().toLowerCase().compareTo(entry1.getKey().toLowerCase());
                    }
                    return valueComparison;
                }
            });

            // Iteramos sobre la lista ordenada e imprimimos las entradas
            for (Map.Entry<String, Integer> entry : entriesList) {
                if (entry.getValue() < 30) break;
                System.out.println(entry.getKey());
            }
            System.out.println("---");
            series = sc.nextInt();
        }
        sc.close();
    }
}

