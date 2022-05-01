import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestATM {
    //tests with 1 <= n <= 1500.
    @RepeatedTest(2)
    public void testWithInputs1() {
        int testData = 1;
        int expectedData = -1;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("lowest value (not valid)").isEqualTo(result);
    }

    @Test
    public void testWithInputs2() {
        int testData = 9;
        int expectedData = -1;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("-1 if returning is impossible (invalid input).").isEqualTo(result);
    }

    @Test
    public void testWithInputs3() {
        int testData = 10;
        int expectedData = 1;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("test with valid value").isEqualTo(result);
    }

    @Test
    public void testWithInputs4() {
        int testData = 20;
        int expectedData = 1;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("test with 20 amount").isEqualTo(result);
    }

    @Test
    public void testWithInputs5() {
        int testData = 30;
        int expectedData = 2;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("test with 2 pieces").isEqualTo(result);
    }

    @Test
    public void testWithInputs6() {
        int testData = 35;
        int expectedData = -1;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("-1 if returning is impossible.").isEqualTo(result);
    }

    @Test
    public void testWithInputs7() {
        int testData = 40;
        int expectedData = 2;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("test with 2 x 20").isEqualTo(result);
    }

    @Test
    public void testWithInputs8() {
        int testData = 50;
        int expectedData = 1;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("test with 50").isEqualTo(result);
    }

    @Test
    public void testWithInputs9() {
        int testData = 100;
        int expectedData = 1;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("test with 100").isEqualTo(result);
    }

    @Test
    public void testWithInputs10() {
        int testData = 200;
        int expectedData = 1;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("test with 200").isEqualTo(result);
    }

    @Test
    public void testWithInputs11() {
        int testData = 500;
        int expectedData = 1;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("test with 500").isEqualTo(result);
    }

    @Test
    public void testWithInputs12() {
        int testData = 1000;
        int expectedData = 2;
        int result = ATM.solve(testData);
        assertThat(expectedData).isEqualTo(result);
    }

    @Test
    public void testWithInputs13() {
        int testData = 1500;
        int expectedData = 3;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("highest value").isEqualTo(result);
    }

    @Test
    public void testWithInputs14() {
        int testData = 880;
        int expectedData = 6;
        int result = ATM.solve(testData);
        assertThat(expectedData).as("1 from all").isEqualTo(result);
    }


}
