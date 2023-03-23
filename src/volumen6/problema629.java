package volumen6;

import java.util.Scanner;

public class problema629 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int casas = sc.nextInt();
		while (casas != 0) {
			int[] mapita = new int[casas];
			int res = 0;
			for (int i = 0; i < casas; i++) {
				int valorActual = sc.nextInt();
				if (valorActual > 0) {
					mapita[Math.max(0, i-valorActual)] = i;
				}
			}
			
			int indiceMenor = 0;
			int indiceMayor = mapita[0];
			
			for(int i = 0; i < casas; i++) {
				if(indiceMayor <= i) {
					res += indiceMayor - indiceMenor;
					indiceMenor = i;
					indiceMayor = i;
				}
				if(mapita[i] > indiceMayor) {
					indiceMayor = mapita[i];
				}
			}
			System.out.println(res);
			casas = sc.nextInt();
		}
		sc.close();
	}
}