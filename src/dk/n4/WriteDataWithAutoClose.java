/* KLASSEØVELSE
Dette lille program kan skrive til en fil, og auto-closer filen efterfølgende. En ny funktion i JDK 7 */

package dk.n4;

public class WriteDataWithAutoClose { //Angiver access modifier og klassens navn

    public static void main(String[] args) throws Exception { //Main-metode, kaster exceptions videre

        java.io.File file = new java.io.File("scores.txt"); //Laver nyt objekt i File-klassen

        //Hvis objektet allerede eksisterer, så lukkes systemet og resten af koden eksekveres ikke!
        if (file.exists()) {
            System.out.println("Filen eksisterer allerede!");
            System.exit(0);
        }

        try ( //Auto-closer
              // Laver nyt PrintWriter-objekt og initialiserer det til at være vores File-objekt
              java.io.PrintWriter output = new java.io.PrintWriter(file);
        ) {
            //Skriver fire formaterede linjer i objektet (txt-filen)
            output.print("Hugo K Børge ");
            output.println(90);
            output.print("Karin F Prutskid ");
            output.println(85);
        } //Try-block lukkes

    } //Main lukkes

} //Klassen lukkes