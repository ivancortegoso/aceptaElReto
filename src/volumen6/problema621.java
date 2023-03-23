package volumen6;

import java.util.Scanner;

public class problema621 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = sc.nextInt(); i > 0; i--) {
			int numero = sc.nextInt();
			System.out.println(numero%2==0?numero+1:numero-1);
		}
		sc.close();
	}

}
