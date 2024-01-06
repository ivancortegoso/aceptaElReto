package volumen7;

import java.util.HashSet;
import java.util.Scanner;

public class problema718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            HashSet<Integer> set = new HashSet<>();
            int res = 0;
            for (int i = 0; i < n; i++) {
                int p = sc.nextInt();
                if (!set.add(p)) {
                    set.remove(p);
                    res++;
                }
            }
            System.out.println(res);
            n = sc.nextInt();
        }
        sc.close();
    }
}
