package general_java.stack;

public class stackMain {
    static void main(String[] args) {
        //object type --> class type
        stackMethod stack=new stackMethod(5);
        System.out.println("is empty"+stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println();
        stack.display();
        System.out.println();

        System.out.println("top element: "+stack.stackTop());

        System.out.println("elements at position 1: "+stack.peek(1));
        System.out.println("elements at position 2: "+stack.peek(2));
        System.out.println("elements at position 3: "+stack.peek(3));
        System.out.println("elements at position 4: "+stack.peek(4));
        System.out.println("elements at position 5: "+stack.peek(5));

        System.out.println();

        System.out.println("Deleted: "+stack.pop());
        System.out.println("Deleted: "+stack.pop());

        System.out.println();

        stack.display();

        System.out.println();

        System.out.println("is empty: "+stack.isEmpty());
        System.out.println("is full: "+stack.isFull());



    }
}
