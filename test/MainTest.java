import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void suma() {
        double a = 1;
        double b = 2;

        double expected = 3;

        double actual = Main.suma(a, b);

        assertEquals(expected, actual);

    }

    @Test
    void resta() {

        double a = 1;
        double b = 2;

        double expected = 1;

        double actual = Main.resta(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void multiplicacion() {

        double a = 5;
        double b = 2;

        double expected = 10;

        double actual = Main.multiplicacion(a, b);

        assertEquals(expected, actual);
    }

    @Test
    void division() {

        double a = 4;
        double b = 2;

        double expected = 2;

        double actual = Main.division(a, b);

        assertEquals(expected, actual);
    }
}