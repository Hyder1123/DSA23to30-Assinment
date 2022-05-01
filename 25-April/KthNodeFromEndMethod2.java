//package 25-April;

public class KthNodeFromEndMethod2 {

    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =  null;
        } 
    }
    private Node head;
    private Node tail;
    private int size;

    public void insert(int data){
        Node nn = new Node(data);
        if(this.size == 0){
            this.head = nn;
            this.tail = nn;
            this.size++;
            return;
        }
        this.tail.next = nn;
        this.tail = nn;
        this.size++;
    }

    public void display(){
        if(this.size == 0){
            System.out.println("LL is empty");
            return;
        }
        Node temp = this.head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int kthNode(int k) throws Exception{
        if(k<0 || k>this.size){
            throw new Exception("Invalid index");
        }
        Node slow = this.head;
        Node fast = this.head;
        for(int i=1;i<k;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public static void main(String args[]) throws Exception{
        KthNodeFromEndMethod2 list = new KthNodeFromEndMethod2();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display(); 
        System.out.println(list.kthNode(3));

    }
}
