package volumen6;

import java.util.Scanner;

public class Problema691 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int filas = sc.nextInt();
			int asientos = sc.nextInt();
			int clientes = sc.nextInt();
			int res = 0;
			if (filas > 1) {
				int[] arrayAux = new int[filas];
				arrayAux[0] = asientos - sc.nextInt();
				for (int i = 1; i < filas; i++) {
					int n = asientos - sc.nextInt();
					insercionOrdenada(arrayAux, n, i);
				}
				for (int i = 0; i < clientes; i++) {
					res += arrayAux[0]--;
					ordenar(arrayAux);
				}
			} else {
				int libre = asientos - sc.nextInt();
				while (clientes-- > 0 && libre > 0) {
					res += libre--;
				}
			}

			System.out.println(res);
		}
		sc.close();
	}

	private static void insercionOrdenada(int[] array, int num, int len) {
		insercionOrdenada(array, num, len, 0, len);
	}

	private static void insercionOrdenada(int[] array, int num, int len, int i, int j) {
		if (i == j) {
			if (array[i] > num)
				i++;
			insercion(array, num, i, len);
		} else {

			int mitad = (i + j) / 2;

			if (num > array[mitad]) {
				insercionOrdenada(array, num, len, Math.max(0, Math.min(i, mitad - 1)), Math.max(mitad - 1, 0));
			} else if (num < array[mitad]) {
				insercionOrdenada(array, num, len, mitad + 1, j);
			} else {
				insercion(array, num, mitad, len);
			}
		}
	}

	private static void insercion(int[] array, int num, int pos, int len) {
		for (int i = pos; i <= len; i++) {
			int aux = array[i];
			array[i] = num;
			num = aux;
		}
	}

	private static void ordenar(int[] array) {
		int a0 = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		insercionOrdenada(array, a0, array.length - 1, 0, array.length - 1);
	}
}
