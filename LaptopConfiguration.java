import java.util.Scanner;
 class Laptop {
    // Fields
    private String ramSize;
    private String cpuType;
    
    // Constructor
    public Laptop(String ramSize, String cpuType) {
        this.ramSize = ramSize;
        this.cpuType = cpuType;
    }
    
    // Method to display laptop details
    public void displayDetails() {
        System.out.println("Laptop RAM Size: " + ramSize + ", CPU Type: " + cpuType);
    }

    // Getters and Setters (optional, if you want to allow changes to the fields after object creation)
    // public String getRamSize() {
    //     return ramSize;
    // }

    // public void setRamSize(String ramSize) {
    //     this.ramSize = ramSize;
    // }

    // public String getCpuType() {
    //     return cpuType;
    // }

    // public void setCpuType(String cpuType) {
    //     this.cpuType = cpuType;
    // }
}


public class LaptopConfiguration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of laptops to configure: ");
        int numberOfLaptops = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over
        
        Laptop[] laptops = new Laptop[numberOfLaptops];
        
        for (int i = 0; i < numberOfLaptops; i++) {
            System.out.println("Enter configuration for laptop " + (i + 1) + ":");
            
            System.out.print("Enter RAM size (e.g., 8GB, 16GB): ");
            String ramSize = scanner.nextLine();
            
            System.out.print("Enter CPU type (e.g., Intel i5, AMD Ryzen 5): ");
            String cpuType = scanner.nextLine();
            
            laptops[i] = new Laptop(ramSize, cpuType);
        }
        
        System.out.println("\nDisplaying configured laptops:");
        for (Laptop laptop : laptops) {
            laptop.displayDetails();
        }
        
        scanner.close();
    }
}
