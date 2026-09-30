import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<User> usersList = new ArrayList<>();
    static List<Book> booksList = new ArrayList<>();
    static Scanner imput = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        while (option != 3) {
            {
                try {
                    System.out.println("\n------------------------------------" + "\nWelcome to Library" +
                            "\n------------------------------------" + "\nPress 1 if you already have an account"
                            + "\nPress 2 if you do not have an account" + "\nPress 3 Exit"
                            + "\n------------------------------------");
                    option = imput.nextInt();
                    switch (option) {
                        case 1:
                            Library();
                            break;
                        case 2:
                            CreateAccount();
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Value");
                    imput.nextLine();
                }
            }
        }
    }

    public static void Library() {
        int option = 0;
        System.out.println("Welcome to Library" +
                "\n1.Press one to borrow a book" + "\n2.Press two to purchase a book.");
        option = imput.nextInt();
        switch (option) {
            case 1:

                break;
        }
    }

    public static void CreateAccount() {
        User userObject = new User();
        imput.nextLine();
        System.out.println("\n ------------------------------------" + "\nCreating Account!"
                + "\n------------------------------------"+"\n");
    }
}