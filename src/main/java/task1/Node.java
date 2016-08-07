package task1;

import static utils.Log.CONSOLE;

/**
 * Created by AnatoliiHanziuk on 04.08.2016.
 */
public class Node<T extends Comparable<T>> {

    private T data;
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    public void insert(T newData) {

        if (this.nextNode != null) {
            this.nextNode.insert(newData);
        }
        else {
            this.nextNode = new Node<>(newData);
        }
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

}
