public class inheritGrandchild extends inheritChild {
    /** have all static variable & public method from inheritChild only
     * cannor access static variable & public method from inheritParent
     * 
     */
    public String hobby;

    public inheritGrandchild(String name, String ability, String heigh, String weight, String eyesight,
            String interest, String hobby) {
        super(name, ability, heigh, weight, eyesight, interest);
        this.hobby = hobby;
        //TODO Auto-generated constructor stub
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return super.toString() + //will use .toString from inheritChild
        "Hobby: " + getHobby() + "\n" + getAbility();

        
    }
    
    public void iam() {
        super.iam();
        System.out.print("Granddaughter ");
    }
}
