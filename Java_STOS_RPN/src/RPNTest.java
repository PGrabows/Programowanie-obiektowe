import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class RPNTest {
    @Test
    public void testAdd() 
    {
        RPN rpn = new RPN();
        assertEquals(5, rpn.rownanie("2 3 +"));
    }

    @Test
    public void testSub() 
    {
        RPN rpn = new RPN();
        assertEquals(1, rpn.rownanie("3 2 -"));
    }

    @Test
    public void testMult() 
    {
        RPN rpn = new RPN();
        assertEquals(6, rpn.rownanie("2 3 *"));
    }

    @Test
    public void testMultipleOperations() {
        RPN rpn = new RPN();
        assertEquals(10, rpn.rownanie("2 3 + 2 *"));
    }

    @Test
    public void testInvalidOperator() 
    {
        RPN rpn = new RPN();
        try 
        {
            rpn.rownanie("2 3 ^");
            fail("Expected IllegalArgumentException for invalid operator");
        } catch (IllegalArgumentException e) 
        {
            
        }
    }

    @Test
    public void testInsufficientOperands() 
    {
        RPN rpn = new RPN();
        try {
            rpn.rownanie("2 +");
            fail("Expected IllegalArgumentException for insufficient operands");
        } 
        catch (IllegalArgumentException e) 
        {

        }
    }

    @Test
    public void testEmptyInput() 
    {
        RPN rpn = new RPN();
        try {
            rpn.rownanie("");
            fail("Expected IllegalArgumentException for empty input");
        } 
        catch (IllegalArgumentException e) 
        {

        }
    }
}
