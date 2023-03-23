package volumen5;

import java.util.Scanner;

public class problema582 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = Integer.parseInt(sc.nextLine());
		while(i > 0) {
			String[] array = sc.nextLine().split(" ");
			if(array.length == 1) {
				System.out.println(array[0].length()>0?"TARDE":"MARISA NARANJO");
			} else if(array.length == 12) {
				System.out.println("CORRECTO");
			} else if(array.length > 12) {
				System.out.println("SALIDA NULA");
			} else if(array.length < 12) {
				System.out.println("TARDE");
			}
			i--;
		}
		sc.close();
	}
}