package volumen3;

import java.util.Scanner;

public class problema395 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int groups = 0;
            sc.nextLine();
            String[] stringMatrix = new String[x];
            for (int i = 0; i < x; i++) {
                stringMatrix[i] = sc.nextLine();
            }
            char[][] matrix = new char[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    matrix[i][j] = stringMatrix[i].charAt(j);
                }
            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    char c = matrix[i][j];
                    if (c != ' ') {
                        int right = 0;
                        for (int h = j + 1; h < y && c == matrix[i][h]; h++) {
                            ++right;
                            matrix[i][h] = ' ';
                        }
                        boolean wentDown = true;
                        for (int h = i + 1; wentDown && h < x; h++) {
                            int g = j;
                            while (g <= j + right && c == matrix[h][g]) {
                                g++;
                            }
                            if (g <= j + right) {
                                wentDown = false;
                            }
                            for (g = j; wentDown && g <= j + right; g++) {
                                matrix[h][g] = ' ';
                            }
                        }
                        ++groups;
                    }
                }
            }
            System.out.println(groups - 1);
        }
        sc.close();
    }
}
