package volumen1;

import java.util.Locale;
import java.util.Scanner;

public class problema108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).useLocale(Locale.ROOT);
		// double comidaTotal = 0;
		// int diasTotales = 1;

		while (sc.hasNext()) {
			boolean dia = true;
			double desayuno = 0;
			double comida = 0;
			double merienda = 0;
			double cena = 0;
			double copa = 0;
			int nVariables = 0;
			int nComidas = 0;

			while (dia) {
				String categoria = sc.next();
				switch (categoria) {
				case "D":
					desayuno += sc.nextDouble();
					nVariables++;
					break;
				case "A":
					comida += sc.nextDouble();
					nVariables++;
					nComidas++;
					break;
				case "M":
					merienda += sc.nextDouble();
					nVariables++;
					break;
				case "I":
					cena += sc.nextDouble();
					nVariables++;
					break;
				case "C":
					copa += sc.nextDouble();
					nVariables++;
					break;
				case "N":
					sc.nextDouble();
					dia = false;
					break;
				}
			}
			double media = (desayuno + comida + merienda + cena + copa) / nVariables;
			int categoriaMax = 0;
			double valorMax = desayuno;
			boolean empateMax = false;

			int categoriaMin = 0;
			double valorMin = desayuno;
			boolean empateMin = false;

			double[] listaValores = { desayuno, comida, merienda, cena, copa };
			String[] nombreCategorias = { "DESAYUNOS", "COMIDAS", "MERIENDAS", "CENAS", "COPAS" };
			for (int i = 1; i < 5; i++) {
				if (listaValores[i] > valorMax) {
					valorMax = listaValores[i];
					categoriaMax = i;
					empateMax = false;
				} else if (listaValores[i] == valorMax) {
					empateMax = true;
				}
				if (listaValores[i] < valorMin) {
					valorMin = listaValores[i];
					categoriaMin = i;
					empateMin = false;
				} else if (listaValores[i] == valorMin) {
					empateMin = true;
				}
			}
			String res = "";
			if (empateMax) {
				res += "EMPATE";
			} else {
				res += nombreCategorias[categoriaMax];
			}
			res += "#";

			if (empateMin) {
				res += "EMPATE";
			} else {
				res += nombreCategorias[categoriaMin];
			}
			res += "#";
			if (comida/nComidas > media) {
				res += "SI";
			} else {
				res += "NO";
			}
			System.out.println(res);
		}
		sc.close();
	}
}
