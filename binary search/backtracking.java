import java.rmi.server.ServerRef;

public class backtracking {

    public static void changes(int arr[],int i,int value) {
        
        if(i==arr.length){
            print(arr);
            return;
        }
        arr[i]=value;
        changes(arr, i+1, value+1);
        arr[i]-=2;
    }

    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void find_subsbet(String str,String ans,int i) {
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;
        }

        find_subsbet(str, ans+str.charAt(i), i+1);
        find_subsbet(str, ans, i+1);
    }

    public static void find_permutations(String str,String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            // abcde= ab+de=abde
            String newstr=str.substring(0,i)+str.substring(i+1,str.length());
            find_permutations(newstr, ans+curr);
        }
    }


    public static void main(String[] args) {
        // int arr[]=new int[5];
        // changes(arr, 0, 1);
        // print(arr);
        
        String str="abc";
        // find_subsbet(str, "", 0);
        // System.out.println(str.substring(0,0));
        // System.out.println(str.substring(1,str.length()));
        // System.out.println(str.substring(0,1)+str.substring(2,str.length()));
        // System.out.println(str.substring(0));
        // System.out.print(str.charAt(0));
        // System.out.print(str.length());
        find_permutations(str, "");
    }
}
