package volumen1;

import java.util.Scanner;
import java.util.Stack;

public class problema141 {
	public static void main(String[] args) {
		Stack<Character> pila = new Stack<Character>();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			pila.clear();
			String linea = sc.nextLine();
			boolean continuar = true;
			for (int i = 0; i < linea.length() && continuar; i++) {
				Character c = linea.charAt(i);
				try {
					switch (c) {
					case 40: {
						pila.add(c);
						break;
					}
					case 91: {
						pila.add(c);
						break;
					}
					case 123: {
						pila.add(c);
						break;
					}
					case 41: {
						if (pila.pop() != 40)
							continuar = false;
						break;
					}
					case 93: {
						if (pila.pop() != 91)
							continuar = false;
						break;
					}
					case 125: {
						if (pila.pop() != 123)
							continuar = false;
						break;
					}
					default:
					}
				} catch (Exception e) {
					continuar = false;
				}
			}
			if (continuar && pila.empty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}