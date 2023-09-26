package Woche2;

public class GaudiMitArraysv2 {
    public static void main(String[] args) {


        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] chars = alphabet.toCharArray();

        int howmuch = -3;

        if (howmuch < 0){                           // falls wert kleiner als 0 ist

            for (int h = 0;howmuch<0; h++ ) {      // howmuch wird in jeder runde +25 bis wert über 0 ist
                howmuch = (howmuch + 25);
            }
        }
        else if (howmuch > 26) {                    // falls wert größer als 26 ist
            howmuch = howmuch % 26;                 // modulo 26  od. alternativ % .length
        }

        for (int i = 0; i < howmuch; i++) {         // schleife zum verschieben des array (so oft wie howmuch)
            int j;                                  // speichern von letztem wert im array
            char last;                              // initialisierter charcter last

            last = chars[chars.length - 1];         //
            for (j = chars.length - 1; j > 0; j--) {    //verschieben von elementen in array um 1 stelle
                chars[j] = chars[j-1];                  //
            }

                chars[0] = last;                        // letztes element wird auf 1.pos der schleife gesetzt
        }
        for (int i=0; i<chars.length;i++) {                     // for schleife für Ausgabe in konsole
            System.out.print(chars[i]);
        }
    }
}
