import java.util.*;
public class simple_binary {

    static public int simple_binary(int arr[],int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            if(arr[middle]==target){
                return middle;
            }
            else if(target >arr[middle]){
                low=middle+1;
            }
            else{
                high=middle-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(simple_binary(arr, 89));
    }
}
