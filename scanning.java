import java.util.*;
public class scanning {
        static public void main(String[] args){
             System.out.println("enter an integer");
            // Scanner sc=new Scanner(System.in);
            // String input=sc.next();
            // System.out.println(input);

            // Scanner sin=new Scanner(System.in);
            // String input1=sin.nextLine();
            // System.out.println(input1);

        //     Scanner sin2=new Scanner(System.in);
        //     int a=sin2.nextInt();
        //     int b=sin2.nextInt();
        //     int sum=a+b;
        //     System.out.print(sum);

        // Scanner sc=new Scanner(System.in);
        //         int a=sc.nextInt();
        //         int b=sc.nextInt();
        //         int product=a*b;
        //         System.out.print(product);

                // Scanner sc=new Scanner(System.in);
                // float rad=sc.nextFloat();
                // float area=3.14f *rad*rad;
                // System.out.println(area);
                
        // type conversion
        Scanner sc=new Scanner(System.in);
        // int number=sc.nextInt(); 
        // float number=sc.nextInt();
        // System.out.println(number);

        //type cast
        // float a=25.12f;
        //         int b=(int)a;
        //         System.out.println(b);
        //         char ch='A';
        //         int u=ch;
        //         System.out.println(u);
        // }

        //type expression
        // char a='A';
        // char b='B';
        // int c=(int)(b-a);
        // System.out.println((int)a);
        // System.out.println((int)b);
        // System.out.println(b);
        // System.out.println(b-a);// type expression 
        // System.out.println(c);

        // short a=2;
        // char b='a';
        // byte c=2;
        // int bt=(int)(a+b+c); //it treats all expression as integers
        // System.out.println(bt);

        // int a=3;
        // float b=5.6f;
        // long c=54;
        // //double d=4.4f;
        // // float res=a+c+b+(float)d;
        // float res=a+c+b;
        // System.out.println(res);
        byte b=5;
        // b*=5;
        //b=b*5; //wrong
        byte a=(byte)(b*5); //right
        System.out.println(a);
}
}       
