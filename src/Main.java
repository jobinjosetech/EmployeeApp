import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<ArrayList> userList = new ArrayList<ArrayList>();
    static void addEmployee(){
        ArrayList<Object> arr = new ArrayList<Object>();
        System.out.print("Enter employee code:");
        double code = sc.nextDouble();
        System.out.print("Enter employee name:");
        String name = sc.next();
        System.out.print("Enter employee designation:");
        String designation = sc.next();
        System.out.print("Enter employee salary:");
        double salary = sc.nextDouble();
        System.out.print("Enter company name:");
        String company = sc.next();
        System.out.print("Enter employee phone:");
        double phone = sc.nextDouble();
        System.out.print("Enter employee email:");
        String email = sc.next();
        arr.add(code);
        arr.add(name);
        arr.add(designation);
        arr.add(salary);
        arr.add(company);
        arr.add(phone);
        arr.add(email);
        userList.add(arr);
        System.out.println("Employee Added Successfully");
    }

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

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
            }
        }
    }
}
