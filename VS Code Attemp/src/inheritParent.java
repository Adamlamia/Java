public class inheritParent { //this is the superclass of inheritChild
    /** Defining inheritance
     * Mechanism of expending existing classes by adding methods and fields
     * 
     * 
     * Advantage: code reuse
     * consist of: 
     * "base class" (superclass or parent class or ancestor) as the dad
     * -can have 
     * 
     * "derived class" (subclass or child class or decendent) dad's children
     * -automathically has all static variable and public method from superclass
     * -no access to private fields from super class
     * ____________________________________________________________________________
     * 
     * use super() to invoke no-argumentor constructor of superclass
     * super. can also be use to call method  
     * 
     * cannot do multiple inheritance throught class
     * we need to use interface to achieve multiple inheritance
     */

    public String name;
    public String ability;
    public String heightTrait;
    public String weightTrait;
    public String eyesightTrait;

    //constructor of inheritParent
    public inheritParent(String name, String ability, String heigh, String weight, String eyesight) {
        this.name = name;
        this.ability = ability;
        this.heightTrait = heigh;
        this.weightTrait = weight;
        this.eyesightTrait = eyesight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getHeightTrait() {
        return heightTrait;
    }

    public void setHeightTrait(String heightTrait) {
        this.heightTrait = heightTrait;
    }

    public String getWeightTrait() {
        return weightTrait;
    }

    public void setWeightTrait(String weightTrait) {
        this.weightTrait = weightTrait;
    }

    public String getEyesightTrait() {
        return eyesightTrait;
    }

    public void setEyesightTrait(String eyesightTrait) {
        this.eyesightTrait = eyesightTrait;
    }

    @Override
    public String toString() {
        return 
        "Name: " + getName() + "\n" +
        "Ability: " + getAbility() + "\n" +
        "Height: " + getHeightTrait() + "\n" +
        "Weight: " + getWeightTrait() + "\n" +
        "Eyesight: " + getEyesightTrait() + "\n";
    }
    
    public void iam() {
        System.out.print("Dad ");
    }
}
