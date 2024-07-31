class calc{
double area(double a,double b)
{
    double res=a*b;
    return res;
} 
double peri(double a,double b)
{
    double res=2*(a+b);
    return res;
}
};
public class area{
    public static void main(String[] args)
    {
        calc c1=new calc();
        System.out.println("area="+c1.area(Double.parseDouble((args[0])),Double.parseDouble((args[1]))));
        System.out.println("perimeter="+c1.peri(Double.parseDouble((args[0])),Double.parseDouble((args[1]))));
    }
}