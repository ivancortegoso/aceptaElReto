package volumen6;

import java.util.Scanner;

public class Problema650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int nPrices = sc.nextInt();
			int res = 0;
			if (nPrices > 2) {
				int[] arrayPrices = new int[nPrices];
				arrayPrices[0] = sc.nextInt();
				for (int i = 1; i < nPrices; i++) {
					int iPrice = sc.nextInt();
					addSortPrice(iPrice, arrayPrices, i - 1);
				}
				for (int i = arrayPrices.length - 3; i >= 0; i = i - 3) {
					res += arrayPrices[i];
				}
			} else {
				sc.nextLine();
				sc.nextLine();
			}
			System.out.println(res);
		}
		sc.close();
	}

	private static void addSortPrice(int price, int[] arrayPrices, int currentArrayLength) {
		addSortPrice(price, arrayPrices, 0, currentArrayLength, currentArrayLength);
	}

	private static void addSortPrice(int price, int[] arrayPrices, int i, int j, int currentArrayLength) {
		if (i == j) {
			if (price <= arrayPrices[i]) {
				for (int k = currentArrayLength + 1; k > i; k--) {
					arrayPrices[k] = arrayPrices[k - 1];
				}
				arrayPrices[i] = price;
			} else {
				for (int k = currentArrayLength + 1; k > i; k--) {
					arrayPrices[k] = arrayPrices[k - 1];
				}
				arrayPrices[i + 1] = price;
			}
		} else {
			int half = (i + j) / 2;
			if (arrayPrices[half] > price) {
				addSortPrice(price, arrayPrices, i, half, currentArrayLength);
			} else if (arrayPrices[half] < price) {
				addSortPrice(price, arrayPrices, half + 1, j, currentArrayLength);
			} else {
				addSortPrice(price, arrayPrices, half, half, currentArrayLength);
			}
		}
	}
}