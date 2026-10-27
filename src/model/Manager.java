package model;


public class Manager extends Employee {

    public Manager(String employeeId, String employeeName,
                   String department, int leaveBalance) {
        super(employeeId, employeeName, department, leaveBalance);
    }

    @Override
    public int getAnnualLeaveAllowance() {
        return 30;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee Type: Manager");
        System.out.println(
                "Annual Leave Allowance: " + getAnnualLeaveAllowance()
        );
    }
}
