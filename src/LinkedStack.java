public class LinkedStack {

    private Node top;
    public int elements;


    public void Pile(){
        top = null;
        elements = 0;
    }

    public boolean empty() {
        if (elements == 0)
            return true;
        else
            return false;

    }
    public int top(){
        if(empty()){
            return -1;
        }else{
            return top.getContent();
        }
    }

    public int pileSize(){
        if(empty()){
            return 0;
        }else{
            return elements;
        }
    }

    public boolean push(int value){
        Node newNode = new Node(value);
        newNode.setNext(top);
        top = newNode;
        elements++;
        return true;
    }

    public boolean pop(){
        Node aux = top;
        int value = aux.getContent();
        top = aux.getNext();
        aux = null;
        elements--;
        return true;
    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "top=" + top +
                ", elements=" + elements +
                '}';
    }
}
