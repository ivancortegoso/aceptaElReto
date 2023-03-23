package volumen1;

import java.util.Scanner;

public class problema136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long enanos = sc.nextInt() * 2;
			long eslabones = sc.nextInt();
			
			if(enanos != 0) {
				System.out.println(rompeCadenas(enanos, eslabones));
			} else {
				break;
			}
		}
		sc.close();
	}
	public static long rompeCadenas(long enanos, long eslabones) {
		if(eslabones > enanos) {
			long cadenaCorta = eslabones / 3;
			long cadenaLarga = eslabones - cadenaCorta;
			return 1 + rompeCadenas(enanos, cadenaLarga) + rompeCadenas(enanos, cadenaCorta);
		}
		return 0;
	}
}