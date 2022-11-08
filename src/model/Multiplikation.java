package model;

/**
 * In dieser Klasse multiplizieren wir zwei Matrizen miteinander.
 * Die Matrizen entstammen der Klasse Matrix_2x2.
 *
 * Das Ergebnis wird als zweidimensionales Array int[][] ausgegeben.
 */

public class Multiplikation
{
    public int[][] matrizenMultiplizieren()
    {
        /*
        Zunaechst holen wir uns zwei Matrizen aus der Matrix_2x2 Klasse
        und speichern sie in den Variablen m01 und m02.
        */

        int[][] m01 = Matrix_2x2.getM01();
        int[][] m02 = Matrix_2x2.getM02();

        /*
        Nun multiplizieren wir die Matrizen.
        Der erste Index gibt jeweils die Zeile und der zweite Index die Spalte der Faktoren an.
        Die Ergebnisse werden in Variablen multix_x abgespeichert.
         */

        int multi0_0 = m01[0][0] * m02[0][0] + m01[0][1] * m02[1][0];
        int multi0_1 = m01[0][0] * m02[0][1] + m01[0][1] * m02[1][1];
        int multi1_0 = m01[1][0] * m02[0][0] + m01[1][1] * m02[1][0];
        int multi1_1 = m01[1][0] * m02[0][1] + m01[1][1] * m02[1][1];

        //Nun fuegen wir die Ergebnisse zu einem zweidimensionalen Array zusammen und geben dieses zurueck.

        int[][] multiplikationsergebnis = {{multi0_0, multi0_1},{multi1_0, multi1_1}};

        return multiplikationsergebnis;

    }

}
