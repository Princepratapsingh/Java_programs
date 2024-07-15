class laptop{
    String cpu;
    int ram;
    public void printdeatils(){
        System.out.println("CPU: " + cpu);
        System.out.println("RAM:"+ram);
    }

}

public class classlaptop {
    public static void main(String[] args) {  
        System.out.println("This is a Custom Class");
        laptop asus=new laptop();
        // setting Attributes
        asus.cpu="intel i5 11th Gen";
        asus.ram=8;
        laptop hp=new laptop();
        hp.cpu="intel i7 12gen";
        hp.ram=16;
        // System.out.println(asus.cpu);
        // System.out.println(asus.ram);
        asus.printdeatils();
        hp.printdeatils();
        
        
    }
} 

