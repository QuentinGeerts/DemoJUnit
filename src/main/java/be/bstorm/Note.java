package be.bstorm;

public class Note {

    public char getLetterNote ( int yearResult ) {

        if ( yearResult < 0 || yearResult > 100 )
            throw new IllegalArgumentException ( "Year resylt must be between 0 and 100" );

        return switch ( yearResult / 10 ) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            case 5 -> 'E';
            default -> 'F';
        };

    }

}
