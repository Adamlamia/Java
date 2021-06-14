public class inheritChild extends inheritParent { //this is subclass of inheritParent, but superclass for inheritGrandchild
    /** have all static variable & public method from inheritParent
     *  no access to private fields from inheriParent
     */
    public String interest;
    
    //constructor of inherit Child
    public inheritChild(String name, String ability, String heigh, String weight, String eyesight, String interest) { //always remember to add parameter for subclass constructor 
        super(name, ability, heigh, weight, eyesight);
        this.interest = interest;
        //TODO Auto-generated constructor stub
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return super.toString() + //will use .toString from inheritParent
        "Interst: " + getInterest() + "\n"; //then add new trait
    }

    public void iam() {
        super.iam();
        System.out.print("Son ");
    }
}
