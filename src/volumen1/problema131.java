package volumen1;

import java.util.Scanner;

public class problema131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int miPiscina = sc.nextInt();
			int miCubo = sc.nextInt();
			int miPerdida = sc.nextInt();
			int vecinoPiscina = sc.nextInt();
			int vecinoCubo = sc.nextInt();
			int vecinoPerdida = sc.nextInt();
			if(miPiscina == 0 || vecinoPiscina == 0) break;
			System.out.println(metodoResolucion(miPiscina, miCubo, miPerdida, vecinoPiscina, vecinoCubo, vecinoPerdida));
		}
		sc.close();
	}
	public static String metodoResolucion(int miPiscina, int miCubo, int miPerdida, int vecinoPiscina, int vecinoCubo, int vecinoPerdida){
		int miRes = 1;
		if(miPiscina - miCubo > 0) {
			if(miCubo - miPerdida > 0) {
				miRes += formulaViajes(miPiscina, miCubo, miPerdida);
			} else {
				return "VECINO " + (1 + formulaViajes(vecinoPiscina, vecinoCubo, vecinoPerdida));
			}
		}
		int vecinoRes = 1;
		if(vecinoPiscina - vecinoCubo > 0) {
			if(vecinoCubo - vecinoPerdida > 0) {
				vecinoRes += formulaViajes(vecinoPiscina, vecinoCubo, vecinoPerdida);
			} else {
				return "YO " + miRes;
			}
		}
		if(miRes < vecinoRes) {
			return "YO " + miRes;
		} else if(miRes > vecinoRes) {
			return "VECINO " + vecinoRes;
		} else {
			return "EMPATE " + miRes;
		}
	}
	public static int formulaViajes(int piscina, int cubo, int perdida) {
		return (int)Math.ceil((double)(piscina - cubo)/(cubo - perdida));
	}
}
