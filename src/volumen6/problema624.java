package volumen6;

import java.util.Scanner;

public class problema624{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int reps = 1;
		while (sc.hasNext() && reps != 0) {
			int max = 0;
			int actual = 0;
			int[] mesa = new int[1000];
			reps = sc.nextInt();
			if (reps != 0) {
				for (int i = reps; i > 0; i--) {
					int calcetin = sc.nextInt();
					if (mesa[calcetin - 1] == 0) {
						actual++;
						if (actual > max)
							max = actual;
						mesa[calcetin - 1] = 1;
					} else {
						actual--;
						mesa[calcetin - 1] = 0;
					}
				}
				System.out.println(max);
			}
		}
		sc.close();
	}
}