package HW2;

public class Node<T> {
    
    private T value;
    private Node<T> next;
    private Node<T> previous;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public boolean equals(Node<T> node) {
        return (this.value == node.value);
    }

}
