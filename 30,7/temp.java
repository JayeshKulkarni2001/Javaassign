import java.util.Scanner;
class calc{
    void results(double temp)
    {
        double res= ((0.555)*(temp-32));
        System.out.println("temparature in celsius is "+res);
    }
}
public class temp {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the temparature in fahrhanheit"+"\n");
        double temp=sc.nextDouble();
        calc c1=new calc();
        sc.close();
        c1.results(temp);
    }
}
