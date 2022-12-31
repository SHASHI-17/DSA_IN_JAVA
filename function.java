import java.util.Scanner;

import javax.xml.transform.Templates;
public class function {

    // factorial and binomial coefficient
    // public static int fact(int x){
    //     if(x==1 || x==0){
    //         return 1;
    //     } else{
    //         return x * fact(x-1);
    //     }
    // }

    // public static int bino(int x,int y){
    //     int a=fact(x);
    //     int b=fact(y);
    //      int c=fact(x-y);
    //     int result=a/(b*c);
    //     return result;
    // }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("enter the value of x");
    //     int x=sc.nextInt();
    //     System.out.println("enter the value of y");
    //     int y=sc.nextInt();
    //     System.out.println("the bino of coffecient is "+bino(x,y));
    // }

    //fucntion overloading

    // public static int func(int a ,int b){
    //     return a+b;
    // }
    // public static int func(int a,int b,int c){
    //     return a+b+c;
    // }

    // public static void main(String args[]){
    //     System.out.print(func(1,2));
    // }

    // check if number is prime or not
    // public static boolean isprime(int x){
    //     //for(int i=2;i<=x-1;i++){
    //     for(int i=2;i<=Math.sqrt(x);i++){
    //         if(x%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    
    // public static void print_in_range(int n){
    //     for(int i=2;i<=n;i++){
    //         if(isprime(i)){
    //             System.out.print(i +" ");
    //         }
    //     }
    // }

    // public static void main(String args[]){
    //    // System.out.println(isprime(16));
    //    print_in_range(20);
    // }

    // binary to decimal
        // public static int binary(int n){
        //     int rem,sum=0,c=1;
        //     while(n!=0){
        //         rem=n%10;
        //         sum=sum+rem*c;
        //         n/=10;
        //         c=c*2;
        //     } 
        //     return sum;
        // }
        public static int binarytodec(int n){
            int rem,sum=0,pow=0;
            while(n!=0){
                rem=n%10;
                sum=sum+rem*(int)Math.pow(2, pow);
                n/=10;
                pow++;
            } 
            return sum;
        }

        // public static int dectobin(int n){
        //     int rem,sum=0,pow=0;
        //     while(n!=0){
        //         rem=n%2;
        //         sum=sum+(rem*(int)Math.pow(10, pow));
        //         n/=2;
        //         pow++;
        //     }
        //     return sum;
        // }
        public static int dectobin(int n){
            int rem,sum=0,pow=1;
            while(n!=0){
                rem=n%2;
                sum=sum+rem*pow;
                n/=2;
                pow=pow*10;
            }
            return sum;
        }

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the binary number");
            int x=sc.nextInt();
            //System.out.println("the binary equivalent of "+x+" is "+binarytodec(x));
            System.out.println("the binary equivalent of "+x+" is "+dectobin(x));
        }

}
