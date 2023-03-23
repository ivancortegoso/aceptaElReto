package volumen6;

import java.util.Scanner;

public class problema628 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			long sabor = sc.nextLong();
			long grosor = sc.nextLong();
			long mejorSabor = -1, mejorGrosor = -1;
			boolean mejorUva = false;
			if(grosor != 0 && sabor != 0) {
				mejorSabor = sabor;
				mejorGrosor = grosor;
				mejorUva = true;
				sabor = sc.nextLong();
				grosor = sc.nextLong();
			}
			while(sabor != 0 && grosor != 0) {
				if(sabor > mejorSabor) {
					mejorSabor = sabor;
					mejorUva = false;
				}
				if(grosor < mejorGrosor) {
					mejorGrosor = grosor;
					mejorUva = false;
				}
				if(sabor == mejorSabor && grosor == mejorGrosor) {
					mejorUva = true;
				}
				sabor = sc.nextLong();
				grosor = sc.nextLong();
			}
			System.out.println(mejorUva?mejorSabor + " " + mejorGrosor:"NO HAY MEJOR");
		}
		sc.close();
	}
}