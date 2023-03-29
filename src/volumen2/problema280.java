package volumen2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problema280 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		while (n1 != -1) {
			List<Integer> arbol = new ArrayList<>();
			while (n1 != -1) {
				arbol.add(n1);
				n1 = sc.nextInt();
			}
			n1 = sc.nextInt();
			if(arbol.size() == 1) {
				System.out.println(arbol.get(0));
				System.out.println(arbol.get(0));
				continue;
			}
			if(arbol.size() == 2) {
				System.out.println(arbol.get(1) + " " + arbol.get(0));
				System.out.println(arbol.get(0) + " " + arbol.get(1));
				continue;
			}
			Nodo root = new Nodo(arbol.get(((arbol.size()) / 2)));
			root.hijoDer = crearArbolTriangularAplastado((arbol.size() / 2 + 1), arbol.size() - 1, arbol);
			root.hijoIzq = crearArbolTriangularAplastado(0, ((arbol.size()) / 2 - 1), arbol);
			
			String resPre = preOrder(root);
			resPre = resPre.substring(0, resPre.length()-1);
			String resPost = postOrder(root);
			resPost = resPost.substring(0, resPost.length()-1);
			System.out.println(resPre);
			System.out.println(resPost);	
		}
		sc.close();
	}
	public static Nodo crearArbolTriangularAplastado(int ini, int fin, List<Integer> arbol) {
		Nodo nodoActual = new Nodo(arbol.get((ini + fin + 1) / 2));
		if (fin - ini > 1) {
			nodoActual.hijoDer = crearArbolTriangularAplastado((ini + fin + 1) / 2 + 1, fin, arbol);
			nodoActual.hijoIzq = crearArbolTriangularAplastado(ini, (ini + fin + 1) / 2 - 1, arbol);
		} else if (fin - ini == 1) {
			nodoActual.hijoIzq = crearArbolTriangularAplastado(ini, (ini + fin + 1) / 2 - 1, arbol);
		} else if (ini == fin) {
			return nodoActual;
		} else {
			return null;
		}
		return nodoActual;
	}
	public static String preOrder(Nodo root) {
		String res = root.id + " ";
		if (root.hijoIzq != null)
			res += preOrder(root.hijoIzq);
		if (root.hijoDer != null)
			res += preOrder(root.hijoDer);
		return res;
	}
	public static String postOrder(Nodo root) {
		String res = root.id + " ";
		if(root.hijoDer != null) {
			res = postOrder(root.hijoDer) + res;
		}
		if(root.hijoIzq != null) {
			res = postOrder(root.hijoIzq) + res;
		}
		return res;
	}
}

class Nodo {
	Nodo hijoIzq;
	Nodo hijoDer;
	Nodo padre;
	int id;

	Nodo() {

	}

	Nodo(int id) {
		this.id = id;
	}

	Nodo(int id, Nodo padre) {
		this.id = id;
		this.padre = padre;
	}
}