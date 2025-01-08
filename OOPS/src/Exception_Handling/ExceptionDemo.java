package Exception_Handling;

import java.io.FileReader;

public class ExceptionDemo {
    public int divide(int a, int b) {
        return a / b;
    }
    public static String exceptionMethod() throws Exception{
        throw new  Exception("Exception Throw");
        //return "a";
        //throws keyword, is not dependent upon how code is written.
        // throws indicate that this method may throw exception.
    }

    public static void main(String[] args) {
        ExceptionDemo e1 = new ExceptionDemo();
        //e1.divide(3,0); this will give divide by zero exception and program stops.
        try {
            e1.divide(3, 0);
        } catch (Exception e) {
            System.out.println(e);
            //String a=null;
            // System.out.println(a.length());
            //this also give error because whatever is in try that only taken care of.
            // but we can have another try and catch inside catch.
            try {
                String a = null;
                System.out.println(a.length());
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }

        System.out.println("I am out of try,catch and program running well");
       // FileReader filereader =new FileReader("");
        // this is checked exception we need to manage it at compile time.
     try{
            exceptionMethod();
       }catch(Exception e){
            e.printStackTrace(); //print at end
          // System.out.println(e);

        }finally{
         System.out.println("I am in finally block");
         //no matter exception is there or not finally will always execute.
         //without catch also we can have finally with try.
     }
     //   exceptionMethod(); if want to use this only.add throws Exception i main
        //but this is not handling this is only passing to main.
        System.out.println("Normal excecution");
    }
    }

//try catch-try
// try- critical lines,in which exception can come.
// classes coming from Exception are Checked exception.
// Classes coming from Runtime are unchecked exception.
//Checked exception we need to  handle at compile time,compiler force us to handle checked exception.
// Unchecked exception is up to us we want to handle or not.