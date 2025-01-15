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
           int randomNumer = (int)(Math.random()*100000);
            String salaryAccount = "Salary Account " + randomNumer;
            String savingsAccount = "Savings Account " + randomNumer;

            


        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void login() {

    }
}
