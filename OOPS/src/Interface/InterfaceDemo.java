package Interface;

// interface what to do;
// class how to do;

public interface InterfaceDemo {

    int a=10; // by default,it is public,static and final
    int getA(); // methods are public and abstract by default

    static String getStatic(){
        return "Coming from Interface,getStatic()";
    }

    default String getDefault(){
        System.out.println(insideMethodsOnly());
        return "Coming from Interface demo,Default method";
    }
    private String insideMethodsOnly(){
        return "We only use private method in different methods inside interface only.";
    }



}
