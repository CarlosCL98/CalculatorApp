package edu.eci.arep.app;

/**
 * This class represent a Node of the LinkedList.
 *
 * @author Carlos Medina
 */
public class Node {

    private double data;
    private Node nextNode;
    private Node priorNode;

    /**
     * Constructor with parameters for Node class.
     *
     * @param data
     * @param nextNode
     * @param priorNode
     */
    public Node(double data, Node nextNode, Node priorNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.priorNode = priorNode;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPriorNode() {
        return priorNode;
    }

    public void setPriorNode(Node priorNode) {
        this.priorNode = priorNode;
    }

}
