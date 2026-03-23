package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunFact4Test
{
    @Test
    void test01()
    {
        var data = TestDataUtils.getTestData();
        var result = FunFact4.getFunFact(data);
        assertEquals(
                "Praha",
                result
        );
    }
}
