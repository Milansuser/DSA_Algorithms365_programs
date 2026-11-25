public class operation_arrays {
    //Blue print
    int array[];
    int length;
    int rightIndex; // also called as size of array = number of elements in an array

    public operation_arrays() {
        //decorations
        length = 5;
        array = new int[length];
        rightIndex = 0; //for empty array

    }


    
    public void DeleteAtStart() {
        if (rightIndex == 0) {
            System.out.println("Array is empty cant be deleted");
        }
        array[0] = 0;
        for (int i = 0; i < rightIndex - 1; i++) {
            array[i] = array[i + 1];

        }
        rightIndex--;
        array[rightIndex] = 0;
    }
    
    public void DeleteFromEnd() {
        if (length == 0) {
            System.out.println("array is empty cant be inserted");
            return;
        }
        rightIndex--;
        array[rightIndex] = 0;
    }

    public void deleteFromStart() {
        if (rightIndex == 0) {
            System.out.println("array is empty");
        }
        for (int i = 0; i < rightIndex - 1; i++) {
            array[i] = array[i + 1];
        }
        rightIndex--;
        array[rightIndex] = 0;
    }

    public void DeleteAtAnyPos(int pos) {
        if (rightIndex == 0) {
            System.out.println("array is emoty cant be printed");
        }
        
        if (pos < 0 || pos > rightIndex) {
            System.out.println("cant be performed");
            return;

        }
        for (int i = pos; i < rightIndex - 1; i++) {
            array[i] = array[i + 1];

        }
        rightIndex--;
        array[rightIndex] = 0;


    }
    
    //Insert at End
    public void insertAtEnd(int value) {

        //array's full
        if (rightIndex == length) {
            System.out.println("Array is full");
            return;//returns to main method / caller
        } else {
            array[rightIndex] = value;
            rightIndex++;
        }
    }
    

    //Insert at start
    public void InsertAtStart(int value) {
        if (rightIndex == length) {
            System.out.println("array is full");
            return;
        } else {
            for (int i = rightIndex - 1; i >= 0; i--) {
                array[i + 1] = array[i];
            }
            array[0] = value;
            rightIndex++;
        }
    }
    
    //insert at any position

    public void InsertAtAnyPos(int value, int pos) {
        if (rightIndex == length) {
            System.out.println("Array is full so cant be inserted");
            return;

        }
        if (pos < 0 || pos > rightIndex) {
            System.out.println("cant be performed");
            return;

        }

        for (int i = rightIndex - 1; i >= pos; i--) {
            array[i + 1] = array[i];

        }
        array[pos] = value;
        rightIndex++;

    }

    public void printElements() {
        System.out.println("Index\tValue");
        for (int i = 0; i < length; i++) {
            System.out.println(i + "\t" + array[i]);
        }
        System.out.println("Size: "+rightIndex);
    }

    public static void main(String[] args) {
        //Memory created
        operation_arrays obj = new operation_arrays();
        obj.printElements();

        //obj.InsertAtAnyPos(100, 2);
        obj.InsertAtStart(10);
        obj.InsertAtStart(20);
        obj.InsertAtStart(30);
        obj.InsertAtStart(40);
        
        //obj.insertAtEnd(100);
        //obj.insertAtEnd(200);

        //obj.insertAtEnd(100);
        //obj.insertAtEnd(200);

        //obj.InsertAtAnyPos(11, 1);

        //obj.insertAtEnd(100);
        obj.printElements();
        
        //System.out.println("deleting at the end");
        obj.deleteFromStart();
        //obj.DeleteFromEnd();

        
        //obj.DeleteAtAnyPos(1);
        obj.printElements();

    }
    
}
