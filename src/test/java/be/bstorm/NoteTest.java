package be.bstorm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NoteTest {

    Note note;

    @BeforeEach
    void setUp ( ) {
        note = new Note ( );
    }

    @AfterEach
    void tearDown ( ) {
        note = null;
    }

    @Test
    void shouldThrowIllegalArgumentException_WhenNegativeValue ( ) {
        // Arrange
        int yearResult = -5;

        // Action & Assert
        IllegalArgumentException actualException = assertThrows ( IllegalArgumentException.class,
                ( ) -> note.getLetterNote ( yearResult ) );

        assertEquals ( "Year resylt must be between 0 and 100", actualException.getMessage ( ) );
    }

    @Test
    void shouldThrowIllegalArgumentException_WhenGreaterThanOneHundred ( ) {
        IllegalArgumentException actualException = assertThrows ( IllegalArgumentException.class,
                ( ) -> note.getLetterNote ( 101 ) );
        assertEquals ( "Year resylt must be between 0 and 100", actualException.getMessage ( ) );
    }

    @Test
    void shouldReturnF_WhenZero ( ) {
        // Arrange
        int yearResult = 0;
        char excepted = 'F';

        // Action
        int actual = note.getLetterNote ( yearResult );

        // Assert
        assertEquals ( excepted, actual );
    }

    @Test
    void shouldReturnF_WhenFortyNine ( ) {
        assertEquals ( 'F', note.getLetterNote ( 49 ) );
    }

    @ParameterizedTest
    @CsvSource({"50", "59"})
    void shouldReturnE_WhenBetween50And59 (int yearResul){
        assertEquals ( 'E', note.getLetterNote ( yearResul ) );
    }

    @ParameterizedTest
    @CsvSource({"60", "69"})
    void shouldReturnE_WhenBetween60And69 (int yearResul){
        assertEquals ( 'D', note.getLetterNote ( yearResul ) );
    }

    @ParameterizedTest
    @CsvSource({"70", "79"})
    void shouldReturnE_WhenBetween70And79 (int yearResul){
        assertEquals ( 'C', note.getLetterNote ( yearResul ) );
    }

    @ParameterizedTest
    @CsvSource({"80", "89"})
    void shouldReturnE_WhenBetween80And89 (int yearResul){
        assertEquals ( 'B', note.getLetterNote ( yearResul ) );
    }

    @ParameterizedTest
    @CsvSource({"90", "100"})
    void shouldReturnE_WhenBetween90And100 (int yearResul){
        assertEquals ( 'A', note.getLetterNote ( yearResul ) );
    }
}