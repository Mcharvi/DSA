import java.util.Stack;
public class ReverseStack {
    public static void main(String[] args) {

        Stack<Integer> st1= new Stack<>();
        System.out.println(st1.isEmpty());
        st1.push(1);
        st1.push(5);
        st1.push(10);
        st1.push(20);
        System.out.println(st1);


        Stack<Integer> st2 = new Stack<>();
        while(!st1.isEmpty()){
            int ele = st1.pop();
            st2.push(ele);
        }
        System.out.println(st2);
    }
}
