package volumen1;

import java.util.Scanner;

public class problema119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		byte numero = sc.nextByte();
		while(numero > 0) {
			System.out.println("Hola mundo.");
			numero--;
		}
		sc.close();
	}
}

/*
 * public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte numero = Byte.parseByte(args[0]);
		while(numero > 0) {
			System.out.println("Hola mundo.");
			numero--;
		}
	}
 */