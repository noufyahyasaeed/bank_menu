//package com.projectx.bank;
//
//import com.projectx.bank.model.Account;
//import com.projectx.bank.repo.AccountRepo;
//import org.springframework.stereotype.Component;
//
//import java.util.Scanner;
//
//@Component
//public class Menu {
//    private final AccountRepo repo;
//    private String name;
//    private String balance;
//    static Scanner scanner = new Scanner(System.in);
//    public Menu(AccountRepo repo) {
//        this.repo = repo;
//    }
//    public void frontMenu(){
//        boolean isRunning = true;
//        int choice;
//        while (isRunning) {
//            System.out.println("1. I have ID");
//            System.out.println("2. Create new account");
//            System.out.println("3. Exit");
//            System.out.print("Enter your choice (1-3): ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1 -> haveAccount();
//                case 2 -> createAccount();
//                case 3 -> isRunning = false;
//                default -> System.err.println("invalid");
//            }
//            // end of while
//        }
//        System.out.println("***************");
//        System.out.println("Thank you! Have a nice day!");
//        System.out.println("***************");
//
//        // end of method
//        scanner.close();
//    }
//
//    private void createAccount() {
//
//        System.out.println("give ur name: ");
//        System.out.println("give ur balance: ");
//
//       // repo.save(name,balance );
//    }
//
//    private void haveAccount() {
//        //asking for ID
//        System.out.print("Enter your account ID: ");
//        int id = scanner.nextInt();
//
//        if (id == null) {
//            System.out.println("❌ Account with ID " + id + " does not exist.");
//            return; // or continue / ask again
//        } else repo.findById(id);
//
//
//    }
//
//    //Method to be in service later
//    static void showBalance(double balance) {
//        System.out.println("***************");
//        System.out.printf("$%.2f\n", balance);
//    }
//    static double deposit() {
//        double amount;
//        System.out.println("Enter an amount to be desposited: ");
//        amount = scanner.nextDouble();
//        if (amount < 0) {
//
//            System.out.println("Amount cant be negative");
//            return 0;
//        } else {
//            return amount;
//        }
//    }
//    static double withdraw(double balance) {
//        double amount;
//        System.out.print("Enter amount to withdraw: ");
//        amount = scanner.nextDouble();
//        if (amount > balance) {
//            System.out.println("INSUFFICIENT FUNDS");
//            return 0;
//        } else if (amount < 0) {
//            System.out.println("amount can't be negative");
//            return 0;
//        } else {
//            return amount;
//        }
//    }
//}
////System.out.println("1. Show Balance");
////            System.out.println("2. Deposit");
////            System.out.println("3. Withdraw");
////            System.out.println("5. Exit");
