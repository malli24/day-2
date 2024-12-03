import java.util.*;
public class Swapping
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        int b=Sc.nextInt();
        int g=Sc.nextInt();
        int c=b;
        b=g;
        g=c;
        String res=String.format("after swapping\nboy=%d\ngirl=%d",b,g);
        System.out.println(res);
    }
}