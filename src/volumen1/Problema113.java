package volumen1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problema113 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vMin = 0.1;
		int nSemaforos = sc.nextInt();
		double vMax = sc.nextInt();
		while (nSemaforos != 0 || vMax != 0) {
			String res = "IMPOSIBLE";
			double distanciaCalle = 0;
			if(vMax < 0.1 || nSemaforos == 0) {
				System.out.println(res);
				nSemaforos = sc.nextInt();
				vMax = sc.nextInt();
				continue;
			}
			List<Problema113> listaSemaforos = new ArrayList<>();
			for (int i = 0; i < nSemaforos; i++) {
				double distancia = sc.nextInt();
				distanciaCalle += distancia;
				listaSemaforos.add(new Problema113(distanciaCalle, sc.nextDouble(), sc.nextDouble()));
			}
			double tiempoFinal = listaSemaforos.get(nSemaforos - 1).tCerrado;
			double tfA = listaSemaforos.get(nSemaforos - 1).tAbierto;
			double tfC = listaSemaforos.get(nSemaforos - 1).tCerrado;

			double vFinal = distanciaCalle / tiempoFinal;
			boolean estaAbierto = true;
			while (vFinal > vMax) {
				if (estaAbierto) {
					tiempoFinal += tfA;
					estaAbierto = false;
				} else {
					tiempoFinal += tfC;
					estaAbierto = true;
				}
				vFinal = distanciaCalle / tiempoFinal;
			}
			if (vFinal >= vMin) {
				do {
					int i;
					for (i = 0; i < nSemaforos - 1; i++) {
						Problema113 semaforoI = listaSemaforos.get(i);
						double tSemaforo = semaforoI.distancia / vFinal;
						double modulo = tSemaforo % (semaforoI.tAbierto + semaforoI.tCerrado);
						if (modulo < semaforoI.tCerrado && modulo > 0.01) {
							break;
						}
					}
					if(i == nSemaforos - 1) {
						res = Integer.toString((int)(distanciaCalle / vFinal));
						break;
					} else {
						if (estaAbierto) {
							tiempoFinal += tfA;
							estaAbierto = false;
						} else {
							tiempoFinal += tfC;
							estaAbierto = true;
						}
						vFinal = distanciaCalle / tiempoFinal;
					}
				} while (vFinal >= vMin);
			}
			System.out.println(res);
			nSemaforos = sc.nextInt();
			vMax = sc.nextInt();
		}
		sc.close();
	}

	double distancia;
	double tAbierto;
	double tCerrado;

	Problema113(double distancia, double tCerrado, double tAbierto) {
		this.distancia = distancia;
		this.tCerrado = tCerrado;
		this.tAbierto = tAbierto;
	}
}
