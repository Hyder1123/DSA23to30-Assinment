//package 26-April;

public class InterSectionPointOfLinkedList {

    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    } 
    private Node head1;
    private Node head2;
    private Node tail1;
    private Node tail2;

    public void insert1(int data){
        Node nn = new Node(data);
        if(this.head1 == null){
            this.head1 = nn;
            this.tail1 = nn;
            return;
        }
        this.tail1.next = nn;
        this.tail1 = nn;
    }
    public void insert2(int data){
        Node nn = new Node(data);
        if(this.head2 == null){
            this.head2 = nn;
            this.tail2 = nn;
            return;
        }
        this.tail2.next = nn;
        this.tail2 = nn;
    }

    
    void display(){
        if(head1 == null){
            //return;
            System.out.println("LL1 is empty");
        }
        if(head2 == null){
            //return;
            System.out.println("LL2 is empty");
        }

        Node t1 = head1;
        while(t1!=null){
            System.out.print(t1.data+" -> ");
            t1 = t1.next;
        }
        System.out.println("null");

        Node t2 = head2;
        while(t2!=null){
            System.out.print(t2.data+" -> ");
            t2 = t2.next;
        }
        System.out.println("null");
    }

    public Node NodeAt(int k){
        Node temp = head1;
        for(int i=1;i<k;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void connect(){
        this.tail2.next = NodeAt(1);
        this.tail2 = this.tail1;
    }

    public int size1(){
        int count = 0;
        Node t1 = head1;
        while(t1!=null){
            t1 = t1.next;
            count++;
        }
        return count;
    }

    public int size2(){
        int count = 0;
        Node t1 = head2;
        while(t1!=null){
            t1 = t1.next;
            count++;
        }
        return count;
    }

    public int intersectionPoint(){
        int l1 = size1();
        int l2 = size2();
        int dif = 0;
        Node t1 = head1;
        Node t2 = head2;
        System.out.println(l1+" "+l2);
        if(l1>l2){
            dif = l1-l2;
            for(int i=1;i<=dif;i++){
                t1 = t1.next;
            }
        }
        else{
            dif = l2-l1;
            for(int i=1;i<=dif;i++){
                t2 = t2.next;
            }
        }
        while(t1!=null && t2!=null){
            if(t1 == t2){
                return t1.data;
            }
            t1 = t1.next;
            t2 = t2.next;
        }

        return -1;
    }
    public static void main(String args[]){

        InterSectionPointOfLinkedList list = new InterSectionPointOfLinkedList();
        list.insert1(1);
        list.insert1(2);
        list.insert1(3);
        list.insert1(4);
        list.insert1(5);
        list.insert1(6);
        list.insert1(7);
        list.insert2(3);
        list.insert2(10);
        list.insert2(13);
        list.connect();
        list.display();
        System.out.println(list.intersectionPoint());

    }
    
}
