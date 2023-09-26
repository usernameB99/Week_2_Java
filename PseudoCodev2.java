package Woche2;

import java.util.Scanner;

public class PseudoCodev2 {
    public static void main(String[] args) {

        boolean cont = true;

        do {
            System.out.println("Welche Zahl soll geprüft werden?");

            Scanner sc = new Scanner(System.in);
            int z = sc.nextInt();


            boolean pz = true;

            for (int t = 2; t <= z - 1; t++) {

                if (z % 2 == 0) {
                    pz = false;
                }
            }

            if (pz)
                System.out.println(z + " " + "ist eine Primzahl.");

            else
                System.out.println(z + " " + "ist keine Primzahl.");

            System.out.println("Soll noch eine Zahl geprüft werden?");
            cont = sc.nextBoolean();

        } while (cont);

        System.out.println("Primzahl-Erkennungs-Programm wird beendet...");
    }
}
