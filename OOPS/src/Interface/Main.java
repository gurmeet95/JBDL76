package Interface;

public class Main {
    public static void main(String[] args) {
        DemoClass d1=new DemoClass();
        System.out.println(d1.getA());
        System.out.println(d1.getDefault());
        System.out.println(InterfaceDemo.getStatic());
    }
}
