import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BalancedWordsCounterTest {

    @Test
    public void shouldReturnNumberOfBalancedSubWords() {
        //given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        //when
        Integer value = balancedWordsCounter.count("aabbabcccba");
        //then
        assertEquals(value, 28);
    }

    @Test
    public void shouldReturnZero() {
        //given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        //when
        Integer value = balancedWordsCounter.count("");
        //then
        assertEquals(value, 0);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowRuntimeException() throws Exception {
        //given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        String input = "abababa1";
        //when
        balancedWordsCounter.count(input);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowRuntimeExceptionBecauseInputIsNull() throws Exception {
        //given
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        //when
        balancedWordsCounter.count(null);
    }

}