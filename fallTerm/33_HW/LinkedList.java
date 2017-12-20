public class LinkedList {

    public NodeForLinkedList head;

    /* Construct a list.
     * When we address linked lists for real, we will build ways
     * to make arbitrary lists. But keep it simple for now.
     */ 
    public LinkedList() {
        
        // creates nodes for the list, in no particular order
        NodeForLinkedList dorsey    = new NodeForLinkedList( "half-n-half"); 
        NodeForLinkedList basie     = new NodeForLinkedList( "1 measly kiwi");
        NodeForLinkedList ellington = new NodeForLinkedList( "Count Chocula");
        NodeForLinkedList goodman   = new NodeForLinkedList( "heart meds");
        
        // connects the just-constructed nodes, with most improtant foods first
        ellington.referenceToNextNode = dorsey;
        dorsey.referenceToNextNode    = basie;
        basie.referenceToNextNode     = goodman;
        // goodman.referenceToNextNode remains null
        
        head = ellington;
    }

    public LinkedList(NodeForLinkedList headparam) {
        
        // creates nodes for the list, in no particular order
        NodeForLinkedList dorsey    = new NodeForLinkedList( "half-n-half"); 
        NodeForLinkedList basie     = new NodeForLinkedList( "1 measly kiwi");
        NodeForLinkedList ellington = new NodeForLinkedList( "Count Chocula");
        NodeForLinkedList goodman   = new NodeForLinkedList( "heart meds");
        
        // connects the just-constructed nodes, with most improtant foods first
        ellington.referenceToNextNode = dorsey;
        dorsey.referenceToNextNode    = basie;
        basie.referenceToNextNode     = goodman;
        // goodman.referenceToNextNode remains null
        
        head = headparam;
    }

    // public String toString() {
    //     // while-style traversal
    //     String result = "";
    //     NodeForLinkedList starting = head;
        
    //     while (starting != null) {

    //         result += starting;
    //         starting = starting.referenceToNextNode;
    //     }
        
    //     return result;
    // }

    // public int size() {

    //     int size = 0;
    //     NodeForLinkedList starting = head;

    //     while (starting != null) {

    //         size += 1;
    //         starting = starting.referenceToNextNode;
    //     }

    //     return size;
    // }

    public String toString() {
        LinkedList continuation = new LinkedList(head.referenceToNextNode);

        // if (head.referenceToNextNode == null) {
        //     return head.toString();
        // }

        // else {
        //     return "" + head + continuation;
        // }

    if (head.referenceToNextNode == null) ? (return head.toString()) : (return "" + head + continuation);
    }

    public int size() {
        LinkedList continuation = new LinkedList(head.referenceToNextNode);

        return continuation.size()++;
    }
}