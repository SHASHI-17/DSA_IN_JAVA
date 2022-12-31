public class minumum_in_rotated_sorted {

    public static int minimum_or_pivot(int arr[]){
        int low=0,high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
             if(arr[mid] >=arr[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return arr[high];
    }
    public static void main(String[] args) {
            int arr[]={10,1,2,3,4,5,6,7,8,9};
        // int arr[]={1,2,3,4,5,6,7,8};

            System.out.print(minimum_or_pivot(arr));
    }
}
