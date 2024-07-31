import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int i,sum=0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[10];
        System.out.println("enter 10 numbers");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        for(i=0;i<10;i++)
        {
            sum+=arr[i];
        }
        double s = sum;
        double avrg=(s/10);
        System.out.println("Average="+avrg);
    }
    
}