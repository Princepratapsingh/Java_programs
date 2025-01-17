class Account {
    int acc_no;
    String name;
    float amount;
    static String bank="BOB";

    
        Account(int a, String n, float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    
    void deposit(float amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
    }

    void withdraw(float amt) {
        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
    }

    
    void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    void display() {
        System.out.println(acc_no + " " + name + " " + amount+" "+bank);
    }
}

class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account(105,"Shyam",50000);
        
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}