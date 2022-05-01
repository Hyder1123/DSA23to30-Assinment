public class SizeOfDoublyLinkedList {

    private class Node {
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head,tail;

    public void insert(int data){
        Node nn = new Node(data);
        if(head == null){
            this.head = nn;
            this.tail = nn;
            return;
        }
        this.tail.next = nn;
        nn.prev = this.tail;
        this.tail = nn;
    }

    public void display(){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
            System.out.print(temp.data+" <-> ");
            count++;
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("size of list = "+count);
    }

    public static void main(String args[]){

        SizeOfDoublyLinkedList list =new SizeOfDoublyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();

    }
    
}
