package volumen1;

import java.util.Scanner;

public class problema117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < r; i++) {
            String name = sc.nextLine().split(" ")[1];
            System.out.println("Hola, " + name + ".");
        }
        sc.close();
    }
}
