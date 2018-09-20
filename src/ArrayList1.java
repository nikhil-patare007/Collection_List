//import java.util.ArrayList;
//import java.util.Iterator;

import java.util.*;

public class ArrayList1 {
    //default size:-10
    //underlying data structure growable array
    //hold heterogenous element
    //null insertion allow
    //serializable and clonable
    //not sortable
    //random access only at arraylist and vector
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(10);
        a.add("a");
        a.add(5);
        a.add(null);

        //  a.add(5);   allow duplication

        System.out.println(a);
        System.out.println("after removing 10 @t index 1");
        a.remove(1);
        System.out.println(a);
        System.out.println("empty or not: " + a.isEmpty());
        System.out.println("size: " + a.size());
        System.out.println("getting via index 2: " + a.get(2));
        Iterator iterator = a.iterator(); ///at the time of iterator have to use method....ex:hasnext
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        ArrayList a1 = new ArrayList();
        a1.addAll(a);

        System.out.println("collection: " + a1);


    }
}
