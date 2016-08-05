package task1;

import static utils.Log.CONSOLE;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AnatoliiHanziuk on 04.08.2016.
 */
public class MiddleNodeTest {

    @Before
    public void beforeTest() {
        System.out.println("-----------------------------------");
        CONSOLE.info("Test is started");
        System.out.println("-----------------------------------");
    }

    @After
    public void afterTest() {
        System.out.println("-----------------------------------");
        CONSOLE.info("Test is finished");
        System.out.println("-----------------------------------");
    }

    @Test
     public void removeMiddleNodeInOneElementList() {
        LinkedList linkedList = new LinkedList();
        assertEquals(linkedList.toString(), "root-");
        Node middleNode = linkedList.getMiddleNode(linkedList);
        assertEquals(middleNode.toString(), "root");
        linkedList.remove(middleNode);
        assertEquals(linkedList.toString(), "root-");
    }

    @Test
    public void removeMiddleNodeInTwoElementList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        assertEquals(linkedList.toString(), "root-1-");
        Node middleNode = linkedList.getMiddleNode(linkedList);
        assertEquals(middleNode.toString(), "1");
        linkedList.remove(middleNode);
        assertEquals(linkedList.toString(), "root-1-");
    }

    @Test
    public void removeMiddleNodeInEvenElementList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        assertEquals(linkedList.toString(), "root-1-2-3-4-5-");
        Node middleNode = linkedList.getMiddleNode(linkedList);
        assertEquals(middleNode.toString(), "3");
        linkedList.remove(middleNode);
        assertEquals(linkedList.toString(), "root-1-2-4-5-");
    }

    @Test
    public void removeMiddleNodeInOddElementList() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert("2");
        linkedList.insert(true);
        linkedList.insert("4");
        assertEquals(linkedList.toString(), "root-1-2-true-4-");
        Node middleNode = linkedList.getMiddleNode(linkedList);
        assertEquals(middleNode.toString(), "2");
        linkedList.remove(middleNode);
        assertEquals(linkedList.toString(), "root-1-true-4-");
    }
}
