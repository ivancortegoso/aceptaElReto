package volumen6;

import java.util.Scanner;

public class Problema686 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		while(n != 0 && d != 0) {
			int res = 0;
			for(int i = 2; i < 999999; i++) {
				String num = i * n + "" + i * d;
				if(num.length() == 9 && numeroValido(num)) {
					res++;
				} else if(num.length() > 9) {
					System.out.println(res);
					break;
				}
			}
			n = sc.nextInt();
			d = sc.nextInt();
		}
		sc.close();
	}
	private static boolean numeroValido(String number) {
		int[] arrayAux = new int[9];
		int i;
		for(i = 8; i >= 0; i--) {
			char c = number.charAt(i);
			if(c - 48 == 0 || arrayAux[c - 49] != 0) {
				break;
			} else {
				arrayAux[c - 49] = 1;
			}
		}
		return i == -1;
	}
}