import java.util.Scanner;
class Calc{
void res(double a,double b,char c)
{
    double per =( b / a ) * 100;
    if(per>75 || c=='Y')
    {
        System.out.println("allowed for exam");
    } 
    else{
        System.out.println("not allowed for exam");
    }

}
};
public class Attend {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of classes held");
        double classes=sc.nextDouble();
        System.out.println("Enter the number of classes attended");
        double attended=sc.nextDouble();
        System.out.println("You had any medical conditions|| Y OR N");
        char med = sc.next().charAt(0);
        Calc c1 = new Calc();
        sc.close();
        c1.res(classes, attended, med);
    }
}
