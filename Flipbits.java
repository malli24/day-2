import java.util.*;
public class Flipbits
{
    public static void main(String[]args)
    {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        int b=Sc.nextInt();
        System.out.println(a^(1<<b));   
    }
}
        