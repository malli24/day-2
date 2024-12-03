import java.util.*;
public class Xor2
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        a=a^b;
        a=a^b;
        a=a^b;
        String res=String.format("after swapping/n a=%d",a,b);
        System.out.println(res);
    }
}