package volumen6;

import java.util.Scanner;

public class problema626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.nextLine();
		while(i > 0) {
			String[] fechaArray = sc.nextLine().split("/");
			
			int[] intArray = new int[3];
			
			intArray[0] = Integer.parseInt(fechaArray[0]);
			intArray[1] = Integer.parseInt(fechaArray[1]);
			intArray[2] = Integer.parseInt(fechaArray[2]);
			
			if(intArray[2] % 4 > 0) {
				System.out.println("29/02/"+ String.format("%04d",(intArray[2] + 4 - intArray[2] % 4)));
			} else {
				if(intArray[1] > 2) {
					System.out.println("29/02/" + String.format("%04d",(intArray[2] + 4)));
				} else if(intArray[1] < 2) {
					System.out.println("29/02/" + String.format("%04d",intArray[2]));
				} else {
					if(intArray[0] < 29) {
						System.out.println("29/02/" + String.format("%04d",intArray[2]));
					} else {
						System.out.println("29/02/" + String.format("%04d",(intArray[2] + 4)));
					}
				}
			}
			i--;
		}
		sc.close();
	}
}