package volumen6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class problema627 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String[] arrayLinea = sc.nextLine().split("/");
			int diaF = Integer.parseInt(arrayLinea[0]);
			int mesF = Integer.parseInt(arrayLinea[1]);
			String[] resto = arrayLinea[2].split(" ");
			int anyoF = Integer.parseInt(resto[0]);
			int diaP = Integer.parseInt(resto[3]);
			int mesP = Integer.parseInt(resto[2]);
			int anyoP = Integer.parseInt(resto[1]);
			
			if(diaF == mesF && mesF == anyoF && anyoF == diaP && diaP == mesP && mesP == anyoP && anyoP == 0) {
				break;
			}
			
			Calendar calendar = Calendar.getInstance();
			calendar.set(anyoF, mesF-1, diaF);
			calendar.add(Calendar.DAY_OF_MONTH, diaP + mesP * 28 + anyoP * 28 * 12);
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		    String strDate = formatter.format(calendar.getTime());
		    System.out.println(strDate);
		}
		sc.close();
	}
}