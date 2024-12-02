import java.util.*;
public class acceptingastring
{
    public static void main(String args[])
    {
        //Accepting a String
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=String.format("Congratulation %s you won 5 lakhs",a);
        System.out.println(b);
    }
}