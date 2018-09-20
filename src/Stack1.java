import java.util.Stack;


public class Stack1 {
    //legacy(old) class
    //ud double linked list
    //null insertion
    //hetero
    //LIFO


    public static void main(String[] args) {
        Stack s=new Stack();
          s.push(10);   //offset:4
          s.push(20);  //offset:3
          s.push(30);  //offset:2
          s.push("a"); //offset:1
        System.out.println(s);
        System.out.println(s.search(10));//return offset
        System.out.println(s.peek()); //return top of the stack


        System.out.println(s.pop()); //remove top
        System.out.println(s);

    }
}
