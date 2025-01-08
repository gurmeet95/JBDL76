package Inheritance;

public class MainForPolyMorphism {
    public static void main(String args[]){
        Calculator c=new Calculator();
        System.out.println(c.add(1,2,3));
        AdvanceCalc ad2=new AdvanceCalc();
        System.out.println(ad2.add(10,20,30));
        //at compile time it was already decided that which method to call
        //this is known as compile time polymorphism.

        Calculator c2= new AdvanceCalc();
        // this is upcasting done by compiler,our object has been parent object hence mul method is not available
        // used ref of parent
        // object of child
        AdvanceCalc ad1=(AdvanceCalc) c2; //this is lower cast now mul method is available.

        System.out.println(c2.add(50,60,80));
        // compiler is taking me to parent class
        // run time ,it will call child method
        //run time polymorhism
        // if add is not present in calculator it will give run time error.
        // if in child same method is not over ride it will return parent other wise child method.
        System.out.println(ad1.multiply(10,20));

    }

}
