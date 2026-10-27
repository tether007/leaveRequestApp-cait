package exception;

/** Thrown when a leave request cannot be applied or cancelled. */
public class LeaveException extends Exception {

    public LeaveException(String message) {
        super(message);
    }
}
