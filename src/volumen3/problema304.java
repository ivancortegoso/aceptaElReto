package volumen3;

import java.util.Scanner;

public class problema304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int dividendo = sc.nextInt();
            int divisor = sc.nextInt();
            if (divisor == 0) {
                System.out.println("DIV0");
            } else if (dividendo >= 0 || dividendo % divisor == 0) {
                System.out.println(dividendo / divisor + " " + dividendo % divisor);
            } else if (divisor > 0) {
                int resultado = dividendo / divisor - 1;
                int resto = dividendo % divisor + divisor;
                System.out.println(resultado + " " + resto);
            } else {
                int resultado = dividendo / divisor + 1;
                int resto = dividendo % divisor - divisor;
                System.out.println(resultado + " " + resto);
            }
        }
        sc.close();
    }
}
