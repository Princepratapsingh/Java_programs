import java.util.Scanner;

public class Stringmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("Choose a Method(len,upper,lower,Sub,replace,concat,equals)");
        String method = sc.nextLine();
        switch (method) {
            case "len":
                System.out.println("The length of the string:" + str + " is:" + str.length());
                break;
            case "upper":
                System.out.println("The upper bound of the string:" + str + " is:" + str.toUpperCase());
                break;
            case "lower":
                System.out.println("The lower bound of the string:" + str + " is:" + str.toLowerCase());
            case "Sub":
                System.out.println("Enter Starting index:");
                int start = sc.nextInt();
                System.out.println("Enter End index:");
                int end = sc.nextInt();
                System.out.println("the Substring for " + str + " is:" + str.substring(start, end));
                break;
            case "replace":
                System.out.println("Enter Old character:");
                String old = sc.nextLine();
                System.out.println("Enter new character:");
                String news = sc.nextLine();
                System.out.println("String After replacement: " + str.replace(old, news));
                break;
            case "concat":
                System.out.println("Enter some Text to concat:");
                String conc = sc.nextLine();
                System.out.println("String After concat: " + str.concat(" ").concat(conc));
                break;
            case "equals":
                System.out.println("Enter character for Checking:");
                String eq = sc.nextLine();
                System.out.println(eq + " is " + str.equals(eq));
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        sc.close();
    }
}
