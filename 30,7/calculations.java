import java.util.Scanner;
class calc{
    int result(int a)
    {
        int res=(((a+8)/3)%5)*5;
        return res;
    }
}
public class calculations {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int value= sc.nextInt();
        sc.close();
        calc c1=new calc();
        System.out.println("result="+c1.result(value));

    }
    
}
