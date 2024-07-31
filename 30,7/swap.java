import java.util.Scanner;
class calc{
void third(int a,int b){
    int c=0;
    c=a;
    a=b;
    b=c;
    System.out.println("A="+a+" "+"B="+b);
}
void nothird(int a,int b)
{
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("A="+a+" "+"B="+b);
}
};
public class swap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter your choice || 1.using third variable || 2.using two variables");
        int ch=sc.nextInt();
        calc c1=new calc();
        sc.close();
        switch(ch){
            case 1: c1.third(a, b);
            break;
            case 2: c1.nothird(a, b);
            break;
            default: System.out.println("invalid");
        }
    }
    
}
