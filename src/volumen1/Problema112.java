package volumen1;

import java.util.Scanner;

public class Problema112 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double metros = sc.nextInt();
		double kmh = sc.nextInt();
		double segundos = sc.nextInt();
		String res;
		while (metros != 0 || kmh != 0 || segundos != 0) {
			res = "PUNTOS";
			if (metros <= 0 || kmh <= 0 || segundos <= 0) {
				res = "ERROR";
			} else {
				double velocidad = metros / segundos * 3.6;
				if(velocidad <= kmh) {
					res = "OK";
				} else if(velocidad < kmh * 1.2) {
					res = "MULTA";
				}
			}
			System.out.println(res);
			metros = sc.nextInt();
			kmh = sc.nextInt();
			segundos = sc.nextInt();
		}
		sc.close();
	}
}
