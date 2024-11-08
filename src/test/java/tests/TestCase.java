package tests;

import org.example.Calculate;
import org.testng.annotations.Test;

public class TestCase {

    @Test
    public void getFactorialTest(){
        Calculate calculate = new Calculate();
        int result = calculate.getFactorial(7);
        assert result == 5040;
    }
}