package volumen2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problema203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String linea1 = sc.nextLine();
			String linea2 = sc.nextLine();
			if(!linea1.equals("-1") || !linea2.equals("-1")) {
				String[] arbolUno = linea1.split(" ");
				int[] arbol1 = new int[arbolUno.length];
				for(int i = 0; i < arbol1.length; i++) {
					arbol1[i] = Integer.parseInt(arbolUno[i]);
				}
				String[] arbolDos = linea2.split(" ");
				int[] arbol2 = new int[arbolDos.length];
				for(int i = 0; i < arbol2.length; i++) {
					arbol2[i] = Integer.parseInt(arbolDos[i]);
				}
				
				List<Integer> res = new ArrayList<>();
				
				int i = 0;
				int j = 0;
				int d1 = 0;
				int d2 = 0;
				boolean im1 = false;
				boolean im2 = false;
				
				while(i < arbol1.length && j < arbol2.length) {
					if(arbol1[i] == -1) {
						if(arbol2[j] == -1) {
							res.add(-1);
							i++;
							j++;
						} else {
							i++;
							d2++;
							for(; j < arbol2.length && d2 != 0; j++) {
								if(arbol2[j] == -1) {
									if(im2) {
										res.add(-1);
										im2 = false;
										d2--;
									} else {
										res.add(-1);
										im2 = true;
										d2--;
									}
								} else {
									res.add(arbol2[j]);
									im2 = false;
									d2++;
								}
							}
						}
					} else {
						if(arbol2[j] != -1) {
							res.add(arbol1[i] + arbol2[j]);
							i++;
							j++;
						} else {
							j++;
							d1++;
							for(; i < arbol1.length && d1 != 0; i++) {
								if(arbol1[i] == -1) {
									if(im1) {
										res.add(-1);
										im1 = false;
										d1--;
									} else {
										res.add(-1);
										im1 = true;
										d1--;
									}
								} else {
									res.add(arbol1[i]);
									im1 = false;
									d1++;
								}
							}
						}
					}
				}
				System.out.print(res.get(0));
				for(int vari = 1; vari < res.size(); vari++) System.out.print(" " + res.get(vari));
				System.out.println("");
			} else {
				break;
			}
		}
		sc.close();
	}
}