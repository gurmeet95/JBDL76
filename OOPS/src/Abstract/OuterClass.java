package Abstract;

public class OuterClass {
    private int a=20;
    public int c=30;
    public static int d=100;
    // instance level inner class
   public static  class InnerClass{
        private int b =30;
        public void printOuterData(){
            System.out.println(d);
            OuterClass out1=new OuterClass();
            System.out.println(out1.c);
            System.out.println(out1.a);
        }

   }

    public static void main(String[] args) {
        System.out.println("I am in main");
        // InnerClass a1=new InnerClass();  not possible without outer.
        InnerClass inner= new OuterClass. InnerClass();
        OuterClass out=new OuterClass();
        System.out.println(out.a);
        System.out.println(inner.b);
       // System.out.println(inner.c); not possible because noy inherited
       // InnerClass inner= new OuterClass.InnerClass(); if inner class is static.
       inner.printOuterData();
   }

}
// only Create inner class when we know that oue inner class
// doest not have independent requirement

