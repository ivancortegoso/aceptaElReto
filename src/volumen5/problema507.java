package volumen5;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class problema507 {
	//TODO
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int personas = sc.nextInt();
		int pesoMax = sc.nextInt();
		while (personas != 0 && pesoMax != 0) {
			Map<Integer, Integer> map = new TreeMap<>();
			for (int i = 0; i < personas; i++) {
				int pesoI = sc.nextInt();
				if(map.get(pesoI) != null) {
					map.put(pesoI, map.get(pesoI)+1);
				} else {
					map.put(pesoI, 1);
				}
			}
			Set<Integer> keys = map.keySet();
			Object[] arrayKeys = keys.toArray();
			int parejasTotales = 0;
			for(int i = 0; i < keys.size(); i++) {
				Integer pesoI = (Integer)arrayKeys[i];
				if(map.get(pesoI) > 1) {
					parejasTotales += gauss((Integer)arrayKeys[i]-1);
				}
				for(int j = i+1; j < keys.size(); j++) {
					int pesoJ = (Integer)arrayKeys[j];
					if(pesoI + pesoJ <= pesoMax) {
						parejasTotales += map.get(pesoJ);
					} else {
						break;
					}
				}
			}
			System.out.println(parejasTotales);
			personas = sc.nextInt();
			pesoMax = sc.nextInt();
		}
		sc.close();
	}
	private static int gauss(int a) {
		return a * (a + 1) / 2;
	}
}