package Woche2;

public class CleanThis {
    public static void main(String[] args) {
        int age = 17;
        boolean withAdult = true;
        boolean VIP = true;
        if (age >= 18) {
            System.out.println("grünes Armband");
        }
        else if (age >= 16 && age < 18) {
            System.out.println("gelbes Armband");
        }
        else if (age >= 4 && age < 16 && withAdult) {
            System.out.println("rotes Armband");
        }
        else {
            System.out.println("kein Zutrit");
        }
        if (VIP && age >16 || VIP && withAdult && age >=4) {
            System.out.println("Goldenes Armband dazu!");
        }
    }
}