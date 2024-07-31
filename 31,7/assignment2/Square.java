import java.util.*;
class Calc{
    void checksquare(double l, double b)
    {
        if ( l == b ){
            System.out.println("its a square");
        }
        else{
            System.out.println("its not a square");
        }
    }
}
public class Square{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double l = sc.nextDouble();
        System.out.println("Enter breadth");
        double b = sc.nextDouble();
        sc.close();
        Calc c1 = new Calc();
        c1.checksquare(l,b);
    }
}