package volumen6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema690 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int x = Integer.valueOf(line[0]);
		int y = Integer.valueOf(line[1]);
		while (x != 0 && y != 0) {
			int res = 0;
			for(int i = 0; i < x; i++) {
				for(int j = 0; j < y; j++) {
					br.read();
				}
				System.out.println(br.read());
			}
			line = br.readLine().split(" ");
			x = Integer.valueOf(line[0]);
			y = Integer.valueOf(line[1]);
			//System.out.println(res);
		}
		br.close();
	}
}
