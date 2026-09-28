import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App{
      static List <User> usersList = new ArrayList<>();
      public static void main(String[] args) {
      int option = 0;
      while (option != 5) {
          Scanner imput = new Scanner(System.in);  
          System.out.println("Welcome to Library"+
          "\n1.Type one to borrow a book"+"\n2.Type two to purchase a book.");
          option = imput.nextInt();
          switch (option) {
              case 1:
                  borrowbook();
                  break;
          }
    }
        }  
    public static void borrowbook(){

    }
}