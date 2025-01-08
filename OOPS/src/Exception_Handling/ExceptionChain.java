package Exception_Handling;

public class ExceptionChain {
    public static void main(String[] args) {
        try{
            String s="Abc";
            System.out.println(s.length());
            int a=8/0;

        }catch(NullPointerException e){
            System.out.println("You are passing null string");

        }catch(ArithmeticException e1){
            System.out.println("You are divided by zero");
        }
        catch (Exception ex){
            System.out.println("Some generic exception");
        }
    }
}
// how to handle exception in production code/application code
// 1. you are throwing exception from the method,where it actually happened you changes the flow.
// 2.  exception 3rd method,read the exception, make it specific by making custom class exception.
//3. throws method
