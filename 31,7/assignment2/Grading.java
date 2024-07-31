import java.util.Scanner;
class Calc{
    char Grade(int mks)
    {
        if(mks<25)
        {
        return 'f';
        }
        else if(mks >= 25 && mks <=45)
        {
            return 'e';
        }
        else if(mks >= 45 && mks <=50)
        {
            return 'd';
        }
        else if(mks >= 50 && mks <=60)
        {
            return 'c';
        }
        else if(mks >= 60 && mks <=80)
        {
            return 'b';
        }
        else if(mks > 80)
        {
            return 'a';
        }
        else{
        return 0;
        }
    }
};
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = sc.nextInt();
        sc.close();
        Calc c1 = new Calc();
        char res=c1.Grade(marks);
        System.out.println(res);
    }
}
