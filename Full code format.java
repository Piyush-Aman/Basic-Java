import java.io.*;
class Piyush
{
    public static void main (String arge[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First Number");
        int a = Integer.parseInt(in.readLine());
        System.out.println("Enter Second Number");
        int b = Integer.parseInt(in.readLine());
        if(a>b)
        {
            System.out.println("First Number is Greater");
        }
        else
        {
            System.out.println("Second Number is Greater");
        }
    }
}