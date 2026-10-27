package model;

public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(String employeeId, String employeeName,
                            String department, int leaveBalance) {

        super(employeeId, employeeName, department, leaveBalance);
    }
    @Override
    public int getAnnualLeaveAllowance() {
        return 10;
    }
}
