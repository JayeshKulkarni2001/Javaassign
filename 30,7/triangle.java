class calc{
double perim(double a,double b,double c){
double res=a+b+c;
return res;
}
};
public class triangle {
    public static void main(String[] args)
    {
        calc c1=new calc();
        System.out.println("perimeter of triangle="+c1.perim(Double.parseDouble((args[0])),Double.parseDouble((args[1])),Double.parseDouble((args[2]))));
    }
    
}
