import java.util.Scanner;
class calc{
void result(double a,double b,double c)
{
    double percentage= (((a+b+c)/300)*100);
    System.out.println("percentage="+percentage+"\n");
    percentage = a + b + c;
    System.out.println("total="+percentage+"\n");
}
};
public class robert {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("sub1 marks out of 100"+"\n");
        double subject1 = sc.nextDouble();
        System.out.println("sub2 marks out of 100"+"\n");
        double subject2 = sc.nextDouble();
        System.out.println("sub3 marks out of 100"+"\n");
        double subject3 = sc.nextDouble();
        calc c1=new calc();
        sc.close();
        c1.result(subject1, subject2, subject3);
    }
    
}
