package volumen7;

import java.util.Scanner;

public class problema717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] linea = sc.nextLine().split(" ");
            boolean d = true;
            for (int j = 0; j < 3 && d; j++) {
                for (int k = 0; k < 3 && d; k++) {
                    if (k != j) {
                        for (int l = 0; l < 3 && d; l++) {
                            if (l != j && l != k) {
                                if ((linea[j] + linea[k].charAt(0)).equals((linea[k].charAt(1) + linea[l]))) {
                                    d = false;
                                }
                            }
                        }
                    }
                }
            }
            if (d) {
                System.out.println("INSULSOS");
            } else {
                System.out.println("DIVERTIDOS");
            }
        }
        sc.close();
    }
}
