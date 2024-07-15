

public class Constructor {
    int id;
    String name;
    int age;
    Constructor(int i,String n){
        id=i;
        name=n;
    }
    Constructor(int i,String n,int a){
        id=i;
        name=n;
        age=a;

    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String[] args) {
       Constructor s1=new Constructor(1,"Prince");
       Constructor s2=new Constructor(1,"Prince",21);

       s1.display();
       s2.display();
    }
}
