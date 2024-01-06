package volumen1;

import java.util.Scanner;

public class problema122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        while (km != -1) {
            int etapa = 0;
            int etapaAcc = 0;
            int kmA = km;
            int acc = 0;
            int maxAcc = 0;
            int maxKm = -1;

            while (km != -1) {
                km = sc.nextInt();
                etapa++;
                if (kmA == km) {
                    acc++;
                    if (maxAcc < acc) {
                        maxAcc = acc;
                        maxKm = etapaAcc;
                    }
                } else {
                    kmA = km;
                    etapaAcc = etapa;
                    acc = 0;
                }
            }

            if (maxKm == -1) {
                System.out.println("HOY NO COMEN");
            } else {
                System.out.println(maxKm + " " + maxAcc);
            }
            km = sc.nextInt();
        }
        sc.close();
    }
}
