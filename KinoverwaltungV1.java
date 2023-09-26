package Woche2;

import java.util.ArrayList;
import java.util.Scanner;

public class KinoverwaltungV1 {
    public static void main(String[] args) {

//Geld Abfrage
        System.out.println("Guten Tag, wie viel geld haben Sie dabei? (Es werden mind 15€ benötigt um fortzufahren)");
        Scanner sc = new Scanner(System.in);
        int moneycustomer = sc.nextInt();

        if (moneycustomer < 15) {
            System.out.println("Sie haben nicht genug Geld, gengans wieda Ham!");
            System.exit(moneycustomer);
        }


        String [][] FilmDaten = new String [4][5];

        FilmDaten [0][0] = "Film Nr."; FilmDaten [0][1] = "Film Name"; FilmDaten [0][2] = "Uhrzeit"; FilmDaten [0][3] = "Saal"; FilmDaten [0][4] = "Restplätze";
        FilmDaten [1][0] = "1."; FilmDaten [1][1] = "Batman"; FilmDaten [1][2] = "20:15"; FilmDaten [1][3] = "1"; FilmDaten [1][4] = "5";
        FilmDaten [2][0] = "2."; FilmDaten [2][1] = "Pokemon"; FilmDaten [2][2] = "22:00"; FilmDaten [2][3] = "3"; FilmDaten [2][4] = "2";
        FilmDaten [3][0] = "3."; FilmDaten [3][1] = "Cats"; FilmDaten [3][2] = "17:00"; FilmDaten [3][3] = "2"; FilmDaten [3][4] = "0";

        ArrayList<Integer> choosenMovies = new ArrayList();

        int welcherfilm;

//Filmtabelle Ausgabe
        boolean cont = true;
        do {

            //Auswahl Film
            do {

            for (int i = 0; i < FilmDaten.length; i++) {                                        // durchlauf aller zeilen
                for (int j = 0; j < FilmDaten[0].length; j++) {     // [i] same as [0]                     // durchlauf aller spalten


                   /* if (i == 0 || j !=4){                                             // alternative mit umgekehrter schreibweise
                        System.out.printf(FilmDaten[i][j]+" ");
                    }
                    else {
                        int seatsleft = Integer.parseInt(FilmDaten[i][j]);
                            if (seatsleft > 0) {
                                System.out.print("verfügbar");
                            }
                            else {
                                System.out.print("ausgebucht");
                            }
                    }
                    */
                    String verfügbar = "verfügbar" ;
                    String ausgebucht = "ausgebucht";

                    if (i >= 1 && j == FilmDaten[i].length-1) {                                                                     //i>=1 && j==4
                        int seatsleft = Integer.parseInt(FilmDaten[i][j]);
                        if (seatsleft > 0) {
                            System.out.printf("%-15s",verfügbar);
                        }
                        else {
                            System.out.printf("%-15s",ausgebucht);
                        }
                    }
                    else {
                        System.out.printf("%-15s",FilmDaten[i][j]);
                    }

                }

                if (i == 0) {
                    System.out.println();
                    System.out.print("-----------------------------------------------------------------------");

                }
                System.out.println();
            }
            System.out.print("-----------------------------------------------------------------------");
            System.out.println();


                do {
                    System.out.println("Welchen (nicht ausgebuchten) Film möchtest du sehen? (0 zum abbrechen)");
                    Scanner sc1 = new Scanner(System.in);
                    welcherfilm = sc.nextInt();


                    if (welcherfilm == 0) {
                        System.out.println("Vielen Danke für Ihren Besuch.");
                        //System.exit(0);
                    }
                } while (welcherfilm < 0 || welcherfilm > FilmDaten.length - 1);   //nachfragen: .length-1 ?-> -1 = index?

                if (FilmDaten[welcherfilm][4].equals("0")) {
                    System.out.println("Dieser Film ist ausgebucht.");
                }
                else if (welcherfilm != 0) {
                    int available = Integer.parseInt(FilmDaten[welcherfilm][4]);
                    int howmany;
                    int price;

// Abfrage Verfügbarkeit
                    do {  // <- do is gut oda nix
                        System.out.println("Es sind noch " + available + " Tickets um je 15€ verfügbar. Wie viele möchten Sie kaufen?");

                        Scanner sc2 = new Scanner(System.in);
                        howmany = sc.nextInt();

                        price = (15 * howmany);
//Ticket-Kauf

                        if (howmany <= available && price <= moneycustomer && howmany > 0) {
                            System.out.println("Du kaufst " + howmany + " Tickets um " + price + "€ und hast jetzt noch " + (moneycustomer - price) + "€");   //sprung nach oben

                            for (int i = 0; i < howmany; i++) {
                                choosenMovies.add(welcherfilm);
                            }




                            moneycustomer = moneycustomer - price;

                            available = available - howmany;

                            FilmDaten[welcherfilm][4] = String.valueOf(available);




                        } else if (howmany > available) {
                            System.out.println("Es sind nicht genug Tickets verfügbar. Verfügbare Tickets: " + available);
                        } else if (price > moneycustomer) {
                            System.out.println("Sie haben nicht genug Geld dabei.");
                        }
                    } while (howmany > available || price > moneycustomer);
                }
                else {
                    cont = false;
                }
            } while (! FilmDaten[welcherfilm][4].equals("0") && welcherfilm != 0);




        } while (cont);
// schleife groß einfügen

    }
}
