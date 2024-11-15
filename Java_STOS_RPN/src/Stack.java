import java.util.ArrayList;
public class Stack {
	ArrayList<String> elements = new ArrayList<>();
	public int size;

	public void push(String element)
	{
		elements.add(element);
	}
	public String pop()
	{
		if (elements.isEmpty()) 
		{
			throw new IllegalStateException("Lista jest pusta");
		}
		return elements.remove(elements.size() - 1);
	}
	public String peek()
	{
		if (elements.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
		return elements.get(elements.size()-1);
	}
	public Integer size()
	{
		Integer rozmiar = elements.size();
		return rozmiar;
	}
}