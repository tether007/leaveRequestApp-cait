package model;


public class Manager extends Employee {

   //Refactor-2 : hyperparameterizing the employees instead of hard code
    private static final int ANNUAL_LEAVE_ALLOWANCE = 30;

    public Manager(String employeeId, String employeeName,
                   String department, int leaveBalance) {
        super(employeeId, employeeName, department, leaveBalance);
    }

    @Override
    public int getAnnualLeaveAllowance() {
        return ANNUAL_LEAVE_ALLOWANCE;
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
