public class pattern {
    public static void main(String[] args) {
        int rows = 4;
        int spaces = rows - 1;
        
       
        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= spaces; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
           
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
           
            spaces--;
        }
    }
}