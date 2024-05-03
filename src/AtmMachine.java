import java.util.Scanner;

class AtmMachine{
    static Scanner scanner=new Scanner(System.in);
    static String accountHolderName = null;
    static String accountPass=null;
    static int option;
    static AccountManager m=new AccountManager();

    public static void main(String[] args){
        System.out.println("Welcome to my ATM");

        System.out.println("Enter account holder name");
        accountHolderName= scanner.nextLine();

        System.out.println("Enter account password");
        accountPass= scanner.nextLine();
        Account customer=m.selectAccount(accountHolderName,accountPass);
        System.out.print(customer.accountName);
        do{
            System.out.println("Welcome "+ customer.accountName);
            System.out.println("Options for you are :");
            System.out.println("1.Balance Inquiry\n"
                    + "2.Withdrawal\n"
                    + "3.Transfer\n"
                    + "4.Mini Statement\n"
                    + "5.Exit\n");
            switch(option){
                case 1:
                    System.out.print(customer.checkBalance());
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    double amount=scanner.nextInt();
                    double left=customer.withdrawal(amount);
                    System.out.println("Left is Rs "+left);
                    break;
                case 3:
                    customer.transfer(0);
                    break;

                case 4:
                    System.out.print("MIni Statement");
                    break;
                case 5:
                    break;
            }
            option=scanner.nextInt();
        }while(option!=5);

    }
}