package volumen6;

import java.util.Scanner;

public class Problema685 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tx = sc.nextInt();
		int ty = sc.nextInt();
		int px = sc.nextInt();
		int py = sc.nextInt();
		while(tx != 0 || ty != 0 || px != 0 || py != 0) {
			double degreesAux = Math.toDegrees(Math.atan2(px - tx, py - ty));
	        if(degreesAux %	 45 == 0) {
	        	System.out.println("SI");
	        } else {
	        	System.out.println("NO");
	        }
	        tx = sc.nextInt();
			ty = sc.nextInt();
			px = sc.nextInt();
			py = sc.nextInt();
		}
		sc.close();
	}
}