package volumen7;

import java.util.Scanner;

public class problema716 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int regletas = sc.nextInt();
        while (regletas != 0) {
            int res = 0;
            for (int i = 0; i < regletas; i++) {
                res += sc.nextInt();
            }
            res -= regletas - 1;
            System.out.println(res);
            regletas = sc.nextInt();
        }
        sc.close();
    }
}
