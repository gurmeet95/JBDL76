package Interface;

public class DemoClass implements InterfaceDemo,InterfaceDemo2{
    @Override
    public int getA() {
        return  3;
    }
    @Override
    public String getDefault(){
        return "Now returning from Override getdefault in Class demo.";
        // return InterfaceDemo.super.getDefault();  to return specific default method.
        // becuase we have this default method in both interfaces,
        // we need to override it here to remove ambiguity.
    }




}
