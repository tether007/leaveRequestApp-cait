package model;

import java.util.ArrayList;
import java.util.List;

import exception.LeaveException;

/** Stores employee information and manages that employee's leave. */
public abstract class Employee {

    private String employeeId;
    private String employeeName;
    private String department;
    private int leaveBalance;
    private List<LeaveRequest> leaveHistory = new ArrayList<>();
    private int nextRequestId = 1;

    public Employee(String employeeId, String employeeName, String department, int leaveBalance) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department = department;
        this.leaveBalance = leaveBalance;
    }

    /** Applies for leave; deducts the days from the balance. */
    public LeaveRequest applyLeave(int days) throws LeaveException {
        if (days <= 0) {
            throw new LeaveException("Leave days must be greater than 0.");
        }
        if (days > leaveBalance) {
            throw new LeaveException(employeeName + " has only " + leaveBalance
                    + " day(s) left, cannot apply for " + days + ".");
        }
        LeaveRequest request = new LeaveRequest(nextRequestId++, days);
        leaveHistory.add(request);
        leaveBalance -= days;
        return request;
    }

    /** Cancels an approved request and gives the days back. */
    public void cancelLeave(int requestId) throws LeaveException {
        for (LeaveRequest request : leaveHistory) {
            if (request.getRequestId() == requestId) {
                if (request.getStatus().equals("CANCELLED")) {
                    throw new LeaveException("Request #" + requestId + " is already cancelled.");
                }
                request.cancel();
                leaveBalance += request.getDays();
                return;
            }
        }
        throw new LeaveException("Request #" + requestId + " not found.");
    }

    public int checkLeaveBalance() {
        return leaveBalance;
    }

    public void displayDetails() {
        System.out.println("ID         : " + employeeId);
        System.out.println("Name       : " + employeeName);
        System.out.println("Department : " + department);
        System.out.println("Balance    : " + leaveBalance + " day(s)");
        for (LeaveRequest request : leaveHistory) {
            System.out.println("  " + request);
        }
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public abstract int getAnnualLeaveAllowance();
}
