package volumen5;

import java.util.Scanner;

public class problema583 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = sc.nextInt(); i > 0; i--) {
			double primera = sc.nextLong();
			double segunda = sc.nextLong();
			long res = 0;
			if(primera == 0) {
				res = 0;
			} else if(segunda == 0) {
				res = 100;
			} else {
				double y = (primera + segunda)/2;
				primera -= y;
				if(primera > 0) {
					res = (long) (primera / y * 100 + 0.5);
				} else {
					res = 0;
				}
			}
			System.out.println(res);
		}
		sc.close();
	}
}