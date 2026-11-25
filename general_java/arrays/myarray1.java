public class myarray1 {
    public static void main(String[] args) {
        //Memory created
        operation_arrays obj = new operation_arrays();
        obj.printElements();

        //obj.InsertAtAnyPos(100, 2);
        //obj.InsertAtStart(10);
        //obj.InsertAtStart(20);
        obj.insertAtEnd(100);
        obj.insertAtEnd(200);

        obj.insertAtEnd(100);
        obj.insertAtEnd(200);

        obj.InsertAtAnyPos(11, 1);

        obj.insertAtEnd(100);

        obj.printElements();

    }
    
}
