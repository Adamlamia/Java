public class classes {
    /**
     * Inside of this you can create
     *  instance varible
     *  constructor
     *  methods
     */
    //instance variable is always private
    private String title;
    private String name;
    private int age;
    private String gender;


    //CONSTRUCTOR

    //Non-argument constructor
    public classes() {
    }
    
    //constructor with argument  
    public classes(String objName) {
        this.title = objName;
    }

    /**
     * a copy constructor
     * used by inserting an object as parameter 
     */ 
    public classes(classes objClasses) {
        if (objClasses == null) {
            System.exit(0);
        }
        //it will copy objclass instant variable
        this.title = objClasses.getTitle();
        this.age = objClasses.getAge();
        this.gender = objClasses.getGender();
        this.name = objClasses.getName();
    }


    //Setter and getter for .... well you know, to set and get the stored object
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return 
        "Title: " + getTitle() + "\n" + 
        "Name: " + getName() + "\n" +
        "Age: " + getAge() + "\n"+
        "Gender: " + getGender() + "\n";
    }
    
    //KIV donno what this do
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        classes other = (classes) obj;
        if (age != other.age)
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

    public static void main(String[] args) {
        //object named obj1 has been created
        classes obj1 = new classes("Peasent"); //invoke constructor with argument to store obj title
        
        obj1.setName("Adam");
        obj1.setGender("Male");
        obj1.setAge(20);
        
        //object named obj2 has been created
        classes obj2 = new classes(obj1); //invoke copy constructor to copy all value of object requested

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

        //comparing obj1 and obj2 names
        System.out.println(obj1.name.equals(obj2.name));
        
        //System.out.println(obj1.hashCode());
    }

}
