import org.junit.*;

import static org.junit.Assert.assertEquals;

public class StackTest {
	@Test
	public void testPopAfterPush() {
		Stack stack = new Stack();
		stack.push("napis");
		String result = stack.pop();
		assertEquals("pop after push", "napis", result);
	}
    @Test
    public void testPopIfEmpty() {

        Stack stack = new Stack();
        try {
            stack.pop();
        } catch (IllegalStateException wyjatek) {
            assertEquals("Lista jest pusta", wyjatek.getMessage());
        }
    }
    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push("element");
        String result = stack.peek();
        assertEquals("element", result);
        Integer rozmiar = stack.size();
        assertEquals((Integer)1,rozmiar);
    }
}
