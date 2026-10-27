package model;

public class PartTimeEmployee extends Employee{

    private static final int ANNUAL_LEAVE_ALLOWANCE = 10;

    public PartTimeEmployee(String employeeId, String employeeName,
                            String department, int leaveBalance) {

        super(employeeId, employeeName, department, leaveBalance);
    }
    @Override
    public int getAnnualLeaveAllowance() {
        return ANNUAL_LEAVE_ALLOWANCE;
    }
}
