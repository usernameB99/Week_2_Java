package Woche2;

import java.util.Random;                                          // j-1
                                                                  //    j
public class GaudiMitStatistikV2 {                                //  i
    public static void main(String[] args) {                      //  0 1 2 3 4 5 6
                                                                  // (8,5,2,5,3,1,9)
        Random r = new Random();                                  //             | .length-1

        int[] numbers = new int[100];                             // initialisierung eines neuen int arrays
        for (int d = 0; d < numbers.length; d++) {                // for-schleife für belegung des leeren int array
            numbers[d] = r.nextInt(100);                    // belegung mit zufallszahlen 0-100
        }

        for (int i = 0; i < numbers.length; i++) {                // geht elemente von array von index bis letztes durch
            for (int j = 1; j < numbers.length - i; j++) {        // start pos 1, bis length-1 (um das letzte element auszuschließen)
                if (numbers[j - 1] > numbers[j]) {                // wenn j-1(=vorgänger von j) größer als j ist ->
                    int temp = numbers[j];                        // zwischenspeichern von j (das ersetzt wird)
                    numbers[j] = numbers[j - 1];                  // vorgönger(-j) ersetzt j
                    numbers[j - 1] = temp;                        // einsetzen von zwischengesp. element auf j-1(vorgängerplatz)
                }
            }                                                     //* i= variable zum zählen
        }                                                         //* j= variable zum prüfen

        for (int p = 0; p < numbers.length; p++) {                // schleife zum ausgeben vom array
            System.out.print(numbers[p] + " ");
        }
    }
}
