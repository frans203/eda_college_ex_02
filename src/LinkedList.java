public class LinkedList {
    private Node head;
    private int size;

    public boolean addToFront(int content){
        Node newNode = new Node(content);
        newNode.setNext(head);
        head = newNode;
        size++;
        return true;
    }
    public Node removeFromFront(){
        if(isEmpty()){
            return null;
        }
        Node removedNode = head;
        head = removedNode.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public boolean addToTail(int content){
        Node current = head;
        Node newNode = new Node(content);

        while(current != null){
            if(current.getNext() == null){
                current.setNext(newNode);
                newNode.setNext(null);
                size++;

            }
            current = current.getNext();
        }
        return true;

    }

    public Node removeFromTail() {
        if(isEmpty()){
            return null;
        }
        Node current = head;
        Node tail;
        int count = 1;
        while(current != null) {
          if(current.getNext() == null){
              tail = current;
              break;
          }
          current = current.getNext();
          count++;
        }
        Node oldTail = getElementByPosition(count);
        tail = getElementByPosition(count - 1);
        tail.setNext(null);
        size--;
        return oldTail;
    }


    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        Node current = head;
        System.out.println("HEAD ->");
        while(current != null){
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public Node getElementByPosition(int pos) {
        Node current = head;
        int count = 1;
        if(pos < 1 || pos > size){
            return null;
        }
        while (pos > count){
            current = current.getNext();
            count++;
        }

        return current;
    }

    public int getPositionByElement(int content){
        Node current = head;
        int position = 1;
        if(isEmpty()){
            return -1;
        }

        while(current != null){
            if(current.getContent() == content){
                return position;
            }
            current = current.getNext();
            position++;
        }
        return -1;
    }

    public boolean insertElement(int position, int content){
        if(position == 1){
            return addToFront(content);
        }else if(position == size + 1){
            return addToTail(content);
        }
        Node current = head;
        int count = 1;
        while(position - 1 > count){
            current = current.getNext();
            count++;
        }

        if(head == null) return false;
        Node newElement = new Node(content);
        newElement.setNext(current.getNext());
        current.setNext(newElement);
        size++;
        return true;
    }

    public boolean modifyElement(int position, int content){
        if(isEmpty()){
            return false;
        }
        Node current = head;
        int count = 1;
        while(count < position){
            current = current.getNext();
            count++;
        }
        current.setContent(content);
        return true;
    }


    public Node removeElement(int position){
        if(position == 1) {
            return removeFromFront();
        }else if(position == size + 1){
            return removeFromTail();
        }else{
            Node current = head;
            Node previous = null;
            int count = 1;
            while((position > count) && (current != null)){
                previous = current;
                current = current.getNext();
                count++;
            }
            if(current == null){
                return null;
            }
            previous.setNext(current.getNext());
            current.setNext(null);
            size--;
            return current;
        }
    }


}
