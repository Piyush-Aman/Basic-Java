import java .io.* ;
class Practice
{
    public static void main (String args[])throws IOException 
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out .println("Enter Number");
        int n = Integer.parseInt(in.readLine());
        int s=0 ,a ;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            s=s+a;
        }
            System.out.println("Sum =" +s);
    }
}