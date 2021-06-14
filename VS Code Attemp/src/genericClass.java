public class genericClass<T,U> {
    T objT;
    U objU;

    public genericClass(T objT, U objU) {
        this.objT = objT;
        this.objU = objU;
    }

    public T getObjT() {
        return objT;
    }

    public void setObjT(T objT) {
        this.objT = objT;
    }

    public U getObjU() {
        return objU;
    }

    public void setObjU(U objU) {
        this.objU = objU;
    }

    public void print() {
        System.out.println(objT);
        System.out.println(objU);
    }
}
//this is the class to test above
class tease {
    public static void main(String[] args) {
        //instance of  integer and string type
        genericClass<Integer,String> iObj = new genericClass<Integer,String>(15,"Nice");
        System.out.println(iObj.getObjT() + " " + iObj.getObjU());        

        //or

        //using method to print
        genericClass<Character,Double> jObj = new genericClass<Character,Double>('Z', 52.33);
        jObj.print();
    }
}
