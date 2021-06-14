public class Constructor {
    /** Defining constructor
     * used by invoking it to construct an object
     * 
     * There can be more than 1 constructor
     * If no constructor written, the class will made it's non-arg constructor with empty body, a.k.a. Default Constructor
     * 
     */
    Constructor something;
    String name;
    int age;
    char gender;

    public Constructor() {
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Constructor getA() {
        return something;
    }

    public void setA(Constructor a) {
        this.something = a;
    }

    public void tellStory() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nGender: " + getGender() + "\n");
    }

    public Constructor(Constructor person){
        if (something == null) {
            System.exit(0);
        }
        name = something.getName();
        age = something.getAge();
        gender = something.getGender();
    }

}
class test{
    public static void main(String[] args) {
        //object a,b,c created
        Constructor a = new Constructor();
        Constructor b = new Constructor();
        Constructor c = new Constructor();
        Constructor d = new Constructor();

        //object a store info about Adam
        a.name = "Adam";
        a.age = 20;
        a.gender = 'L';
        
        //object b store info about Iman
        b.name = "Iman";
        b.age = 15;
        b.gender = 'L';

        //object c store info about Umar
        c.name = "Umar";
        c.age = 11;
        c.gender = 'L';

        //object d store info about Nuh
        d.name = "Nuh";
        d.age = 3;
        d.gender = 'L';

        a.tellStory();
        b.tellStory();
        c.tellStory();
        d.tellStory();


    }
}
