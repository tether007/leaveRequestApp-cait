package model;
//inherit
public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String employeeId, String employeeName,
                            String department, int leaveBalance) {

        super(employeeId, employeeName, department, leaveBalance);
    }
    @Override
    public int getAnnualLeaveAllowance() {
        return 20;
    }
}
