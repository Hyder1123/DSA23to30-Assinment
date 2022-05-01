import java.lang.*;
public class QueueUsingArray {

    int n = 10;
    int queue[] = new int[n];
    int front = -1,rear = -1;

    public void enQueue(int data) {
        if(rear == n){
            System.out.println("queue is full");
        }
        if(front==-1 && rear==-1){
            this.front++;
            this.rear++;
            queue[this.rear] = data;
        }
        else{
            this.rear++;
            queue[this.rear] = data;
        }
    }

    public int deQueue() throws Exception{
        if(front == rear){
            throw new Exception("queue is empty");
        }
        int rv = queue[front];
        for(int i=0;i<n-1;i++){
               queue[i] = queue[i+1];
        }
        if(rear<n-1){
            queue[rear] = 0;
        }
        rear--;

        return rv;
    }

    public void display(){
        if(front == rear){
            System.out.println("queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    public int peek() throws Exception{
        if(front == rear){
            throw new Exception("queueu is empty");
        }

        return queue[front];
    }

    public boolean isEmpty(){
        if(front == rear){
            return true;
        }
        return false;
    }
    public static void main(String args[]) throws Exception{
        QueueUsingArray list = new QueueUsingArray();
        list.enQueue(10);
        list.enQueue(20);
        list.enQueue(30);
        list.display();
        System.out.println(list.deQueue());
        list.display();
    }
    
}
