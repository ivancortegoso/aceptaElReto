package volumen6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class problema623 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		sc.nextLine();
//		for(;i > 0; i--) {
//			String[] numeros = sc.nextLine().split(" ");
//			int[] array = new int[10]; 
//			for(int j = 0; j < numeros[0].length(); j++) {
//				array[numeros[0].charAt(j) - 48]++;
//				array[numeros[1].charAt(j) - 48]--;
//			}
//			boolean gana = true;
//			for(int n : array) {
//				if(n != 0) {
//					gana = false;
//					break;
//				}
//			}
//			System.out.println(gana?"GANA":"PIERDE");
//		}
//		sc.close();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = Integer.parseInt(br.readLine());i > 0; i--) {
			int[] array = new int[10];
			int siguiente = 0;
			for(int j = 0; j < 7; j++) {
				siguiente = br.read();
				array[siguiente - 48]++;
			}
			siguiente = br.read();
			for(int j = 0; j < 7; j++) {
				siguiente = br.read();
				array[siguiente - 48]--;
			}
			if(i > 1) br.readLine();
			boolean gana = true;
			for(int e : array) {
				if(e != 0) {
					gana = false;
					break;
				}
			}
			System.out.println(gana?"GANA":"PIERDE");
		}
		br.close();
	}
}