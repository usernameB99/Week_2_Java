package Woche2;

import java.util.Scanner;
public class GaudiMitStatistikV1MethodeScanner {
    public static void main(String[] args) {

        System.out.println("geben sie einen satz ein");

        Scanner sc = new Scanner(System.in);
        String satz = sc.nextLine();

        checkSentence(satz);
    }

    public static void checkSentence(String satz) {
        char[] chars = satz.toCharArray();
        int anzahlGB = 0;
        int anzahlKB = 0;
        int anzahlZA = 0;
        int anzahlSZ = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                anzahlGB++;
            }
            else if (Character.isLowerCase(chars[i])) {
                anzahlKB++;
            }
            else if (Character.isDigit(chars[i])) {
                anzahlZA++;
            }
            else  {
                anzahlSZ++;
            }
        }
            System.out.println(satz);
            System.out.println("Großbuchstaben:" + " " + anzahlGB);
            System.out.println("Kleinbuchstaben:" + " " + anzahlKB);
            System.out.println("Zahlen:" + " " + anzahlZA);
            System.out.println("Sonderzeichen:" + " " + anzahlSZ);


    }
}