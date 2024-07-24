import java.util.Scanner;
/**
 * Atm
 */
public class Atm {

    public static void main (String args[])
    {
        BankAccount account = new BankAccount();
        Atm atm = new Atm();
        Scanner sc = new Scanner(System.in);
        while  (true){
            System.out.println("\nAtm Machine");
            System.out.println("1.Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            System.out.println("Choose an option:");
            String choice = sc.nextLine();
            if (choice.equals("1")){
                System.out.println("Enter amount to withdraw:");
                double amount = sc.nextDouble();
                sc.nextLine();
                System.out.println(atm.withdraw(amount));
            }
            else if (choice.equals("2")){
                System.out.print("Enter amount to deposite:");
                double amount = sc.nextDouble();
                sc.nextLine();
                System.out.println(atm.deposit(amount));
            }
            else if (choice.equals("3")){
                System.out.println(atm.checkBalance());
            }
            else if (choice.equals("4")){
                System.out.println("ThankYou for using the atm.");
            break;
            }
            else {
                System.out.println("Invalid option");
            }
            
        }
    }

    private char[] checkBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkBalance'");
    }

    private char[] deposit(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    private char[] withdraw(double amount) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }
}