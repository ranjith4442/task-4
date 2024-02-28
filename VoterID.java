public class VoterID {
    private int Voterid;
    private String Name;
    private int Age;
    VoterID(int a , String b, int c)
    {
        this.Voterid=a;
        this.Name=b;
        this.Age=c;
        try{
        if (c < 18) {
            throw new InvalidAgeException(" Invalid age for voting ");
        }}
        catch(InvalidAgeException e)
        {
            System.err.println("Error : " + e.getMessage());
        }

    }
public static void main(String[] args)
{
        VoterID v1 = new VoterID(1,"Ranjith",16);
}
}

