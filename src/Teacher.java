public class Teacher extends Person{

    private String subject;

    public Teacher(){
        super();
        subject = "Computer Science";
    }

    public Teacher(String firstname, String lastname, int age, String teachersubject){
        super();
        this.subject = teachersubject;
        setFirst(firstname);
        setLast(lastname);
        setAge(age);
    }

    public String toString(){
        return "\n" + super.toString() + "\n" + subject;
    }



}
