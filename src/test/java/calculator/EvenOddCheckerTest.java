package calculator;

//import EvenOddChecker;
import org.junit.Assert;
import org.junit.Test;

public class EvenOddCheckerTest {

        @Test
        public void checkEven() {
            Assert.assertEquals("Numbers should be even", true, EvenOddChecker.check(2));
        }

        @Test
        public void oddEven() {
            Assert.assertEquals("Numbers should be odd", false, EvenOddChecker.check(3));
        }
}

