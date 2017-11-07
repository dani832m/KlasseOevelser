// Denne klasse opretter nye objekter baseret på de indkapslede data i BMI-klassen

package dk.n4;

public class UseBMIClass {

    public static void main(String[] args) {

        BMI bmi1 = new BMI("Oluf Sand", 63, 92, 1.80); //Nyt objekt (person)
        System.out.println("BMI'en for " + bmi1.getName() + " er "
                + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Ulla Hansen", 70, 1.70); //Nyt objekt (person)
        System.out.println("BMI'en for " + bmi2.getName() + " er "
                + bmi2.getBMI() + " " + bmi2.getStatus());

    }

}