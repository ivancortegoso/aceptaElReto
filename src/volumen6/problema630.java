package volumen6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problema630 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea = br.readLine();
		String[] arrayDatos = linea.split(" ");
		int jugadores = Integer.parseInt(arrayDatos[0]);
		int rondas = Integer.parseInt(arrayDatos[1]);
		int res = 0;
		while (jugadores != 0 || rondas != 0) {
			if (jugadores == 0) {
				
			} else if (rondas == 0) {
				br.readLine();
			} else {
				res = 0;
				int[] game = new int[jugadores / 2];
				int g = 0;
				for (int i = 0; i < jugadores; i++) {
					int actual = br.read();
					if (actual == 49) {
						i++;
						actual = br.read();
						if (actual == 49) {
							res++;
						}
						game[g] = 1;
					} else {
						i++;
						actual = br.read();
						if (actual == 49) {
							game[g] = 1;
						}
					}
					g++;
				}
				for (int i = 1; i < rondas && jugadores > 1; i++) {
					jugadores /= 2;
					g = 0;
					for (int j = 0; j < jugadores && jugadores > 1; j++) {
						int actual = game[j];
						if (actual == 1) {
							j++;
							actual = game[j];
							if (actual == 1) {
								res++;
							}
							game[g] = 1;
						} else {
							j++;
							actual = game[j];
							if (actual == 1) {
								game[g] = 1;
							} else {
								game[g] = 0;
							}
						}
						g++;
					}
				}
				br.readLine();
			}
			System.out.println(res);
			arrayDatos = br.readLine().split(" ");
			jugadores = Integer.parseInt(arrayDatos[0]);
			rondas = Integer.parseInt(arrayDatos[1]);
		}
		br.close();
	}
}