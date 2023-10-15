package ATM;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=0;
        int deposite;
        int withdraw;

        while(true){
            System.out.println("****** Welcome to OBI ATM *******");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Balance check");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");


            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter amount for withdraw: ");
                    withdraw = sc.nextInt();
                    if(balance<withdraw){
                        System.out.println("Insufficient Balance !!!");
                        System.out.println();
                        break;
                    }else {
                        balance = balance-withdraw;
                        System.out.println(withdraw+" RS withdrawn successfully !!");
                        System.out.println("Thank you !! Visit Again!!!!");
                        System.out.println();
                        break;
                    }

                case 2:
                    System.out.println("Please enter amount to deposite: ");
                    deposite = sc.nextInt();
                    balance = balance+ deposite;
                    System.out.println(deposite+" .RS deposited successfully !!");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Your account balance is Rs."+balance);
                    System.out.println();
                    break;

                case 4:
                    System.exit(0);
            }


        }


    }
}
