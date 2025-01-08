package Miscellaneous;

public class Student {
    private String name;
    private Integer id;
    Student(String name,int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public  int hashCode(){
        return this.id.hashCode()+this.name.hashCode();
        // now hashcode are sam because values are same
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj.getClass()!= this.getClass()) {
            return  false; // comparing same class object here.;
        }
        Student student=(Student) obj;
        if(this.id.equals(student.id) && this.name.equals(student.name)){
            return true;
        }
        return false;


    }


    public static void main(String[] args) {

        Student s=new Student("Gurmeet",1);
        Student s1=new Student("Gurmeet",1);
        System.out.println(s.equals(s1)); // false
        // with object this is comparing reffernce.
        // need to override equals methods
        System.out.println(s); // s is not exactly hashcode
        System.out.println(s1);


    }

}
// == checks the refrence.
// equals method is returning true;
// hashcode for two objects are different

// Java contract, equals should return true only when hashcode of objects are same.
//  but our program return true and hashcode is not same
// conclusion -when we make changes to equals need to do changes is hashcode also and vice versa.



