 class Person {
    
    private String name;
    private int age;

    
    public Person(){

    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Prince");
        Person person3 = new Person("Shyam", 20);

        
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}
