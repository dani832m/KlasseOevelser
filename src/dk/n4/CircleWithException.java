/* KLASSEØVELSE
Denne klasse indeholder variabler, constructors og metoder til at konstruere et cirkel-objekt.
Desuden illustreres, hvordan "exceptions" fungerer i Java. Objekter oprettes i "TestCircleWithException" */

//Package for tilhørende klasser
package dk.n4;

public class CircleWithException { //Angiver access modifier og klassens navn

    //Deklarerer variablen "radius" inkl. angivelse af access modifier
    private double radius;

    //Deklarerer og initialiserer variablen "numberOgObjects" inkl. angivelse af access modifier
    private static int numberOfObjects = 0; //Antal af objekter kreeret, default sat til 0

    //Constructor, der automatisk kreerer et objekt med en radius på 1
    public CircleWithException() {
        this(1.0);
    }

    //Constructor, der tager ét parameter ind, kaldt "newRadius"
    public CircleWithException(double newRadius) {
        setRadius(newRadius); //Angiver, at parameter "newRadius" skal være objektets radius - Se metode længere nede
        numberOfObjects++; //Lægger 1 til variablen "numberOfObjects", når denne constuctor kaldes
    }

    //Metode, der returnerer objektets radius
    public double getRadius() {
        return radius;
    }

    //Metode, der giver objektet en ny radius
    public void setRadius(double newRadius) //Access modifier og variabelnavn på metode. Tager ét parameter ind
            throws IllegalArgumentException { //Kaster exception videre. Håndteres ikke her
        //If-statement, der håndterer en radius på 0 eller under
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new IllegalArgumentException(
                    "Radius kan ikke være negativ!");
    }

    //Metode, der returnerer vores variabel "numberOfObjects"
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    //Metode, der returnerer arealet af cirkel
    public double findArea() {
        return radius * radius * 3.14159;
    }

}