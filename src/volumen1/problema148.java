package volumen1;

import java.util.Scanner;

public class problema148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        while (!line.equals("00:00")) {
            int res = 60;
            res -= Integer.valueOf(line.substring(3));
            int hours = 23;
            hours -= Integer.valueOf(line.substring(0, 2));
            res += hours * 60;
            System.out.println(res);
            line = sc.nextLine();
        }
        sc.close();
    }
}
