package Woche2;

public class PseudoCode {
    public static void main(String[] args) {

        int z = 1;

        boolean pz = true;

        for (int t = 2; t <= z - 1; t++) {

            if (z % 2 == 0) {
                pz = false;
            }
        }

        System.out.println(pz);


    }
}
