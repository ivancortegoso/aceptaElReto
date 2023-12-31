package volumen1;

import java.util.Scanner;

public class problema120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        while (n != 0) {
            int v = n / 2;
            int f = v * n + c;
            int res = (f + f + n) / 2 * n;
            System.out.println(res);
            n = sc.nextInt();
            c = sc.nextInt();
        }
        sc.close();
    }
}
