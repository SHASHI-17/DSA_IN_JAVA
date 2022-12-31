import java.util.*;
public class string {

    public static void print_string(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    // given string is a palindorme or not
    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    // given a route of 4 directions,find the shortest path
    
    public static float get_shortest_path(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir == 'W'){
                x--;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'N'){
                y++;
            }
            else{
                y--;
            }
        }
        int x2=x*x,y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
        
    // string substring
    public static String subString(String str1,int si,int ei){
        String str2="";
        for(int i=si;i<ei;i++){
            str2+=str1.charAt(i);
        }
        return str2;
    }

    public static String to_upper_case(String str){
        StringBuilder sb=new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

        // aaabbccd
        public static String compress(String str){
            String new_str="";
            for(int i=0;i<str.length();i++){
                int count=0;
                // Integer count=0;
                while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
                    count++;
                    i++;
                }
                new_str+=str.charAt(i);
                if(count>0){
                    new_str+=count;
                    // new_str+=count.toString();
                }
            }
            return new_str;
        }
        // aaabbccd
        public static StringBuilder compress_through_string_builder(String str){
            StringBuilder sb=new StringBuilder("");
            for(int i=0;i<str.length();i++){
                int count=0;
                while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                    count++;
                    i++;
                }
                sb.append(str.charAt(i));
                if(count>0){
                    sb.append(count);
                }
            }
            return sb;
        }
        
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="shashi";
        // String str2=new String("shashii"); 

        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);

        // String naam="thor";
        // System.out.println(naam.length());

        // concatenation 
        // String fisrt_name="shashi";
        // String last_name="kiran";
        // String full_name=fisrt_name+" "+last_name;
        // // System.out.println(full_name+" is this");
        // // System.out.println(full_name.charAt(0));
        // print_string(full_name);

        // palindrome 
        // String str="racecar";
        // System.out.println(palindrome(str));

        // shortest path
        // String path="WNEENESENNN";
        // System.out.println(get_shortest_path(path));

        // comparing two strings

        // String s1="tony";
        // String s2="tony";
        // String s3=new String("tony");

        // if(s1==s2){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }
        // if(s3==s1){
        //     System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }

        // if(s1.equals(s3)){
        //     System.out.println("true");
        // }

        //string substring
        // String str="helloworld";
        // System.out.println(str.subSequence(0, 4));
        // System.out.println(subString(str, 0, 5));


        // string comparsion
        // String str[]={"apple","banana","mango"};
        // String largest=str[0];
        // for(int i=1;i<str.length;i++){
        //     if(largest.compareTo(str[i]) < 0){
        //         largest=str[i];
        //     }
        // }
        // System.out.println(largest);


        // string builder

        // StringBuilder sb=new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch); 
        // }
        // System.out.println(sb);

        // converting the first letter into upper case after space

            // String str="hello, shashi bhai";
            // System.out.println(to_upper_case(str));

            //string compression
            String str="aaaabbbccd";
            // System.out.println(compress(str));
            System.out.println(compress_through_string_builder(str));
    }
}
