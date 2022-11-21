import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(true) {
            System.out.println("------------------ Menu ----------------------");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.println("----------------------------------------------");
            System.out.print("\nPlease enter the choice: ");
            int choice = sc.nextInt();
        }
    }
}