package volumen2;

import java.util.Scanner;

public class problema290 {
	private static int lastIndex = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nArboles = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < nArboles; i++) {
			lastIndex = 0;
			String arbol = sc.nextLine();
			System.out.println(alturaArbol(arbol, lastIndex++, 0));
		}
		sc.close();
	}

	public static int alturaArbol(String arbol, int indice, int profundidad) {
		int profundidadMax = 0;
		if(arbol.charAt(indice) == '*') {
			profundidadMax = alturaArbol(arbol, lastIndex++, profundidad+1);
			profundidadMax = Math.max(profundidadMax, alturaArbol(arbol, lastIndex++, profundidad+1));
		} else {
			profundidadMax = profundidad;
		}
		return profundidadMax;
	}
}