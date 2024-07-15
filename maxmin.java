import java.util.Scanner;
import java.util.Arrays;
public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Element "+(i+1));
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
             
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            } else if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("The Maximum Element of the array:" + max);
        System.out.println("The Minimum Element of the array:" + min);

        sc.close();
    }
}