package volumen7;

import java.util.Scanner;

public class problema720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            long l = sc.nextLong();
            long ordenados = 1;
            long a = sc.nextLong();
            for (long i = 1; i < l; i++) {
                long b = sc.nextLong();
                if (a <= b) {
                    ordenados++;
                } else {
                    ordenados = 1;
                }
                a = b;
            }
            while (l > ordenados) l /= 2;
            System.out.println(l);
        }
        sc.close();
    }
}
