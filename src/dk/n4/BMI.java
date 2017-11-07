/* KLASSEØVELSE
Simpelt Java-program, der kan udregne din BMI og fortælle dig, hvorvidt du er overvægtig eller ej.
Denne klasse indkapsler vores primitive datatyper + opretter metoder og constructors. Objekter oprettes i "UseBMIClass" */

package dk.n4;

public class BMI {

    //Klassevariabler
    private String name;
    private int age;
    private double weight;
    private double height;

    //Constructors
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    //Metoder
    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "- Undervægtig";
        else if (bmi < 25)
            return "- Normalvægtig";
        else if (bmi < 30)
            return "- Overvægtig";
        else
            return "- Fed";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

}