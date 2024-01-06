package volumen7;

import java.util.Scanner;

public class problema721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (; i > 0; i--) {
            int n = sc.nextInt();
            int res = 1;
            int sum = 1;
            int f = 1;
            while (n > sum) {
                ++res;
                f += res;
                sum += f;
            }
            if (n != sum) --res;
            System.out.println(res);
        }
        sc.close();
    }
}
