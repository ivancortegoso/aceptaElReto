package volumen4;

import java.util.Scanner;

public class problema424 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numEntradas = sc.nextInt();
		while(numEntradas > 0) {
			long res = sc.nextLong();
			long max = res;
			numEntradas--;
			for(;numEntradas > 0; numEntradas--) {
				res += sc.nextLong();
				if(res > max) max = res;
			}
			System.out.println(res + " " + max);
			numEntradas = sc.nextInt();
		}
		sc.close();
	}
}
