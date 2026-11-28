package general_java.singlyLinkedList;

public class mainn {

    public static void main(String[] args) {

        sll singly=new sll();
        sll luckeyNumber=new sll();

        sll ll1=new sll();


        ll1.insertAtStart(100);
        ll1.insertAtStart(90);
        ll1.insertAtStart(80);
        ll1.insertAtStart(70);
        ll1.insertAtStart(60);
        ll1.insertAtStart(50);
        ll1.printAllNodes();
        System.out.println();

        sll ll2=new sll();
        ll2.insertAtStart(67);
        ll2.insertAtStart(57);
        ll2.insertAtStart(45);
        ll2.insertAtStart(35);
        ll2.printAllNodes();
        System.out.println();

        sll mergeLists=sll.mergerLists(ll1,ll2);
        mergeLists.printAllNodes();

        /*Node head=null; //remove this

        singly.printAllNodes();

        singly.insertAtStart(100);
        singly.printAllNodes();

        singly.insertAtStart(200);
        singly.printAllNodes();


        singly.insertAtStart(300);
        singly.printAllNodes();
        System.out.println();


        System.out.println();
        System.out.println("insert At End");
        singly.insertAtEnd(1);
        singly.printAllNodes();

        System.out.println();
        singly.insertAtAnyPos(4,0);
        singly.printAllNodes();*/


        //luckeyNumber.deleteAtPosition(1);
        //luckeyNumber.insertAtStart(201);


        //luckeyNumber.insertAtStart(202);

        //luckeyNumber.deleteAtEnd();
        /*luckeyNumber.insertAtStart(203);
        luckeyNumber.insertAtStart(204);
        luckeyNumber.insertAtStart(205);*/
        //luckeyNumber.printAllNodes();

        /*System.out.println();
        System.out.println("skipping the preceding node");
        luckeyNumber.skipNextNode();*/

        /*boolean res=luckeyNumber.SearchInLinkedList(-1);
        System.out.println(res);*/

        //luckeyNumber.deleteAtStart();
        //luckeyNumber.printAllNodes();

        //luckeyNumber.deleteAtEnd();
        //luckeyNumber.createLoop();
        //luckeyNumber.printAllNodes();
        //luckeyNumber.deleteAtPosition(1);
        //luckeyNumber.printAllNodes();

        /*System.out.println();
        boolean resul=luckeyNumber.checkLoopIsPresent();
        System.out.println("is loop present: "+resul);*/

        /*luckeyNumber.createLoop();
        boolean loop=luckeyNumber.checkLoopIsPresent();
        System.out.println();
        System.out.println("is loop is present: "+loop);*/
        //luckeyNumber.printAllNodes();

        //luckeyNumber.printAllNodes();

        /*System.out.println();
        System.out.println();
        System.out.println("finding the middle elemnt in the linked list:");
*/
        /*luckeyNumber.findMiddleElement();
        luckeyNumber.printAllNodes();*/




    }

}
