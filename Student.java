public class Student {
    public int Rollno;
    public String Name;
    public int Age;
    public String Course;

    Student(int ab , String b, int c, String d)
    {
        this.Rollno = ab;
        this.Name=b;
        this.Age=c;
        this.Course=d;

        if(Age < 15 || Age >21)
            try {
                throw new AgeNotWithinRangeException("The Student age should be within the limit 15 - 21 " );
            } catch (AgeNotWithinRangeException e) {
                System.err.println("Error " + e.getMessage());
            }
        for (char a: Name.toCharArray()) {
            try {
                if (Character.isDigit(a) || !Character.isLetter(a))
                    throw new NameNotValidException("Invalid Name ");
            }
            catch(NameNotValidException e)
            {
                System.err.println("Error : " + e.getMessage());
            }
    }
    }
    public static void main(String[] args)
    {
        try {
            Student s1 = new Student(1, "R-anjith", 25, "Mech");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    }


