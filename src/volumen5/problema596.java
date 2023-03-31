package volumen5;

import java.util.Scanner;

public class problema596 {
	static int indexGlobal = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			indexGlobal = 1;
			String arbol = sc.nextLine();
			if(arbol.length() == 1) {
				System.out.println("");
				continue;
			}
			Node root = new Node(arbol.charAt(0));
			root.hijoIzq = creaArbol(arbol);
			root.hijoDer = creaArbol(arbol);
			imprimirMensaje(root);
			System.out.println("");
		}
		sc.close();
	}

	public static Node creaArbol(String arbol) {
		if (arbol.charAt(indexGlobal) != '.') {
			Node actual = new Node(arbol.charAt(indexGlobal++));
			actual.hijoIzq = creaArbol(arbol);
			actual.hijoDer = creaArbol(arbol);
			return actual;
		}
		indexGlobal++;
		return null;
	}
	public static void imprimirMensaje(Node n) {
		if(n.hijoIzq != null) imprimirMensaje(n.hijoIzq);
		if(n.hijoDer != null) imprimirMensaje(n.hijoDer);
		if(n.hijoDer == null && n.hijoIzq == null) System.out.print(n.id);
	}
}

class Node {
	Node hijoIzq;
	Node hijoDer;
	Node padre;
	char id;

	Node() {

	}

	Node(char id) {
		this.id = id;
	}

	Node(char id, Node padre) {
		this.id = id;
		this.padre = padre;
	}
}
