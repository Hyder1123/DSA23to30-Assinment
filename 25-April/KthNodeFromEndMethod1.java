//package 25-April;

public class KthNodeFromEndMethod1 {

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

    public void reverse() throws Exception{
        if(this.size == 0){
            throw new Exception("LL is empty");
        }
        if(this.size == 1){
            return;
        }
        Node prev = this.head;
        Node curr = prev.next;
        while(curr != null){
            Node t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;
        }
        Node temp = this.tail;
        this.tail = this.head;
        this.head = temp;
        this.tail.next = null;
    }

    public int kthNodeFromEnd(int k) throws Exception{
           if(k<0 || k>this.size){
               throw new Exception("Invalid index");
           }
           Node temp = this.head;
           for(int i=1;i<k;i++){
               temp = temp.next;
           }
           return temp.data;
    }

    public static void main(String args[]) throws Exception{
        KthNodeFromEndMethod1 list = new KthNodeFromEndMethod1();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display(); 
        list.reverse();
        list.display();
        System.out.println(list.kthNodeFromEnd(5));

    }
    
}
