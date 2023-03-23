package volumen2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class problema251 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int casosPrueba = sc.nextInt(); casosPrueba > 0; casosPrueba--) {
			int monedasDiferentes = sc.nextInt();
			int numeroMonedas = sc.nextInt();
			int[] arrayMonedas = new int[monedasDiferentes];
			List<Integer> listaRes = new ArrayList<>();
			Set<Integer> sett = new HashSet<>();
			for(int i = 0; i < monedasDiferentes; i++) {
				int num = sc.nextInt();
				sett.add(num);
				listaRes.add(num);
				arrayMonedas[i] = num;
			}
			int indice = 0;
			for(int i = 1; i < numeroMonedas; i++){
				int sizeLista = listaRes.size();
				for(int j = indice; j < sizeLista; j++){
					for(int k = 0; k < monedasDiferentes; k++){
						int valorActual = listaRes.get(j) + arrayMonedas[k];
						if(sett.add(valorActual)) listaRes.add(valorActual);
					}
				}
				indice = sizeLista;
			}
			System.out.println(listaRes.size());
		}
		sc.close();
	}
}