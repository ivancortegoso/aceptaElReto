package volumen3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problema397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> mapResults = new HashMap<>();
        mapResults.put(0, 0);
        mapResults.put(1, 0);
        mapResults.put(2, 1);
        mapResults.put(3, 1);
        mapResults.put(4, 0);
        mapResults.put(5, 1);
        mapResults.put(6, 1);
        mapResults.put(7, 0);
        mapResults.put(8, 1);
        mapResults.put(9, 1);
        int i = sc.nextInt();
        for (; i > 0; i--){
            int n = sc.nextInt();
            System.out.println(mapResults.get(sumDigits(n)) == 1 ? "SI" : "NO");
        }
        sc.close();
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        if (sum / 10 != 0) {
            sum = sumDigits(sum);
        }
        return sum;
    }

}
