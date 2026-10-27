package model;

/** One leave request made by an employee. */

public class LeaveRequest {

    private int requestId;
    private int days;
    private String status;
    private String reason;

    public LeaveRequest(int requestId, int days) {
        this(requestId, days, "No reason specified");
    }

    public LeaveRequest(int requestId, int days, String reason) {
        this.requestId = requestId;
        this.days = days;
        this.reason = reason;
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

    public String getReason() {
        return reason;
    }

    public void cancel() {
        this.status = "CANCELLED";
    }

    @Override
    public String toString() {
        return "Request #" + requestId
                + " | " + days + " day(s)"
                + " | " + status
                + " | Reason: " + reason;
    }
}

