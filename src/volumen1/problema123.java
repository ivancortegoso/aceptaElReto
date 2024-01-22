package volumen1;

import java.util.Scanner;

public class problema123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ppl = new String[]{"yo ", "tu ", "el ", "nosotros ", "vosotros ", "ellos "};
        while (sc.hasNext()) {
            String word = sc.next();
            String tense = sc.next();
            String root = word.substring(0, word.length() - 2);
            String lastTwo = word.substring(word.length() - 2);
            int conj = lastTwo == "ar" ? 1 : lastTwo == "er" ? 2 : 3;

        }
        sc.close();
    }
}
