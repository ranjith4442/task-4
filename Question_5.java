import java.util.*;

public class Question_5 {
    Stack<Integer> s1 = new Stack<>();
     public void push(int a)
     {
         System.out.println("After Push method : " + s1.push(a));
     }
    public void pop()
    {
        System.out.println("After Pop method : " + s1.pop());
    }
    public void isempty()
    {
        if(s1.isEmpty())
            System.out.println("Stack is empty");
        else System.out.println("The Stack is not empty : "+s1);
    }
    public static void main(String[] args) {
         Question_5 obj = new Question_5();
         Scanner s = new Scanner(System.in);
        System.out.println("For push Enter 1\nFor pop Enter 2\nFor Checking empty Enter 3");
        int input = s.nextInt();
        if (input == 1)
        {
            System.out.println("Enter the element to push");
            int a = s.nextInt();
            obj.push(a);
        }
        else if (input == 2)
        {
            obj.pop();
             }
        else if (input == 3) {
            obj.isempty();
        }
    }
}
