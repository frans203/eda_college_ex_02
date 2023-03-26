public class Main {
    public static void main(String[] args) {
        //Empty List
        LinkedList linkedlist = new LinkedList();
        //Verifying if List is empty
        System.out.println(linkedlist.isEmpty());
        //Adding elements to the front
        linkedlist.addToFront(1);
        linkedlist.addToFront(2);
        linkedlist.addToFront(3);
        //Get Size of the linkedList
        System.out.println("size: " + linkedlist.getSize());
        //Get element by position
        System.out.println("Element at position 2: " + linkedlist.getElementByPosition(2));
        //Get Position by Element
        System.out.println("Position of element 3: " + linkedlist.getPositionByElement(3));
        //Adding to tail of the LinkedList
        linkedlist.addToTail(10);
        linkedlist.addToTail(33);
        //Modifying content of an element by position
        linkedlist.modifyElement(2, 99);
        //Insert Element on a certain position
        linkedlist.insertElement(2, 49);
        //Remove Element on a certain position
        linkedlist.removeElement(4);
        //Remove from Head
        linkedlist.removeFromFront();
        //Remove from tail
        linkedlist.removeFromTail();
        //Print List
        linkedlist.printList();
    }
}