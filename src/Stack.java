
public class Stack {
    int[] data;
    int index = 0;
    final int length = 5;

    public Stack()
    {
        data = new int[length];
    }

    public void push(int value)
    {
        if(index < length)
        {
            data[index++] = value;
        }else
        {
            throw new ArrayIndexOutOfBoundsException("Stack is overflow");
        }
    }

    public  int  pop()
    {
        if(index > 0)
        {
            return data[index--];
        } else
        {
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
    }

    public static void main (String args[])
    {
        Stack stack = new Stack();
    }
}
