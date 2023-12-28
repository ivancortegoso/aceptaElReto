package volumen1;

import java.util.Scanner;

public class problema115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        while (num != 0) {
            if (num == 1) {
                System.out.println("SI");
            } else {
                long square = num * num;
                long n1 = square % 10;
                square /= 10;
                long i = 10;
                for (; n1 == 0 && square > 0; i *= 10) {
                    n1 = (square % 10) * i;
                    square /= 10;
                }
                for (; square + n1 != num && square > 0; i *= 10) {
                    n1 += (square % 10) * i;
                    square /= 10;
                }
                if (square > 0) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
            num = sc.nextInt();
        }
        sc.close();
    }
}
