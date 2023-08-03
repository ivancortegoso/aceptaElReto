package volumen5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class problema505 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int drones = sc.nextInt();
            int pilasA = sc.nextInt();
            int pilasB = sc.nextInt();
            Comparator<Integer> reverseComparator = new Comparator<Integer>() {
                @Override
                public int compare(Integer a, Integer b) {
                    return b.compareTo(a);
                }
            };
            Queue<Integer> pilasAQueue = new PriorityQueue<Integer>(pilasA, reverseComparator);

            Queue<Integer> pilasBQueue = new PriorityQueue<Integer>(pilasB, reverseComparator);

            for (int i = 0; i < pilasA; i++) {
                pilasAQueue.offer(sc.nextInt());
            }
            for (int i = 0; i < pilasB; i++) {
                pilasBQueue.offer(sc.nextInt());
            }
            while (!pilasAQueue.isEmpty() && !pilasBQueue.isEmpty()) {
                int res = 0;
                List<Integer> pilasAUsadas = new ArrayList<>();
                List<Integer> pilasBUsadas = new ArrayList<>();
                int i = 0;
                for (i = 0; !pilasAQueue.isEmpty() && !pilasBQueue.isEmpty() && i < drones; i++) {
                    int pilaA = pilasAQueue.poll();
                    int pilaB = pilasBQueue.poll();
                    if (pilaA < pilaB) {
                        res += pilaA;
                        pilasBUsadas.add(pilaB - pilaA);
                    } else if (pilaB < pilaA) {
                        res += pilaB;
                        pilasAUsadas.add(pilaA - pilaB);
                    } else {
                        res += pilaA;
                    }
                }
                for(Integer pila : pilasAUsadas) {
                    pilasAQueue.offer(pila);
                }
                for(Integer pila : pilasBUsadas) {
                    pilasBQueue.offer(pila);
                }
                System.out.print(res + (pilasAQueue.isEmpty() || pilasBQueue.isEmpty() ? "" : " "));
            }
            System.out.println("");
        }
        sc.close();
    }
}