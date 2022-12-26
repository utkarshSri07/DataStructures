public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        linked_functionality ll =new  linked_functionality();
        ll.addStart(5);
        ll.addStart(10);
        ll.display();
         ll.addLast(500);
         ll.insertAt(2,35);
        ll.display();
        // ll.deleteAtLast();
       // ll.deleteAtStart();
        ll.deleteAt(2);


       // ll.display();
       // System.out.println(ll.returnHead().data);
    // ll.insertAtRecursively(ll.returnHead(),16,3);
        ll.displayRercursively(ll.insertAtRecursively(ll.returnHead(),16,3));


    }
}