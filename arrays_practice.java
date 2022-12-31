import java.util.*;

public class arrays_practice {

    public static int duplicate(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return 1;
                }
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter the size of the array ");
        // int size=sc.nextInt();
        int arr[]={1,2,3,4,5,6,1};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println("enter the element "+(i+1));
        //     arr[i]=sc.nextInt();
        // }
        duplicate(arr);
     }
}
