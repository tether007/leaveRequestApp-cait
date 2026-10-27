package test;

import exception.LeaveException;
import model.Employee;
import model.LeaveRequest;

/** Simple tests for Employee (no external libraries needed). */
public class EmployeeTest {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        Employee e1 = new Employee("E101", "Asha Rao", "Engineering", 20);
        Employee e2 = new Employee("E102", "Ravi Kumar", "Finance", 12);
        Employee e3 = new Employee("E103", "Meera Nair", "HR", 6);

        testApplyLeaveReducesBalance(e1);
        testCancelLeaveRestoresBalance(e2);
        testNotEnoughBalance(e3);
        testInvalidDays(e3);
        testCancelUnknownRequest(e3);
        testCancelTwice(e1);

        System.out.println("\nPassed: " + passed + "  Failed: " + failed);
        if (failed > 0) {
            System.exit(1);
        }
    }

    private static void testApplyLeaveReducesBalance(Employee e) {
        try {
            e.applyLeave(5);
            check("applyLeave reduces balance", e.checkLeaveBalance() == 15);
        } catch (LeaveException ex) {
            check("applyLeave reduces balance", false);
        }
    }

    private static void testCancelLeaveRestoresBalance(Employee e) {
        try {
            LeaveRequest r = e.applyLeave(3);
            e.cancelLeave(r.getRequestId());
            check("cancelLeave restores balance", e.checkLeaveBalance() == 12);
        } catch (LeaveException ex) {
            check("cancelLeave restores balance", false);
        }
    }

    private static void testNotEnoughBalance(Employee e) {
        try {
            e.applyLeave(10);
            check("rejects days above balance", false);
        } catch (LeaveException ex) {
            check("rejects days above balance", e.checkLeaveBalance() == 6);
        }
    }

    private static void testInvalidDays(Employee e) {
        try {
            e.applyLeave(0);
            check("rejects 0 days", false);
        } catch (LeaveException ex) {
            check("rejects 0 days", true);
        }
    }

    private static void testCancelUnknownRequest(Employee e) {
        try {
            e.cancelLeave(99);
            check("rejects unknown request id", false);
        } catch (LeaveException ex) {
            check("rejects unknown request id", true);
        }
    }

    private static void testCancelTwice(Employee e) {
        try {
            LeaveRequest r = e.applyLeave(1);
            e.cancelLeave(r.getRequestId());
            e.cancelLeave(r.getRequestId());
            check("rejects cancelling twice", false);
        } catch (LeaveException ex) {
            check("rejects cancelling twice", true);
        }
    }

    private static void check(String name, boolean ok) {
        System.out.println((ok ? "PASS  " : "FAIL  ") + name);
        if (ok) {
            passed++;
        } else {
            failed++;
        }
    }
}
