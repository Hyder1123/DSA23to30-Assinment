public class RemoveNodeGreaterThan25 {
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
    public void remove() throws Exception{
        if(this.head == null){
            throw new Exception("LL is empty");
        }
        if(this.head.next == null && this.head.data>25){
            head = null;
            tail = null;
            return;
        }
        while(this.head.next != null && head.data>25){
            
            head = head.next;
            head.prev = null;
           /* if(head.next == null && head.data>25){
                head = null;
                tail = null;
            }*/
            
           
        }
        if(head.next == null && head.data>25){
            head = null;
            tail = null;
            return;
        }
        Node t = head;
        while(t.next!= null){
            if(t.data > 25){
                t.prev.next = t.next;
                t.next.prev = t.prev;
                t = t.next;
            }
            else{
                t = t.next;
            }
        }

        if(tail.data>25){
            tail = tail.prev;
            tail.next = null;
        }
    }

    public static void main(String args[]) throws Exception{

        RemoveNodeGreaterThan25 list =new RemoveNodeGreaterThan25();
        list.insert(39);
        list.insert(30);
        list.insert(30);
        list.insert(10);
        list.insert(29);
        list.insert(20);
        list.insert(39);
        list.insert(17);
        list.insert(38);
        list.remove();
        list.display();

    }
}
