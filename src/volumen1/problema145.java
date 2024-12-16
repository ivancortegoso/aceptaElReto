package volumen1;

import java.util.Scanner;
import java.util.Stack;

public class problema145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            Stack<Character> stack = new Stack<>();
            int parejas = 0;
            String tren = sc.nextLine();
            for (int i = 0; i < tren.length(); i++) {
                char c = tren.charAt(i);
                if (c == 'H' || c == 'h') {
                    stack.push(c);
                } else if (c == '@') {
                    stack.clear();
                } else if (c == 'm') {
                    if (!stack.empty() && stack.pop().equals('h')) {
                        ++parejas;
                    } else {
                        stack.clear();
                    }
                } else if (c == 'M') {
                    if (!stack.empty() && stack.pop().equals('H')) {
                        ++parejas;
                    } else {
                        stack.clear();
                    }
                }
            }
            System.out.println(parejas);
        }
        sc.close();
    }
}
