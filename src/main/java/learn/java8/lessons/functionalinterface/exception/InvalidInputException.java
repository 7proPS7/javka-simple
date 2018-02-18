package learn.java8.lessons.functionalinterface.exception;

public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
