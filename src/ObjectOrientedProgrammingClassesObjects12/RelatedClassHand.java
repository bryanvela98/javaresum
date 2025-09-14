package ObjectOrientedProgrammingClassesObjects12;

public class RelatedClassHand {

    // This is going to be a class related to the Persona class.
    // A person has two hands, so we can create a Hand class to represent that.

    // Attributes
    private String handSize;
    private String skinColor;
    private int fingerCount;

    // Constructor
    public RelatedClassHand(String handSize, String skinColor, int fingerCount) {
        this.handSize = handSize;
        this.skinColor = skinColor;
        this.fingerCount = fingerCount;
    }

    // Getters
    public String getHandSize() {
        return handSize;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public int getFingerCount() {
        return fingerCount;
    }

}
