package volumen5;

import java.util.Scanner;

public class problema584 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = sc.nextInt(); i > 0; i--) {
			int horas = sc.nextInt();
			int encendidos = sc.nextInt();
			int uso = sc.nextInt();
			
			long horasMaximas = encendidos*uso;
			int usosMaximos = (int) (horas / uso + 0.5);
			
			if(horasMaximas >= horas) {
				if(usosMaximos >= encendidos) {
					System.out.println("AMBAS");
				} else {
					System.out.println("HORAS");
				}
			} else {
				System.out.println("ENCENDIDOS");
			}
		}
		sc.close();
	}
}