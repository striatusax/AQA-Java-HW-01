package tests;

import org.example.Calculate;
import org.junit.jupiter.api.Test;

public class TestCase {

    @Test
    public void getFactorialTest(){
        Calculate calculate = new Calculate();
        int result = calculate.getFactorial(5);
        assert result == 120;
    }
}
