package volumen6;

import java.util.Scanner;

public class problema622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int numeroExamenes = sc.nextInt();
			if(numeroExamenes > 0) {
				int notas = 0;
				for(int i = 0; i < numeroExamenes; i++) {
					notas += sc.nextInt();
				}
				int notaMedia = sc.nextInt();
				int x = notaMedia * (numeroExamenes+1) - notas;
				if(x > 10) {
					System.out.println("IMPOSIBLE");
				} else if(x < 0){
					System.out.println("IMPOSIBLE");
				} else {
					System.out.println(x);
				}
			} else {
				break;
			}
		}
		sc.close();
	}
}