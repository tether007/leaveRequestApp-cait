package app;

import exception.LeaveException;
import model.Employee;

/** Small demo of the leave system. Tests live in the test package. */
public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("E101", "Asha Rao", "Engineering", 20);
        Employee e2 = new Employee("E102", "Ravi Kumar", "Finance", 12);
        Employee e3 = new Employee("E103", "Meera Nair", "HR", 6);

        try {
            e1.applyLeave(5);
            e2.applyLeave(3);
            e3.applyLeave(2);
        } catch (LeaveException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();
    }
}
