package general_java.stack;

public class singleStackPractise
{
    static int top=-1;
    static int size=5;

    static int[] stack=new int[size];
    //stack --> size --> top --> stackTop -->
    public static boolean isEmpty(int top)
    {
        return top==-1;
    }

    public static boolean isFull(int top,int size)
    {
        return top==size-1;
    }

    public static void push(int value)
    {
        if(isFull(top, size))
        {
            System.out.println("stack is full cannot be inserted");
            return;
        }
        top++;
        stack[top]=value;
    }

    public static void display()
    {
        if(isEmpty(top)){
            return;
        }
        for(int i=top;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }
    public static int pop()
    {
        if(isEmpty(top))
        {
            return -1;
        }
        int value=stack[top];
        top--;
        return value;
    }

    public static int stackTop()
    {
        if(isEmpty(top))
        {
            System.out.println("stack is empty so, stack top is not be determined");
            return -1;
        }
        return stack[top];

    }

    public static int peek(int position)
    {
        int index=top-position+1;
        if(index<0 || index>top)
        {
            System.out.println("peek cannot be determined bcos index out of bounds");
            return -1;
        }
        return stack[index];

    }
    public static void main(String[] args) {


        System.out.println(isEmpty(top));

        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        System.out.println("The stack top value is: "+stackTop());

        display();

        System.out.println();

        pop();
        pop();

        System.out.println("The stack top value is: "+stackTop());

        display();

        System.out.println("The peek element is: "+peek(4));

        display();


    }
}
