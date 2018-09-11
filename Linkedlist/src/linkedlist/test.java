package linkedlist;
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
    }
}
class LinkedList {
    Node head;
    Node target;
    Node tail;
    void add(int x) {
        Node n = new Node(x);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        
    }
    void addOrdered(int x){
        Node n = new Node(x);
        if(head == null){
            head = n;
            tail = n;
        }
        else if(n.data<=head.data){
            head = n;
            head.next = target;
        }
        else if(n.data>= tail.data){
            tail.next = n;
            tail = n;
        }
        else{
            Node run = head;
            while(run !=null){
                if(n.data<=run.data){
                    n.next = run;
                    target.next = n;
                    break;
                }
                target = run;
                run = run.next;
            }
        }
        target = n;
    }
    void print() {
        Node t = head;
        while (t != null) {
            System.out.print(t.data + "→");
            t = t.next;
        }
        System.out.println("null");
    }
    void joinList(LinkedList p){
        tail.next = p.head;
    }
    void count(){
        Node count = head;
        int c = 0;
        while(count!=null){
            c++;
            count = count.next;
        }
        System.out.println(c);
    }
}
public class test {
    public static void main(String[] args) {
        Node n1 = new Node(90);
        Node n2 = new Node(80);
        Node n3 = new Node(70);
        Node n4 = new Node(60);
        Node n5 = new Node(50);
        LinkedList l = new LinkedList();
        LinkedList l2 = new LinkedList();
        l.add(90);
        l.add(80);
        l.add(70);
        l.add(60);
        l.add(50);
        l.count();
        l2.addOrdered(900);
        l2.addOrdered(1);
        l2.addOrdered(12);
        l2.addOrdered(60);
        l2.addOrdered(25);
        l.joinList(l2);
        l.print();
        
    }
}
