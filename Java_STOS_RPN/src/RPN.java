import java.util.Stack;

public class RPN {
    private Stack<Integer> stack = new Stack<>();
    public int rownanie(String input) 
    {
        String[] elementy = input.split(" ");
        for (String element : elementy) 
        {
            if (czyLiczba(element)) 
            {
                stack.push(Integer.parseInt(element));
            } 
            else 
            {
                if (stack.size() < 2) 
                {
                    throw new IllegalArgumentException("Za mało elementów na stosie do wykonania operacji.");
                }
                int liczba2 = stack.pop();
                int liczba1 = stack.pop();
                int wynik = dzialanie(liczba1, liczba2, element);
                stack.push(wynik);
            }
        }

        if (stack.size() != 1) 
        {
            throw new IllegalStateException("Nieprawidłowe wyrażenie RPN.");
        }
        return stack.pop();
    }

    private boolean czyLiczba(String str) 
    {
        try 
        {
            Integer.parseInt(str);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }

    private int dzialanie(int liczba1, int liczba2, String dzialanie) 
    {
        switch (dzialanie) {
            case "+":
                return liczba1 + liczba2;
            case "-":
                return liczba1 - liczba2;
            case "*":
                return liczba1 * liczba2;
            default:
                throw new IllegalArgumentException("Nieprawidłowy operator: " + dzialanie);
        }
    }
}
