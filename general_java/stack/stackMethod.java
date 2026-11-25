package general_java.stack;

public class stackMethod
{
    int size;
    int top;
    int[] stack; //-->?

    //constructor
    stackMethod(int size)
    {
        this.size=5; //this--> keyword
        top=-1;
        stack=new int[size];
    }

    boolean isEmpty()
    {
        return top==-1;
    }

    boolean isFull()
    {
        return top==size-1;
    }

    void push(int value)
    {
        if(isFull())
        {
            System.out.println("stack is full");
            return;
        }
        top++;
        stack[top]=value;

        System.out.println(value+" inserted into stack");
    }

    int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        int value=stack[top];
        top--;

        return value;
    }

    //stackTop
    int stackTop()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return -1;
        }

        return stack[top];
    }

    // peek
    int peek(int position)
    {
        int index=top-position+1;

        if(index<0 || index >top)
        {
            System.out.println("invalid index");
            return -1;
        }

        return stack[index];
    }

    void display()
    {
        if(isEmpty())
        {
            System.out.println("cant be displayed because no elenefs");
            return;
        }
        System.out.println("\nStack elements: ");

        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }

}
