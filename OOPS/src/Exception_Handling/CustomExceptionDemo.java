package Exception_Handling;

public class CustomExceptionDemo {
    public static void main(String[] args) throws AgeChecker  {
        int age=2;
        checkAge(age);

    }
    private static void checkAge(int age) throws AgeChecker{
        if(age<18){
            throw  new AgeChecker("Age is not valid");
            //this is checked exception compiler will ask to handle this
        }
    }

}
