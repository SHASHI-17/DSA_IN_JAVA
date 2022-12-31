import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {
        // int a=3,b=6;
        // if(a>=b){
        //     System.out.println("a is greater");
        // } else{
        //     System.out.println("b is greater");
        // }

        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter your income");
        // int income=sc.nextInt();
        // float tax=0;
        //     if(income<500000){
        //         tax=0;

        //     } else if(income>=500000 && income<=1000000){
        //         tax=income*0.2f;
        //     } else{
        //         tax=income*0.3f;
        //     }

        //     System.out.println("Your tax is "+ tax);

        // int a=1,b=2,c=3;
        // if(a>b && a>c){
        //     System.out.println("A is greater");
        // } else if(b>c){
        //     System.out.println("b i greater");
        // } else{
        //     System.out.println("c is greater");
        // }

        // int number=4;
        // String type =number%2==0 ?"even" : "odd";
        // System.out.println(type);

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        char c=sc.next().charAt(0);
        switch(c){
            case '+' :
            System.out.println(a+b);
            break;
            case '-' :
            System.out.println(a-b);
            break;
            case '*' :
            System.out.println(a*b);
            break;
            case '/' :
            System.out.println(a/b);
            break;
            case '%' :
            System.out.println(a%b);
            break;
            default :
            System.out.println("sorry");
        }
    }
}
