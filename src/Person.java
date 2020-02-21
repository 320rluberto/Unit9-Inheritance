public class Person {

    private String first;
    private String last;
    private int age;

    public Person(){
        first = "Jane";
        last = "Brown";
        age = 69;
    }

    public Person(String firstname, String lastname, int personage){
        this.first = firstname;
        this.last = lastname;
        this.age = personage;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return getFirst() + "\n" + getLast() + "\n" + getAge();
    }
}
