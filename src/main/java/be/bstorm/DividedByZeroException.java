package be.bstorm;

public class DividedByZeroException extends RuntimeException {

    public DividedByZeroException ( ) {
        super ( "Cannot divide by zero." );
    }

    public DividedByZeroException ( String message ) {
        super ( message );
    }
}
