package volumen2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class problema244pau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int queens = sc.nextInt();
        while (size != 0 || queens != 0) {
            Set<Integer> setX = new HashSet<>();
            Set<Integer> setY = new HashSet<>();
            Set<Integer> setDiagDesc = new HashSet<>();
            Set<Integer> setDiagAsc = new HashSet<>();
            int i = 0;
            for (; i < queens; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (!setX.add(x)) break;
                if (!setY.add(y)) break;
                if (!setDiagDesc.add(y - x)) break;
                if (!setDiagAsc.add(y - (size - x + 1))) break;
            }
            if (i < queens) {
                sc.nextLine();
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            size = sc.nextInt();
            queens = sc.nextInt();
        }
        sc.close();
    }

}
