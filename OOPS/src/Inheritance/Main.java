package Inheritance;

public class Main {
    public static void main(String[] args ){
        AdvanceCalc abc=new AdvanceCalc();
        System.out.println(abc.hashCode());
        Calculator c=new Calculator();
        System.out.println(c.hashCode());
        System.out.println(abc.a);
        System.out.println(abc.ParentA());


        Address a1=new Address("123","delhi");
        Student s1=new Student("Gurmeet",a1);

        System.out.println(s1.getName());
        System.out.println(s1.getAddress()); // print address not value need to check.
        // override tostring in address. 


    }


}
