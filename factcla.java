public class factcla {
    public static void main(String[] args) {


            int num = Integer.parseInt(args[0]);

            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + num + " is: " + factorial);

            

    }
}