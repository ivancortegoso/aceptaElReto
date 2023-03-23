package volumen3;

import java.util.Scanner;

public class problema347 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int ancho = sc.nextInt();
			int largo = sc.nextInt();
			if(ancho != 0 || largo != 0) {
				int numPajaritas = 0;
				if(largo > ancho) {
					int aux = largo;
					largo = ancho;
					ancho = aux;
				}
				while(ancho >= 10 && largo >= 10) {
					numPajaritas += ancho/largo;
					int aux = largo;
					largo = ancho%largo;
					ancho = aux;
				}
				System.out.println(numPajaritas);
			} else {
				break;
			}
		}
		sc.close();
	}
}
