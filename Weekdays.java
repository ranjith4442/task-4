import java.util.*;
public class Weekdays {



    public static void main(String[] args)
    {   Scanner s =new Scanner(System.in);
        String arr[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        System.out.println("Enter the day Position : ");
        int a = s.nextInt();
        try {
            if (a < 0 && a > 6)
                throw new ArrayIndexOutOfBoundsException();
            else System.out.println(" The Day is : " + arr[a]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Enter the Correct day position within 0 - 6");

        }

    }
}
