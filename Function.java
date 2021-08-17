import java .io.*;
class Function
{
public static void add ()
{
    System.out.println("Enter First Number");
    int a = Integer.parseInt(in.readLine());
    System.out.println("Enter Second Number");
    int b =Integer.parseInt(in.readLine());
    int s = a+b;
    System.out.println("Answer ="+s);
} 
public static void subtract(int h,int j)
{
    d=h-j;
    System.out.println("Difference ="+d);
}
public static double Multiplication()
{
    System.out.println("Enter First Number");
    int p = Integer.parseInt(in.readLine());
    System.out.println("Enter Second Number");
    int q =Integer.parseInt(in.readLine());
    m=p*q;
    return m;
}
public static double Division(int a, int b)
{
    d=f/g;
    return d ;
}
    public static void main (String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Choice");
        int c = Integer.parseInt(in.readLine());
        switch(c)
        {
            case 1 : add();
            break;
            case 2 :System.out.println("Enter First Number");
            int h = Integer.parseInt(in.readLine());
            System.out.println("Enter Second Number");
            int j =Integer.parseInt(in.readLine());
            subtract(h,j);
            break;
            case 3 : double m = Multiplication();
            System.out.println("Answer="+m);
            break;
            case 4 :System.out.println("Enter First Number");
            int f = Integer.parseInt(in.readLine());
            System.out.println("Enter Second Number");
            int g =Integer.parseInt(in.readLine()); 
            double d =Division(f,g);
            System.out.println("Answer ="+d);
            break;
            default : System.out.println("Wrong Choice");
        }
    }
}