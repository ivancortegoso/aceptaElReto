package volumen1;

import java.util.Scanner;

public class problema114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (; i > 0; i--) {
            int f = sc.nextInt();
            switch (f) {
                case 0:
                    System.out.println(1);
                    break;
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(2);
                    break;
                case 3:
                    System.out.println(6);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                default:
                    System.out.println(0);
            }
        }
        sc.close();
    }
}
