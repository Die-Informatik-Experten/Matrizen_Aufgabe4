package model;

import java.util.Arrays;

/**
 * Diese Klasse baut mit vier Zufallszahlen aus der Zufallszahl
 * Klasse einen 2 x 2 Matrix auf.
 *
 * Die 2 x 2 Matrix wird mit der Methode matrixBauen()
 * als zweidimensionales Array int[][] zurückgegeben.
 *
 * Zum Schluss erstellen wir noch zwei Instanzen die
 * ueber die Methoden getM01() und getM02 aufrufbar sind.
 */

public class Matrix_2x2
{
    public int[][] matrixBauen()
    {
        //Wir erstellen eine neue Instanz der Zufallszahl klasse.

        Zufallszahl zufallszahl = new Zufallszahl();


        /*
        Aus dieser Instanz erstellen wir vier Zufallszahlen die
        wir in Variablen benannt nach Zeile und Spalte benennen.
        */

        int z0_s0 = zufallszahl.zufallszahlGenerieren();
        int z0_s1 = zufallszahl.zufallszahlGenerieren();
        int z1_s0 = zufallszahl.zufallszahlGenerieren();
        int z1_s1 = zufallszahl.zufallszahlGenerieren();

        //Jetzt setzten wir die Zufallszahlen in zwei Arrays, fuer die jeweiligen Zeilen ein.

        int[] zeile_0 = {z0_s0, z0_s1};
        int[] zeile_1 = {z1_s0, z1_s1};

        /*Die beiden Spalten setzten wir in ein zweidimensionales Array ein,
        um somit unsere 2 x 2 Matrix zu erhalten.
        */

        int[][] matrix = {zeile_0, zeile_1};


        System.out.println(Arrays.toString(zeile_0));
        System.out.println(Arrays.toString(zeile_1));
        System.out.println("");

        return matrix;
    }

    //Wir erstellen zwei Instanzen der Matrix_2x2 Klasse.

    static Matrix_2x2 matrix_01 = new Matrix_2x2();
    static Matrix_2x2 matrix_02 = new Matrix_2x2();

    //Die beiden Matrizen speichern wir in den Variablen m01 und m02 ab.

    static int[][] m01 = matrix_01.matrixBauen();
    static int[][] m02 = matrix_02.matrixBauen();

    //Damit andere Klassen auf die Matrizen zugriff haben, erstellen wir zwei Getter.
    public static int[][] getM01()
    {
        return m01;
    }

    public static int[][] getM02()
    {
        return m02;
    }

}


