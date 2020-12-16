package CustomExceptions;

public class NotStartOfTheGameException extends Exception{

    private String message;

    public NotStartOfTheGameException(String message) {
        super(message);
    }

    public String getError() {
        return message;
    }
}
