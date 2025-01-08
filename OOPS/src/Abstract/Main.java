package Abstract;

public class Main {
    public static void main(String[] args) {
        Demo2 d2=new Demo2();
        System.out.println(d2.getA1());
        d2.printB();

       //  Demo_Abstract d1=new Demo_Abstract() ; not work because
        // we can not create object of Abstract class
        Demo_Abstract d1=new Demo_Abstract(){
            @Override
            public String getA1(){
                return "From Anonymous getA1()";
            }// not mandatory to override it because this is not abstract method

            @Override
            public void printB() {
                System.out.println("In Anonymous class also we must need to provide body to Abstract method.");
            }
        }; // anonymous class which got create internally
        System.out.println(d1.getA1());
        d1.printB();
        //Generally we use interfaces because we have multiple Inheritance
        // in Interfaces but not in Abstract classes.




    }
}
