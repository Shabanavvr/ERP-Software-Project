package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ERPSystem erp = new ERPSystem();
        Leaderboard leaderboard = new Leaderboard();
        PredictionEngine predictionEngine = new PredictionEngine();

        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the ERP System!");

        do {
            System.out.println("\n1. Manage Inventory");
            System.out.println("2. Manage Users");
            System.out.println("3. Process Orders");
            System.out.println("4. View Leaderboard");
            System.out.println("5. Predict Future Orders");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    erp.addInventory("Item1");
                    erp.manageInventory();
                    break;
                case 2:
                    erp.addUser("User1");
                    erp.manageUsers();
                    break;
                case 3:
                    leaderboard.addUserScore("User1", 100); // Simulate order score
                    break;
                case 4:
                    leaderboard.displayLeaderboard();
                    break;
                case 5:
                    predictionEngine.predictFutureOrders();
                    break;
                case 6:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select again.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}

