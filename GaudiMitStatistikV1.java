package Woche2;

public class GaudiMitStatistikV1 {
    public static void main(String[] args) {

        String satz = "Unter #Handy finden sich 6 große Anbieter, 2 davon sind aber die besten!";

        int anzahlGB = 0;
        int anzahlKB = 0;
        int anzahlZA = 0;
        int anzahlSZ = 0;

        char[] chars = satz.toCharArray();

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
            else  {          //für einzelne operatoren -> else if (chars[i]=='#'|| chars[i]==',')
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
