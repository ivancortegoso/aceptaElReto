package volumen6;

import java.util.Scanner;

public class problema625 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int reps = sc.nextInt(); reps > 0; reps--) {
			int numLineas = sc.nextInt();
			if (numLineas >= 3) {
				int[] arrayLineas = new int[numLineas];
				int aux = 0;
				for (int i = 0; i < numLineas; i++) {
					int numero = sc.nextInt();
					int j = indice(arrayLineas, numero, i);
					aux = arrayLineas[j];
					arrayLineas[j++] = numero;
					while (j <= i) {
						int aux1 = arrayLineas[j];
						arrayLineas[j] = aux;
						aux = aux1;
						j++;
					}
				}
				// Arrays.sort(arrayLineas, Collections.reverseOrder());
				int perimetroMax = 0;
				for (int i = numLineas - 1; i > 0 && perimetroMax == 0; i--) {
					for (int j = i - 1; j >  0 && perimetroMax == 0; j--) {
						for (int k = j - 1; k >= 0 && perimetroMax == 0; k--) {
							int a = arrayLineas[i];
							int b = arrayLineas[j];
							int c = arrayLineas[k];
							if (a < b + c)
								perimetroMax = a + b + c;
						}
					}
				}
				if (perimetroMax > 0) {
					System.out.println(perimetroMax);
				} else {
					System.out.println("NO HAY NINGUNO");
				}
			} else {
				for(int i = numLineas; i > 0; i--) sc.nextInt();
				System.out.println("NO HAY NINGUNO");
			}
		}
		sc.close();
	}

	public static int indice(int[] array, int numero, int lenActual) {
		return indiceRecursivo(array, numero, 0, lenActual);
	}

	public static int indiceRecursivo(int[] array, int numero, int posIni, int posFin) {
		if (posIni == posFin)
			return posIni;
		if (numero > array[(posIni + posFin) / 2]) {
			if (numero < array[(posIni + posFin) / 2 + 1])
				return (posIni + posFin) / 2 + 1;
			return indiceRecursivo(array, numero, (posIni + posFin) / 2 + 1, posFin);
		} else if (numero < array[(posIni + posFin) / 2]) {
			if (numero > array[(posIni + posFin) / 2] - 1) return (posIni + posFin) / 2;
			return indiceRecursivo(array, numero, posIni, (posIni + posFin) / 2);
		} else {
			return (posFin + posIni) / 2;
		}
	}
}