import java.util.Scanner;

public class practice_set_conditional_statements {
    public static void main(String[] args) {
        //question 5
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the year");
        // int year=sc.nextInt();
        // if(year % 400==0 || year % 100==0 || year % 4==0){
        //         System.out.println(year +" is a leap year");
        // } else{
        //     System.out.println(year+" is not a leap year");
        // }
        int a=23,b=5;
        boolean x=(a>b)?true:false;
        int y=(a<b)?a:b;
        System.out.println(x+" "+y);
    }
}
