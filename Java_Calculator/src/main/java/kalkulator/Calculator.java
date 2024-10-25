package kalkulator;

public class Calculator {
	private int state = 0;
    private Integer memory = null;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void add(int value){
		state += value;
	}

	public void mult(int value){
		state *= value;
	}

	public void div(int value)
	{
		if (value==0) 
		{
			throw new ArithmeticException("Nie można dzielić przez zero");
		}
		else
		{
			state /= value;
		}
	}
	public void sub(int value)
	{
		state -= value;
	}
	
    public void storeInMemory() 
	{
        memory = getState();
    }
    public void clearMemory() 
	{
        memory = null;
	}
    public Integer recallMemory() 
	{
        return memory;
	}
    public void setStatefromMemory() 
	{
        if (memory != null) 
		{
            state = memory;
        } 
		else 
		{
            throw new IllegalStateException("Brak danych w pamięci");
        }
    }
}
