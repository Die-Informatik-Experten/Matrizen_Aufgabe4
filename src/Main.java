import model.Addition;
import model.Multiplikation;

import java.util.Arrays;

/**
 * In unserer Main Klasse erstellen wir fuer die Multiplikation
 * und die Addition von zwei 2 x 2 Matrizen jeweils eine Instanz
 * der entsprechenden Klasse.
 *
 * Anschliessend rufen wir in jeweils einem Print-Statement die
 * Methode zum Addieren bzw. Multiplizieren auf und geben die
 * Ergebnisse aus.
 */

public class Main
{
    public static void main(String[] args)
    {
        Multiplikation multiplikation = new Multiplikation();
        System.out.println("Die Multiplikation der Matrizen ergibt: " + Arrays.deepToString(multiplikation.matrizenMultiplizieren()));

        Addition addition = new Addition();
        System.out.println("Die Addition der Matrizen ergibt: " + Arrays.deepToString(addition.matrizenAddieren()));
    }
}