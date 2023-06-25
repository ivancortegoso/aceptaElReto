package volumen6;

import java.util.Scanner;

public class Problema697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        while(size > 0) {
            int[][] array = new int[size][size];
            for (int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    array[i][j] = sc.nextInt();
                }
            }
            int i = size / 2;
            int j = size / 2;
            int varI = -1;
            int varJ = 1;
            int iter = 1;
            int res = array[i][j];
            while (j <= size - 1 && j >= 0 && i <= size - 1 && i >= 0) {
                int k;
                if(iter % 2 == 0) {

                    for(k = 1; k <= iter && j <= size - 1 && j >= 0; k++) {
                        j += 1 * varJ;
                        if(j > size - 1 || j < 0) break;
                        res += array[i][j];
                    }
                    if(j == size - 1 && k < iter + 1) break;
                    varJ *= -1;
                } else {
                    for(k = 1; k <= iter && i <= size - 1 && i >= 0; k++) {
                        i += 1 * varI;
                        if(i > size - 1 || i < 0) break;
                        res += array[i][j];
                    }
                    if (i == size - 1 && k < iter + 1) break;
                    varI *= -1;
                }
                iter++;
            }
            System.out.println(res);
            size = sc.nextInt();
        }
        sc.close();
    }
}