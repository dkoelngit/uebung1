package h1;
import java.util.Random;

// Die Idee ist das wir z nicht nur einfach als eine feste Variable definieren wollen, sondern z einen zufälligen Wert von 0 bis 50 hat.
// Wenn man z einen festen Wert bekommen soll, klammert man Line 9-12 aus und kann danach z manuell einen Wert zuweisen. 

public class h1_main {
    public static void main(String[] args) {
        Random rand = new Random();
        int z = rand.nextInt(50);
        z = z + 1;
        System.out.println("z ist "+ z);

        if (z>10) {
            System.out.println("Der Wert von z ist über 10, demnach werden 10 abgezogen"); 
            //Mit den beiden prints sieht der Benutzer was das ursprüglich Z war und das jetzt 10 abgezogen werden, da es größer als 10 ist
            z = z - 10;
            System.out.println("Der neue Wert von z ist " + z);
        } else { System.out.println("Da z kleiner als 10 ist passiert nichts");

        }
    }
}

//test test für neues repo

