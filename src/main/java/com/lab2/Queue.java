class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}

public class Queue<T> {
    private Node<T> head;
    private int size;
    private Boolean hasMaxSize;
    private int maxSize;

    public Queue() {
        this.head = null;
        this.size = 0;
        this.hasMaxSize = false;
        this.maxSize = 0;
    }

    public Queue(int maxSize) {
        if(maxSize < 0) {
            throw new IllegalArgumentException("maxSize cannot be negative");
        }

        this.head = null;
        this.size = 0;
        this.hasMaxSize = true;
        this.maxSize = maxSize;
    }

    public void push(T element) {
        if(hasMaxSize && size + 1 > maxSize) {
            System.out.println("You have reached the maximum size of the Queue. The push operation will not take place.");
            return;
        }

        Node<T> node = new Node<T>(element);
        node.next = this.head;
        this.head = node;
        this.size += 1;
    }

    public T pop() {
        if(this.head == null) {
            return null;
        }

        this.size -= 1;
        if(this.head.next == null) {
            Node<T> cur = this.head;
            this.head = null;
            return cur.value;
        }
        
        Node<T> cur = this.head;
        while(cur.next.next != null) {
            cur = cur.next;
        }

        T val = cur.next.value;
        cur.next = null;
        return val;
    }

    @Override
    public String toString() {
        // I know adding strings in java is not very efficient, but whatever
        String s = "";
        
        Node<T> cur = this.head;

        while(cur != null) {
            s += " -> ";
            s += cur.value;
            cur = cur.next;
        }
        
        s += " -> ";
        s += cur;

        return s;
    }

    // Advanced Level (mark 9 || 10)
    public Boolean isEmpty() {
        return this.size == 0;
    }
    
    // Advanced Level (mark 9 || 10)
    public Boolean isFull() {
        if(this.hasMaxSize) {
            return this.size == this.maxSize;
        }

        return false;
    }

    public static void main(String[] args) {
        // Medium Level (mark 7 || 8)
        Queue<Integer> queue1 = new Queue<Integer>();
        Queue<Integer> queue2 = new Queue<Integer>(3);

        queue1.push(34);
        queue1.push(25);
        queue1.push(66);
        System.out.println("queue1 " + queue1);
        
        queue2.push(21);
        queue2.push(29);
        queue2.push(99);
        queue2.push(199);
        System.out.println("queue2 " + queue2);
        
        System.out.println(queue1.pop());
        System.out.println("queue1 " + queue1);
        
        System.out.println(queue2.pop());
        System.out.println("queue2 " + queue2);

        // Advanced Level (mark 9 || 10)
        System.out.println("queue1 isEmpty = " + queue1.isEmpty() + ", isFull = " + queue1.isFull());
        System.out.println("queue2 isEmpty = " + queue2.isEmpty() + ", isFull = " + queue2.isFull());
    }
}
