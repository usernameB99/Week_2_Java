package Woche2;

import java.util.Random;
public class GaudiMitArraysV1 {
    public static void main(String[] args) {


        int [] a = {1,2,3,4,5,6,7,8,9,0};

        Random r = new Random();

        int [] b = new int[100];
        for (int x = 0; x < b.length; x++) {            // b.length -> länge des array
            b[x] = r.nextInt (100) ;            // bound 100 zahlen von 1 bis 100
            System.out.println(b[x]);
        }

        boolean [] c = new boolean[10];
        for (int e = 0; e < c.length; e++){ // int e -> zur wiederholung der schleife
            c[e] = e % 2 == 0;
            System.out.println(c[e]);
        }

    }
}
