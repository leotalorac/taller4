//node implementation
public class Node {
    //next node
    Node next;
    //data to save, for convinience use int, but can be change to object
    Object ob;
    //constructor
     Node(Object val) {
        ob = val;
        next = null;
    }
}
