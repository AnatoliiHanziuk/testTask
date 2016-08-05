package task1;

import static utils.Log.CONSOLE;

/**
 * Created by AnatoliiHanziuk on 04.08.2016.
 */
public class LinkedList<T extends Comparable<T>>{

    private Node<T> root;
    private int count = 1;

    public LinkedList(){
        this.root = new Node("root");
    }

    @Override
    public String toString() {
        String result = "";
        Node<T> actualNode = this.root;
        // Before we are not at the end of linked list
        while (actualNode != null) {
            result += actualNode.getData() + "-";
            actualNode = actualNode.getNextNode();
        }
        CONSOLE.info("Linked list representation: " + result);
        return result;
    }

    public void insert(T data) {
        // If we want to insert the first element
        this.count++;
        if (this.root == null) {
            this.root = new Node<>(data);
        }
        else {
            this.root.insert(data);
        }
    }

    public boolean remove(Node node) {
        if (node == null || node.getNextNode() == null) {
            return false;
        }
        node.getData();
        Node next = node.getNextNode();
        node.setData(next.getData());
        node.setNextNode(next.getNextNode());
        return true;
    }

    public Node getMiddleNode(LinkedList linkedList) {
        Node currentNode = linkedList.getRoot();
        int length = 0;
        Node middleNode = linkedList.getRoot();
        while(currentNode != null) {
            length++;
            if (length % 2 == 0) {
                middleNode = middleNode.getNextNode();
            }
            currentNode = currentNode.getNextNode();
        }
        CONSOLE.info("Middle node: " + middleNode.toString());
        return middleNode;
    }

    public Node getRoot(){
        return root;
    }

}
