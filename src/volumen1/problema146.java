package volumen1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class problema146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, String> map = new HashMap<>();
		while (n != 0) {
			System.out.print(n + ": ");
			String res = "";
			if (map.get(n) != null) {
				res = map.get(n);
			} else {
				Queue<Integer> queue = new LinkedList<Integer>();
				// primera inserción
				for (int i = 1; i <= n; i++) {
					if (i % 2 == 0)
						queue.add(i);
				}
				for (int m = 3; queue.size() >= m; m++) {
					int queueSize = queue.size();
					queue.poll();
					for (int i = 1; i < queueSize; i++) {
						if (i % m == 0) {
							queue.poll();
						} else {
							queue.add(queue.poll());
						}
					}
				}
				res = "";
				for (Integer integer : queue) {
					res = integer + " " + res;
				}
				map.put(n, res);
			}
			System.out.println(res.substring(0, res.length() - 1));
			n = sc.nextInt();
		}
		sc.close();
	}
}