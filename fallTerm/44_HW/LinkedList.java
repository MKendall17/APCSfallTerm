public class LinkedList {

    private NodeForLinkedList head;

    /* Construct either...
     *   o  a short list; or
     *   o  a longer list with a short list as one node's cargo
     */ 
    public LinkedList( ) {
        // if( sizeWanted == 2) { // make a short list to be used as a sub-list
        //     NodeForLinkedList terry = new NodeForLinkedList( "mango");
        //     NodeForLinkedList green = new NodeForLinkedList( "grapes");
        //     terry.setReferenceToNextNode( green);
        //     head = terry;
        // }
            
        // else { // make a long list, including a short sub-list
        //     NodeForLinkedList dorsey    = new NodeForLinkedList( "half-n-half"); 
        //     NodeForLinkedList basie     = new NodeForLinkedList( new LinkedList(2));
        //     NodeForLinkedList ellington = new NodeForLinkedList( "Count Chocula");
        //     NodeForLinkedList goodman   = new NodeForLinkedList( "heart meds");
            
        //     // connects the just-constructed nodes
        //     ellington.setReferenceToNextNode( dorsey);
        //     dorsey.setReferenceToNextNode( basie);
        //     basie.setReferenceToNextNode( goodman);
        //     // goodman.referenceToNextNode remains null
            
        //     head = ellington;

        head = null;
        }

    // while-style 
    public String toString() {
        String result = "while-style: ( "; // enclosed in parens, like Racket
        
        NodeForLinkedList n = head;
        while(  n != null) {
            result +=  n;
            n = n.getReferenceToNextNode();
        }
        return result + " )";
    }

    /** 
        Adds an n @NodeForLinkedList to the beginning of the LinkedList @LinkedList
    */
    public void addFirst(NodeForLinkedList n) {

        n.setReferenceToNextNode(head);
        head = n;
    }

    /** 
        Adds an n @NodeForLinkedList to the end of the LinkedList @LinkedList
    */

    //helper function

    public NodeForLinkedList lastNode() {
        NodeForLinkedList marker = head;
        while (marker.getReferenceToNextNode() != null) {
            marker = marker.getReferenceToNextNode();
        }
        return marker;
    }

    public void addLast(NodeForLinkedList n) {
        NodeForLinkedList lastNode = lastNode();
        lastNode.setReferenceToNextNode(n);
    }
}