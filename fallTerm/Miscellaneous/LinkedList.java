public class LinkedList {

	private NodeForLinkedList head;

	// public NodeForLinkedList lastOfList() {
	// 	NodeForLinkedList n = head;

	// 	if (head == null) {
	// 		return head;
	// 	}

	// 	while (n.getReferenceToNextNode() != null) {
	// 		n = n.getReferenceToNextNode();
	// 	}

	// 	return n;
	// }

	public NodeForLinkedList lastOfList() {
		NodeForLinkedList n = head;
		if (head == null || head.getReferenceToNextNode() == null) {
			return head;
		}

		LinkedList L = new LinkedList();
		L.head = n.getReferenceToNextNode();
		return L.lastOfList();
	}




	//code that I copied
	public void addFirst( NodeForLinkedList n) {
        n.setReferenceToNextNode( head);
        head = n;
    }

   /** Chain @n to the END of the list
     * precondition: @n.referenceToNextNode == null
     */
    public void addLast( NodeForLinkedList n) {
        // empty lists require special handling
        if( head == null) 
            // set the head, rather than a node's referenceToNextNode
            head = n;
        else {  // list already has at least 1 node
            
            // find end of existing list
            NodeForLinkedList cur = head;
            while(    cur.getReferenceToNextNode() != null)
                cur = cur.getReferenceToNextNode();
            
            // add @n to end
            cur.setReferenceToNextNode( n);
        }
    }

    public String toString() {
        String result = "( "; // enclosed in parens, like Racket
        
        NodeForLinkedList n = head;
        while(  n != null) {
            result +=  n;
            n = n.getReferenceToNextNode();
        }
        return result + " )";
    }


    public int indexOf(String value) {
    	if (head == null) {
    		return -1;
    	}
    	int counter = 0;
    	NodeForLinkedList n = head;
    	while (n.getCargo() != value && n != null) {
    		counter ++;
    		n = n.getReferenceToNextNode();
    		if (counter == this.length()) {
    			return -1;
    		}
    	}
    	return counter;
    }

    private int length() {
    	if (head == null) {
    		return 0;
    	}
    	int counter = 1;
    	NodeForLinkedList n = head;
    	while (n.getReferenceToNextNode() != null) {
    		counter++;
    		n = n.getReferenceToNextNode();
    	}
    	return counter;
    }

    // public Boolean contains(String toFind) {
    // 	if (head == null) {
    // 		return false;
    // 	}
    // 	for (NodeForLinkedList n = head; n != null; n = n.getReferenceToNextNode()) {
    // 		if (n.getCargo().equals(toFind)) {
    // 			return true;
    // 		}
    // 	}
    // 	return false;
    // }

    public Boolean contains(String toFind) {
    	if (head == null) {
    		return false;
    	}
    	return chainContains(toFind, head);
    }

    private static Boolean chainContains(String toFind, NodeForLinkedList start) {
    	if (start.getCargo().equals(toFind)) {
    		return true;
    	}
    	else if (start.getReferenceToNextNode() == null) {
    		return false;
    	}
    	return chainContains(toFind, start.getReferenceToNextNode());
    }

    // public int indexOf(String value) {
    // 	if (head == null) {
    // 		return -1;
    // 	}
    // 	return chainIndexOf(value, head);
    // }

    // private static chainIndexOf(String value, NodeForLinkedList n) {
    // 	if (n.getCargo().equals(value)) {
    // 		return 1;
    // 	}
    // 	if (head.referenceToNextNode() == null) {
    // 		return -1;
    // 	}
    // 	return 
    // }

    public NodeForLinkedList get(int index) {
    	if (head == null) {
    		return null;
    	}
    	NodeForLinkedList n = head;
    	while (index > 0) {
    		n = n.getReferenceToNextNode();
    		index--;
    	}
    	return n;
    }

    public NodeForLinkedList get(int index) {
    	if (head == null) {
    		return null;
    	}
    	return chainGetIndex(head, index);
    }

    private static NodeForLinkedList chainGetIndex(NodeForLinkedList n, int index) {
    	if (index == 0) {
    		return n;
    	}
    	return chainGetIndex(n.getReferenceToNextNode(), index -1);
    }


}
