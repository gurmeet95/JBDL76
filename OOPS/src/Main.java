//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lecture jbdl76=new Lecture();
        jbdl76.mentorName="Kajal";
        int abc=Lecture.noOfStudents;
        System.out.println(abc);
        Lecture.noOfStudents=60;
        System.out.println(Lecture.noOfStudents);
        System.out.println(abc);
        System.out.println(jbdl76.mentorName);
        jbdl76.setClassTitle("JAVA JBDL 76");
        System.out.println(jbdl76.getClassTitle());
        System.out.println(jbdl76.getDataWrapper());

        String s=new String("Fifty");
        String a="Fifty";
        String b="Fifty";
        System.out.println(s==a);
        System.out.println(s.equals(a));
        System.out.println(a==b);
        a="Fiftyone";
        System.out.println(a==b);
        String s1=new String("Fifty").intern();
        System.out.println(s1==b);



    }
}