import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerNumberTest {
    @Test
    public void should_calculate_a_number_is_greater_than_another(){
        IntegerNumber bigNumber = new IntegerNumber(5);
        IntegerNumber smallNumber = new IntegerNumber(1);

        assertTrue(bigNumber.isGreaterThan(smallNumber));
    }

    @Test
    public void should_calculate_the_sum_of_two_integer_numbers(){
        IntegerNumber aNumber = new IntegerNumber(5);
        IntegerNumber another = new IntegerNumber(1);

        IntegerNumber sum = aNumber.add(another);

        int expectedResult = 6;
        assertEquals(sum.getValue(), expectedResult);
    }
}
