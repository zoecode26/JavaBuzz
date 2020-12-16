import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaBuzzTest {
    @Test
    public void numberDivisibleByThreeShouldReturnJava() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.calculate(6);
        assertEquals("Java", result);
    }

    @Test
    public void numberDivisibleByFiveShouldReturnBuzz() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.calculate(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void numberDivisibleByThreeAndFiveShouldReturnJavaBuzz() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.calculate(15);
        assertEquals("JavaBuzz", result);
    }

    @Test
    public void numberDivisibleByNeitherThreeOrFiveShouldReturnNumberItself() {
        JavaBuzz javabuzz = new JavaBuzz();
        String result = javabuzz.calculate(4);
        assertEquals("4", result);
    }
}