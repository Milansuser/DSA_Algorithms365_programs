package general_java.singlyLinkedList;

public class sll {

    private Node head;
    private int count;

    public sll(){

        this.head=null;
        this.count=0;
    }

    public void printAllNodes()
    {
        System.out.println();
        //print head

        System.out.print("head --> ");
        //null check
        if(this.head==null)
        {
            System.out.println("linked list is null");
            return;
        }
        else{
            // int i = 0;
            Node walker=this.head; // walker --> new variable name
            while(walker!=null)
            {
                System.out.print(walker.data+" --> ");
                walker=walker.next;
            }
            System.out.print("null");
        }
    }

    public void insertAtStart(int value)//
    {
        Node newNode=new Node(value);
        if(this.head==null)//
        {
             this.head=newNode;//
        }
        else{
            newNode.next=this.head;
            this.head=newNode;//

        }
        this.count++;
        System.out.println();
        //System.out.println(" count "+count);
    }

    public Node insertAtEnd(int value)
    {
        Node endNode=new Node(value);
        if(this.head==null)
        {
            return endNode;
        }
        else{
            Node currNode=this.head;
            while(currNode.next!=null)
            {
                currNode=currNode.next;
            }
            currNode.next=endNode;
            //walker.next=null;
            return currNode;


        }

    }

    public void insertAtAnyPos(int position,int value)
    {

        if(position< 1 || position>this.count+1)
        {
            System.out.println("invalid");
            return;
        }
        if(position==1)
        {
            this.insertAtStart(value);
            return;
        }
        if(position==this.count)
        {
            this.insertAtEnd(value);
            return;
        }

        Node currNode=this.head;
        int count=1;
        Node newNode= new Node(value);

        while(count<position-1)
        {

            currNode=currNode.next;
            count++;

        }

        //step 3
        newNode.next=currNode.next;
        currNode.next=newNode;
        this.count++;

    }
    public boolean SearchInLinkedList(int key)
    {
        System.out.println();
        //print head
        boolean result=false;

        //System.out.print("head --> ");
        //null check
        if(this.head==null)
        {
            System.out.println("linked list is null");
            return false;
        }
        else{
            // int i = 0;
            Node walker=this.head; // walker --> new variable name
            while(walker!=null)
            {
                if(key==walker.data){
                    //result=true;
                    break;
                }
                //System.out.print(walker.data+" --> ");
                walker=walker.next;
            }
            //System.out.print("null");
        }
        return result;
    }

    public void skipNextNode()
    {
        System.out.println();

        System.out.print("head --> ");
        if(this.head == null)
        {
            System.out.println("linked list is null");
            return;
        }
        Node walker = this.head;

        while(walker != null)
        {
            System.out.print(walker.data + " --> ");

            if(walker.next == null)
            {
                break;
            }

            walker = walker.next.next;
        }

        System.out.println("null");
    }

    void deleteAtStart(){
        if(this.head==null)
        {
            return;
        }

        //single and multiple node
        this.head=this.head.next;
        this.count--;
    }

    void deleteAtEnd(){
        if(this.head==null)
        {
            return;
        }
        //only one node
        if(this.head.next==null)
        {
            this.head=null;
            return;
        }
        //many nodes

        Node walker=this.head;
        while(walker.next.next!=null){
            walker=walker.next;
        }
        walker.next=null;
        this.count--;
    }

    void deleteAtPosition(int position)
    {
        if(position<1 || position>count)
        {
            System.out.println("Invalid position");
            return;
        }
        if(position==1)
        {
            this.deleteAtStart();
            return;
        }
        if(position==this.count)
        {
            this.deleteAtEnd();
            return;
        }
        Node walker=this.head;
        count=1;
        while(count<position-1)
        {
            walker=walker.next;
        }
        walker.next=walker.next.next;
        System.out.println("deleted the node");
        count--;

    }

    void createLoop()
    {
        if(this.head==null)
        {
            return;
        }
        Node lastNode=this.head;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;

        }
        lastNode.next=this.head;
    }

    boolean checkLoopIsPresent()
    {
        boolean result=false;
        if(this.head==null)
        {
            return false;
        }

        //only one node
        if(this.head.next==null)
        {
            this.head=null;
            return false;
        }

        Node slow=this.head;
        Node fast=slow.next.next;

        while(slow!=fast && fast.next!=null)
        {
            if(fast==null)
            {
                break;
            }
            slow=slow.next;
            fast=fast.next.next;

        }
        if(slow==fast)
        {
            result=true;
        }
        return result;

    }

    void findMiddleElement()
    {

        if(this.head==null)
        {
            return;
        }

        //only one node
        if(this.head.next==null)
        {
            this.head=null;
            return;
        }

        Node slow=this.head;
        Node fast=slow.next;


        while(fast!=null && fast.next != null){

            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);


    }

    Node getNodeAtStartAndRemoveIt()
    {
        if(this.head == null)
        {
            System.out.println("List is empty");
            return null;
        }

        Node firstNode = this.head;

        this.head = this.head.next;

        firstNode.next = null;  // IMPORTANT: disconnect the extracted node

        this.count--;

        return firstNode;
    }

    public void insertAtEnd(Node newNode)
    {
        if(newNode == null)
        {
            return;
        }

        if(this.head == null)
        {
            this.head = newNode;
            this.count++;
            return;
        }

        Node currentNode = this.head;

        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
        this.count++;
    }

    public static sll mergerLists(sll firstList, sll secondList)
    {
        sll mergedList = new sll();

        if(firstList == null)
        {
            return secondList;
        }

        if(secondList == null)
        {
            return firstList;
        }

        while(firstList.head != null && secondList.head != null)
        {
            Node firstNode = null;

            if(firstList.head.data < secondList.head.data)
            {
                firstNode = firstList.getNodeAtStartAndRemoveIt();
            }
            else
            {
                firstNode = secondList.getNodeAtStartAndRemoveIt();
            }

            mergedList.insertAtEnd(firstNode);
        }

        sll unfinishedList = null;

        if(firstList.head != null)
        {
            unfinishedList = firstList;
        }
        else if(secondList.head != null)
        {
            unfinishedList = secondList;
        }

        if(unfinishedList != null)
        {
            while(unfinishedList.head != null)
            {
                Node newNode = unfinishedList.getNodeAtStartAndRemoveIt();
                mergedList.insertAtEnd(newNode);
            }
        }

        System.out.println("Merged List: ");

        return mergedList;
    }

}


