package ObjectOrientedProgrammingClassesObjects12;

import ObjectOrientedProgrammingClassesObjects12.RelatedClassHand;
import ObjectOrientedProgrammingClassesObjects12.RelatedEnumRace;

public class RelatedClassPersona {

    // This is the main class that represents a person.
    // We will relate this class to other classes like Hand and Leg.

    // Attributes
    private String name;
    private String lastName;
    private RelatedClassHand leftHand; // Composition: A person has hands
    private RelatedClassHand rightHand; // Composition: A person has hands
    private RelatedEnumRace race; // Enumeration: A person's race

    // Here is how we can use the RelatedClassHand and RelatedEnumRace classes in
    // the
    // Persona class.

    // Constructor
    public RelatedClassPersona(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.leftHand = new RelatedClassHand("Medium", "Light", 5);
        this.rightHand = new RelatedClassHand("Medium", "Light", 5);
        this.race = RelatedEnumRace.ASIAN;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public RelatedClassHand getLeftHand() {
        return leftHand;
    }

    public RelatedClassHand getRightHand() {
        return rightHand;
    }

    public RelatedEnumRace getRace() {
        return race;
    }

}
