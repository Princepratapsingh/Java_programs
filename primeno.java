import java.util.Scanner;

public class primeno {
    public static int isprime(int n) {
        int prm = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prm=1;
                break; 
            }
        }
        return prm;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isprime(n)==0) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}
