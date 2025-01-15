package miniBank;


import java.util.List;
import java.util.Scanner;

public class MainMeny {
    static UserControll userControll = new UserControll();
    private List<User> users;
    public static void main(String[] args) {
        mainMeny();



    }

    public static void mainMeny() {
        while (true) {
            try {


                Scanner sc = new Scanner(System.in);
                System.out.println("Meny");
                System.out.println("1.Create User");
                System.out.println("2.Login User");
                System.out.println("4.Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        userControll.addUser();
                        break;
                    case 2:
                        userControll.login();
                        break;
                    case 3:
                        System.out.println("Exit program ");
                        System.exit(0);

                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;


                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }


        }


    }}



