import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void test1() {
        assertEquals("stringToNumber(1234)", 1234, StringToNumber.stringToNumber());
    }

    @Test
    public void test2() {
        assertEquals("stringToNumber(605)", 605, StringToNumber.stringToNumber());
    }

    @Test
    public void test3() {
        assertEquals("stringToNumber(1405)", 1405, StringToNumber.stringToNumber());
    }

    @Test
    public void test4() {
        assertEquals("stringToNumber(-7)", -7, StringToNumber.stringToNumber());
    }

    private static class StringToNumber {
        public static int stringToNumber(String str) {
            int num = Integer.parseInt(str);
            return num;
        }
    }
}



