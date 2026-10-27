package model;
//inherit
public class Intern extends Employee {

    private static final int ANNUAL_LEAVE_ALLOWANCE = 5;

    public Intern(String employeeId, String employeeName,
                            String department, int leaveBalance) {

        super(employeeId, employeeName, department, leaveBalance);
    }


    @Override
    public int getAnnualLeaveAllowance() {
        return ANNUAL_LEAVE_ALLOWANCE;
    }
}
