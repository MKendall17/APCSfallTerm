public class UserOfLinkedList {

    public static void main(String[] commandLine) {

    	/** 
    		before addFirst
    	*/
        LinkedList shopping = new LinkedList();
        
        System.out.println( "\n"
                          + shopping  + "\n"
                          + "\n");

        //add something
        /**
        	after addFirst, before addLast
        */

        NodeForLinkedList n0 = new NodeForLinkedList("Bobbby");
        shopping.addFirst(n0);

        System.out.println( "\n"
                          + shopping  + "\n"
                          + "\n");

        NodeForLinkedList n1 = new NodeForLinkedList("Jimmmy");
        shopping.addLast(n1);

        /**
        	after addLast
        */

        System.out.println(shopping.lastNode());

        System.out.println( "\n"
                          + shopping  + "\n"
                          + "\n");

    }
}

