package model;

/** One leave request made by an employee. */
public class LeaveRequest {

    private int requestId;
    private int days;
    private String status; // APPROVED or CANCELLED

    public LeaveRequest(int requestId, int days) {
        this.requestId = requestId;
        this.days = days;
        this.status = "APPROVED";
    }

    public int getRequestId() {
        return requestId;
    }

    public int getDays() {
        return days;
    }

    public String getStatus() {
        return status;
    }

    public void cancel() {
        this.status = "CANCELLED";
    }

    @Override
    public String toString() {
        return "Request #" + requestId + " | " + days + " day(s) | " + status;
    }
}
