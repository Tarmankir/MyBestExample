import org.testng.annotations.Test;

import static common.DataConverter.separateNumberInString;
import static org.testng.Assert.assertEquals;

public class DataConverterTest {

    @Test(description = "Unit test for separate number method in DataConverter")
    public void dataConverterPositiveTest() {
        assertEquals(separateNumberInString("тестовая строка 123"), "123");
    }
}