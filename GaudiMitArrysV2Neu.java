package Woche2;

public class GaudiMitArrysV2Neu {
    public static void main(String[] args) {


        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] chars = alphabet.toCharArray();

        int howmuch = -27;

        if (howmuch < 0){
            for (int mal = 0; howmuch < mal; mal++){
                howmuch = howmuch + 26;
            }
        }
        else if (howmuch > 26){
            howmuch = howmuch % 26;
        }

        for (int turn = 0; turn < howmuch; turn++ ){               // schleife zum wiederholen von anzahl d. rotationen

        char lastElement = chars[chars.length-1];                 //3. char lastElement saves last(/first) from Array
        for (int i = chars.length-1; i > 0; i--) {                //1. start v. -1 ; from 0 up; i-- i goes down one step
            chars[i] = chars[i-1];                                //2. Array letztes wird mit -1 zum vorherigen nachbarn
        }
        chars[0] = lastElement;                                    //4. lastElement wird nun an index im array eingefügt
        }
        System.out.println(chars);
    }
}
