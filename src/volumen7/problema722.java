package volumen7;

import java.util.Scanner;

public class problema722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        while (a != 0) {
            if (c == d) {
                if (a == b && a % c == 0) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            } else {
                long y = (b * c - a * d) / (c * c - d * d);
                long x = (a - y * d) / c;
                if (y + x > 0 && y >= 0 && x >= 0 && a == x * c + y * d && b == y * c + x * d) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            d = sc.nextLong();
        }
        sc.close();
    }
}
