import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();
        System.out.println("Enter The Operation you want to apply:");
        int opertion = sc.nextInt();
        switch (opertion) {
            case 1:
                System.out.println("Addition of  num1 and num2 =" + (num1 + num2));
                break;
            case 2:
                System.out.println("Substraction of  num1 and num2 =" + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication of  num1 and num2 =" + (num1 * num2));
                break;
            case 4:
                System.out.println("Division of  num1 and num2 =" + ((float)num1 / (float)num2));
                break;
            default:
                System.out.println("Wrong Input");
        }
        sc.close();
    }

}
