import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestRoundUpToTheNextMultipleOf5 {

    @RepeatedTest(5)
    //@Test
    public void testWithInputs1() {
        int testData = 1;
        int expectedData = 5;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);
        assertThat(expectedData).as("The rounding up to the next 5 does not work!").isEqualTo(result);
    }

    @Test
    public void testWithInputs2() {
        int testData = 5;
        int expectedData = 5;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);
        Assertions.assertEquals(expectedData, result
        );
    }

    @Test
    public void testWithInputs3() {
        int testData = 7;
        int expectedData = 10;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);
        Assertions.assertEquals(expectedData, result
        );
    }

    @Test
    public void testWithInputs4() {
        int testData = 0;
        int expectedData = 0;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);
        Assertions.assertEquals(expectedData, result
        );
    }

    @Test
    public void testWithInputs5() {
        int testData = -1;
        int expectedData = 0;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);
        Assertions.assertEquals(expectedData, result
        );
    }

    @Test
    public void testWithInputs6() {
        int testData = -14;
        int expectedData = -10;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);
        Assertions.assertEquals(expectedData, result
        );
    }

    @Test
    public void testWithInputs7() {
        int testData = 123456;
        int expectedData = 123460;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);
        Assertions.assertEquals(expectedData, result
        );
    }

    @Test
    public void testWithInputs8() {
        int testData = -123456;
        int expectedData = -123455;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);
        Assertions.assertEquals(expectedData, result
        );
    }

    @Test
    public void testWithInputs9() {
        int testData = 981;
        int expectedData = 985;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);

        Assertions.assertEquals(expectedData, result
        );
    }

    @Test
    public void testWithInputs10() {
        int testData = -981;
        int expectedData = -980;
        int result = RoundUpToTheNextMultipleOf5.roundToNext5(testData);
        Assertions.assertEquals(expectedData, result
        );
    }
}
