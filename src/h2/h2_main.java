package h2;

import java.util.ArrayList;
import java.util.Collections;

public class h2_main {
    public static void main(String[] args) {
        
        int i = 25;
        int j = 5;
        int k = 12;
        int min;
        int max; 

        //  Mit ArrayList wird eine Liste unsere zuvor angegebenen Variablen erstellt bzw. mit ihrem zugewiesenem Wert von (5,12,25)
        //  Die Idee dahinter ist das wir die Zahlen in dieser Liste nun nach Größe sortieren und uns dann die erste und letzte 
        //  Zahl, also min und max ausgeben lassen.

        ArrayList<Integer> zahlen = new ArrayList<>(); 
        
        zahlen.add(i);
        zahlen.add(j);
        zahlen.add(k);

        Collections.sort(zahlen);

        //  Collections.sort sortiert nun wie vorher besprochen die Zahlen nach Größe

        min = zahlen.get(0);
        max = zahlen.get(zahlen.size() -1 );

        //  Da die erste Zahl in einer ArrayList auf der Stelle 0 steht ist die kleinste Zahl auf der Stelle 0
        //  und da die Liste bei 0 beginnt ist die letzte Zahl auf der Position (Anzahl der Zahlen - 1) also (zahlen.size() -1 )
        
        System.out.println("Ursprüngliche Werte: i=" + i + ", j=" + j + ", k=" + k);
        System.out.println("Sortierte Liste: " + zahlen);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        //  Nun geben wir dem Benutzer noch eine klare übersicht seiner zuvor intergrierten Werte, ihrer Anordnung 
        //  in der Liste und der daraus folgenden Ermittleung von min und max
        




        //  Beim testen ist mir aufgefallen, dass es man in Java nicht einfach Dezimalzahlen verwenden kann, ich werde mich dazu weiter informierem und im laufe
        //  das Programm verbessern 
    }
}