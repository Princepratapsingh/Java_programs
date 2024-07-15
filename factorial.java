import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();
        int fact=1;
        int i=1;
        while(num>=i){
         fact=fact*i;
         i++;
        }
        System.out.println(fact);
        sc.close();
}
}