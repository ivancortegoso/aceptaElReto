package volumen7;

import java.util.Scanner;

public class problema719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        int[] meses = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int cuatroA = 1461;
        int res = 0;
        while (dias != 0) {
            if (dias % 1461 == 1460) dias = -1;
            dias %= cuatroA;
            if (dias % 365 == 1 && dias / 365 >= 1) dias = 0;
            boolean bisiestoA = dias > 365;
            boolean ultimoA = dias > 1095;
            dias %= 365;
            res = dias;
            boolean bisiesto = bisiestoA;
            if (ultimoA) {
                for (int i = 0; i < 12 && dias > 28; i++) {
                    int j = 0;
                    for (; j < 12 && dias > 28; j++) {
                        dias -= meses[(i + j) % 12];
                        if ((i + j) % 12 == 1) --dias;
                    }
                    if (dias > 1 || dias < 0) {
                        dias = res;
                    }
                }
            } else {
                for (int i = 0; i < 12 && dias > 27; i++) {
                    int j = 0;
                    if (!bisiestoA && i != 1) {
                        bisiesto = false;
                    }
                    for (; j < 12 && dias > 27; j++) {
                        dias -= meses[(i + j) % 12];
                        if ((i + j) % 12 == 1) {
                            bisiesto = true;
                        }
                    }
                    if (dias > 1 || dias < 0 || (!bisiesto && dias == 1)) {
                        dias = res;
                    }
                }
            }
            if ((bisiesto && dias == 1) || dias == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
            dias = sc.nextInt();
        }
        sc.close();
    }
}