package model;

/**
 * Diese Klasse generiert Zufallszahlen aus der Menge der ganzen Zahlen.
 * Wir grenzen dies jedoch mit einem Minimum von -100 und einem Maximum von 100 ein.
 *
 * Die Zufallszahl kann mit der Methode zufallszahlGenerieren() aufgerufen werden.
 */

public class Zufallszahl
{
    //Zufallszahlen generieren

    public int zufallszahlGenerieren()
    {
        int Minimum = -100;
        int Maximum = 100;
        int RandomInt = Minimum + (int)(Math.random() * ((Maximum - Minimum) + 1));

        return RandomInt;
    }
}
