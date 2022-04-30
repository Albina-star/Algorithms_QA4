import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {
@Test
    public void testOddEvenHappyPath(){
        int a = 222222;
        String expectedResult= "Even";

        OddEven as = new OddEven();
        String actualResult = as.OddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
