package Miscellaneous;

public class LoggerClient {
    public static void main(String[] args) {
       // Logger logger =new Logger();  not able because private const. of Logger
       Logger i= Logger.getInstance();
       i.printlog("Printing logs");
        System.out.println(i);
        i=null;
        System.out.println(i);

        Logger i1= Logger.getInstance();

        System.out.println(i1);
        // hashcode for both are same because Logger class is singleton class.
        //only one instance throughout the project.
    }
}
