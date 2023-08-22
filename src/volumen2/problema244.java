package volumen2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problema244 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int queens = sc.nextInt();
        while (size != 0 || queens != 0) {
            Set<Integer> setX = new HashSet<>();
            Set<Integer> setY = new HashSet<>();
            Set<String> setDiag = new HashSet<>();
            int i = 0;
            for (; i < queens; i++) {
                int x = sc.nextInt();
                if (!setX.add(x)) break;
                int y = sc.nextInt();
                if (!setY.add(y)) break;
                if (!addDiag(size, x, y, setDiag)) break;
            }
            if (i < queens) {
                System.out.println("SI");
                sc.nextLine();
            } else {
                System.out.println("NO");
            }
            size = sc.nextInt();
            queens = sc.nextInt();
        }
        sc.close();
    }

    public static boolean addDiag(int n, int x, int y, Set<String> setDiag) {
        String add = "(" + Math.max(1, x - y + 1) + "," + Math.max(1, y - x + 1) + ") ";
        add += "(" + Math.min(n, x + (n - y)) + "," + Math.min(n, y + (n - x)) + ")";
        boolean res = setDiag.add(add);
        add = "(" + Math.max(1, x - (n - y)) + "," + Math.min(n, y + x - 1) + ") ";
        add += "(" + Math.min(n, x + y - 1) + "," + Math.max(1, y - (n - x)) + ")";
        res &= setDiag.add(add);
        return res;
    }

}
