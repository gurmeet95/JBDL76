package Miscellaneous;

public class Logger {

    private static Logger instance; // lazy initialized
    // public static Logger instance=new Logger(); Early Initialized

    // private constructor, not able to make object from outside of the class.
    private Logger(){

    }
    //static method
    public static Logger getInstance(){
     if(instance==null) instance=new Logger();
     return instance;
    }
    public void  printlog(String logg){
        System.out.println(logg);
    }


}
// multiple threads running inside
// 2 threads may create 2 objects
// that's why this code is not thread safe.
// making this class thread safe is our responsibility.

// early initialization is thread safe.