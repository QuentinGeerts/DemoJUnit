package be.bstorm;

public class Mathematic {

    public int add ( int a, int b ) {
        if ( (long) a + (long) b > Integer.MAX_VALUE ) throw new RuntimeException ( );
        return a + b;
    }

    public double division ( double a, double b ) {
        if ( b == 0 ) throw new DividedByZeroException ( );
        return a / b;
    }

}
