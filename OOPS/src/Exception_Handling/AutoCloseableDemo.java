package Exception_Handling;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseableDemo implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("I am in Close method.");
    }
    public void print_data(){
        System.out.println("I am in print data method");
    }

    public static void main(String[] args) throws IOException {
        AutoCloseableDemo demo=new AutoCloseableDemo();
        try{
            demo.print_data();
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            demo.close();
           // System.out.println("I am in finally");
            // inside finally we generally close the things.
        }
        // with the help of try with resource we can do this without finally also.
        try(AutoCloseableDemo d1=new AutoCloseableDemo(); FileReader reader=new FileReader("")) {

        }catch (Exception ex){
            ex.printStackTrace();
        }
        //this code from line 28 to line 32 is exactly same from line 17 to 26.
        //try with resources by default called close methods for resources passes in try();
        // try with resources, need to have a class implementing Closeable.
        // i.e AutoCloseableDemo  must implement Closeable.
        // internally FileReader also implements Closeable or giving body to Closeable .
       // if we want finally can be there but not for closing resources.
    }


}
