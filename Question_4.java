import java.util.HashMap;
import java.util.Scanner;
public class Question_4 {
    HashMap<String, Integer> stu= new HashMap<>();
    public void add(String a,int b)
    {   stu.put(a,b);
    }
    public void remove(String a)
    {
        if(stu.containsKey(a))
        {  stu.remove(a);
            System.out.println("The name is removed");}
        else
            System.out.println("Invalid name");
    }
    public void displayname(String a)
    {
        if(stu.containsKey(a))
         System.out.println("The grade of "+a+" is : "+stu.get(a));
        else
            System.out.println("Invalid name");
    }
    public static void main(String[] args) {
        Question_4 hm = new Question_4();
        Scanner s = new Scanner(System.in);
        hm.add("Ranjith", 10);
        hm.add("karthick", 8);
        hm.add("surya", 9);
        System.out.println("Enter 1 to add a student  : \nEnter 2 to remove a student : \nEnter 3 to display the grade of any name : ");
        int input = s.nextInt();
        if (input == 1) {
            System.out.println("Enter the name of the Student : ");
            String name = s.next();
            System.out.println("Enter the corresponding grade : ");
            int grade = s.nextInt();
            hm.add(name,grade);
            System.out.println("The student is added.....");
        }
        else if (input == 2)
        {
            System.out.println("Enter the student name : ");
            String removename= s.next();
            hm.remove(removename);
        }
        else if (input == 3 )
        {
            System.out.println("Enter the name of the Student : ");
            String dispname = s.next();
            hm.displayname(dispname);
        }
        else System.out.println("Invalid choice input");


    }
}
