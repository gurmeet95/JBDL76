package Interface;

public interface InterfaceDemo2 {
    int getA();
    default String getDefault(){
        return "Returning from Default,InterfaceDemo2";
    }

}
