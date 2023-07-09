package volumen6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problema698 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nSquares = sc.nextInt();
        for (int i = 0; i < nSquares; i++) {
            int length = sc.nextInt();
            long sum = 0;
            Set<Long> squareSet = new HashSet<>();
            for (int j = 0; j < length; j++) {
                for(int k = 0; k < length; k++) {
                    long number = sc.nextInt();
                    sum += number;
                    squareSet.add(number);
                }
            }
            String res = length == 1 || sum % 2 == 0 && squareSet.contains(sum / 2) ? "SI": "NO";
            System.out.println(res);
        }
        sc.close();
    }
}
