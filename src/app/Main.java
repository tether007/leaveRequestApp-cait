package app;

import exception.LeaveException;
import model.*;
/** Small demo of the leave system. Tests live in the test package. */

public class Main {

    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("E101", "Aarav", "IT", 20);
        Employee e2 = new PartTimeEmployee("E102", "Diya", "HR", 10);
        Employee e3 = new Intern("E103", "Rohan", "Sales", 5);
        Employee fte = new FullTimeEmployee("FTE1","Hanuman","IT",3);
        Employee pte = new PartTimeEmployee("PTE1","Mahaveer","Engineering",1);
        Employee intern = new Intern("IN1","George", "Engineering",1);
        try {
            e1.applyLeave(5);
            e2.applyLeave(3);
            e3.applyLeave(2);
            fte.applyLeave(2);
            pte.applyLeave(3);
            intern.applyLeave(1);
        } catch (LeaveException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        e3.displayDetails();
        System.out.println();
        fte.displayDetails();
        System.out.println();
        pte.displayDetails();
        System.out.println();
        intern.displayDetails();
        System.out.println();
    }
}
