package kalkulator;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
	@Test
	public void testAddOne(){
		// Arrange
		// sut = System Under Test
		Calculator sut = new Calculator();
		// Act
		sut.add(1);
		// Assert
		assertEquals("0+1 = 1", 1, sut.getState());
	}
	@Test
	public void testAddOverload()
	{
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.add(Integer.MAX_VALUE);
		assertEquals("1+Integer.MAX_VALUE=Integer.MAX_VALUE+1",(long)Integer.MAX_VALUE+1,sut.getState());
	}
	@Test
    public void testAddNeg()
	{
        Calculator sut = new Calculator();
		sut.setState(0);
        sut.add(-28);
        assertEquals("0+(-28) = -28", -28, sut.getState());
	}

	@Test
	public void testMultOneByTwo(){
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(2);
		assertEquals("1*2 = 2", 2, sut.getState());
	}
	
	@Test
	public void testMultOneByZero()
	{
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(0);
		assertEquals("1*0 = 0", 0, sut.getState());
	}
	@Test
	public void testMultOneByNeg()
	{
		Calculator sut = new Calculator();
		sut.setState(1);
		sut.mult(-3);
		assertEquals("1*(-3)=(-3)",-3,sut.getState());
	}
	@Test
    public void testMultOverload() 
	{
        Calculator sut = new Calculator();
        sut.setState(Integer.MAX_VALUE);
        sut.mult(3);
        assertEquals("Integer.MAX_VALUE*2 = overload or value", (long)Integer.MAX_VALUE * 3, sut.getState());
	}

	@Test
	public void testsubOne(){
		Calculator sut = new Calculator();
		sut.setState(0);
		sut.sub(1);
		assertEquals("0-1 = -1", -1, sut.getState());
	}
	@Test
	public void testsubOverload()
	{
		Calculator sut = new Calculator();
		sut.setState(Integer.MIN_VALUE);
		sut.sub(1);
		assertEquals("Integer.MIN_VALUE - 1 = value",(long)Integer.MIN_VALUE-1,sut.getState());
	}
	@Test
    public void testsubNeg()
	{
        Calculator sut = new Calculator();
		sut.setState(0);
        sut.add(-28);
        assertEquals("0+(-28) = -28", -28, sut.getState());
	}
	@Test
	public void testDivOneByTwo()
	{
        Calculator sut = new Calculator();
		sut.setState(1);
        sut.div(2);
        assertEquals("1/2=0.5", 0.5, sut.getState(),0.01);
	}
	@Test
    public void testDivByZero() {
        Calculator sut = new Calculator();
        sut.setState(1);
        try 
		{
            sut.div(0);
            fail("Oczekiwano ArithmeticException");
        } 
		catch (ArithmeticException e) 
		{
            assertEquals("nie można dzielić przez zero", e.getMessage());
        }
    }
	@Test
	public void testDivOverload()
	{
		Calculator sut = new Calculator();
		sut.setState(1);
        sut.div(Integer.MAX_VALUE);
        assertEquals("1/Integer.MAX_VALUE = 1/Integer.MAX_VALUE", 1/Integer.MAX_VALUE, sut.getState());
	}
	@Test
	public void testDivByNeg()
	{
		Calculator sut = new Calculator();
		sut.setState(1);
        sut.div(-1);
        assertEquals("1/-1=-1", -1, sut.getState());
	}


}
