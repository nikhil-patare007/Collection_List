import java.util.LinkedList;

public class LinkedList1 {
    //methods r same as arraylist only difference is that we can add at first,middle,last also.

    //ud linked list
    //insertion or deletion at middle
    //stores clustered form
    //allow null insertion
    //allow duplication
    //preserve insertion order:-
    //doesn't contains capacity


    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(20);
        l1.addFirst(10);
        l1.add(30);
        l1.addLast(40);
        System.out.println(l1);
        System.out.println("removings last: " + l1.removeLast()); //also we can remove first element also
        System.out.println("getting first: " + l1.getFirst()); //we can also apply for first
        System.out.println("getting last: " + l1.getLast()); //we can also apply for last
        System.out.println(l1);
    }
}
