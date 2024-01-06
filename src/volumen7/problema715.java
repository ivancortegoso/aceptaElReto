package volumen7;

import java.util.Scanner;

public class problema715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int uvas = sc.nextInt();
            int personas = sc.nextInt();
            if (uvas / personas < 12) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
        }
        sc.close();
    }
}
