package volumen2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class problema218 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int nNodos = sc.nextInt();
			if (nNodos == 0)
				break;
			sc.nextLine();
			Map<Integer, Integer> inOrder = new HashMap<>();
			for (int i = 0; i < nNodos; i++)
				inOrder.put(sc.nextInt(), i);
			int[] postOrder = new int[nNodos];
			for (int i = 0; i < nNodos; i++)
				postOrder[i] = sc.nextInt();
			Node root = new Node(postOrder[postOrder.length - 1]);
			int posRoot = inOrder.get(postOrder[postOrder.length - 1]);
			// lado Derecho
			int c = 0;
			for (int i = nNodos - posRoot - 2; i >= 0; i--) {
				c++;
				Node aux = root;
				Node nuevo = new Node(postOrder[nNodos - c - 1]);
				int posNuevo = inOrder.get(postOrder[nNodos - c - 1]);
				int posAux = inOrder.get(aux.id);
				int j = 0;
				while (j < nNodos - posRoot) {
					if (posAux < posNuevo) {
						if (aux.hijoDer == null) {
							aux.hijoDer = nuevo;
							break;
						} else {
							aux = aux.hijoDer;
							posAux = inOrder.get(aux.id);
							j++;
						}
					} else {
						if (aux.hijoIzq == null) {
							aux.hijoIzq = nuevo;
							break;
						} else {
							aux = aux.hijoIzq;
							posAux = inOrder.get(aux.id);
							j++;
						}
					}
				}
			}
			// lado Izquiero
			for (int i = 1; i <= posRoot; i++) {
				Node aux = root;
				Node nuevo = new Node(postOrder[posRoot - i]);
				int posNuevo = inOrder.get(postOrder[posRoot - i]);
				int posAux = inOrder.get(aux.id);
				int j = 0;
				while (j < posRoot) {
					if (posAux < posNuevo) {
						if (aux.hijoDer == null) {
							aux.hijoDer = nuevo;
							break;
						} else {
							aux = aux.hijoDer;
							posAux = inOrder.get(aux.id);
							j++;
						}
					} else {
						if (aux.hijoIzq == null) {
							aux.hijoIzq = nuevo;
							break;
						} else {
							aux = aux.hijoIzq;
							posAux = inOrder.get(aux.id);
							j++;
						}
					}
				}
			}
			String res = preOrder(root);
			System.out.println(res.substring(0, res.length()-1));
		}
		sc.close();
	}

	public static String preOrder(Node root) {
		String res = root.id + " ";
		if (root.hijoIzq != null)
			res += preOrder(root.hijoIzq);
		if (root.hijoDer != null)
			res += preOrder(root.hijoDer);
		return res;
	}
}

class Node {
	Node hijoIzq;
	Node hijoDer;
	Node padre;
	int id;

	Node() {

	}

	Node(int id) {
		this.id = id;
	}

	Node(int id, Node padre) {
		this.id = id;
		this.padre = padre;
	}
}