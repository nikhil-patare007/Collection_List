import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;


public class Vector1 {
     //thread safe and arraylist is not *****
     // same as arraylist
     //lower performance than arrayllist
     //default size:10
     //serializable,clonable,random access
     //Best choice:if have to read element from middle along with thread is frequent operation  ***
     // capaciy current * 2 + 1
    public static void main(String[] args) {
           Vector v=new Vector();
             v.addElement(10);
             v.addElement("s");
             v.addElement(5);
          //   v.add(5);
        Enumeration enum1 =v.elements();
        System.out.println("Vector Elements");
        while(enum1.hasMoreElements()){
            System.out.println(enum1.nextElement());
        }
        System.out.println(v);
               Vector v1=new Vector(); //generic method
                     v1.addAll(v);
                     v1.addElement(15);
        System.out.println(v1);


    }
}
