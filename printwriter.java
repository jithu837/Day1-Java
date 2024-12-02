import java.io.PrintWriter;
public class printwriter
{
    public static void main(String args[])
    {
        PrintWriter pw= new PrintWriter(System.out);
        pw.println("HELLO WORLD");
        pw.print("This is a ");
        pw.print("Print Statement");
        pw.close();
    }
}