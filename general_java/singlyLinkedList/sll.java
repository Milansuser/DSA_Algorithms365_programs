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
            Node walker=this.head; // walker --> new variable naem
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
        System.out.println(" count "+count);
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
}
