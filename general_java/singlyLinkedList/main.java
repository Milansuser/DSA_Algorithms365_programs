package general_java.singlyLinkedList;

import java.util.concurrent.BlockingDeque;

public class main {

    public static void main(String[] args) {

        sll singly=new sll();
        sll luckeyNumber=new sll();

        Node head=null; //remove this

        singly.printAllNodes();

        singly.insertAtStart(100);
        singly.printAllNodes();

        luckeyNumber.insertAtStart(200);

        singly.insertAtStart(200);
        singly.printAllNodes();

        luckeyNumber.insertAtStart(201);

        singly.insertAtStart(300);
        singly.printAllNodes();
        System.out.println();

        luckeyNumber.insertAtStart(202);

        System.out.println();
        System.out.println("insert At End");
        singly.insertAtEnd(1);
        singly.printAllNodes();

        System.out.println();
        singly.insertAtAnyPos(4,0);
        singly.printAllNodes();

        //luckeyNumber.printAllNodes();

    }

}
