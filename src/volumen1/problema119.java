package volumen1;

import java.util.Scanner;

public class problema119 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int res = 0;
			int soldados = n;
			while (soldados > 1) {
				int formacion = (int) Math.sqrt(soldados);
				soldados -= formacion * formacion;
				res += formacion * formacion + formacion * 4;
			}
			if (soldados == 1) res += 5;
			System.out.println(res);
			n = sc.nextInt();
		}
		sc.close();
	}
}