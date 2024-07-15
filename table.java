import java.util.Scanner;
public class table {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int m=0;
        for (int i=1; i<=10; i++) {
            m=n*i;
            System.out.println(n+"*"+i+"="+m);
        }
sc.close();
    }
}
