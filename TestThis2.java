// use of this keyword If local variables(formal arguments) and instance variables are different, 
// there is no need to use this keyword But in this program instance variables and local variables are same so we use this keyword
class Student1 {
    int rollno;
    String name;
    float fee;

    Student1(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class TestThis2 {
    public static void main(String args[]) {
        Student1 s1 = new Student1(111, "ankit", 5000f);
        Student1 s2 = new Student1(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}