import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesterTestC {

    @Test
    void calculator() {

        //GIVEN
        int numberone = 23;
        int numbertwo = 23;
        //WHEN
        int actual = Tester.calculator(numberone, numbertwo);
        //THEN
        assertEquals(numberone + numbertwo, actual);

    }
}

