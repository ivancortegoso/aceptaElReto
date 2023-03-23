package volumen5;

import java.util.Arrays;
import java.util.Scanner;

public class problema505 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int nDrones = sc.nextInt();
			int pilasFuncionandoA = sc.nextInt();
			int pilasFuncionandoB = sc.nextInt();
			int auxPilasFuncionandoA = 0;
			int auxPilasFuncionandoB = 0;
			
			int[] pilasA = new int[pilasFuncionandoA];
			int[] pilasB = new int[pilasFuncionandoB];
			
			for (int i = 0; pilasFuncionandoA > i; i++) {
				pilasA[i] = sc.nextInt();
			}
			for (int i = 0; pilasFuncionandoB > i; i++) {
				pilasB[i] = sc.nextInt();
			}
			while(pilasFuncionandoA > 0 && pilasFuncionandoB > 0) {
				Arrays.sort(pilasA, pilasA.length - pilasFuncionandoA + auxPilasFuncionandoA, pilasA.length);
				Arrays.sort(pilasB, pilasB.length - pilasFuncionandoB + auxPilasFuncionandoB, pilasB.length);
				auxPilasFuncionandoA = 0;
				auxPilasFuncionandoB = 0;
				int horasDeVuelo = 0;
				for(int i = 0; Math.min(nDrones ,Math.min(pilasFuncionandoA, pilasFuncionandoB)) > i; i++) {
					if(pilasA[pilasA.length -1 -i] > pilasB[pilasB.length -1 -i]) {
						pilasA[pilasA.length -1 -i] = pilasA[pilasA.length -1 -i] - pilasB[pilasB.length -1 -i];
						horasDeVuelo += pilasB[pilasB.length -1 -i];
						pilasB[pilasB.length -1 -i] = 0;
						auxPilasFuncionandoB--;
					} else if(pilasB[pilasB.length -1 -i] > pilasA[pilasA.length -1 -i]) {
						pilasB[pilasB.length -1 -i] = pilasB[pilasB.length -1 -i] - pilasA[pilasA.length -1 -i];
						horasDeVuelo += pilasA[pilasA.length -1 -i];
						pilasA[pilasA.length -1 -i] = 0;
						auxPilasFuncionandoA--;
					} else {
						horasDeVuelo += pilasA[pilasA.length -1 -i];
						pilasA[pilasA.length -1 -i] = 0;
						pilasB[pilasB.length -1 -i] = 0;
						auxPilasFuncionandoA--;
						auxPilasFuncionandoB--;
					}
				}
				System.out.print(horasDeVuelo + " ");
				pilasFuncionandoA += auxPilasFuncionandoA;
				pilasFuncionandoB += auxPilasFuncionandoB;
			}
			if(sc.hasNext()) System.out.println("");
		}
		sc.close();
	}
}
