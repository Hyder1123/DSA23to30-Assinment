public class QueueUsingLinkedList {

    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    public void enQueue(int data){
        Node nn = new Node(data);
        if(front == null && rear==null){
            front = nn;
            rear = nn;
            return;
        }  
        rear.next = nn;
        rear = nn;
    }

    public int deQueue() throws Exception{
        int rv = front.data;
        if(front == null && rear == null){
             throw new Exception("Queue is Empty");
        }
        if(front == rear){
            front = null;
            rear = null;
            return rv;
        }
        front = front.next;
        return rv;
    }

    public void display(){
        if(front==null){
            System.out.println("Queue is Empty");
            return;
        }
        Node t = front;
        while(t!=null){
            System.out.print(t.data+" -> ");
            t = t.next;
        }
        System.out.println(".");
    }

    public int peek() throws Exception{
        if(front == null){
            throw new Exception("Queue is empty");
        }

        return front.data;
    }

    public boolean isEmpty(){
        if(front==null && rear==null){
            return true;
        }
        return false;
    }
    public static void main(String args[]) throws Exception{
       QueueUsingLinkedList list = new QueueUsingLinkedList();
       list.enQueue(10);
       list.enQueue(20);
       list.enQueue(30);
       list.enQueue(40);
       list.display();
       System.out.println(list.deQueue());
       list.display();

    }
    
}
