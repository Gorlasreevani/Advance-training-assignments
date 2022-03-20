package BankAccount;

import java.util.Scanner;

public class accountdetails {
	public static BankAccount getAccountDetails()
    {
        BankAccount acc=new BankAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter account id: ");
        acc.setAccountId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter account type: ");
        acc.setAccountType(sc.nextLine());
        int b;
        do
        {
        System.out.println("Enter Balance");
        acc.setBalance(sc.nextInt());
        b=acc.getBalance();
        if(b<=0)
        System.out.println("Balance should be positive");
        }
        while(b<=0);
        return acc;
    }
    public static int getWithdrawAmount()
    {
        Scanner sc=new Scanner(System.in);
        int w;
        do
        {
            System.out.println("Enter amount to be withdrawn:");
            w=sc.nextInt();
            if(w<=0)
            System.out.println("Amount should be positive");
        }
        while(w<=0);
        return w;
    }
    public static void main(String[] args)
    {
        BankAccount accObj=new BankAccount();
        accObj=getAccountDetails();
        int c=getWithdrawAmount();
        accObj.withdraw(c);
    }
}


