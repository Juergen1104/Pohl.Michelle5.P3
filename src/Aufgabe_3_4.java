import java.awt.image.BufferedImage;

public class Aufgabe_3_4 {
    // 4P
 
    public static void main(String[] args){
	int W = 360;  // Breite des Bilds = Anzahl Spalten
	int H = 220;  // Hoehe des Bilds  = Anzahl Zeilen

        // Bild mit H Zeilen und W Spalten
	int[][] ffData = new int[H][W];  

        int blue = -16777003; // int Wert der Farbe (r=0,g=0,b=213)
        int white = -1;       // int Wert der Farbe (r=255,g=255,b=255)

        
        // hier Code einfügen....
        
	
	

	// Bild in Datei schreiben
        BufferedImage finFlag = ImageTools2.createImage(ffData);
	ImageTools2.writeImage(finFlag,"finnland.png");

    }
}
