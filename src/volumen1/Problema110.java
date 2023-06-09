package volumen1;

import java.util.Scanner;

public class Problema110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nVersos = sc.nextInt();
		while (nVersos != 0) {
			sc.nextLine();
			String[] palabras = new String[nVersos];
			for (int i = 0; i < nVersos; i++) {
				String[] verso = sc.nextLine().split(" ");
				palabras[i] = reduccion(verso[verso.length - 1].toLowerCase());
			}
			System.out.println(rima(palabras));
			nVersos = sc.nextInt();
		}
		sc.close();
	}

	private static String rima(String[] versos) {
		String res;
		switch (versos.length) {
		case 2: {
			res = estrofa(versos[0], versos[1]);
			break;
		}
		case 3: {
			res = estrofa(versos[0], versos[1], versos[2]);
			break;
		}
		case 4: {
			res = estrofa(versos[0], versos[1], versos[2], versos[3]);
			break;
		}
		default:
			res = "DESCONOCIDO";
		}
		return res;
	}

	private static String estrofa(String p1, String p2) {
		String res = "DESCONOCIDO";
		if (p1.equals(p2))
			res = "PAREADO";
		return res;
	}

	private static String estrofa(String p1, String p2, String p3) {
		String res = "DESCONOCIDO";
		if (p1.equals(p3) && !p1.equals(p2))
			res = "TERCETO";
		return res;
	}

	private static boolean mismasVocales(String p1, String p2) {
		boolean res = false;
		int i;
		int j = p2.length() - 1;
		for (i = p1.length() - 1; i >= 0; i--) {
			if (esVocal(p1.charAt(i))) {
				while (!esVocal(p2.charAt(j)))
					j--;
				if (p1.charAt(i) != p2.charAt(j)) {
					return false;
				} else {
					j--;
				}
			}
		}
		if (i == -1 && j == -1)
			return true;
		return res;
	}

	private static String estrofa(String p1, String p2, String p3, String p4) {
		String res = "DESCONOCIDO";
		if (p1.equals(p2) && p1.equals(p3) && p1.equals(p4))
			return "CUADERNA VIA";
		if (!p1.equals(p2) && p1.equals(p3) && p2.equals(p4))
			return "CUARTETA";
		if (!p1.equals(p2) && p1.equals(p4) && p2.equals(p3))
			return "CUARTETO";
		if (!p2.equals(p4) && mismasVocales(p2, p4) && !mismasVocales(p1, p2) && !mismasVocales(p2, p3) && !mismasVocales(p1, p3))
			return "SEGUIDILLA";
		
		return res;
	}

	private static String reduccion(String s) {
		StringBuilder sb = new StringBuilder();
		int vocales = 0;

		for (int i = s.length() - 1; vocales < 2 && i >= 0; i--) {
			char c = s.charAt(i);
			if (c > 96 && c < 123) {
				if (esVocal(c)) {
					vocales++;
				}
				sb.insert(0, c);
			}
		}

		return sb.toString();
	}

	private static boolean esVocal(char c) {
		boolean vocal;
		switch (c) {
		case 97: {
			vocal = true;
			break;
		}
		case 101: {
			vocal = true;
			break;
		}
		case 105: {
			vocal = true;
			break;
		}
		case 111: {
			vocal = true;
			break;
		}
		case 117: {
			vocal = true;
			break;
		}
		default:
			vocal = false;
		}
		return vocal;
	}

}