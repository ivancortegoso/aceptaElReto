package volumen6;

import java.util.Scanner;

public class Problema695 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        while(!n.equals("0")) {
            int[] result = arrayResult(n);
            System.out.format("%d - %d = %d = %d x 9\n", result[1], result[0], result[1] - result[0],(result[1] - result[0]) / 9);
            n = sc.nextLine();
        }
        sc.close();
    }
    private static int[] arrayResult(String n) {
        int[] aux = new int[n.length()];
        int[] res = new int[2];
        aux[0] = n.charAt(0) - 48;
        for (int i = 1; i < n.length(); i++) {
            int digit = n.charAt(i) - 48;
            mergedInsertion(aux, digit, i);
        }
        int menor = 0;
        int mayor = 0;
        int mult = 1;
        for (int i = 0; i < aux.length; i++) {
            menor += aux[i] * mult;
            mayor += aux[aux.length - i - 1] * mult;
            mult *= 10;
        }
        return new int[] {menor, mayor};
    }

    private static void mergedInsertion(int[] array, int n, int j) {
        mergedInsertion(array, n, 0, j);
    }
    private static void mergedInsertion(int[] array, int n, int i, int j) {
        if(i >= j) {
            if (n > array[i]) {
                insertion(array, n, i);
            } else {
                insertion(array, n, i + 1);
            }
        } else {
            int mitad = (i + j) / 2;
            if(array[mitad] > n) {
                mergedInsertion(array, n, mitad + 1, j);
            } else if (array[mitad] < n) {
                mergedInsertion(array, n, i, mitad - 1);
            } else {
                insertion(array, n, mitad);
            }
        }
    }

    private static void insertion(int[] array, int n, int pos) {
        for(; pos < array.length; pos++) {
            int aux = array[pos];
            array[pos] = n;
            n = aux;
        }
    }
}
