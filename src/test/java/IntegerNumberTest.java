import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntegerNumberTest {
    @Test
    public void should_calculate_a_number_is_greater_than_another(){
        IntegerNumber bigNumber = new IntegerNumber(5);
        IntegerNumber smallNumber = new IntegerNumber(10);

        assertTrue(bigNumber.isGreaterThan(smallNumber));
    }
}
