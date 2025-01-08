package Inheritance;

public class AdvanceCalc extends Calculator{
    int a=20;
    public int multiply(int a,int b){
        return a*b;
    }
   public AdvanceCalc(){
       System.out.println(super.hashCode());
        System.out.println("I am in advance calc.");


    }
    int ParentA(){
        return super.a;
    };
    public int add(int a,int b,int c){
        return a+b+c+1;
    }
    public int sub(int a,int b,int c){
        return a+b+c+1;
    }





}
