package Woche2;

public class KleinerAlgorythmus {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int count = 10;


        for (int r = 0; r < count; r++) {

            int c=a+b;
            System.out.println(a + "+" + b + "=" + c);

            a = b; b=c;

        }
    }
}