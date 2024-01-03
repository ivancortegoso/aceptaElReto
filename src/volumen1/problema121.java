package volumen1;

import java.util.Scanner;

public class problema121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long envoltoriosPremio = sc.nextInt();
        long chiclesPremio = sc.nextInt();
        long chicles = sc.nextInt();
        while (envoltoriosPremio != 0) {
            if (envoltoriosPremio <= chiclesPremio && chicles >= envoltoriosPremio) {
                System.out.println("RUINA");
            } else {
                long chiclesConsumidos = 0;
                long envoltoriosRestantes = 0;
                if (chiclesPremio == 0) {
                    chiclesConsumidos = chicles;
                    envoltoriosRestantes = chicles;
                    chicles = 0;
                }
                while (chicles > 0) {
                    chiclesConsumidos += chicles;
                    envoltoriosRestantes += chicles;
                    chicles = envoltoriosRestantes / envoltoriosPremio * chiclesPremio;
                    envoltoriosRestantes = envoltoriosRestantes % envoltoriosPremio;
                }
                System.out.println(chiclesConsumidos + " " + envoltoriosRestantes);
            }

            envoltoriosPremio = sc.nextInt();
            chiclesPremio = sc.nextInt();
            chicles = sc.nextInt();
        }
        sc.close();
    }
}
