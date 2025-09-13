package ObjectOrientedProgramming12;
import ObjectOrientedProgramming12.RelatedClassHand;
import ObjectOrientedProgramming12.RelatedEnumRace;

public class RelatedClassPersona {

    // This is the main class that represents a person.
    // We will relate this class to other classes like Hand and Leg.

    // Attributes
    private String name;
    private String lastName;
    private RelatedClassHand leftHand;
    private RelatedClassHand rightHand;
    private RelatedEnumRace race;

    // Constructor
    public RelatedClassPersona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.leftHand = new RelatedClassHand("Medium", "Light", 5);
        this.rightHand = new RelatedClassHand("Medium", "Light", 5);
        this.race = RelatedEnumRace.ASIAN;
    }

}
