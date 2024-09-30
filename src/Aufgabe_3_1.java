public class Aufgabe_3_1 {

    // Methode fuellt das Feld mit Zufallszahlen aus derm Intervall [1,100]
    public static void fillRand(int[] feld) {
	for (int i=0;i<feld.length;i++){
	    feld[i] = (int) (Math.random() * 100) + 1;
	}
    }

    public static void main(String[] args){
	int [] feld = new int[10];
	fillRand(feld);

	/* *** Aufgabenteil (a) *** */
        // 1.5

	
	/* *** Aufgabenteil (b) *** */
        // 3


	/* *** Aufgabenteil (c) *** */
        // 2.5
	
    }
}

