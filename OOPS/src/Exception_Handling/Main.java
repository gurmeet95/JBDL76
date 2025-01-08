package Exception_Handling;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private static void recursiveMethod(){
        recursiveMethod();
    }

    public static void main(String[] args) {
        List<Date> l1=new ArrayList<>();
//        while(true){
//            System.out.println("Inside while");
//            l1.add(new Date());
//        }
        // this will give heap out of space error.

       // recursiveMethod();  it will give stack overflow error

        // we can not handle error if it will come it will.

    }
}
