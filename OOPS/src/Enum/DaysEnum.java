package Enum;

public enum DaysEnum {
    // mini db for local project
    SUNDAY(7,"sun"),
    MONDAY(1,"mon"),
    TUESDAY(9,"tue");
     int id;
     String val;
    DaysEnum(int id,String val){
        this.id=id;
        this.val =val;

    }

    public static void main(String[] args) {
        for(DaysEnum d:DaysEnum.values()){
            // values method is not present in the enum,added by tht compiler.
            System.out.println(d);
        }
        System.out.println("*************************************");
        System.out.println(DaysEnum.valueOf("SUNDAY"));
        System.out.println(DaysEnum.valueOf("SUNDAY").id);
        System.out.println(DaysEnum.valueOf("SUNDAY").val);
        //ordinal  id of sun =7 ordinal =0 and so on for others 1,2,3...
        System.out.println(DaysEnum.valueOf("SUNDAY").ordinal());
        System.out.println(DaysEnum.SUNDAY.val);

    }

}
// enum special class
// public enum DaysEnum == public class DaysEnum extends Enum
// thats  why can not extends another class.
