import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = sc.nextDouble(); 
        
        System.out.print("Enter the threshold amount for discount: ");
        double threshold = sc.nextDouble(); 
        
        double discountRate = 0.1; 
        
        
        double discount = purchaseAmount > threshold ? purchaseAmount * discountRate : 0;
        
        
        double finalAmount = purchaseAmount - discount;
        
        System.out.println("Original Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Amount After Discount: " + finalAmount);
        
    
        sc.close();
    }
}
