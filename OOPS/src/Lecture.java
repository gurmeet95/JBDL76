public class Lecture {

    private String classTitle; // instance variable
    String mentorName;
    String status;
    String classTime;
    public static int noOfStudents=50;//should access with class not object.

    public void setClassTitle(String classTitle) {
        // now after making classtitle private,with help of setter  i can keep a check
        //who make changes,allowed to change or not,print logs and all.
        this.classTitle = classTitle;
    }

    public String getClassTitle() {
        return classTitle;
    }
    private String getData(){
        return "Dummy data";
    }
    public String getDataWrapper(){
        return getData();
    }
}
