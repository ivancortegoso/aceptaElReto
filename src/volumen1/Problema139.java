package volumen1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Problema139 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while (number > 0) {
			HashSet<Integer> set = new LinkedHashSet<>();
			set.add(1);
			while(set.add(number)) {
				number = elevarAlCubo(number);
			}
			Iterator<Integer> itr = set.iterator();
			itr.next();
			while(itr.hasNext()) {
				System.out.print(itr.next() + " - ");
			}
			if(number == 1) {
			 	System.out.println("1 -> cubinfinito.");
			} else {
				System.out.println(number + " -> no cubinfinito.");
			}
			number = sc.nextInt();
		}
		sc.close();
	}

	private static int elevarAlCubo(int x) {
		int res = 0;
		while (x > 0) {
			int digit = x % 10;
			res += digit * digit * digit;
			x /= 10;
		}
		return res;
	}
}