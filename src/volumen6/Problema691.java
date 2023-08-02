package volumen6;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Problema691 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int filas = sc.nextInt();
            int asientos = sc.nextInt();
            int clientes = sc.nextInt();
            sc.nextLine();
            long res = 0;
            Queue<Integer> priorityQueue = new PriorityQueue<>();
            for (int i = 0; i < filas; i++) {
                priorityQueue.offer(sc.nextInt());
            }
            for(int i = 0; i < clientes; i++) {
                int head = priorityQueue.poll();
                if (head < asientos) {
                    res += asientos - head;
                    ++head;
                    priorityQueue.offer(head);
                } else {
                    break;
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
