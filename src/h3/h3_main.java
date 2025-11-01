package h3;

public class h3_main {
    public static void main(String[] args) {

        int i = 21;
        int j = 25;

        int k = -10;

        boolean ausdruck1 = (i >   j); //   Es wurden Leerzeichen hinzugefügt, um die Auflistung besser erscheinen zu lassen
        boolean ausdruck2 = (i > 200);
        boolean ausdruck3 = (j > 100);

        // Jetzt müssen wir herausfinden bei welchen kombinationen von Wahr und Falsch welchen Wert k bekommen soll

        if (ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 1;
        } else if (ausdruck1 && ausdruck2 && !ausdruck3) {
            k = 2;
        } else if (ausdruck1 && ausdruck2 && ausdruck3) {
            k = 3;
        } else if (!ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 4;
        } else {
            k = -10;
        }

        //  k wird nun entweder 1, 2 oder 3 sein, je nachdem welche Kombination der Aussagen wahr ist. Sollten alle Aussagen falsch sein entspricht k = 4 und 
        //  und wenn irgend etwas anderes passieren sollte bleibt k = -10
        
        System.out.println("Werte: i=" + i + ", j=" + j);
        System.out.println("Ausdrücke: 1 (i>j)=" + ausdruck1 + ", 2 (i>200)=" + ausdruck2 + ", 3 (j>100)=" + ausdruck3);
        System.out.println("Endwert von k: " + k);

        //  über die zweite println (line 33) kann der Benutzer erfahren welche der Aussage als true oder false gewertet worden sind.
    }
}