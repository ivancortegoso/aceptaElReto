package volumen1;

import java.util.Scanner;

public class problema140 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numero = sc.nextLine();
		int res = numero.charAt(0) - 48;
		while(res >= 0) {
			System.out.print(res);
			for (int i = 1; i < numero.length(); i++) {
				System.out.print(" + " + (numero.charAt(i)-48));
				res += numero.charAt(i)-48;
			}
			System.out.println(" = " + res);
			numero = sc.nextLine();
			res = numero.charAt(0) - 48;
		}
		sc.close();
	}
}