package volumen1;

import java.util.Scanner;

public class problema118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        while (n1 >= 0) {
            if ((n3 > n2 && n3 < n1) || (n3 < n2 && n3 > n1) || n3 == n2 && n3 == n1) {
                System.out.println(0);
            } else {
                if (n3 < n1 || n3 < n2) {
                    double rM = ((n3 + Math.max(n1, n2)) * 3 - 1) / 2;
                    int res = (int) rM;
                    if (res < 128) {
                        System.out.println("I");
                    } else {
                        System.out.println(res - 128);
                    }
                } else {
                    double rM = ((n3 + Math.min(n1, n2)) * 3) / 2 + 1;
                    int res = (int) rM;
                    if (res > 64) {
                        System.out.println("I");
                    } else {
                        System.out.println(res);
                    }
                }
            }
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            n3 = sc.nextInt();
        }
        sc.close();
    }
}
