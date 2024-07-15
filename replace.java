import java.util.Scanner;
public class replace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The String:");
        String st=sc.nextLine();
        System.out.println("Original String: "+st);
        System.out.println("Enter the Character You Want to replace:");
        String chr=sc.nextLine();
        System.out.println("Enter the new Character for Replacement:");
        String rpch=sc.nextLine();
        String rp=st.replace(chr,rpch);
        System.out.println("String After Replacement:"+rp);

        sc.close();
    }
}
