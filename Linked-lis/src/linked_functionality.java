public class linked_functionality {
    Node head;
    Node tail;

    private int size = 0;


    public void addLast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            size++;
            return;
        }
        Node n1 = head;
        while (n1.next != null) {
            n1 = n1.next;
            size++;
        }
        n1.next = n;

    }

    public void addStart(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            size++;
            return;
        }
        n.next = head;
        head = n;
        size++;

    }

    public void insertAt(int pos, int data) {
        if (pos > size) {
            System.out.println("Out Of Range");
        } else if (pos == 0) {
            addStart(data);
        } else if (pos == size) {
            addLast(data);
        } else {
            Node n = new Node(data);
            Node n1 = head;
            int flag = 0;
            while (flag != pos - 1 && n1 != null) {
                n1 = n1.next;
                flag++;
            }
            n.next = n1.next;
            n1.next = n;
            size++;
        }
    }
    public void deleteAtLast(){
        Node n = head;
        while (n.next.next != null){
            System.out.println("In deletion Phase"+n.data);
            n=n.next;
        }
        size--;
        n.next=null;
    }
    public void deleteAtStart(){
        head = head.next;
    }
    public void deleteAt(int pos){
        if(pos ==0){
            deleteAtStart();
        }else if(pos==size){
            deleteAtLast();
        }else {
            Node n = head;
            int flag=0;
            while (n.next != null && flag!=pos){
                n=n.next;
                flag++;
            }
            n=n.next;
        }

    }
    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data);
            if(n.next != null){
                System.out.print("->");
            }
            n = n.next;
        }
        System.out.println("\n"+size);
    }
}
