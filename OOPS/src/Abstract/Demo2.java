package Abstract;

public class Demo2 extends Demo_Abstract{
   // if our parent class have abstract method we need to provide
    // body to that abstract method inside child.


    @Override
    public void printB() {
        System.out.println("I am abstract method of Parent,Override in Child");
    }
}
