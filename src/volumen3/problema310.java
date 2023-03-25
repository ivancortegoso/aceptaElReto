package volumen3;

import java.util.Scanner;

public class problema310 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nArboles = sc.nextInt();
		if(nArboles > 0) {
			sc.nextLine();
			for(int i = 0; i < nArboles; i++) {
				System.out.println(alturaArbol(sc, 1));
			}
		}
		sc.close();
	}
	public static int alturaArbol(Scanner sc, int profundidad) {
		int nHijos = sc.nextInt();
		int maxProfundidad = profundidad;
		for(int i = 0; i < nHijos; i++) {
			maxProfundidad = Math.max(maxProfundidad, alturaArbol(sc, profundidad+1));
		}
		return maxProfundidad;
	}
}
