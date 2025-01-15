package miniBank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserControll {
    private Map<String ,User> users;

    public UserControll() {
        this.users = new HashMap<>();
    }


    public void addUser() {
        try {


            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your personal ID number: ");
            String personalID = scanner.nextLine();
            if(!personalID.matches("[0-9]{10}")) {
                System.out.println("Invalid personal ID, it must be 10 digits");
                return;
            }
            System.out.println("Enter your pin, its must be a 4 digits: ");
            String pin = scanner.nextLine();
            if(!pin.matches("[0-9]{4}")) {
                System.out.println("Invalid pin, it must be a 4 digits: ");
                 return;
            }
           int randomNumber = (int)(Math.random()*100000);
            int randomNumber2 = (int)(Math.random()*100000);
            String salaryAccount = "Salary Account " + randomNumber;
            String savingsAccount = "Savings Account " + randomNumber2;

            User user = new User(personalID, pin, salaryAccount, savingsAccount);
            users.put(personalID, user);

            System.out.println("User created successfully!");
            System.out.println("Salary Account: " + salaryAccount);
            System.out.println("Savings Account: " + savingsAccount);


        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public void login() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your personal ID: ");
            String personalId = scanner.nextLine();

            if (!users.containsKey(personalId)) {
                System.out.println("User not found.");
                return;
            }

            System.out.print("Enter your PIN: ");
            String pin = scanner.nextLine();

            User user = users.get(personalId);

            if (user.getPin().equals(pin)) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Invalid PIN.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred during login. Please try again.");
        }
    }

}
