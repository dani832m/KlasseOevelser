//Her oprettes objekter baseret på klassen "CirleWithException". Læs mere i den angivne klasse.

//Package for tilhørende klasser
package dk.n4;

public class TestCircleWithException { //Angiver access modifier og klassens navn

    public static void main(String[] args) { //Kører main-metoden (PSVM)

        //Try-and-catch-block, der illustrerer brugen af exceptions i Java
        try { //Prøver at lave tre nye objekter med en specifik radius
            CircleWithException c1 = new CircleWithException(5); //Cirkel-objekt bliver oprettet
            CircleWithException c2 = new CircleWithException(-5); //Her er radius negativ, det må den ikke være
            CircleWithException c3 = new CircleWithException(0); //Denne cirkel oprettes aldrig pga. fejl i forrige
        }
        catch (IllegalArgumentException ex) { //Obj. med negativ radius bliver opfanget af "IllegalArgumentException"
            System.out.println(ex); //Fejlen printes i konsollen
        }

        //Kalder metoden "getNumberOfObjects()" på obj. fra "CircleWithException" og udprinter resultatet i konsollen
        System.out.println("Antal af cirkel-objekter oprettet: " + CircleWithException.getNumberOfObjects() + ".");

    }

}