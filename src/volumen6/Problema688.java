package volumen6;

import java.util.Scanner;

public class Problema688 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int c = sc.nextInt();
			int m = sc.nextInt();
			int n = sc.nextInt();
			int alturaActual = sc.nextInt();
			int alturaSiguiente = sc.nextInt();
			int pSiguiente = Math.abs(alturaSiguiente - alturaActual);
			int pActual = pSiguiente;
			int pMax = pActual;
			int pMin = pActual;
			alturaActual = alturaSiguiente;
			int i = 1;
			for (; i < n; i++) {
				alturaSiguiente = sc.nextInt();
				pSiguiente = Math.abs(alturaSiguiente - alturaActual);

				if (pSiguiente > pMax) {
					pMax = pSiguiente;
				}
				if (pSiguiente < pMin) {
					pMin = pSiguiente;
				}

				if (Math.max(pSiguiente, pActual) - Math.min(pSiguiente, pActual) > c) {
					System.out.println("Tropiezo");
					sc.nextLine();
					break;
				} else if (pSiguiente - pMin > m) {
					System.out.println("Tropiezo");
					sc.nextLine();
					break;
				} else if(pMax - pSiguiente > m) {
					System.out.println("Tropiezo");
					sc.nextLine();
					break;
				}

				pActual = pSiguiente;
				alturaActual = alturaSiguiente;
			}
			if (i == n)
				System.out.println("Ok");
		}
		sc.close();
	}
}
