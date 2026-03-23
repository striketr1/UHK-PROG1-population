package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunFact1Test
{
    @Test
    void test01()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact1.getFunFact(data);
        assertEquals(
                132,
                result
        );
    }
}
