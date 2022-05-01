//package 26-April;

public class LinkedListPalindrome {

    
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

    public boolean reverse() throws Exception{
        if(this.size == 0){
            throw new Exception("LL is empty");
        }
        if(this.size == 1){
            return true;
        }
        Node head1 = this.head;
        Node tail1 = this.tail;

        Node prev = this.head;
        Node curr = prev.next;
        while(curr != null){
            Node t = curr.next;
            curr.next = prev;
            prev = curr;
            curr = t;
        }
       
        Node temp = tail1;
        tail1 = head1;
        head1 = temp;
        tail1.next = null;
        Node t1 = head1;
        Node t2 = head;
        while(t1!= null && t2!=null){
            if(t1.data != t2.data){
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }

        return true;
    }

    public static void main(String args[]) throws Exception{

        LinkedListPalindrome list  = new LinkedListPalindrome();
        list.insert(1);
        list.insert(2);
        list.insert(1);
        list.insert(4);
        list.display();
        System.out.println(" is Palindrome "+ list.reverse());
    }
    
}
