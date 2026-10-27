package model;
//inherit
public class Intern extends Employee {
    public Intern(String employeeId, String employeeName,
                            String department, int leaveBalance) {

        super(employeeId, employeeName, department, leaveBalance);
    }
    @Override
    public int getAnnualLeaveAllowance() {
        return 5;
    }
}
