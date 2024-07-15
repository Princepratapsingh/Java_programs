
class StudentDetails {
    static String college_name = "GLA University";// will get memory only once and retain its value

    String Name;
    int id;

    StudentDetails(String Name, int id) {
        this.Name = Name;
        this.id = id;
    }

    void Display() {
        System.out.println("Name: " + Name + " id: " + id + " College: " + college_name);
    }

    public static void main(String args[]) {
        // creating objects
        StudentDetails c1 = new StudentDetails("Prince", 101);
        StudentDetails c2 = new StudentDetails("Shyam", 102);
        StudentDetails c3 = new StudentDetails("Shivam", 103);
        c1.Display();
        c2.Display();
        c3.Display();
    }
}