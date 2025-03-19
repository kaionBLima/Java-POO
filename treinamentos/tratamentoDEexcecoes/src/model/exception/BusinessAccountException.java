package model.exception;

public class BusinessAccountException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public BusinessAccountException(String message) {
        super(message);

    }
}
