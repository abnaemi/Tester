import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesterTest {

    @Test
    void ShouldReturnTrueIfHigherThan100() {

        // GIVEN
       int highNumber = 101;

        //WHEN
      boolean actual = Tester.HigherThan100(highNumber);

        //THEN

        assertEquals(true, actual);
    }
    @Test
    void ShouldReturnFalseIfLowerThan100() {

        // GIVEN
        int highNumber = 233;

        //WHEN
        boolean actual = Tester.HigherThan100(highNumber);

        //THEN

        assertEquals(false, actual);
    }

}



